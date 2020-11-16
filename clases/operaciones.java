import java.util.Scanner;
public class operaciones{
    Scanner entrada = new Scanner(System.in);
    
    public void menu(){
        char op;

        System.out.println("Ejemplo de un menu que se encarga de:\nA. Calculadora\nB. Conversor de unidades\nC. Creacion de cuadros\nD. Movimieneto de cuadro");
        op = entrada.next().charAt(0);
        switch (op){
            case 'A':
                Calculadora();
                break;
            case 'B':
                ConversorUnidades();
                break;
            case 'C':
                CreaCuadro();
                break;
            case 'D':
                MoviCuadro();
                break;
        }

    }
    public void Calculadora(){
        double numero=0.00, suma=0.00, multi=1.00;
        double divi=1.00;
        char operacion, p;
        System.out.println("Seleccione la opcion deseada\na. Suama y resta\nb. Multiplicacion\nc. Divison");

        operacion = entrada.next().charAt(0);

        switch(operacion){

            case 'a':
                do{
                    System.out.println("Para dejar de sumar ingresa 0");
                    System.out.println("Ingresa el valor a sumar");
                    numero=entrada.nextDouble();
                    suma += numero;

                }while(numero!=0);
                System.out.println("La suma total es de: "+suma);
                break;
            case 'b':
                do{
                    System.out.println("Para dejar de multiplicar ingresa 0");
                    System.out.println("Ingresa el valor a multiplicar");
                    numero=entrada.nextDouble();

                if(numero>0){
                    multi *= numero;
                }else{
                    System.out.println("Ingresa solo numeros positivos");
                }
                }while(numero != 0);
                System.out.println("La multiplicacion total es de: "+multi);
                break;
            case 'c':
                 do{
                    System.out.println("Para dejar de dividit ingresa 0");
                    System.out.println("Ingresa el valor a dividir");
                    numero=entrada.nextDouble();
                    for(int i=0; i<numero; i++){
                    divi /= numero;
                    }

                }while(numero!=1);
                System.out.println("La division total es de: "+divi);
                break;
        }
    }
    public void ConversorUnidades(){

        /*
        van a tener que realizar las conversiones de unidades de:
        metros a cm 
        metros a pulgadas
        kilogramos a libras
        kilogramos a onzas
        */ 
    }
    public void CreaCuadro(){

        int n,m;
        do{
            System.out.println("Ingrese el numero de * que tenga el cuadro");
            n=entrada.nextInt();

            if((n<0) || (n>1000)){
                System.out.println("El numero no es valido");
            }else{
                for(int i=0; i<=n; i++){
                    System.out.println("*");
                }
                System.out.println("\n");
                for(int i=0;i<n-2; i++){
                    System.out.println("*");
                    for(int j=0;j<n-2;j++){
                        System.out.println(" ");
                    }
                   
                    }
                    System.out.println("*");
                    for(int k=0; k<=n; k++){
                        System.out.println("*");
                    }
                }
            }while(m!=1);
        }
    }
    public void MoviCuadro(){

        //es suyo despues de que yo haga el anterior
    }
}
