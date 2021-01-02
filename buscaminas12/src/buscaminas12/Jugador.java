/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;
import java.util.*;
import java.io.*;

/**
 *
 * @author juice_pjuorme
 */
public class Jugador extends VentanaJugador implements Serializable{
int puntuacion;
String edad1, edad;
String nombre;
String nom;

    public Jugador() {
  
    }
    

    public Jugador(int puntuacion, String nombre, String edad1) {
        super();
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        this.edad1 = edad1;
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
    
    public void aceptaDatos(String nom, String edad, int puntuacion){
        nombre=nom;
        System.out.println("El nombre es: "+nombre);
        edad1=edad;
        System.out.println("La edad es: "+edad1);
        System.out.println("La puntuacion inicial es de: " +getPuntuacion());
        ModificarLista o = new ModificarLista();
        System.out.println("Los datos ingresados son validos, estos NO se podran cambiar despues");
                
    }
    
}