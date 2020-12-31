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
public class Jugador extends VentanaJugador{
private int puntuacion;
String edad1, edad;
String nombre;
String nom;
ArrayList<Jugador>lista=new ArrayList<>();
Jugador hola;

    public Jugador() {
        super();
    }
    

    public Jugador(int puntuacion, String nombre, String edad1, ArrayList lista) {
        super();
        this.hola = new Jugador();
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        this.edad1 = edad1;
        this.lista = lista;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad1;
    }

    public void setEdad(String edad1) {
        this.edad1 = edad1;
    }
    
    
     @Override
public String toString() {
    return "Nombre: " + this.getNombre() + "\n" +
           "Edad: " + this.getEdad();
}

    /**
     *
     * @param nom
     * @param edad
     * @return
     */
    public ArrayList guardar(String nom, String edad){
    nombre = nom;
    edad1=edad;
    this.hola = new Jugador(puntuacion, nombre, edad1, lista);
    lista.add(hola);
        System.out.println("*******************");
        System.out.println("Nombre: "+hola.getNombre()+"\n"+
                "Edad: "+hola.getEdad()+"\n"+
                        "Puntuacion Inicial: "+hola.getPuntuacion());
        System.out.println("*******************");
    return lista;
        
        
    
}
   
    public void verJugadores(){
        System.out.println("*******************");
        System.out.println("La lista de jugadores es:"+
                "\n"+
                "*******************");
        if(lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
    for (int i=0;i<lista.size();i++) {
        System.out.println("Nombre: "+lista.get(i).getNombre());
        System.out.println("Edad: "+lista.get(i).getEdad());
        System.out.println("Puntuacion: "+lista.get(i).getPuntuacion());
    }
    }
    }
    
   

}
