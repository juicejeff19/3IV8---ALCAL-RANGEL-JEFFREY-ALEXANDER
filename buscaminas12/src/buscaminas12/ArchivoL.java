/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author juice_pjuorme
 */
public class ArchivoL implements Serializable {
    
    ArrayList<Jugador> listarecuperada = new ArrayList<Jugador>();
    
    //aqui es donde tenemos el manejor de archivos por separado
    public ArrayList<Jugador> leer(){
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Jugador.txt"));
            
            listarecuperada = (ArrayList<Jugador>)in.readObject();
            
            in.close();
        
        }catch(Exception e){
            System.out.println("Esperando ..... " + e.getMessage());
        
        }
        return listarecuperada;
    }
    
    void serializar(ArrayList<Jugador> listaseriar){
        try{
            FileOutputStream out = new FileOutputStream("Jugador.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(listaseriar);
            objout.close();
        
        }catch(Exception e){
            System.out.println("Error ... "+ e.getMessage());
        
        }
    }
    
}
