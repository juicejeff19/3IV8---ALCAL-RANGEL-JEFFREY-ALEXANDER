/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author juice_pjuorme
 */
public class ModificarLista extends Jugador implements Serializable{
    
    public ArrayList<Jugador> lista;
    public ArchivoL objarchivo = new ArchivoL();

    public ModificarLista() {
        lista = new ArrayList<>();
        lista = objarchivo.leer();
    }

    public ModificarLista(int puntuacion, String nombre, String edad1) {
        super(puntuacion, nombre, edad1);
    }
    
    public void agregar(String nom, String edad){
        Jugador objJugador = new Jugador();
        objJugador.aceptaDatos(nom, edad, puntuacion);
        lista.add(objJugador);
        System.out.println("Jugador Registrado");
        System.out.println("Prueba, el nombre es: "+objJugador.getNombre());
        
    }
    
    

    
    public void consultar(){
        if(lista.isEmpty()){
            System.out.println("No hay jugadores registrados");
        }else{
            System.out.println("Los libros son:\n");
            //debemos recorrer el arreglo
            for(int i = 0; i<lista.size(); i++){
                System.out.println("*****************");
                System.out.println(lista);
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
