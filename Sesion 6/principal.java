import java.util.*;
public class principal{
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        int bigchungus;
        Edades babyoda = new Edades();
        Figuras ugandan = new Figuras();
        Telefonia pillofon = new Telefonia();
        sesion5 admin = new sesion5();

        System.out.println("3IV8 ALCALA RANGEL JEFFREY ALEXANDER");
        do{
            principal.menu();
                System.out.println("Si quiere volver al menu escriba <<1>>, si quiere cerrar el programa escriba cualquier cosa");
                bigchungus = entrada.nextInt();
        }while (bigchungus == 1);
    }
public void menu(){
private int bee;
System.out.println("*Menu*\nIntroduzca el numero del programa a ejecutar");
System.out.println("1. Edades\n2. Figuras\n3. Telefonia");
bee = entrada.nextInt();
if(bee<1 || bee>3){
    System.out.println("Ojo a la comedia");
} 
switch{
    case 1:
    babyoda.menuprograma();
    break;
    
    case 2:
    ugandan.menuprograma();
    break;

    case 3:
    pillofon.menuprograma();
    break;
}
}
}
 