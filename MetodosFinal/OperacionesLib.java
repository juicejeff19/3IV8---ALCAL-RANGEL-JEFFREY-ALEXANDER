import java.util.*;
public class OperacionesLib extends BibliHeren{
    Scanner entrada = new Scanner (System.in);
    private int efe, b, lib, existencia;
    private int [] prestados2 = new int [getTitulo().length];

    public  OperacionesLib(){
    
    }

    public  OperacionesLib(String[] titulo, String[] autor, int[] existencias, int[]prestados)
    {
        super(titulo, autor, existencias, prestados);
    }

    public void Menu(){
    do{
    System.out.println("Elija la operación a realizar, (1)Prestamo, (2)Devolucion, (3)Consultar Disponibilidad");
    efe = entrada.nextInt();

    switch (efe){
    //PRESTAMO
    case 1:
    Mostrarlibros();
    existencia = Existencia();
    if (existencia<=0){
        System.out.println("efe no hay");
    }
    else{
    //realiza prestamo
    Prestamo();
    }
    break;

    //DEVOLUCION
    case 2:
    Mostrarlibros();
    existencia = Existencia();
    if (existencia>=getExistencias()[lib]){
        System.out.println("Ya se encuentran devueltos todos los ejemplares.");
    }
    else{
    Devolucion();
    }
    break;

    //CONSULTAR EXISTENCIA
    case 3:
    Mostrarlibros();
    existencia = Existencia();
    System.out.println("En existencia: "+existencia);
    break;
    }
    System.out.println("Para volver al menu digite 0");
    b = entrada.nextInt();
    } while (b == 0);
    }

    //muestra listado y lee libro a consultar
    public void Mostrarlibros(){
    System.out.println("LIBROS");
    for (int i=0; i<getTitulo().length; i++){
    System.out.println((i+1)+". "+getTitulo()[i]);
    System.out.println("Autor: "+getAutor()[i]);
    }
    System.out.println("Ingrese el numero del libro.");
    lib = entrada.nextInt() - 1;
        System.out.println("Ingrese numeros enteros.");
    }

    public int Existencia(){
    existencia = getExistencias()[lib] - getPrestados()[lib] - prestados2[lib];
    return existencia;
    }

    public void Prestamo(){
    prestados2[lib] = prestados2[lib]+1;
    System.out.println("Ya");
    }

    public void Devolucion(){
    prestados2[lib] = prestados2[lib]-1;
    System.out.println("Ok");
    }
    
}
