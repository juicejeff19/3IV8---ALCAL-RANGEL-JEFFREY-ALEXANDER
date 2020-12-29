/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author juice_pjuorme
 */
public class Pizza {
    //Niveles de acceso a los datos
    
    private String masa;
    private String salsa;
    private String[] ingredientes;
    
    public Pizza(){}

    public Pizza(String masa, String salsa, String[] ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void preparar(){
        System.out.println("La masa preparada es de: ");
        System.out.println("Se agrega la salsa de: ");
        System.out.println("Se agregan los ingredientes de: ");
        for(int i=0;i<this.ingredientes.length-1;i++){
            System.out.println(this.ingredientes[i]+" ");
        }
        
    }
    
    public void hornear(){
        
    }
    
    public void cortar(){
        
    }
    
    
}
