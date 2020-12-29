/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author juice_pjuorme
 */
//Se llama a la libreria Util
import java.util.*; 
public class Principal{
    //se declara el Scanner
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        //se declaran las variables
        Scanner entrada = new Scanner(System.in);
        int bigchungus;
        System.out.println("3IV8 ALCALA RANGEL JEFFREY ALEXANDER");
        do{
            //se llama al menu desde donde quiera que este
            Principal.menu();
                System.out.println("Si quiere volver al menu escriba <<1>>, si quiere cerrar el programa escriba cualquier cosa");
                //funcion para repetir el menu
                bigchungus = entrada.nextInt();
        }while (bigchungus == 1);
    }
    //se crea el metodo menu
public static void menu(){
    Scanner entrada = new Scanner(System.in);
Vehiculo obj = new Vehiculo();
obj.recopilar();
obj.showData();
}
}
