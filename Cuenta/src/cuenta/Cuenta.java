/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import java.util.*;

/**
 *
 * @author juice_pjuorme
 */
public class Cuenta {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Bienvenido al banco");
        System.out.println("Que operacion desea realizar?");
        System.out.println("1. Cuenta de Debito");
        System.out.println("2. Cuenta de Credito");
        System.out.println("Cuenta de cheques");
        System.out.println("Salir");
        
        do{
        System.out.println("Bienvenido al banco");
        System.out.println("Que operacion desea realizar?");
        System.out.println("1. Cuenta de Debito");
        System.out.println("2. Cuenta de Credito");
        System.out.println("Cuenta de cheques");
        System.out.println("Salir");
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
            
        }while(opc!=4);
           
    }
    
}
