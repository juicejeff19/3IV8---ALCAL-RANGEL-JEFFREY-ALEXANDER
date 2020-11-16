import java.util.Scanner;
public class sumaArray{
    public static void main(String[]args){
        int[] numeros = new int[100];
        int suma = 0;
        double media = 0.00;
        for(int i=0; i<numeros.length;i++){
            numeros[i]=i+1;

            suma += numeros[i];
        }
        System.out.println("La suma de los numeros es de: "+suma);
        media = (double)suma/numeros.length;
        System.out.println("La media de los numeros es de: "+media);
        
    }
}