import java.util.Scanner;

class figurasClasico{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion;
        char letra;
        double resultado;
    do{
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.Calcular el area de un cuadrado: ");
        System.out.println("3.Calcular el area de un triangulo: ");
        System.out.println("3.Calcular el area de un circulo: ");
        System.out.println("4.salir: ");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Ingresa el valor del lado");
            base = entrada.nextInt();

            resultado = base*base;
            System.out.println("El area del cuadrado es de: "+resultado);
            break;

            case 2:
            System.out.println("Ingresa el valor de la base");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la altura");
            altura = entrada.nextInt();

            resultado = base*altura;
            System.out.println("El area del triangulo es de: "+resultado);
            break;
            

            case 3:
            System.out.println("Ingresa el valor de la radio");
            base = entrada.nextInt();


            resultado = 3.14*base*base;
            System.out.println("El area del circulo es de: "+resultado);
            break;

            default:
            System.out.println("Gacias");

        
           
   
        }

        System.out.println("deaseas repetir?, si lo desea, escriba s");
        letra = entrada.next().charAt(0);
    }while(letra == 's');
    
    }


}