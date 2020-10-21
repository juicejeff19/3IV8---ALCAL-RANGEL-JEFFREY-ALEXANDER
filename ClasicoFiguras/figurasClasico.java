import java.util.Scanner;

class figurasClasico{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion, perimetro;
        char letra;
        double resultado;
    do{
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.Calcular el area y perimetro de un cuadrado: ");
        System.out.println("3.Calcular el area y perimetro de un triangulo: ");
        System.out.println("3.Calcular el area y perimetro de un circulo: ");
        System.out.println("5.Calcular el area y perimetro del rectangulo: ");
        System.out.println("6.Calcular el area y perimetro del Pentagono: ");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Ingresa el valor del lado");
            base = entrada.nextInt();

            perimetro = base+base+base+base;
            resultado = base*base;
            System.out.println("El area del cuadrado es de: "+resultado);
            System.out.println("El perimetro del cuadrado es de "+perimetro);
            break;

            case 2:
            System.out.println("Ingresa el valor de la base");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la altura");
            altura = entrada.nextInt();

            resultado = (base*altura)/2;
            perimetro = base+base+base;
            System.out.println("El area del triangulo es de: "+resultado);
            System.out.println("El perimetro del triangulo es de "+perimetro);
            break;
            

            case 3:
            System.out.println("Ingresa el valor de la radio");
            base = entrada.nextInt();

            perimetro = (int) (6.2832*base);
            resultado = 3.1416*base*base;
            System.out.println("El area del circulo es de: "+resultado);
            System.out.println("El perimetro del circulo es de "+perimetro);
            break;

            case 4:
            System.out.println("Ingresa el valor de la base");
            base = entrada.nextInt();
            System.out.println("Ingresa el valor de la altura");
            altura = entrada.nextInt();

            perimetro = (base*2)+(altura*2);
            resultado = base*altura;
            System.out.println("El area del rectangulo es de: "+resultado);
            System.out.println("El perimetro del rectangulo es de "+perimetro);

            case 5:
            System.out.println("Ingresa el valor de un lado");
            base = entrada.nextInt();
            System.out.println("Ingresa el valor del apotema");
            altura = entrada.nextInt();

            perimetro = base+base+base+base+base;
            resultado = (5*base*altura)/2;
            System.out.println("El area del pentagono es de: "+resultado);
            System.out.println("El perimetro del pentagono es de "+perimetro);



            default:
            System.out.println("Gacias xd");

        
           
   
        }

        System.out.println("deaseas repetir?, si lo desea, escriba s");
        letra = entrada.next().charAt(0);
    }while(letra == 's');
    
    }


}