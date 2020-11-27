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
        int [] prestados = new int [a];
        int [] existencias = new int [a];
        String[] autor = new String [a];
        String[] titulo = new String [a]; 
        titulo = titulom(titulo);
        autor = autorm(autor, titulo);
        existencias = existenciasm(existencias, titulo);
        prestados = prestadosm(prestados, titulo);
        OperacionesLib = new OperacionesLib(titulo, autor, existencias, prestados);
        objeto.principalib();
    }
    public String[] titulom(String[] titulo){
        for(int i=0;i<titulo.length;i++){
            System.out.println("Ingrese el nombre del libro");
            titulo=entrada.nextLine();
        }
        return titulo
    }
    public String[] autorem(String[] autore, String[]titulo){
        for (int i=0; i<autores.length;i++){
            System.out.println("Ingrese el autor de "+titulo[i]);
            autores[i] = entrada.nextLine();
        }
        return autores;
    }
    public int[] Ejemplares(int[]existencias, String[] titulo){
        for (int i=0; i<existencias.length;i++){
        System.out.println("Ingrese el numero de existencias de el libro "+ titulo[i]);
        existencias[i] = entrada.nextInt();
        }
    return ejemplares;
    }
    public int[] Prestados(int []prestados, String[]titulo){
        for (int i=0; i<prestados.length;i++){
        System.out.println("Ingrese el numero de ejemplares prestados de "+ titulo[i]);
        prestados[i] = entrada.nextInt();
        }
        }
    return prestados;
    }
}