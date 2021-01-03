/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import conexionSQL.ConexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

/**
 *
 * @author juice_pjuorme
 */
public class DatosSerial implements Serializable{
    
    ConexionSQL cc = new ConexionSQL();
    Connection con=cc.conexion();
    String id1, nombre1,edad1, puntuacion1;

    public DatosSerial() {
    }
    
    

    public DatosSerial(String id1, String nombre1, String edad1, String puntuacion1) {
        this.id1 = id1;
        this.nombre1 = nombre1;
        this.edad1 = edad1;
        this.puntuacion1 = puntuacion1;
    }
    
    /*Metodo por el cual se almacenaran los datos almacenados en mi base de datos de 
    mysql, se mandan llamar y se almacenan en variables de la clase, para 
    posteriormente ser serializados en un objeto, si el usuario asi lo desea
    */
    public void Recopilar(){
    
    String SQL = "select * from jugadores";
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                id1=rs.getString("idjugadores");
                nombre1=rs.getString("nombre");
                edad1=rs.getString("edad");
                puntuacion1=rs.getString("puntuacion");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: "+e.getMessage());
        }
}

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getEdad1() {
        return edad1;
    }

    public void setEdad1(String edad1) {
        this.edad1 = edad1;
    }

    public String getPuntuacion1() {
        return puntuacion1;
    }

    public void setPuntuacion1(String puntuacion1) {
        this.puntuacion1 = puntuacion1;
    }
    
    
}
