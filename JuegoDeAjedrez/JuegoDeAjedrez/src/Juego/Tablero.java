/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Piezas.Alfil;
import Piezas.Caballo;
import Piezas.Peon;
import Piezas.Reina;
import Piezas.Rey;
import Piezas.Torre;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Esta clase es la principal del ajedrez, extiende de JPanel, que a su vez extiende de un componente, dado que el ajedrez ha sido creado para usarse
 * como un componente mas, que se puede agregar facilmente a un frame o otro panel.

 */
public class Tablero extends JPanel {

   /*
 * Especifica el turno de la computadora, para saber si la computadora jugará las negras o las blancas.
 */
    private int turnoComputadora = -1;
    /*
     * Especifica el turno que le toca jugar, siempre empieza con las blancas.
     */
    private int turno = 1;//1 para las blancas y -1 para las negras
    /*
     * Es el array principal que diseña el tablero, es un conjunto de cuadrosPiezas. el un array de 8 por 8
     */
    CuadroPieza tablero[][];
    /*
     * Especifica que piezas han sido comidas actualmente, esto se utilizará para que el peon pueda reclamar alguna pieza.
     */
    private ArrayList<Pieza> piezasComidas = new ArrayList<Pieza>();
    /*
     * Especifica el color de los cuadros del tablero "negros"
     */
    private Color negro = Color.darkGray;
    /*
     * Especifica el color de los cuadros del tablero "blancos"
     */
    private     Color blanco = Color.white;
    /*
     * Cuando un cuadro es resaltado, y es blanco se usará este color, para diferenciarlo de los demas
     */
    private     Color blancoResaltado = new Color(120, blanco.getGreen() - 64, blanco.getBlue() - 64, 100);
    /*
     * Cuando un cuadro es resaltado, y es negro se usará este color, para diferenciarlo de los demas
     */
    private Color negroResaltado = new Color(120, negro.getGreen() - 64, blanco.getBlue() - 64, 100);
    /*
     * Cuando selecciono alguna pieza el cuadro se colorea de este color.
     */
    private Color Seleccionado = Color.LIGHT_GRAY;
    /*
     * Cuando quiero resaltar un color, como alerta(Especialmente cuando la pieza puede comer a otra pieza, uso este color)
     */
    private Color Alerta = Color.RED;
    /*
     * Establesco el rey blanco del juego, que lo puedo usar para saber si esta en jacke o no.
     */
    private Rey reyblanco;
    /*
     * Establesco el rey negro del juego, que lo puedo usar para saber si esta en jacke o no.
     */
    private Rey reynegro;
    /*
     * Indica si el usuario quiere que se le muestren los posibles movimientos de alguna pieza.
     */
    private boolean seleccionarAlternativas = true;
    /*
     * Se usa para terminar el juego, si hay jacke mate, y la maquina no intente buscar mas posibles movimientos, entrando en un bucle infinito.
     */
    private boolean suspenderJuego = false;
    /*
     * Es el Jlabel, que nos permite generar el movimiento de que la pieza esta siendo movida.
     */
    JLabel tmp;
    /*
     * Indica el tamaño de cada cuadrado del tablero.
     */
    int altoCuadro = 56;
    int anchoCuadro = 56;
    /*
     * Indica el cuadro que esta seleccionado actualmente.
     */
    CuadroPieza cuadroSeleccionado = new CuadroPieza(0, 0);

    public Tablero() {
        super();
        llenarCuadrosTablero();
        ordenarTablero();
        init();// para darle eventos mouse
    }
/**
 * Este metodo crea el tablero, quiere decir que grafica el tablero en el Jpanel.
 */
    private void llenarCuadrosTablero() {
        tmp = new JLabel();
        tmp.setBounds(-100, -100, 56, 56);
        add(tmp);
        tablero = new CuadroPieza[8][8];
        setLayout(null);
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tablero[x][y] = new CuadroPieza(x, y);
                add(tablero[x][y]);// para agregar los elementos
            }
        }
        rePintarTablero();
    }
