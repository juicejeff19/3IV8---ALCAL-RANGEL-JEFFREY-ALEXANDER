import java.util.*;
public class Salarios{
    Scanner entrada = new Scanner(System.in);
    int id,horas1,horas2, puesto;
    String nombre;
    SalaHeren no = new SalaHeren();

    public void nombre(){
        System.out.println("Porfavor, ingrese su nombre:");
        nombre = entrada.next();
    }
    public void identificacion(){
    System.out.println("Ingrese su ID");
    id = entrada.nextInt();
    System.out.println("Ingrese el numero que aparece antes de su puesto, (0)Empleado, (1)Administrativo");
    puesto = entrada.nextInt();
    caso(puesto);
    }
    public void extras(){
        System.out.println("Porfavor, ingrese las horas nocturnas trabajadas");
        horas1=entrada.nextInt();
        System.out.println("Porfavor, ingrese las horas diurnas trabajadas");
        horas2=entrada.nextInt();
    }
    public void caso(int puesto){
        System.out.println("Usted ha elegido: "+puesto);
        Salariosempleado dear = new Salariosempleado();
        switch(puesto){
            case 0:
            nombre();
            extras();
            Salariosempleado obj77 = new Salariosempleado(nombre, puesto, id, horas1, horas2);
            obj77.operaciones1();

            break;

            case 1:
            nombre();
            Salariosadmin obj78 = new Salariosadmin(nombre, puesto, id);
            obj78.sueldoa();
            break;
        }
    }
    
}