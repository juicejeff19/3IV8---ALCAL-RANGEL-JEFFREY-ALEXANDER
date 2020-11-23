import java.util.*;
public class salarios{
    private int id, numerohoras1, sueldodiurnas, sueldonocturnas, numerohoras2, puesto, sueldoobrerostotal;
    private double sueldoadmin1 = 8000;
        private String nombre;
        Scanner entrada = new Scanner(System.in);
    public void menuprograma(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor, Introduzca su nombre");
        nombre = entrada.nextLine();
        System.out.println("¿Que tipo de trabajador es usted?\n1. Obrero\n2. Administrativo");
        puesto = entrada.nextInt();
        switch(puesto){
            case 1:
            try{
                seguridad1();
            }catch(Exception e){
                 //mensaje de error
            System.out.println("Ojo a la comedia1");
            //saber el tipo de error
            System.out.println("Error: "+ e.getMessage());
            }
            break;

            case 2:
            try{
                seguridad2();
            }catch(Exception e){
                System.out.println("Ojo a la comedia");
                System.out.println("Error: "+e.getMessage());
            }
            break;

            default: System.out.println(":))");
        }

    }
    public void obrero(){
    System.out.println("Usted ha elegido la opcion: Obrero, calculemos su salario quincenal");
    System.out.println("¿Cuantas horas extras (diurnas) ha trabajado?");
    numerohoras1 = entrada.nextInt();
    sueldodiurnas = numerohoras1*50;
    System.out.println("Su remunerracion por las horas diurnas trabajadas es de: "+sueldodiurnas);
    System.out.println("¿Cuantas horas extras (nocturnas) ha trabajado?");
    numerohoras2 = entrada.nextInt();
    sueldonocturnas = numerohoras2*60;
    int[] sueldoobrero1 = new int[2];
    sueldoobrero1[0] = sueldodiurnas;
    sueldoobrero1[1] = sueldonocturnas;
    sueldoobrerostotal = sueldoobrero1[0]+sueldoobrero1[1]+5000;
    System.out.println("Su sueldo total quincenal es de: "+sueldoobrerostotal+"\nTenga un buen dia :)");

    }
    public void administrativo(){
        double[] sueldoadmin = new double[3];
        System.out.println("Usted ha elegido la opcion: Administrativo, calculemos su salario quincenal");
       System.out.println("El salario neto (quinsenal) de un administrativo es de: "+sueldoadmin1);
       System.out.println("Se descuenta el 0.2 para el pago de Infonavit");
       sueldoadmin[0] = sueldoadmin1-sueldoadmin1*0.2;
       System.out.println("Se descuenta el 0.1 para el pago de Seguro de gastos medicos");
       sueldoadmin[1] = sueldoadmin[0]-sueldoadmin1*0.1;
       System.out.println("Se descuenta el 0.16 para el pago de Impuestos");
       sueldoadmin[2] = sueldoadmin[1]-sueldoadmin1*0.16;
       System.out.println("Su salario quincenal real será de "+sueldoadmin[2]+"\nTenga un buen dia :)");
       
        }
        public void seguridad1(){
            System.out.println("Su nombre es: "+nombre);
            //tuve que utilizar enteros para identificar el nombre ya que no me salia bien mediante Strings :(
            System.out.println("Identifiquese porfavor, los nombres de trabajadores en calidad de obreros son:\n 1.John, 2.Cesar, 3.Isaac, 4.Alejandro\nLos nombres de los trabajadores en calidad de administratvos son:\n 5.Gabriel, 6.Dean, 7.Fernando, 8.Victor\n Porfavor, digite la ID que aparece antes de su nombre");
            id = entrada.nextInt();
            if(id==1 || id==2 || id==3 || id==4){
                obrero();
            }else{
                System.out.println("Ojo a la comedia");
            }
        }
        public void seguridad2(){
            System.out.println("Su nombre es: "+nombre);
            //tuve que utilizar enteros para identificar el nombre ya que no me salia bien mediante Strings :(
            System.out.println("Identifiquese porfavor, los nombres de trabajadores en calidad de obreros son:\n 1.John, 2.Cesar, 3.Isaac, 4.Alejandro\nLos nombres de los trabajadores en calidad de administratvos son:\n 5.Gabriel, 6.Dean, 7.Fernando, 8.Victor\n Porfavor, digite la ID que aparece antes de su nombre");
            id = entrada.nextInt();
            if(id==5 || id==6 || id==7 || id==8){
                administrativo();
            }else{
                System.out.println("Ojo a la comedia");
            }
        }
}
