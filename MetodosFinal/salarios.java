import java.util.*;
public class salarios{
    private int id, numerohoras1, sueldodiurnas, sueldonocturnas, numerohoras2, puesto, sueldoobrerostotal;
        private String nombre;
        Scanner entrada = new Scanner(System.in);
    public void menuprograma(){
        System.out.println("¿Que tipo de trabajador es usted?\n1. Obrero\n2. Administrativo");
        Scanner entrada = new Scanner(System.in);
        puesto = entrada.nextInt();
        switch(puesto){
            case 1:
            try{
                obrero();
            }catch(Exception e){
                 //mensaje de error
            System.out.println("Ojo a la comedia");
            //saber el tipo de error
            System.out.println("Error: "+ e.getMessage());
            }
            break;

            case 2:
            break;

            default: System.out.println(":))");
        }

    }
    public void obrero(){
    System.out.println("Usted ha elegido la opcion: Obrero, calculemos su salario quincenal");
    System.out.println("¿En cuantas ocaciones ha trabajado horas extras (diurnas)?");
    numerohoras1 = entrada.nextInt();
    sueldodiurnas = numerohoras1*50;
    System.out.println("Su remunerracion por las horas diurnas trabajadas es de: "+sueldodiurnas);
    System.out.println("¿En cuantas ocaciones ha trabajado horas extras (nocturnas)?");
    numerohoras2 = entrada.nextInt();
    sueldonocturnas = numerohoras2*60;
    int[] sueldoobrero1 = new int[2];
    sueldoobrero1[0] = sueldodiurnas;
    sueldoobrero1[1] = sueldonocturnas;
    sueldoobrerostotal = sueldoobrero1[0]+sueldoobrero1[1]+5000;
    System.out.println("Su sueldo total quincenal es de: "+sueldoobrerostotal+"\nTenga un buen dia :)");

    }


}