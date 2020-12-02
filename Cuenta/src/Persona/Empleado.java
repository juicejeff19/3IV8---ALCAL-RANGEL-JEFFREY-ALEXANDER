/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author juice_pjuorme
 */
public class Empleado extends Persona{
    private int num_empleado;
    private double sueldo;
    
    public Empleado(){
    }

    public Empleado(int num_empleado, double sueldo) {
        this.num_empleado = num_empleado;
        this.sueldo = sueldo;
    }

    public Empleado(int num_empleado, double sueldo, String nombre, String appat, String apmat, int edad, String domicilio) {
        super(nombre, appat, apmat, edad, domicilio);
        this.num_empleado = num_empleado;
        this.sueldo = sueldo;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    

    
}
