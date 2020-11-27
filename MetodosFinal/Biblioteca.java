import java.util.*;
public class Biblioteca{
    Scanner entrada = new Scanner(System.in);
    private int libros;

    public void libros(){
        System.out.println("Cual es la cantidad de libros?");
        libros = entrada.nextInt();
        registro();
    }
    public void registro(){
        int [] prestados = new int [libros];
        int [] existencias = new int [libros];
        String[] autor = new String [libros];
        String[] titulo = new String [libros]; 
        titulo = titulom(titulo);
        autor = autorm(autor, titulo);
        existencias = existenciasm(existencias, titulo);
        prestados = prestadosm(prestados, titulo);
        OperacionesLib xd = new OperacionesLib(titulo, autor, existencias, prestados);
        xd.Menu();
    }
    public String[] titulom(String[] titulo){
        for(int i=0;i<titulo.length;i++){
            System.out.println("Ingrese el nombre del libro");
            titulo[i]=entrada.nextLine();
        }
        return titulo;
    }
    public String[] autorm(String[] autor, String[]titulo){
        for (int i=0; i<autor.length;i++){
            System.out.println("Ingrese el autor de "+titulo[i]);
            autor[i] = entrada.nextLine();
        }
        return autor;
    }
    public int[] existenciasm(int[]existencias, String[] titulo){
        for (int i=0; i<existencias.length;i++){
        System.out.println("Ingrese el numero de existencias de el libro "+ titulo[i]);
        existencias[i] = entrada.nextInt();
        }
    return existencias;
    }
    public int[] prestadosm(int []prestados, String[]titulo){
        for (int i=0; i<prestados.length;i++){
        System.out.println("Ingrese el numero de ejemplares prestados de "+ titulo[i]);
        prestados[i] = entrada.nextInt();
        }
        
    return prestados;
}
public int getlibros(){
    return libros;
    }

public void setlibros(){
        this.libros = libros;
    }

}