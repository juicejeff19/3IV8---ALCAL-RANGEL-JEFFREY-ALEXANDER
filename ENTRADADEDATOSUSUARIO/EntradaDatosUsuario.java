import java.util.Scanner;

class EntradaDatosUsuario{

    public static void main(String [] args){
     
        
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        float altura;

        System.out.println("Escribe tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad ");
        edad = entrada.nextInt();
        System.out.println("Escribe tu estatura: ");
        altura = entrada.nextFloat();

        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu altura es: "+altura);
    }
}