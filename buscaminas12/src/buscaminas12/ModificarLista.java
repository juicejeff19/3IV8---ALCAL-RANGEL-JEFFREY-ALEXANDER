/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;

import java.util.ArrayList;

/**
 *
 * @author juice_pjuorme
 */
public class ModificarLista extends Jugador{
    
    protected ArrayList<Jugador> lista;

    public ModificarLista() {
        lista = new ArrayList<>();
    }

    public ModificarLista(int puntuacion, String nombre, String edad1, ArrayList lista) {
        super(puntuacion, nombre, edad1, lista);
    }
    
    public void agregar(){
        
    }
    
    
}
