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
    
    public void agregar(String nom, String edad){
        Jugador objJugador = new Jugador();
        objJugador.aceptaDatos(nom, edad);
        lista.add(objJugador);
        System.out.println("Jugador Registrado");
        System.out.println("Prueba, el nombre es: "+objJugador.getNombre());
    }
    
    public void consultar(){
        if(lista.isEmpty()){
            System.out.println("No hay libros registrados");
        }else{
            System.out.println("Los libros son:\n");
            //debemos recorrer el arreglo
            for(int i = 0; i<lista.size(); i++){
                System.out.println("*****************");
                System.out.println("Nombre: " + lista.get(i).getNombre()+ "\n"
                                 + "Edad: " + lista.get(i).getEdad()+ "\n");
                                 
                System.out.println("*****************");
            }
            
        }
    }
    
    
}
