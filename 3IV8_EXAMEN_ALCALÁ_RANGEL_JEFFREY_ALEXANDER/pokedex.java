import java.util.Scanner;
import java.io.*;
import java.util.*;
//llamo a las librerias//


class pokedex{ //declaro la clase//
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //declaro el scanner//

        int numero, opcion, pokemon, ataque; //declaración de variables//
        do{

    System.out.println("3IV8 ALCALA RANGEL JEFFREY ALEXANDER");
    System.out.println("");
    System.out.println("Bienvenido a tu pokedex, elige al pokemon para ver sus datos, o el modo batalla");
    System.out.println("1. Charmander");
    System.out.println("2. bulbasaor");
    System.out.println("3. squartle");
    System.out.println("4. Modo batalla");

    opcion = entrada.nextInt(); //uso de scanner//
    
    

    switch (opcion) {
        //inicio la lista//

        case 1: //declaro el caso//
        do{
        System.out.println("Charmander eh? Buena eleccion, parace ser el favorito");
        System.out.println("aqui estan sus datos: ");
        System.out.println("Energia vital: 1");
        System.out.println("Id: 69");
        System.out.println("Nombre: Charmander");
        System.out.println("Fuerza: 89");
        System.out.println("Defensa: 70");
        System.out.println("Vida: 1");
        System.out.println("Ataque principal: Llamarada; 89 daño");
        System.out.println("Ataque secundario: Ataque Ingeo; 50 daño");


       
        System.out.println("¿desea repetir?, si es asi presione 1, si desea volver al menu presione el numero <<2>> dos veces");
        numero = entrada.nextInt();
        }while (numero == 1); //termino el do while//
        break; // rompe el codigo //

        case 2:
        do{
        System.out.println("Bulbasor eh? ok");
        System.out.println("aqui estan sus datos: ");
        System.out.println("Energia vital: 1");
        System.out.println("Id: 2");
        System.out.println("Nombre: Bulbasor");
        System.out.println("Fuerza: 64");
        System.out.println("Defensa: 40");
        System.out.println("Vida: 1");
        System.out.println("Ataque principal: planta; 59 daño");
        System.out.println("Ataque secundario: ataque normal; 58 daño");


       
        System.out.println("¿desea repetir?, si es asi presione 1, si desea volver al menu presione el numero <<2>> dos veces, si quiere cerrar el programa ponga una r");
        numero = entrada.nextInt();
        }while (numero == 1);
        break;

        case 3:
        do{
        System.out.println("squartle eh? bien");
        System.out.println("aqui estan sus datos: ");
        System.out.println("Energia vital: 1");
        System.out.println("Id: 3");
        System.out.println("Nombre: squartle");
        System.out.println("Fuerza: 89");
        System.out.println("Defensa: 50");
        System.out.println("Vida: 1");
        System.out.println("Ataque principal: burbuja; 59 daño");
        System.out.println("Ataque secundario: ataque agua; 58 daño");

       
        System.out.println("¿desea repetir?, si es asi presione 1, si desea volver al menu presione el numero <<2>> dos veces, si quiere salir ponga una r");
        numero = entrada.nextInt();
        }while (numero == 1);
        break;

        case 4: //modo pelea//
        do{
        System.out.println("Bienvenido al modo batalla");
        System.out.println("Elije a a tu pokemon");
        System.out.println("1. Charmander");
        System.out.println("2. Bulbasaor");
        System.out.println("3. squartle");
        pokemon = entrada.nextInt();
        if (pokemon == 1){  //Utilización de if//
            System.out.println("Has elegido charmander");
            System.out.println("Tu enemigo sera bulbasour");
            
            System.out.println("Elige tu ataque, (1= primario, 2= secundario");
            ataque = entrada.nextInt();
            if (ataque == 1){
            System.out.println("has atcado a bulbasour (planta) con un ataque fuego, el ataque es critico y bulbasour es derrotado");
            }else{
                System.out.println("has atcado a bulbasour (planta) con un ataque fuego, el ataque es critico y bulbasour es derrotado");
                System.out.println("bulbasour ha sido derrotado y esta cansado");
            }
        }
        if (pokemon == 3){
            System.out.println("Has elegido squartle");
            System.out.println("Tu enemigo sera charmander");
            
            System.out.println("Elige tu ataque, (1= primario, 2= secundario");
            ataque = entrada.nextInt();
            if (ataque == 1){
            System.out.println("has atcado a charmander (furgo) con un ataque agua, el ataque es critico y charmander es derrotado");
            }else{
                System.out.println("has atcado a charmander (fuego) con un ataque agua, el ataque es critico y charmander es derrotado");
                System.out.println("charmander ha sido derrotado y esta cansado");
            }
        }
        if (pokemon == 2){
            System.out.println("Has elegido bulbasour");
            System.out.println("Tu enemigo sera squartle");
            
            System.out.println("Elige tu ataque, (1= primario, 2= secundario");
            ataque = entrada.nextInt();
            if (ataque == 1){
            System.out.println("has atcado a squartle (agua) con un ataque planta, el ataque es critico y squartle es derrotado");
            }else{
                System.out.println("has atcado a squartle (agua) con un ataque planta, el ataque es critico y squartle es derrotado");
                System.out.println("squartle ha sido derrotado y esta cansado");
            }
        }

        System.out.println("¿desea repetir?, si es asi presione 1, si desea volver al menu presione el numero <<2>> dos veces, si desea salir escriba r");
        numero = entrada.nextInt();
        }while (numero == 1);
        break; 
        }





        
        
    
    numero = entrada.nextInt();
}while (numero == 2); //repetir hasta el menu//
    
    

    








}
}  //termino del programa//



