//Se llama a la libreria Util
import java.util.*; 
public class principal{
    //se declara el Scanner
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        //se declaran las variables
        Scanner entrada = new Scanner(System.in);
        int bigchungus;

        System.out.println("3IV8 ALCALA RANGEL JEFFREY ALEXANDER");
        do{
            principal.menu();
                System.out.println("Si quiere volver al menu escriba <<1>>, si quiere cerrar el programa escriba cualquier cosa");
                bigchungus = entrada.nextInt();
        }while (bigchungus == 1);
    }
    //se crea el metodo menu
public static void menu(){
    Scanner entrada = new Scanner(System.in);
int bee;
//vuelvo a crear los objetos ya que no me los reconocia cuando solo estaban en Main :(
salarios babyoda = new salarios();
//Aqui ira el segundo objeto
//Aqui ira el tercer objeto
System.out.println("*Menu*\nIntroduzca el numero del programa a ejecutar");
System.out.println("1. Salarios\n2. \n3. ");
bee = entrada.nextInt();
if(bee<1 || bee>3){
    System.out.println("Ojo a la comedia");
} 
switch (bee){
    //se declaran los casos
    case 1:
    babyoda.menuprograma();
    break;
    
    case 2:
    //aqui se llamara al menu del segundo programa
    break;

    case 3:
    //aqui se llamara al menu del tercer programa
    break;

    
}
}
}