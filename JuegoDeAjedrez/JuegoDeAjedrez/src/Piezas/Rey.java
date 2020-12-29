/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Piezas;

import Juego.CuadroPieza;
import Juego.Pieza;
import Juego.Tablero;
import javax.swing.ImageIcon;
/**
 *
 * @author Jhon Frayser
 */
public class Rey extends Pieza {
public Rey(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/rey_" + (color == 1 ? "b" : "n") + ".gif")));
        setPeso(10);
    }

    public String toString() {
        return "Rey" + (getColor() == 1 ? "blanco" : "negro");
    }

    public boolean MoverPieza(CuadroPieza Destino, Tablero tbl) {
        if (validarMovimiento(Destino, tbl)) {
            validarEnroque(Destino, tbl, true);
            getCuadroPieza().setPieza(null);
            if(Destino.getPieza()!=null){
                tbl.getPiezasComidas().add(Destino.getPieza());
                setCantMovimientosSinCambios(0);
            }else{
                setCantMovimientosSinCambios(getCantMovimientosSinCambios() + 1);
            }
            Destino.setPieza(this);
            setFirstmov(false);
            return true;
        }
        return false;
    }

    public boolean validarMovimiento(CuadroPieza Destino, Tablero tbl) {
        if (Math.abs(getCuadroPieza().getInX() - Destino.getInX()) <= 1) {
            if (Math.abs(getCuadroPieza().getInY() - Destino.getInY()) <= 1) {
                return super.validarMovimiento(Destino, tbl);
            }
        }
        //Si llego hasta aqui, es por que sus movimientos no son validos
        //Su ultima opcion es el enroque, si no es asi ya retorna falso pero si hay enroque retorna true.
        if (validarEnroque(Destino, tbl, false)) {//El segundo parametro falso por que solo quiero saber si se puede.
            return super.validarMovimiento(Destino, tbl);
        }
        return false;

    }

    private boolean validarEnroque(CuadroPieza Destino, Tablero tbl, boolean movTorre) {
        int cantCuaMov = getCuadroPieza().getInX() - Destino.getInX();
        //Si el mov. del rey es horizontal, si es su primer movimiento y si mueve solo dos casillas, ya sea a la derecha o a la izq.
        if ((getCuadroPieza().getInY() - Destino.getInY() == 0) && isFirstmov() && Math.abs(cantCuaMov) == 2) {
            Pieza torreAMover = tbl.getTablero()[getCuadroPieza().getInY()][cantCuaMov == -2 ? 7 : 0].getPieza();
            if (torreAMover != null) {
                if (torreAMover.isFirstmov()) {//Sea la pieza que sea, si es su primer movimiento, tiene que ser la torre del rey
                    if (movTorre) {//Si tengo que moverla, la muevo, si no solo valido que se permita el movimiento.
                        return torreAMover.MoverPieza(tbl.getTablero()[cantCuaMov == -2 ? 5 : 3][getCuadroPieza().getInY()], tbl);
                    } else {
                        return torreAMover.validarMovimiento(tbl.getTablero()[cantCuaMov == -2 ? 5 : 3][getCuadroPieza().getInY()], tbl);
                    }

                }
            }
        }
        return false;
    }

    public boolean isInJacke(Tablero tbl) {
        try {
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++) {
                    if (tbl.getTablero()[y][x].getPieza() != null) {
                        if (tbl.getTablero()[y][x].getPieza().getColor() == getColor() * -1) {//Si es el enemigo
                            if (tbl.getTablero()[y][x].getPieza().validarMovimiento(getCuadroPieza(), tbl)) {
                                //Si puede comer al rey.
                                return true;
                            }

                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
