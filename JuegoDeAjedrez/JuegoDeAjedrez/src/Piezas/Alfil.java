/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Piezas;
import Juego.CuadroPieza;
import Juego.Tablero;
import javax.swing.ImageIcon;
import Juego.Pieza;

/**
 *
 * @author Jhon Frayser
 */
public class Alfil  extends Pieza {
public Alfil(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/alfil_" + (color == 1 ? "b" : "n") + ".gif")));
        setPeso(3);//Establesco el peso del alfil.
    }

    public String toString() {
        return "Alfil " + (getColor() == 1 ? "blanco" : "negro");
    }

    /*
     * Validar Movimiento, metodo sobreescrito de la clase Pieza.
     */
    @Override
    public boolean validarMovimiento(CuadroPieza Destino, Tablero tbl) {
        //Si la cantidad de cuadros movidos horizontalmente es la misma que verticalmente, es un movimiento valido del alfil.
        if (Math.abs(Destino.getInY() - getCuadroPieza().getInY()) == Math.abs(Destino.getInX() - getCuadroPieza().getInX())) {
            /*
             * A partir de aqui valido que no haya piezas de intermedio, recordemos que el alfil no puede saltar.
             * ----------------------------------------------------------------------------------------------------
             * Con los if's, doy la orientacion de los for, esto quiere decir que el for puede ir:
             * - de Arriba a abajo de derecha a izquierda
             * - de Arriba a abajo de izquierda a derecha
             * - de abajo a arriba de derecha a izquierda
             * - de abajo a arriba de izquierda a derecha
             * Por esa razon son 4 ifs.
            */

            //Si el movimiento es de abajo a arriba de izquierda a derecha
            if (Destino.getInY() > getCuadroPieza().getInY() && Destino.getInX() > getCuadroPieza().getInX()) {
                for (int y = getCuadroPieza().getInY() + 1, x = getCuadroPieza().getInX() + 1; y < Destino.getInY() && x < Destino.getInX(); y++, x++) {
                    //Y y X empiezan en un cuadro delante, para que no se cuente el cuadro actual, y terminan en un cuadro antes de destino
                    //ambos Van aumentando en uno en uno.
                    if (tbl.getTablero()[x][y].getPieza() != null) {//Si hay alguna pieza en el cuadro revisado, retorno false.
                        return false;
                    }

                }
            }

            //Si el movimiento es de abajo a arriba de derecha a izquierda
            if (Destino.getInY() > getCuadroPieza().getInY() && Destino.getInX() < getCuadroPieza().getInX()) {
                for (int y = getCuadroPieza().getInY() + 1, x = getCuadroPieza().getInX() - 1; y < Destino.getInY() && x > Destino.getInX(); y++, x--) {
                    //Y y X empiezan en un cuadro delante, para que no se cuente el cuadro actual, pero esta vez x va hacía los negativos por lo que empieza en el x actual -1
                    //Ademas el contador de y va aumentando, mientras el x va disminuyendo en 1
                    if (tbl.getTablero()[x][y].getPieza() != null) {//Si hay alguna pieza en el cuadro revisado, retorno false.
                        return false;
                    }

                }
            }
            //Si el movimiento es de arriba a abajo de izquierda a derecha
            if (Destino.getInY() < getCuadroPieza().getInY() && Destino.getInX() > getCuadroPieza().getInX()) {
                for (int y = getCuadroPieza().getInY() - 1, x = getCuadroPieza().getInX() + 1; y > Destino.getInY() && x < Destino.getInX(); y--, x++) {
                    //Y y X empiezan en un cuadro delante, para que no se cuente el cuadro actual, pero esta vez y va hacía los negativos por lo que empieza en una el y actual -1
                    //Ademas el contador de y va disminuyendo, mientras el x va aumentando en 1
                    if (tbl.getTablero()[x][y].getPieza() != null) {//Si hay alguna pieza en el cuadro revisado, retorno false.
                        return false;
                    }

                }
            }
            //Si el movimiento es de arriba a abajo de derecha a izquierda.
            if (Destino.getInY() < getCuadroPieza().getInY() && Destino.getInX() < getCuadroPieza().getInX()) {
                for (int y = getCuadroPieza().getInY() - 1, x = getCuadroPieza().getInX() - 1; y > Destino.getInY() && x > Destino.getInX(); y--, x--) {
                    //tanto x como y van hacia los negativos por lo tanto empiezan en un X y un Y menos, y sus contadores van restando menos 1
                    if (tbl.getTablero()[x][y].getPieza() != null) {//Si hay alguna pieza en el cuadro revisado, retorno false.
                        return false;
                    }

                }
            }
            return super.validarMovimiento(Destino, tbl);//Si todo esta bien debería retornar true, a menos que haya un problema con el validar movimiento del padre.

        }
        return false;
    }

}
