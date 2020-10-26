import java.util.Scanner;
import java.io.*;
import java.util.*;

class figurasClasico{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion, perimetro, edad, abono, abono2, socios, decimalInicial, grados, chocolate, agua, helado, tanque, helicoptero, monto;
        char letra;
        double resultado, grados2, uno, dos, tres, primero, segundo;

        do{
        System.out.println("ESTE PROGRAMA FUE ELABORADO POR 3IV8_ALCALA_RANGEL_JEFFREY_ALEXANDER");
        System.out.println("Elija el Programa que desea ejecutar: ");
        System.out.println("1.Descuentos: ");
        System.out.println("2.Decimal a Binario: ");
        System.out.println("3.Conversion de temperaturas: ");
        System.out.println("4:Cuenta de Positivos y negativos ");
        System.out.println("5.Tienda ");
        System.out.println("6.Figuras Clasico: ");
        System.out.println("7:Tabla ");
        System.out.println("8:Factoriales ");
        System.out.println("13:Calculadora ");
        System.out.println("14:(dos veces) para salir) ");

        opcion = entrada.nextInt();

        switch (opcion) {

        case 6:
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
            break;

            case 5:
            System.out.println("Ingresa el valor de un lado");
            base = entrada.nextInt();
            System.out.println("Ingresa el valor del apotema");
            altura = entrada.nextInt();

            perimetro = base+base+base+base+base;
            resultado = (5*base*altura)/2;
            System.out.println("El area del pentagono es de: "+resultado);
            System.out.println("El perimetro del pentagono es de "+perimetro);
            break;



            default:
            System.out.println("Gacias xd");

        
           
   
        }

        System.out.println("deaseas repetir?, si lo desea, escriba s");
        letra = entrada.next().charAt(0);
    }while(letra == 's');
    break;

    
    case 1:
    do{
    System.out.println("introduce tu edad porfavor");
    edad = entrada.nextInt();

    System.out.println("introduce el total de tu abono porfavor");
    abono = entrada.nextInt();

    if (edad>65) {
        abono2 = (int) (abono-abono*.40);
        System.out.println("su total sera de: "+abono2);

    
    }else {
        if (edad<21){
            System.out.println("¿Tus padres son socios? Escirbe <<0>> en caso de que la respuesta se afirmativa o <<1>> en caso de que sea negativa.");
            socios = entrada.nextInt();
            if (socios == 0) {
                abono2 = (int) (abono-abono*.45);
                System.out.println("su total sera de: "+abono2);

            }else{
                 if (edad<21) {
                abono2= (int) (abono-abono*.25);
                System.out.println("su total sera de: "+abono2);
                
                break;
    
                 }
            }
                
        }
    }

    System.out.println("deaseas repetir?, si lo desea, escriba s");
    System.out.println("deaseas volver al menu?, si lo desea, escriba m");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;

case 2:
do{
    System.out.println("Escriba su numero");
    decimalInicial = entrada.nextInt();
    // de decimal a binario
    String binario = Integer.toBinaryString(decimalInicial);
    System.out.println(binario);
    System.out.println("deaseas repetir?, si lo desea, escriba s");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;

case 3:
do{
    System.out.println("Elija la opcion deseada: ");
    System.out.println("1.Convertir Farenheit a Celsius: ");
    System.out.println("2.Convertir Farenheit a KELVINE: ");
    System.out.println("3.Convertir Farenheit a RANKINE: ");
    System.out.println("4.Convertir Celsius a Farenheit: ");
    System.out.println("5.Convertir Celsius a Kelvine: ");
    System.out.println("6.Convertir Celsius a Rankine: ");
    System.out.println("7.Convertir Kelvine a Farenheit: ");
    System.out.println("8.Convertir Kelvine a Celsius: ");
    System.out.println("9.Convertir Kelvine a Rankine: ");
    System.out.println("10.Convertir Rankine a Farenheit: ");
    System.out.println("11.Convertir Rankine a Celsius: ");
    System.out.println("12.Convertir Rankine a Kelvine: ");

    opcion = entrada.nextInt();
    switch (opcion) {
        
        case 1:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) (grados-32)*5/9;
        System.out.println("la conversión resulta en: "+grados2);
        break;

        case 2:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        grados2 = (int) (grados-273.15) * 9/5 + 32;
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 3:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) (grados + 459.67);
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 4:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) (grados * 9/5) + 32;
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 5:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) grados+273.15;
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 6:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        grados2 = (int) (grados*9/5)+491.67;
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 7:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) (grados-273.15)*9/5+32;
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 8:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) grados-273.15;
        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 9:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) grados*1.8;

        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 10:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) grados-459.67;

        System.out.println("la conversión resulta en: "+grados2);
        break;
        case 11:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) (grados-491.67)*5/9;

        System.out.println("la conversión resulta en: "+grados2);
        break;

        case 12:
        System.out.println("Introduzca el valor");
        grados = entrada.nextInt();
        
        grados2 = (int) grados*5/9;

        System.out.println("la conversión resulta en: "+grados2);
        break;


    }
    System.out.println("deaseas repetir?, si lo desea, escriba s");
    System.out.println("deaseas volver al menu?, si lo desea, escriba m");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;


case 4:

