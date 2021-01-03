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

/**
 *
 * @author juice_pjuorme
 */
public class DatosSerial {
    
    ConexionSQL cc = new ConexionSQL();
    Connection con=cc.conexion();
    String id1, nombre1,edad1, puntuacion1;

    public DatosSerial(String id1, String nombre1, String edad1, String puntuacion1) {
        this.id1 = id1;
        this.nombre1 = nombre1;
        this.edad1 = edad1;
        this.puntuacion1 = puntuacion1;
    }
    
    
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
    
}
