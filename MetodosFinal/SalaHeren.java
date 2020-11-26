import java.util.*;
public class SalaHeren{
    private String nombre;
    private int id, puesto;

    public SalaHeren(){
    }
    public SalaHeren(String nombre, int puesto, int id){
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPuesto(){
        return puesto;
    }

    public void setPuesto(int puesto){
        this.puesto = puesto;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }
    
}

