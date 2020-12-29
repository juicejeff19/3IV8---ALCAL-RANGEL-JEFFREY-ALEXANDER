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
public class Deportivo extends Vehiculo{
private int cilindrada;

    public Deportivo() {
    }

    public Deportivo(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
@Override
    public String showData(){
        return "matricula: "+matricula+"\n"+"marca: "+marca+"modelo: "+modelo+"cilindrada: "+cilindrada;
    }
}
