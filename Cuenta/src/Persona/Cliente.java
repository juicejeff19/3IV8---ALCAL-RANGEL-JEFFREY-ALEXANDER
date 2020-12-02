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
public class Cliente extends Persona{
    private int num_cuenta;
    private String tipo_cuenta;

    public Cliente() {
    }

    public Cliente(String nombre, String appat, String apmat, int edad, String domicilio) {
        super(nombre, appat, apmat, edad, domicilio);
    }
    
    public void RegistrarCliente(Cliente c){
        
    }
    
}
