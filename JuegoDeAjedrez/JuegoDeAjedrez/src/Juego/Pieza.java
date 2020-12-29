/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.ImageIcon;

/**
 * Esta clase abstracta establecerá las funciones basicas de toda pieza, sera la clase padre, de las demas piezas
 * Se declara abstracta para que no pueda ser instanciada.
 * @author JhonFrayser
 */
public abstract class Pieza {

    /**
     * Es una variable static o variable de clase, establece cuantos mavimientos hay actualmente sin realizar algun cambio(comer a otras piezas)
     * Esto es para cumplir la regla que dice que no pueden pasar mas de 50 turnos sin comer alguna pieza del oponente.
     */
    private static int cantMovimientosSinCambios = 0;

    /**
     * @return the cantMovimientosSinCambios
     */
    public static int getCantMovimientosSinCambios() {
        return cantMovimientosSinCambios;
    }

    public static void setCantMovimientosSinCambios(int aCantMovimientosSinCambios) {
        cantMovimientosSinCambios = aCantMovimientosSinCambios;
    }
    /**
     * Establece si la pieza ya se ha movido alguna vez, dado que algunas piezas solo pueden realizar determinados movimientos en su primer movimiento
     * Como es el peon que puede moverse dos casillas hacia adelante en su primer movimiento.
     * O el rey que solo puede hacer enroque en su primer movimiento
     */
    private boolean firstmov = true;
    /**
     * Establece el peso de la pieza, esto quiere decir cuanto vale una pieza, los valores de las piezas serán establecidos por las clases que hereden.
     * Los valores son los siquientes:
     * Rey: -- No tiene peso es el mas importante, le estableceremos un peso 10
     * Reina: 8
     * Torre: 5
     * Caballo: 3
     * Alfil: 3
     * Peon: 1
     */
    private int peso;
    /**
     * Establece el color de la pieza
     * Blanco: 1
     * Negro: -1
     */
    private int color;
    /**
     * Es la imagen de la pieza, que será declarada en las clases hijas.
     */
    private ImageIcon imagenPieza;
    /**
     * Es el cuadro del tablero en donde actualmente esta la pieza.
     */
    private CuadroPieza cuadroPieza = null;

    /**
     * Constructor.
     * @param color
     * Blanco: 1
     * Negro: -1
     */
    public Pieza(int color) {
        this.color = color;
    }

  
     public boolean validarMovimiento(CuadroPieza Destino, Tablero tbl) {
        if (Destino.getPieza() != null) {//Si el cuadro destino esta ocupado entonces:
            if (Destino.getPieza().getColor() == getCuadroPieza().getPieza().getColor()) {
                //Si la pieza destino tiene el mismo color que la pieza que voy a mover
                return false; //El movimiento es invalido, no puedo comer una pieza de mi mismo equipo.
            }
        }
        //---Valido que no su rey no entre en jacke despues de que se mueva.
        Pieza tmpDestino = Destino.getPieza();//Guardo las piezas en temporales, para deshacer los cambios
        Pieza tmpActual = getCuadroPieza().getPieza();//Guardo las piezas en temporales, para deshacer los cambios
        CuadroPieza Actual = getCuadroPieza();//El cuadro dode actualmente esta la pieza, tambien lo guardo.
        Actual.setPieza(null);//simulo un movimiento, dejo el cuadro actual en vacio
        Destino.setPieza(this);//Muevo esta pieza al cuadro destino
        //Valido si despues de que mueva, el rey esta en jacke.
        boolean b = tbl.getRey(getColor()).isInJacke(tbl);//Para lo cual obtengo el rey del mismo color de la pieza y le pregunto si esta en jacke

        Actual.setPieza(tmpActual);//Deshago los cambios, porque SOLO valido, NO muevo piezas
        Destino.setPieza(tmpDestino);//Deshago los cambios, porque solo valido, NO muevo piezas
        /* 
         * Si retorna que esta en jacke(b=true), entonces el movimiento es invalido,
         * Si retorna que no esta en jacke(b=false), el mov. es valido.
         */
        return !b;

    }


    

