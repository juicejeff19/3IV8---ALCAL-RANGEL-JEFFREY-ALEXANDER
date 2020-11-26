import java.util.*;
public class Salariosempleado extends SalaHeren{
    private float salario2;
    private int horas1, horas2;
    float salario1 = 5000;
    public Salariosempleado(){

    }
    
    public Salariosempleado(String nombre, int id, int puesto, int horas1, int horas2){
        super(nombre, id, puesto);
    this.horas1 = horas1;
    this.horas2 = horas2;
    }


    public int getHoras1(){
        return horas1;
    }

    public void setHoras1(int horas1){
        this.horas1 = horas1;
    }

    public int getHoras2(){
        return horas2;
    }

    public void setHoras2(int horas2){
        this.horas2 = horas2;
    }

    public void operaciones1(){
        float[] Salarioarray = new float[2];
        System.out.println("Bienvenido, calculemos su salario, su sueldo base es de $5000 (quincenales)");
        Salarioarray[0] = salario1+(getHoras1()*50);
        System.out.println("Su salario tras el aumento de las horas diurnas es de: "+Salarioarray[0]);
        Salarioarray[1] = Salarioarray[0]+(getHoras2()*60);
        System.out.println("Su salario tras el aument de las horas nocturnas es de "+Salarioarray[1]);


}
}

