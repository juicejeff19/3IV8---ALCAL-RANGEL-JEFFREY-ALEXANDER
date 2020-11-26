import java.util.*;
public class Salarios{
    Scanner entrada = new Scanner(System.in);
    int id,horas1,horas2, puesto;
    String nombre;

    public void nombre(){
        System.out.println("Porfavor, ingrese su nombre:");
        nombre = entrada.next();
    }
    public void identificacion(){
    System.out.println("Ingrese su ID");
    id = entrada.nextsInt();
    System.out.println("Ingrese el numero que aparece antes de su puesto, (0)Empleado, (1)Administrativo");
    puesto = entrada.nextInt();
    }
    public void extras(){
        System.out.println("Porfavor, ingrese las horas nocturnas trabajadas");
        horas1=entrada.nextInt();
        System.out.println("Porfavor, ingrese las horas diurnas trabajadas");
        horas2=entrada.nextInt();
    }
    public void caso(int puesto){
        switch(id){
            case 0:
            nombre();
            identificacion();

            break;

            case 1:
            nombre();
            identificacion();

            break;
        }
    }
    
}