do{
    System.out.println("Introduce tres numeros y te diremos cuantos son positivos o negativos.");
    uno = entrada.nextDouble();
    dos = entrada.nextDouble();
    tres = entrada.nextDouble();

    if(uno == 0){
        System.out.println("El primer numero es neutro.");
    }
        else if(uno < 0){
            System.out.println("El primer numero es negativo.");
        }
        else{
            System.out.println("El primer numero es positivo.");
        }

    if(dos == 0){
        System.out.println("El primer nuamero es neutro.");
    
    }else if(dos < 0){
            System.out.println("El primer numero es negativo.");
        }                
        else{
            System.out.println("El primer numero es positivo.");
        }
    
    if(tres == 0){
        System.out.println("El tercer numero es neutro.");
    }
        else if(tres < 0){
            System.out.println("El tercer numero es negativo.");
        }
        else{
        System.out.println("El tercer numero es positivo.");
        }

        System.out.println(" ");
        System.out.println("deaseas repetir?, si lo desea, escriba s");
        System.out.println("deaseas volver al menu?, si lo desea, escriba m");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;


case 5:
do{
System.out.println("bienvenido a nuestra tienda, nuestro inventario esta conformado por");
System.out.println("chocolate-$5. agua-$8. helado-$13. helicoptero-$3.");

System.out.println("Por favor, digite cuantos chocolates ha adquirido.");
chocolate = entrada.nextInt()*3;
if (chocolate<0){
    System.out.println("ojo a la comedia");
}else{

System.out.println("Por favor, digite cuanta agua ha adquirido.");
agua = entrada.nextInt()*8;
if (agua<0){
    System.out.println("ojo a la comedia");
}else{

System.out.println("Por favor, digite cuantos helados ha adquirido.");
helado = entrada.nextInt()*13;
if (helado<0){
    System.out.println("ojo a la comedia");
}else{


System.out.println("Por favor, digite cuantos helicopteros ha adquirido.");
helicoptero = entrada.nextInt()*3;
if (helicoptero<0){
    System.out.println("ojo a la comedia");
}else{



monto = (chocolate + agua + helado + helicoptero);

System.out.println("Sus productos suman un total de " + monto + " $. Gracias por su compra.");

}
}
}
}

System.out.println(" ");
        System.out.println("deaseas repetir?, si lo desea, escriba s");
        System.out.println("deaseas volver al menu?, si lo desea, escriba m");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;


case 7:
do{
System.out.println("Tabla XD.");

                System.out.println("\tN\t\t\t");
                System.out.println("\t1\t10\t100\t1000");
                System.out.println("\t2\t20\t200\t2000");
                System.out.println("\t3\t30\t300\t3000");
                System.out.println("\t4\t40\t400\t4000");
                System.out.println("\t5\t50\t500\t5000");
                System.out.println("\t6\t60\t600\t6000");
                System.out.println("\t7\t70\t700\t7000");
                System.out.println("\t8\t80\t800\t8000");
                System.out.println("\t9\t90\t900\t9000");
                System.out.println("\t10\t100\t1000\t1000");

                System.out.println(" ");
                System.out.println("deaseas repetir?, si lo desea, escriba s");
                System.out.println("deaseas volver al menu?, si lo desea, escriba m");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
        break;



        case 8:
        do{
            System.out.println("Introduzca el numero cuyo factorial desea conocer:");

            int calculo = 0;

            while(calculo < 1) {
                try {
                    calculo = entrada.nextInt();
                    if(calculo < 1)
                        System.out.println("Por favor, introduzca un valor superior y distinto de 0.");
                }catch(InputMismatchException e) {
                    System.out.println("Por favor, introduzca un valor numerico.");
                    entrada.nextLine();
                }
            }

            long factorial = 1L;

            for(int i = calculo; i > 0; i--) {
                factorial=factorial*i;
            }
     
            System.out.println("El factorial de " + calculo + " es " + factorial + ".");

            System.out.println(" ");
        System.out.println("deaseas repetir?, si lo desea, escriba s");
        System.out.println("deaseas volver al menu?, si lo desea, escriba m");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;


case 13:
do{

    System.out.println("Bienvenido a la calculadora de dos variables.");
    System.out.println(" ");
    System.out.println("Por favor, digita el primer numero.");
    primero = entrada.nextDouble();

    System.out.println(" ");
    System.out.println("Por favor, digita el segundo numero.");
    segundo = entrada.nextDouble();

    System.out.println(" ");
    System.out.println("Por favor, digita la operacion a realizar con base en la siguiente nomenclatura.");
    System.out.println(" ");
    System.out.println("s = suma. r = resta. m = multiplicacion. d = division. r = residuo.");
    letra = entrada.next().charAt(0);
    System.out.println(" ");

    if(letra == 's')
    {
        resultado = primero+segundo;
        System.out.println("El resultado de sumar " + primero + " mas " + segundo + " es: " + resultado);
    }

    if(letra == 'r')
    {
        resultado = primero-segundo;
        System.out.println("El resultado de restar " + primero + " menos " + segundo + " es: " + resultado);
    }

    if(letra == 'm')
    {
        resultado = primero*segundo;
        System.out.println("El resultado de multiplicar " + primero + " por " + segundo + " es: " + resultado);
    }

    if(letra == 'd')
    {
        resultado = primero/segundo;
        System.out.println("El resultado de dividir " + primero + " entre " + segundo + " es: " + resultado);
    }

    if(letra == 'r')
    {
        resultado = primero%segundo;
        System.out.println("El residuo de dividir " + primero + " entre " + segundo + " es: " + resultado);
    }
    System.out.println(" ");
        System.out.println("deaseas repetir?, si lo desea, escriba s");
        System.out.println("deaseas volver al menu?, si lo desea, escriba m");
    letra = entrada.next().charAt(0);
}while(letra == 's');
break;


case 14:
break;
}
letra = entrada.next().charAt(0);

}  
while(letra == 'm');
}
}




     