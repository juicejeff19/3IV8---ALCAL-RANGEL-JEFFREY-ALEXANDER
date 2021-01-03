/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author juice_pjuorme
 */
public class ObjSerial implements Serializable{
    
    private ArrayList<DatosSerial> lista;
    private ArchivoJ objarchivo = new ArchivoJ();
    
    public ObjSerial(){
    lista = new ArrayList<DatosSerial>();
}
    public void agregar(){
            
            //objeto del cat de libros
            DatosSerial obj = new DatosSerial();
            obj.Recopilar();
            //lo agregamos al array
            lista.add(obj);
            grabar();
            System.out.println("Archivo creado");
        }

    public ArrayList<DatosSerial> getLista() {
        return lista;
    }

    public void setLista(ArrayList<DatosSerial> lista) {
        this.lista = lista;
    }

    public ArchivoJ getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(ArchivoJ objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    
    
    public void grabar(){
        getObjarchivo().serializar(lista);
    }
    
}
   
