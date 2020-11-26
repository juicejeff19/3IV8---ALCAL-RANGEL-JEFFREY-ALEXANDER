import java.util.*;
//clase proovedores
public class Proovedores{
    Scanner entrada = new Scanner(System.in);
    //variables
    String nombre;
    int id;
    String[] productos = new String[10];
    int[] cantidad = new int[10];
    int[] precios = new int[10];

//recopilacion de datos
    public void recopilacion(){
        System.out.println("A continuación se le pediran sus datos y los del pedido");
        System.out.println("Porfavor, ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su ID");
        id = entrada.nextInt();
        System.out.println("Ahora llenaremos los datos del pedido");
        productosA();
        cantidadA();
        preciosA();
    }
    //llenado de arreglo productos
    public void productosA(){
        System.out.println("Ingrese los productos");
        for (int i=0; i<productos.length;i++){
        System.out.print("Producto "+(i+1)+": ");
        productos[i] = entrada.nextLine();
        }
        }
        //llenado de arreglo cantidad
    public void cantidadA(){
        System.out.println("Ingrese la cantidad de los productos");
        for (int i=0; i<cantidad.length;i++){
        System.out.print("Ammount of: "+(i+1)+": ");
        cantidad[i] = entrada.nextInt();
        }
    }
    public void preciosA(){
        //llenado de arreglo precios
        System.out.println("Ingrese el precio de los productos");
        for (int i=0; i<precios.length;i++){
        System.out.print("Precio de: "+(i+1)+": ");
        precios[i] = entrada.nextInt();
        }
    }

}