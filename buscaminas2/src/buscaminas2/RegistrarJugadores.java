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
    JFrame f;

    
    public RegistrarJugadores(String nom){
        super(nom);
        this.nom=nom;
    }
    jugador j = new jugador(nom);
    ArrayList<jugador> listaJugadores = new ArrayList<>();
    
    public void Registrar(){
    listaJugadores.add(j);
    JOptionPane.showMessageDialog(f,"Se ha registrado el jugador: "+j.nom);
}
    public void mostrarJugadores(){
        for(int i=0;i<listaJugadores.size();i++){
            if(listaJugadores.contains(j)){
        f=new JFrame();
       JOptionPane.showMessageDialog(f,"Se ha registrado el jugador: "+listaJugadores);
            }
        }
    }
            
            
}

