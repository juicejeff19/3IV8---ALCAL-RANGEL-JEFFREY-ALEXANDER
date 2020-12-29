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
public class Peon extends Pieza {
 
     public Peon(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/peon_" + (color == 1 ? "b" : "n") + ".gif")));
        setPeso(1);//Establesco el peso del Peon = 1.
    }

    @Override
    public String toString() {
        return "Peon" + (getColor() == 1 ? "blanco" : "negro");
    }

    @Override
    public boolean MoverPieza(CuadroPieza Destino, Tablero tbl) {
        if (super.MoverPieza(Destino, tbl)) {
            if (Destino.getInY() == 7 || Destino.getInY() == 0) {
                Pieza reclamar = this;
                for (int i = 0; i < tbl.getPiezasComidas().size(); i++) {
                    System.out.println(tbl.getPiezasComidas().get(i));
                    if (tbl.getPiezasComidas().get(i).getColor() == getColor()) {
                        if (reclamar.getPeso() < tbl.getPiezasComidas().get(i).getPeso()) {
                            reclamar = tbl.getPiezasComidas().get(i);
                        }
                    }
                }
                if (reclamar != this) {
                    tbl.getPiezasComidas().remove(reclamar);
                    tbl.getPiezasComidas().add(this);
                    getCuadroPieza().setPieza(reclamar);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validarMovimiento(CuadroPieza Destino, Tablero tbl) {
        if (Destino.getPieza() == null) {//No se puede comer de frente
            if (Destino.getInX() - getCuadroPieza().getInX() == 0) {//Movimiento recto
                if (Destino.getInY() - getCuadroPieza().getInY() == getColor() * -1) {
                    return super.validarMovimiento(Destino, tbl);
                }
                if (isFirstmov()) {//Si es su primer movimiento
                    if (Math.abs(getCuadroPieza().getInY() - Destino.getInY()) == 2) {
                        if (tbl.getTablero()[Destino.getInX()][Destino.getInY() + getColor()].getPieza() == null) {//Verificamos que no salte.
                            return super.validarMovimiento(Destino, tbl);
                        }
                    }
                }
            }
        } else {
            if (getColor() == -1) {//Si es negro
                if (Destino.getInY() - getCuadroPieza().getInY() == 1) {//Si avanza uno
                    if (Math.abs(Destino.getInX() - getCuadroPieza().getInX()) == 1) {
                        return super.validarMovimiento(Destino, tbl);
                    }

                }

            } else {
                if (getCuadroPieza().getInY() - Destino.getInY() == 1) {//Si avanza uno
                    if (Math.abs(getCuadroPieza().getInX() - Destino.getInX()) == 1) {
                        return super.validarMovimiento(Destino, tbl);
                    }
                }

            }
        }
        return false;
    }
    
}
