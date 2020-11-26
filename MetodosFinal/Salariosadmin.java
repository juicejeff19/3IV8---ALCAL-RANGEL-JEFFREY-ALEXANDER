public class Salariosadmin extends SalaHeren{
    public Salariosadmin(){

    }
    public Salariosadmin(String nombre, int id, int puesto){
        super(nombre, id, puesto);
    }
    
    public void sueldoa(){
        double[] salario2 = new double[3];
        System.out.println("Su nombre es: "+getNombre());
        System.out.println("Su ID es:" +getId());
        System.out.println("Su sueldo base es de $8000");
        salario2[0]=8000-8000*0.2;
        System.out.println("Su salario tars el descuento de infonavit es de: "+salario2[0]);
        salario2[1]=salario2[0]-8000*0.1;
        System.out.println("Su salario tars el descuento de 'Gastos de seguro Mdico' es de: "+salario2[1]);
        salario2[2]=salario2[1]-8000*0.16;
        System.out.println("Su salario final es de: "+salario2[2]);


    }
}