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
            //se llama al menu desde donde quiera que este
            Principal.menu();
                System.out.println("Si quiere volver al menu escriba <<1>>, si quiere cerrar el programa escriba cualquier cosa");
                //funcion para repetir el menu
                bigchungus = entrada.nextInt();
        }while (bigchungus == 1);
    }
    //se crea el metodo menu
public static void menu(){
    Scanner entrada = new Scanner(System.in);
int bee;
//se crean los objetos para invocar a los metodos
Datos exa = new Datos();
Alumno pug = new Alumno();
//se piden los datos
System.out.println("*Menu*\nIntroduzca el numero del programa a ejecutar");
System.out.println("1. Buscaminas\n2. Datos del Alumno");
bee = entrada.nextInt();
if(bee<1 || bee>3){
    System.out.println("Ojo a la comedia");
} 
switch (bee){
    //se declaran los casos
    case 1:
    exa.identificacion();
    break;
    
    case 2:
    pug.alumno();
    break;

    default: System.out.println(":))");

    
}
}
}