/**
 * Inicializo todos los listener de cada pieza
 */
    public void init() {//lo que es evento con el Mouse
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tablero[x][y].addMouseListener(new java.awt.event.MouseAdapter() {

                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        seleccionarPieza(evt);//cuando mouse se levantado o presionado haga esto
              
                    }

                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        dejarPieza(evt);
                    
                    }
                });
                tablero[x][y].addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {

                    public void mouseDragged(java.awt.event.MouseEvent evt) {
                        /*
                         * Para simular que la pieza es arrastrada, uso el label tmp, y le cambio sus coordenadas, con la del mouse.
                         */
                        tmp.setLocation(cuadroSeleccionado.getLocation().x + evt.getX() - 18, cuadroSeleccionado.getLocation().y + evt.getY() - 28);
                    }
                });


            }
        }
    }
/**
 * Usado para seleccionar pieza, es llamada gracias al evento de clic del raton.
 * @param evt
 */
     public void seleccionarPieza(java.awt.event.MouseEvent evt) {
        // Se pasa como parametro el evento
        CuadroPieza t = ((CuadroPieza) evt.getComponent());//Averiguo en que cuadro sucedio el evento
        if (t.getPieza() != null) {//Veo si el cuadro no esta vacio.
            if (t.getPieza().getColor() == getTurno()) {//Veo si es del mismo color del turno que actualmente le toca.
                cuadroSeleccionado = t;
                /*
                 * Con esto hago que se resalten los posibles movimientos en todo el tablero.
                 */
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        tablero[x][y].opacarPieza();//Si hay piezas seleccionadas, las opaco
                        if (isSeleccionarAlternativas()) {//Resalto los posibles movimientos.
                            if (cuadroSeleccionado.getPieza().validarMovimiento(tablero[x][y], this)) {
                                tablero[x][y].resaltarPieza(tablero[x][y].getPieza() != null ? getAlerta() : null);
                            }
                        }
                    }
                }
                /*
                 * Resalto el cuadro que ha sido seleccionado para que el usuario sepa que cuadro selecciono
                 */
                cuadroSeleccionado.resaltarPieza(getSeleccionado());
                /*
                 * Establesco la imagen de la pieza que ha sido seleccionada al label.
                 */
                tmp.setIcon(cuadroSeleccionado.getPieza().getImagenPieza());
                /*
                 * borro la imagen de la pieza del cuadro.
                 */
                cuadroSeleccionado.lbl.setIcon(null);
                /*
                 * Establesco la nueva posicion del label, que tiene la imagen de la pieza.
                 */
                tmp.setLocation(cuadroSeleccionado.getLocation().x + evt.getX() - 18, cuadroSeleccionado.getLocation().y + evt.getY() - 28);
            }
        }
    }
    
/*
 * Es el metodo que permite soltar una pieza en determinado lugar.
 */
    ////////////////////////////////////////////////////////////
     public void dejarPieza(java.awt.event.MouseEvent evt) {
        if (cuadroSeleccionado.getPieza() != null) {//Si hay alguna pieza seleccionada
            tmp.setLocation(-100, -100);//Pongo el label tmp, por donde no se vea para que no estorbe.
            cuadroSeleccionado.lbl.setIcon(cuadroSeleccionado.getPieza().getImagenPieza());//Regreso el icono de la p ieza al cuadro que había sido seleccionado
            tmp.setIcon(null);//Borro el icono del label.
            CuadroPieza cuadroDestino = (CuadroPieza) this.getComponentAt(evt.getComponent().getX() + evt.getX(), evt.getComponent().getY() + evt.getY());
            if (cuadroDestino != cuadroSeleccionado) {//Pregunto si el cuadro destino es diferente del cuadro seleccionado.
                MoverPieza(cuadroSeleccionado, cuadroDestino);//Muevo la pieza, o al menos si es valido, el metodo decide eso.
            }

        }


    }
    ///////////////////////////////////
/*
 * Este metodo permite que la PC juegue sola, en el turno que se le diga.
 */
