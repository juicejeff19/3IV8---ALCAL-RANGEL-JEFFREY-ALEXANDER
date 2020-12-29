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
public class Caballo extends Pieza {
   public Caballo(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/caballo_" + (color == 1 ? "b" : "n") + ".gif")));
        setPeso(3);
    }

    public String toString() {
        return "Caballo" + (getColor() == 1 ? "blanco" : "negro");
    }

    public boolean validarMovimiento(CuadroPieza Destino, Tablero tbl) {
        if (Math.abs((getCuadroPieza().getInX() - Destino.getInX())) == 2) {//Si se mueve dos casillas en x
            if (Math.abs(getCuadroPieza().getInY() - Destino.getInY()) == 1) {//Si se mueve una casillas en y
                return super.validarMovimiento(Destino, tbl);
            }
        }

        if (Math.abs(getCuadroPieza().getInY() - Destino.getInY()) == 2) {//Si se mueve dos casillas en y
            if (Math.abs(getCuadroPieza().getInX() - Destino.getInX()) == 1) {//Si se mueve 1 casillas en x
                return super.validarMovimiento(Destino, tbl);
            }
        }
        return false;
    }   
}
