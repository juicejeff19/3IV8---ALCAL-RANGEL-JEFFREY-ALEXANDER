public class BibliHeren{
    Biblioteca uwuchurtu = new Biblioteca();
    private int libros = uwuchurtu.getlibros();
    private String[] titulo = new String [libros];
    private String[] autor = new String [libros];
    private int[] existencias= new int [libros];
    private int[] prestados = new int [libros];

    public BibliHeren(){
    
    }

    public  BibliHeren(String[] titulo, String[] autor, int[] existencias, int[]prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.existencias = existencias;
        this.prestados = prestados;
    }

    public String[] getTitulo(){
        return titulo;
    }

    public void setTitulo(String[] titulo){
        this.titulo = titulo;
    }

    public String[] getAutor(){
        return autor;
    }

    public void setAutor(String[] autor){
        this.autor = autor;
    }

    public int[] getExistencias(){
        return existencias;
    }

    public void setExistencias(int[] existencias){
        this.existencias = existencias;
    }

    public int[] getPrestados(){
        return prestados;
    }

    public void setPrestados(int [] prestados){
        this.prestados = prestados;
    }

    public int getLibros(){
        return libros;
    }

    public void setLibros(int libros){
        this.libros = libros;
    }

    public int getlibros(){
        return libros;
        }
    
    public void setlibros(){
        this.libros = uwuchurtu.getlibros();
        }


 
    

}