///////////////////////////////////////////////////////////////////////////
         public void jugarMaquinaSola(int turno) {
        if (suspenderJuego) {
            return;
        }
        CuadroPieza cuadroActual;
        CuadroPieza cuadroDestino;
        CuadroPieza MovDestino = null;
        CuadroPieza MovActual = null;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                cuadroActual = tablero[x][y];
                if (cuadroActual.getPieza() != null) {
                    if (cuadroActual.getPieza().getColor() == turno) {
                        for (int x1 = 0; x1 < 8; x1++) {
                            for (int y1 = 0; y1 < 8; y1++) {
                                cuadroDestino = tablero[x1][y1];
                                if (cuadroDestino.getPieza() != null) {
                                    if (cuadroActual.getPieza().validarMovimiento(cuadroDestino, this)) {
                                        if (MovDestino == null) {
                                            MovActual = cuadroActual;
                                            MovDestino = cuadroDestino;
                                        } else {
                                            if (cuadroDestino.getPieza().getPeso() > MovDestino.getPieza().getPeso()) {
                                                MovActual = cuadroActual;
                                                MovDestino = cuadroDestino;
                                            }
                                            if (cuadroDestino.getPieza().getPeso() == MovDestino.getPieza().getPeso()) {
                                                //Si es el mismo, elijo al azar si moverlo o no
                                                if (((int) (Math.random() * 3) == 1)) {
                                                    MovActual = cuadroActual;
                                                    MovDestino = cuadroDestino;
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        if (MovActual == null) {
            boolean b = true;
            do {//Si no hay mov recomendado, entonces genero uno al azar
                int x = (int) (Math.random() * 8);
                int y = (int) (Math.random() * 8);
                tablero[x][y].getPieza();
                int x1 = (int) (Math.random() * 8);
                int y1 = (int) (Math.random() * 8);

                MovActual = tablero[x][y];
                MovDestino = tablero[x1][y1];
                if (MovActual.getPieza() != null) {
                    if (MovActual.getPieza().getColor() == turno) {
                        b = !MovActual.getPieza().validarMovimiento(MovDestino, this);
                    //Si mueve la pieza, sale del while.
                    }
                }
            } while (b);
        }
        if (MovActual.getPieza().MoverPieza(MovDestino, this)) {
            this.setTurno(this.getTurno() * -1);
            if (getRey(this.getTurno()).isInJacke(this)) {
                if (Pieza.isJugadorAhogado(turno, this)) {
                    JOptionPane.showMessageDialog(null, "Hacke Mate!!! - te lo dije xD");
                    if (JOptionPane.showConfirmDialog(null, "Deseas Empezar una nueva Partida¿?", "Nueva Partida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        ordenarTablero();
                    } else {
                        suspenderJuego = true;
                    }
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Rey en Hacke -  ya t kgste");
                }
            } else {
                if (Pieza.isJugadorAhogado(turno, this)) {
                    JOptionPane.showMessageDialog(null, "Empate!!!\nComputadora: Solo por que te ahogaste...!!!");
                    if (JOptionPane.showConfirmDialog(null, "Deseas Empezar una nueva Partida¿?", "Nueva Partida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        ordenarTablero();
                    } else {
                        suspenderJuego = true;
                    }
                    return;
                }
                if (Pieza.getCantMovimientosSinCambios() >= 50) {
                    JOptionPane.showMessageDialog(null, "Empate!!! \nComputadora: Vaya, han pasado 50 turnos sin comernos jeje!!!");
                    if (JOptionPane.showConfirmDialog(null, "Otra Partida Amistosa¿?", "Nueva Partida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        ordenarTablero();
                    } else {
                        suspenderJuego = true;
                    }
                    return;
                }
            }
        }
        if (this.getTurno() == turnoComputadora) {
            jugarMaquinaSola(this.getTurno());
        }
    }
         /*
 * Este metodo es el que mueve la pieza a un determinado lugar, verifica que este en hacke, o este ahogado, es como el arbitro del juego..
 */
    public void MoverPieza(CuadroPieza cuadroActual, CuadroPieza cuadroDestino) {
        try {
            if (suspenderJuego) {//Si el juego no esta suspendido
                return;
            }
            if (cuadroActual.getPieza().MoverPieza(cuadroDestino, this)) {//Si el movimiento es valido
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        tablero[x][y].opacarPieza();//Regreso todos los cuadros a su estado inicial, para que no esten resaltados.
                    }
                }
                setTurno(getTurno() * -1);//Cambio de turno.
                if (getRey(getTurno()).isInJacke(this)) {//Pregunto si el rey del turno actual, o sea al que le toca mover despues de este metodo, esta en jacke
                    if (Pieza.isJugadorAhogado(getTurno(), this)) {//Si esta en jacke, pregunto si esta ahogado(Quiere decir que no tiene opcion.)
                        //Si esta en jacke y esta ahogado a la vez, quiere decir que esta en jacke mate.
                        JOptionPane.showMessageDialog(null, "Hacke Mate!!!\nComputadora: Parece que me ganaste=(");
                        if (JOptionPane.showConfirmDialog(null, "Computadora: Te reto a que lo vuelvas a hacer, Otra¿?", "Nueva Partida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            ordenarTablero();
                        } else {
                            JOptionPane.showMessageDialog(null, "Computadora: Cobarde ¬¬");
                            suspenderJuego = true;
                        }
                        return;
                    } else {
                        //Si no esta ahogado, simplemente es un jacke.
                        JOptionPane.showMessageDialog(null, "Rey en Hacke \nComputadora: Y ahora que hago¿? =(");
                    }
                } else {
                    if (Pieza.isJugadorAhogado(getTurno(), this)) {
                        //Si solo esta ahogado, es un empate.
                        JOptionPane.showMessageDialog(null, "Empate!!!\nComputadora: Vamos que andamos parchis, me has ahogado!!!");

                        if (JOptionPane.showConfirmDialog(null, "Deseas Empezar una nueva Partida¿?", "Nueva Partida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            ordenarTablero();
                        } else {
                            suspenderJuego = true;
                        }
                        return;
                    }
                    if (Pieza.getCantMovimientosSinCambios() >= 50) {
                        //Si han pasado 50 movimientos sin ningun cambio, tambien se considera empate.
                        JOptionPane.showMessageDialog(null, "Empate!!! \nComputadora: Vaya, han pasado 50 turnos sin comernos jeje!!!");
                        if (JOptionPane.showConfirmDialog(null, "Otra Partida Amistosa¿?", "Nueva Partida", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            ordenarTablero();
                        } else {
                            suspenderJuego = true;
                        }
                    }
                }

                if (getTurno() == turnoComputadora) {//Si le toca a la computadora, le toca jugar a ella.
                    jugarMaquinaSola(getTurno());
                }
            } else {
                if (getRey(getTurno()).isInJacke(this)) {//Si el movimiento es invalido, y encima el rey esta en jacke, pues es un movimiento invalido, el rey tiene que librarse del jacke
                    JOptionPane.showMessageDialog(null, "Movimiento invalido");
                }
            }
        } catch (Exception e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
    /**
 * Este metodo ordena todo el tablero, quiere decir que pone las piezas blancas y las piezas negras en su sitio.(Resetea el juego)
 */
    public void ordenarTablero() {
        Pieza.setCantMovimientosSinCambios(0);
        setTurno(1);
        suspenderJuego = false;
        //Limpiar el tablero
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tablero[x][y].setPieza(null);
            }
        }
        int color = -1;
        for (int i = 0; i <= 1; i++) {
            tablero[0][i * 7].setPieza(new Torre(color));
            tablero[1][i * 7].setPieza(new Caballo(color));
            tablero[2][i * 7].setPieza(new Alfil(color));
            tablero[3][i * 7].setPieza(new Reina(color));
            Rey rey = new Rey(color);
            setRey(rey, color);
            tablero[4][i * 7].setPieza(rey);
            tablero[5][i * 7].setPieza(new Alfil(color));
            tablero[6][i * 7].setPieza(new Caballo(color));
            tablero[7][i * 7].setPieza(new Torre(color));
            for (int j = 0; j < 8; j++) {
                tablero[j][i == 0 ? 1 : 6].setPieza(new Peon(color));
            }
            color *= -1;
        }
        rePintarTablero();
        if (turnoComputadora == getTurno()) {
            jugarMaquinaSola(getTurno());
        }
    }
   
/*
 * Si hay algun cambio en quien juega arriba y quien juega abajo, se repinta el tablero.
 *
 */
    public void rePintarTablero() {
        int colorArriba = turnoComputadora != 0 ? turnoComputadora : -1;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (x % 2 == 0) {
                    tablero[x][y].setFondo(y % 2 == 1 ? getNegro() : getBlanco());
                    tablero[x][y].setResaltar(y % 2 == 1 ? getNegroResaltado() : getBlancoResaltado());
                } else {
                    tablero[x][y].setFondo(y % 2 == 0 ? getNegro() : getBlanco());
                    tablero[x][y].setResaltar(y % 2 == 0 ? getNegroResaltado() : getBlancoResaltado());
                }
                tablero[x][y].setBounds(anchoCuadro * (colorArriba == -1 ? x : (7 - x)), altoCuadro * (colorArriba == -1 ? y : (7 - y)), anchoCuadro, altoCuadro);
            }
        }
    }

    public CuadroPieza getPiezaSeleccionada() {
        return cuadroSeleccionado;
    }

    public CuadroPieza[][] getTablero() {
        return tablero;
    }

    public void setRey(Rey rey, int color) {
        if (color == -1) {
            reynegro = rey;
        } else {
            reyblanco = rey;
        }
    }
    public Rey getRey(int color) {
        return color == -1 ? reynegro : reyblanco;
    }

    public ArrayList<Pieza> getPiezasComidas() {
        return piezasComidas;
    }

    public void setPiezasComidas(ArrayList<Pieza> piezasComidas) {
        this.piezasComidas = piezasComidas;
    }

    public int getTurnoComputadora() {
        return turnoComputadora;
    }

    public void setTurnoComputadora(int turnoComputadora) {
        this.turnoComputadora = turnoComputadora;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean isSeleccionarAlternativas() {
        return seleccionarAlternativas;
    }

    public void setSeleccionarAlternativas(boolean seleccionarAlternativas) {
        this.seleccionarAlternativas = seleccionarAlternativas;
    }

    /**
     * @return the negro
     */
    public Color getNegro() {
        return negro;
    }

    /**
     * @param negro the negro to set
     */
    public void setNegro(Color negro) {
        this.negro = negro;
    }

    /**
     * @return the blanco
     */
    public Color getBlanco() {
        return blanco;
    }

    /**
     * @param blanco the blanco to set
     */
    public void setBlanco(Color blanco) {
        this.blanco = blanco;
    }

    /**
     * @return the blancoResaltado
     */
    public Color getBlancoResaltado() {
        return blancoResaltado;
    }

    /**
     * @param blancoResaltado the blancoResaltado to set
     */
    public void setBlancoResaltado(Color blancoResaltado) {
        this.blancoResaltado = blancoResaltado;
    }

    /**
     * @return the negroResaltado
     */
    public Color getNegroResaltado() {
        return negroResaltado;
    }

    /**
     * @param negroResaltado the negroResaltado to set
     */
    public void setNegroResaltado(Color negroResaltado) {
        this.negroResaltado = negroResaltado;
    }

    /**
     * @return the Seleccionado
     */
    public Color getSeleccionado() {
        return Seleccionado;
    }

    /**
     * @param Seleccionado the Seleccionado to set
     */
    public void setSeleccionado(Color Seleccionado) {
        this.Seleccionado = Seleccionado;
    }

    /**
     * @return the Alerta
     */
    public Color getAlerta() {
        return Alerta;
    }

    /**
     * @param Alerta the Alerta to set
     */
    public void setAlerta(Color Alerta) {
        this.Alerta = Alerta;
    }
    
}




