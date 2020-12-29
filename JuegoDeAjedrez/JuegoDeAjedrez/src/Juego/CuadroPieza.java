
package Juego;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jhon Frayser
 */
public class CuadroPieza extends JPanel {

    private int inX;
    private int inY;
     private Pieza pieza = null;
    public JLabel lbl = new JLabel();
    // para imprimir o mostrar una imagen en un jpanel
    // se realiza mediante un JLabel.
    private Color fondo;
    private Color resaltar;

    public CuadroPieza(int x, int y) {
        add(lbl);// agrega el label a Jpanel .add es un metodo del Jpanel
        this.inX = x;
        this.inY = y;
    }
    
    
     public Pieza getPieza() {
        return pieza;
    }
   public void setPieza(Pieza pieza) {
        this.pieza = pieza;
        if (pieza != null) {
            lbl.setIcon(pieza.getImagenPieza());
            pieza.setCuadroPieza(this);
        } else {
            lbl.setIcon(null);
        }
    }

    public void resaltarPieza() {
        setBorder(javax.swing.BorderFactory.createLineBorder(Color.CYAN, 4));
        setBackground(resaltar);
        setBorder(null);
    }

    public void resaltarPieza(Color c) {
        if (c != null) {
            setBackground(c);
            setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLUE, 3));
        } else {
            resaltarPieza();
        }
    }

    public void opacarPieza() {
        setBackground(getFondo());
        setBorder(null);
    }
    
     /**
     * @return the inX
     */
    public int getInX() {
        return inX;
    }
  
    /**
     * @param inX the inX to set
     */
    public void setInX(int inX) {
        this.inX = inX;
    }

    /**
     * @return the inY
     */
    public int getInY() {
        return inY;
    }

    /**
     * @param inY the inY to set
     */
    public void setInY(int inY) {
        this.inY = inY;
    }

    /**
     * @return the fondo
     */
    public Color getFondo() {
        return fondo;
    }

    /**
     * @param fondo the fondo to set
     */
    public void setFondo(Color fondo) {
        setBackground(fondo);// se hereda de un jpnael para poner un fondo
        setBorder(null);
        this.fondo = fondo;
    }

    /**
     * @return the resaltar
     */
    public Color getResaltar() {
        return resaltar;
    }

    /**
     * @param resaltar the resaltar to set
     */
    public void setResaltar(Color resaltar) {
        this.resaltar = resaltar;
    }
}