     public boolean MoverPieza(CuadroPieza Destino, Tablero tbl) {
        /*
         * Valido el movimiento, antes de mover, tener en cuenta que en las clases hijas este metodo debe haber sido sobreescrito
         * Por lo que no solo va a validar lo que hay en el metodo validarMovimiento de Pieza, si no va a usar el metodo sobreescrito en la clase hija
         */
        if (validarMovimiento(Destino, tbl)) {
            getCuadroPieza().setPieza(null);//Le paso al cuadro donde actualmente esta la pieza el valor de null, que quiere decir que ya no tiene pieza
            if (Destino.getPieza() != null) {//Si hay una pieza en el destino
                tbl.getPiezasComidas().add(Destino.getPieza());//Agrego la pieza que estoy comiento a un arraylist de piezas comidas.
                setCantMovimientosSinCambios(0);//Si come a alguna pieza, reseteo el contador de movimientos sin cambios.
            } else {
                setCantMovimientosSinCambios(getCantMovimientosSinCambios() + 1);//Si no come alguna pieza, el contador aumenta en uno.
            }
            Destino.setPieza(this);//Muevo la pieza al cuadro destino
            setFirstmov(false);//El siguiente movimiento, ya no sería el primero.
            return true;
        } else {
            return false;
        }
    }
 
         public static boolean isJugadorAhogado(int turno, Tablero tbl) {
  
            CuadroPieza cuadroDestino = null;
            CuadroPieza cuadroActual = null;
            /*
             * Lo que se hace aqui es recorrer todas las piezas, y comparar si tienen algun movimiento posible, a alguna posicion del tablero.
             * Para recorrer todas las piezas uso los dos primeros for.
             * Para recorrer los cuadros posibles a los que se puede mover, uso los 2 siguientes for.
             */
            for (int x = 0; x < 8; x++) {//Busco todas las piezas del jugador del que quiero saber si esta ahogado.
                for (int y = 0; y < 8; y++) {
                    cuadroActual = tbl.getTablero()[y][x];
                    if (cuadroActual.getPieza() != null) {//Si hay una pieza en el cuadro selecciondo actualmente por el for.
                        if (cuadroActual.getPieza().getColor() == turno) {//Reviso que sea del color de pieza, que del jugador que quiero averiguar si esta ahogado.
                            for (int x1 = 0; x1 < 8; x1++) {//Recorro todos los cuadros a del tablero preguntandole si puede moverse a ese cuadro
                                for (int y1 = 0; y1 < 8; y1++) {
                                    cuadroDestino = tbl.getTablero()[y1][x1];
                                    if (cuadroActual.getPieza().validarMovimiento(cuadroDestino, tbl)) {//Si hay un movimiento posible, entonces no esta ahogado
                                        return false;
                                    }

                                }
                            }
                        }
                    }
                }
            }
            return true;//Si no encontro algun movimiento posible, pues el usuario esta ahogado, y retorno true.
    }
   
    public int getColor() {
        return color;
    }

    /**
     *
     * Blanco: 1
     * Negro: -1
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * @return the firstmov
     */
    public boolean isFirstmov() {
        return firstmov;
    }

    
    public void setFirstmov(boolean firstmov) {
        this.firstmov = firstmov;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the imagenPieza
     */
    public ImageIcon getImagenPieza() {
        return imagenPieza;
    }

    /**
     * @param imagenPieza the imagenPieza to set
     */
    public void setImagenPieza(ImageIcon imagenPieza) {
        this.imagenPieza = imagenPieza;
    }

    /**
     * @return the cuadroPieza
     */
    public CuadroPieza getCuadroPieza() {
        return cuadroPieza;
    }

    /**
     * @param cuadroPieza the cuadroPieza to set
     */
    public void setCuadroPieza(CuadroPieza cuadroPieza) {
        this.cuadroPieza = cuadroPieza;
    }
}
