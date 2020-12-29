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
public class Torre extends Pieza {
      public Torre(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/torre_" + (color == 1 ? "b" : "n") + ".gif")));
        setPeso(5);
    }

    public String toString() {
        return "Torre " + (getColor() == 1 ? "blanco" : "negro");
    }

    @Override
    public boolean validarMovimiento(CuadroPieza Destino,Tablero tbl) {
        //Si se mueve en Y
        if (Destino.getInX() - getCuadroPieza().getInX() == 0) {
            //Variables del for
            int inicio, fin;
            if(getCuadroPieza().getInY()<Destino.getInY()){
                inicio = getCuadroPieza().getInY()+1;
                fin = Destino.getInY();
            }else{
                inicio = Destino.getInY()+1;
                fin = getCuadroPieza().getInY();
            }
            //recorro todos los valores
            for (int i = inicio; i < fin; i++) {
                if (tbl.getTablero()[getCuadroPieza().getInX()][i].getPieza() != null) {
                    return false;
                }
            }
            return super.validarMovimiento(Destino, tbl);
        }
        //Si se mueve en X
        if (Destino.getInY() - getCuadroPieza().getInY() == 0) {

            //Variables del for
            int inicio, fin;
            if(getCuadroPieza().getInX()<Destino.getInX()){
                inicio = getCuadroPieza().getInX()+1;
                fin = Destino.getInX();
            }else{
                inicio = Destino.getInX()+1;
                fin = getCuadroPieza().getInX();
            }
            //recorro todos los valores
            for (int i = inicio; i < fin; i++) {
                if (tbl.getTablero()[i][getCuadroPieza().getInY()].getPieza() != null) {
                    return false;
                }
            }
            return super.validarMovimiento(Destino, tbl);
        }
        return false;
    }
}
