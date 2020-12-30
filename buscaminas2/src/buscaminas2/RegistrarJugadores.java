/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas2;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author juice_pjuorme
 */
public class RegistrarJugadores extends jugador{

    JFrame f = new JFrame();
    ArrayList<RegistrarJugadores> listaJugadores = new ArrayList<>();
    String nomPros;
    
    RegistrarJugadores sad = new RegistrarJugadores(nomPros);
    
    
    public RegistrarJugadores(String nom){
        super();
        this.nom=nom;
    }

   
    
    public void Registrar(){
         
         nomPros = nom;
        
        listaJugadores.add(sad);
        JOptionPane.showMessageDialog(f,"Se ha registrado el jugador: "+nomPros);

}
    public void mostrarJugadores(){
for(int i = 0; i<listaJugadores.size(); i++){
      
                JOptionPane.showMessageDialog(f,"Libro: " + listaJugadores.get(i).nomPros);
                
               
            }
        }

    public String getNomPros() {
        return nomPros;
    }

    public void setNomPros(String nomPros) {
        this.nomPros = nomPros;
    }
    }
            
            


