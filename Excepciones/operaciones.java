import java.util.*;
public class operaciones{
    Scanner entrada = new Scanner(System.in);
    int y=0
    public void Ejemplo(){
        try{
            System.out.println("Ingresa un valor numerico");
            y=entrada.nextInt();
            System.out.printl("El numero es: "+ y);
            System.exit(0);

        }catch(Exception e){
            System.out.println("Ingresa solo valores enteros");
            System.out.println("Error: "+ e.getMessage());
        }
    }
}