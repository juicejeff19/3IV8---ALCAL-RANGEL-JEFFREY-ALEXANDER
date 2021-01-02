/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

/**
 *
 * @author juice_pjuorme
 */
public class ModificarLista extends Jugador implements Serializable{
    
    private ArrayList<Jugador> lista;
    private ArchivoL objarchivo = new ArchivoL();
    Scanner entrada = new Scanner(System.in);
    

    public ModificarLista() {
        lista = new ArrayList<Jugador>();
        lista = objarchivo.leer();
    }

    
    @Override
    public String toString() {
        return "Nombre: "+getNombre()
                + "Edad"+getEdad()
                + "Puntuacion: "+ getPuntuacion();
    }
    
    public void agregar(String nom, String edad){
        Jugador objJugador = new Jugador();
        objJugador.aceptaDatos(nom, edad, puntuacion);
        lista.add(objJugador);
        System.out.println("Jugador Registrado");
        
    }
    
    

    
    public void consultar(){
        if(lista.isEmpty()){
            System.out.println("No hay jugadores registrados");
        }else{
            System.out.println("Los jugadores son:\n");
            //debemos recorrer el arreglo
            for(int i = 0; i<lista.size(); i++){
                System.out.println("*****************");
                System.out.println("Nombre: "+lista.get(i).getNombre());
                System.out.println("Edad: "+lista.get(i).getEdad());
                System.out.println("*****************");
            }  
        }
    }

    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }

    public ArchivoL getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(ArchivoL objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    
    public void grabar(){
        getObjarchivo().serializar(lista);
    }
    
    
}
