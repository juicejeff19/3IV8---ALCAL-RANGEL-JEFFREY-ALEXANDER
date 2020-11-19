// se llama al Scanner
import java.util.Scanner;
public class telefonia{
// se declaran las variables
    private int numero, opcion;
    private double credito, tiempo, cargo, total, credito2;
    private double credito1=69;
    Scanner entrada = new Scanner(System.in);
    //se crea el metodo del menu
    public void menuprograma(){
    System.out.println("Bienvenido\nSeleccione la operacion que desea realizar");
    System.out.println("1. Llamada\n2. Consulta de Credito");
    opcion = entrada.nextInt();
    if(opcion<1 || opcion>2){
        System.out.println("Ojo a la comedia");
    }
    //se declaran los casos, regresando al menu una vez terminada cada operación
    switch(opcion){
        case 1:
        tipo();
        System.out.println("El cargo es de $"+cargo);
        menuprograma();
        break;

        case 2:
        credito();
        menuprograma();

        break;

    }
}
// se obtiene el tipo de operación a realizar
    public void tipo(){
        System.out.println("Usted empezo con un credito de $69, al cual se le han restado" +credito2);
        System.out.println("Introduzca el numero a llamar");
        numero = entrada.nextInt();
        System.out.println("Introdizca el tipo de llamada");
        System.out.println("1. Nacional\n2. internacional\n3. Celular");
        tiempo = entrada.nextDouble();
        System.out.println("Introduzca el tiempo");
        double opcion2;
        opcion2=entrada.nextDouble();
        if(opcion2<1 || opcion>3){
            System.out.println("Ojo a la comedia");
        }
       cargo = cargo(tiempo,opcion2);
    } //se realizan las operaciones
    public double cargo(double opcion2, double tiempo){
        if(opcion==1){
            cargo=tiempo*0.5;
        }
        if(opcion==2){
            cargo=tiempo*0.6;
        }
        if(opcion==3){
            cargo=tiempo*0.2;
            
        }
        total += cargo;
        return cargo;
    }
    //metodo para comprobar el credito
    public void credito(){
        credito2 = credito1 - cargo;
        System.out.println("El credito actual es: "+credito2);
    }


}