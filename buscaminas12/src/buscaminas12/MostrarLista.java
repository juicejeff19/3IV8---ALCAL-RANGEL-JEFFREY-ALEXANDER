/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;

import java.util.*;

/**
 *
 * @author juice_pjuorme
 */
public class MostrarLista extends Jugador{
   
    ArrayList<Jugador> listaMostrar = (ArrayList<Jugador>)lista.clone();

    public MostrarLista() {
    }

    public MostrarLista(int puntuacion, String nombre, String edad1, ArrayList lista, ArrayList listaMostrar) {
        super(puntuacion, nombre, edad1, lista);
        this.listaMostrar=listaMostrar;
        
    }
    @Override
public String toString() {
    return "Nombre: " + this.getNombre() + "\n" +
           "Edad: " + this.getEdad();
}
public void mostrar(ArrayList lista, ArrayList listaMostrar){
    if(listaMostrar.isEmpty()){
        System.out.println("La lista esta vacia");
    }else{
    
    for (int i=0;i<listaMostrar.size();i++) {
        System.out.println(listaMostrar);
    }
    }
}
    
    
}
