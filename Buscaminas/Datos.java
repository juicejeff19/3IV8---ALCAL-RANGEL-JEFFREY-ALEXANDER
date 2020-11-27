import java.util.*;
public class Datos{
    //declaro el Scanner
    Scanner entrada = new Scanner(System.in);
    //no estoy seguro de que poner como herencia en un juego, asi que seran los datos del jugador
    //Declaro las variables privadas
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
        System.out.println("Pulsa 1 cuando estes listo para empezar");
        decision = entrada.nextInt();
        if (decision==1){
        System.out.println("Estamos listos para empezar :)");
        //creo el objeto que me llevara al juego, mandandolo con mis variables recopiladas
        Buscaminas dear = new Buscaminas(nombre, gamertag, id);
        //vamos para el juego
        dear.juego();
        }else if(decision==69){
            System.out.println("Ja,ja,ja,ja,ja");
        }else{
            System.out.println("En realidad no tenias opcion xd supongo que no estas preparado");
        }



    } 

} 