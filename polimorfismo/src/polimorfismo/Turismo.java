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
public class Turismo extends Vehiculo{
    private int npuertas;

    public Turismo() {
    }

    public Turismo(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }
    @Override
    public String showData(){
        return "matricula: "+matricula+"\n"+"marca: "+marca+"modelo: "+modelo+"numero de puertas: "+npuertas;
    }

    void recopilartu() {
        System.out.println("Ingresa el numero de puertas");
        npuertas = entrada.nextInt();
    }
    
}
