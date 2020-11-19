//Se llama a la libreria Util
import java.util.*; 
public class principal{
    //se declara el Scanner
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        //se declaran las variables
        Scanner entrada = new Scanner(System.in);
        int bigchungus;
        Edades babyoda = new Edades();
        figuras despacito2 = new figuras();
        telefonia amlo = new telefonia();
        principal admin = new principal();

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
Edades babyoda = new Edades();
figuras despacito2 = new figuras();
telefonia amlo = new telefonia();
System.out.println("*Menu*\nIntroduzca el numero del programa a ejecutar");
System.out.println("1. Edades\n2. Figuras\n3. Telefonia");
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
    despacito2.Figuras();
    break;

    case 3:
    amlo.menuprograma();
    break;

    
}
}
}