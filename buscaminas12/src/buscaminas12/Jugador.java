/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;

/**
 *
 * @author juice_pjuorme
 */
public class Jugador extends VentanaJugador{
private int puntuacion,edad;
private String nombre;

    public Jugador() {
    }

    public Jugador(int puntuacion, String nombre, int edad) {
        super();
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void check(){
        System.out.println("El nombre es: "+getNombre());
    }
    
   

}
