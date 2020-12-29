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
public class Reina extends Pieza {
 public Reina(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/reina_" + (color == 1 ? "b" : "n") + ".gif")));
        setPeso(8);
    }

    public String toString() {
        return "Reina" + (getColor() == 1 ? "blanco" : "negro");
    }

    public boolean validarMovimiento(CuadroPieza Destino, Tablero tbl) {
        Torre t = new Torre(0);
        t.setCuadroPieza(getCuadroPieza());
        if (t.validarMovimiento(Destino, tbl)) {
            return super.validarMovimiento(Destino, tbl);
        }
        Alfil a = new Alfil(0);
        a.setCuadroPieza(getCuadroPieza());
        if (a.validarMovimiento(Destino, tbl)) {
            return super.validarMovimiento(Destino, tbl);
        }
        return false;

    }
}
