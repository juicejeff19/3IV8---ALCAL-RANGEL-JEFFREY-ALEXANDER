import java.util.*;
public class sesion5{
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        float xd;
        Scanner entrada = new Scanner(System.in);
        sesion5 casos = new sesion5();

        System.out.println("3IV8 ALCALA RANGEL JEFFREY ALEXANDER\n △⊚ ");
        do{
            casos.menu();
                System.out.println("Si quiere volver al menu escriba <<1>>, si quiere cerrar el programa escriba cualquier cosa");
                xd = entrada.nextFloat();
        }while (xd == 1);
    }
    public void menu(){
        int casoele,sino;
        int [] array = new int [10];
        sesion5 op = new sesion5();
        System.out.println("Seleccione el programa a ejecutar");
        System.out.println("1. Numeros positivos y negativos");
        System.out.println("2. Pares");
        System.out.println("3. Calificaciones");
        System.out.println("4. Matriz");
        
        casoele = entrada.nextInt();
        if (casoele<0 || casoele>5){
            System.out.println("Mira alchile si vas a elegir una que exista no elijas ninguna, neta, mejor duermete otro rato");
        }
        switch (casoele){

            case 1:
            array = arreglito(array);
            op.positivosporfavorsaquenmedeaqui(array);
            op.negativosyalevoyentendiendoxd(array);
            op.parestenunbuendiatelmex(array);
            break;
            case 2:
            array = arreglito(array);
            op.parestenunbuendiatelmex(array);
            break;
            case 3:
            array = arreglito(array);
            op.Calificacionestenunbuendiaedmaverick(array);
            op.promediotenunbuendiabatiz(array);
            op.amloypena(array);
            op.ninosprodigio(array);
            op.tumuerestuvives(array);
            break;
            case 5:
            op.SM();


        }

    }
    public int[] arreglito(int[] array){
        System.out.println("Digite los 10 numeros (enteros) del arreglo, en el caso 3 seran las calificaciones");
        for (int i=0; i<10;i++){
            System.out.print("El numero de la casilla "+i+": ");
            array [i] = entrada.nextInt();
        }
        return array;
    }
    public void positivosporfavorsaquenmedeaqui(int[]array){
        int n=0;
        int num=0;
        for (int i=0; i<10;i++){
            if (array[i]>0){
                n += array[i];
                num++;
            }else{
                System.out.println("Casilla numero "+i+": El numero fue <<negativo>>");
            } 
        }
        System.out.println("El promedio de los numeros positivos es: "+n/num);
    }
    public void negativosyalevoyentendiendoxd(int[]array){
        int n=0;
        int num=0;
        for (int i=0; i<10;i++){
            if (array[i]<0){
                n += array[i];
                num++;
            }else{
                System.out.println("Casilla numero "+i+": El numero fue <<positivo>>");
            } 
        }
        System.out.println("El promedio de los numeros negativos es: "+n/num);
    }
    public void parestenunbuendiatelmex(int[]array){
        float n=0;
        float num = 0;
        for (int i=0; i<array.length;i++){
            float residuo = i % 2;
            if (residuo == 0){
                n += array[i];
                num ++;
            } 
        }
        System.out.println("El promedio de las casillas pares es: "+(n/num));
    }
    public void Calificacionestenunbuendiaedmaverick(int[]array){
        System.out.println("Como en el saes solo hay numeros enteros :)");
        System.out.println("Calificaciones");
        for (int i=0; i<array.length;i++){
            System.out.println("Calificacion "+(i)+" = "+(array [i]));
        }
    }
    public void promediotenunbuendiabatiz(int[]array){
        int x = 0;
        for (int i=0; i<array.length;i++){
            x += array [i];
        }
        int promedio;
        promedio=x/array.length;
        System.out.println("El promedio es de :"+promedio);

    }
    public void amloypena(int[]array){
        int may=0;
        int men= array[0];
        for (int i=0; i<array.length;i++){
            if (array[i]>may){
            may = array[i];
            }
            else if (array[i]<men){
                men = array[i];
            }
        }
        System.out.println("La calificacion mayor es: "+may);
        System.out.println("La calificacion menor es: "+men);
    }
    public void ninosprodigio(int[]array){
        int x = 0;
        for (int i=0; i<array.length;i++){
            x += array [i];
        }
        int promedio;
        promedio=x/array.length;
        System.out.println("El promedio es de :"+promedio);
        for (int i=0; i<array.length; i++){
            if (array[i] > promedio){
                System.out.println("Calificación por encima del promedio en la casilla " + (i + 1));

            }
        }   
    }
    public void tumuerestuvives(int[]array){
        int vivo=0;
        int muerto=0;
        for (int i=0; i<array.length;i++){
            if (array[i]>6){
                vivo++;
            }
            if (array[i]<6){
                muerto++;
            }
        }
        System.out.println("El numero de aprobados es: "+vivo);
        System.out.println("El numero de reprobados(nomerepruebe xfa) es: "+muerto);
    }
    public void SM(){

        
        int matrizA[][] = new int [3][3];
        int matrizB[][] = new int [3][3];
        int matrizS[][] = new int [3][3];
        int i, j;

        System.out.println("Datos de la primera matriz");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Datos de la segunda matriz");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                 matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Matriz resultante de la suma:");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++) {
                System.out.println(matrizS[i][j]);
            }           
        }
    }

}


