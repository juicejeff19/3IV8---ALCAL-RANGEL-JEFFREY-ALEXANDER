import java.util.*;

public class Persona{
    String nombre;
    int id;
    //Constructor
    public Persona(){
    }

    //getters y setters
    public int getNombre(){
        return nombre;
    }

    public void setNombre(int nombre){
        this.nombre = nombre;
    } 

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}