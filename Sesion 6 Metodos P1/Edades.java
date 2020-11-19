import java.util.Scanner;
public class Edades{ //se crea la clase
    //se declaran variables
    Scanner entrada = new Scanner(System.in);
    private int dia, mes, ano, edad1, edad2;
    
    public void menuprograma(){
        //se crea el metodo menu
        System.out.println("Bienvenido, introduzca los datos que se le solicitan");
        datos1();
        
    }
    public void datos1(){
        //se recopilan los datos
            System.out.println("Ingrese los datos de la fecha de nacimiento");
            System.out.println("Introduzca el anio: ");
            ano = entrada.nextInt();
      
            System.out.println("Introduzca el mes: ");
            mes = entrada.nextInt();
      
            System.out.println("Introduzca el dia: ");
            dia = entrada.nextInt();
            EdadActual();
    }
    public void EdadActual(){
        //se calcula la edad
        int edadac;
        int edad3;
        edadac=2020-ano;
        edad3 = edadac-1;
        if(mes<11 && dia<16){
            System.out.println("Usted tiene: "+edad3+" anios");
        }
        System.out.println("Usted tiene: "+edadac+" anios");
    }
}