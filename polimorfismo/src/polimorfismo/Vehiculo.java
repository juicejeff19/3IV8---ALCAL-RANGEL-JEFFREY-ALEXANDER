/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import java.util.*;

/**
 *
 * @author juice_pjuorme
 */
public class Vehiculo {
    Scanner entrada = new Scanner(System.in);
    
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int tipo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String showData(){
        return "matricula: "+matricula+"\n"+"marca: "+marca+"modelo: "+modelo;
        
    }
    public void recopilar(){
        
        System.out.println("Bienvenido, ingresa los datos de los vehiculos");
        System.out.println("Ingresa la matricula del vehiculo");
        matricula=entrada.next();
        System.out.println("Ingresa la marca");
        marca=entrada.next();
        System.out.println("Ingresa el modelo");
        modelo=entrada.next();
        System.out.println("Que clase de vehiculo estas registrando?"+"\n"+"1.Deportivo"+"n"+"2. Turismo"+"\n"+"3.Furgoneta");
        tipo = entrada.nextInt();
        switch (tipo) {
            case 1:
                Turismo ob1 = new Turismo();
                ob1.recopilartu();
                
                break;
            default:
                throw new AssertionError();
        }
}
}
