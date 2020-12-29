/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author juice_pjuorme
 */
public class Furgoneta extends Vehiculo {
    private int carga;

    public Furgoneta() {
    }

    public Furgoneta(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    @Override
    public String showData(){
        return "matricula: "+matricula+"\n"+"marca: "+marca+"modelo: "+modelo+"carga: "+carga;
}
}
