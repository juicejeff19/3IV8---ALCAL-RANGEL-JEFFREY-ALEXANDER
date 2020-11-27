public class Heren{ //creo la clase que contendra a los getters y los stetters
    //declaro las variables
    private String nombre, gamertag;
    private int id;
    
    //Declaro el builder
    public Heren(){
    }
    
    //Acceso a las variables de la clase datos
    public Heren(String nombre, String gamertag, int id){
        this.nombre = nombre;
        this.gamertag = gamertag;
        this.id = id;
    }
    //Se crean los getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getGamertag(){
        return gamertag;
    }

    public void setGamertag(int puesto){
        this.gamertag = gamertag;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }
    
}