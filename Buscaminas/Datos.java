import java.util.*;
public class Datos{
    //declaro el Scanner
    Scanner entrada = new Scanner(System.in);
    //no estoy seguro de que poner como herencia en un juego, asi que seran los datos del jugador
    //Declaro las variables
     String nombre, gamertag;
     int id, decision;
    //declaro el metodo para recopilar los datos
    public Datos(){
    }
    public void identificacion(){
        System.out.println("¡Bienvenido gamer!\nSe te solcitaran algunos datos con el fin de personalizar tu experiencia :)");
        System.out.println("Porfavor, ingresa tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Bien, ahora, ingresa tu gamertag");
        gamertag = entrada.nextLine();
        System.out.println("Ese es un gran gamertag, ahora, diseña tu id, recuerda que tiene que ser un numero entero");
        id = entrada.nextInt();
        System.out.println("Instrucciones:\nTienes un numero limitado de intentos, tendras que encontrar las minas para asi desactivarlas\n¿Quien no queria ser un Desactivador de minas de niño?");
        System.out.println("Selecciona la dificultad\n1. Facil\n2. Intermedia\n3 .Dificil\4. Imposible");
        decision = entrada.nextInt();
        //creo el objeto que me llevara al juego, mandandolo con mis variables recopiladas
        Buscaminas dear = new Buscaminas(nombre, gamertag, id);
        if (decision==1){
        System.out.println("Estamos listos para empezar :), La dificultad que has elegido es Facil");
        //vamos para el juego
        dear.juego();
        }else if(decision==2){
            System.out.println("Estamos listos para empezar :), La dificultad que has elegido es Intermedia");
            dear.juego1();

        }else if(decision==3){
            System.out.println("Estamos listos para empezar :), La dificultad que has elegido es Dificil");
            dear.juego2();

        }else  if(decision==4){
            System.out.println("Estamos listos para empezar :), La dificultad que has elegido es Imposible");
            dear.juego3();

        }



    } 

} 