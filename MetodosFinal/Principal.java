//Se llama a la libreria Util
import java.util.*; 
public class Principal{
    //se declara el Scanner
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        //se declaran las variables
        Scanner entrada = new Scanner(System.in);
        int bigchungus;
        System.out.println("3IV8 ALCALA RANGEL JEFFREY ALEXANDER");
        do{
            Principal.menu();
                System.out.println("Si quiere volver al menu escriba <<1>>, si quiere cerrar el programa escriba cualquier cosa");
                bigchungus = entrada.nextInt();
        }while (bigchungus == 1);
    }
    //se crea el metodo menu
public static void menu(){
    Scanner entrada = new Scanner(System.in);
int bee;
Salarios cesar = new Salarios();
//vuelvo a crear los objetos ya que no me los reconocia cuando solo estaban en Main :(
System.out.println("*Menu*\nIntroduzca el numero del programa a ejecutar");
System.out.println("1. Salarios\n2. Proovedores\n3. Biblioteca");
bee = entrada.nextInt();
if(bee<1 || bee>3){
    System.out.println("Ojo a la comedia");
} 
switch (bee){
    //se declaran los casos
    case 1:
    cesar.identificacion();
    break;
    
    case 2:
    cesar.identificacion();
    break;

    case 3:
    cesar.identificacion();
    break;

    default: System.out.println(":))");

    
}
}
}
