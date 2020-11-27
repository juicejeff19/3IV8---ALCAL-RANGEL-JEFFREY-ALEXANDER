import java.util.Arrays;
public class Poperaciones extends ProHeren{
    float total_costos;
    float mayor, menor, promedio;

    public Poperaciones(){
    }
    public Poperaciones(String nombre, int id, String[] productos, int[] precios, int[]cantidad){
    super(nombre, id, productos, precios, cantidad);
    }
    public void mostrarDatos(){
        System.out.println("Información de los productos");
        for (int i=0; i<getProductos().length; i++){
            System.out.println("Producto: "+getProductos()[i]);
            System.out.println("Cantidad: "+getCantidad()[i]+"   Costo: "+getPrecios()[i]);
        }
    }
    public void princip(){
        System.out.println("Nombre:" +getNombre()+"\nID: "+getId());
        mostrarDatos();
        suma();
        mayorm();
        menorm();
        promediom();
        System.out.println("El promedio de los precios es: "+promedio+"\nEl precio mayor es de: "+mayor+"\nEl precio menor es de: "+menor);

    }
    public void suma(){
        for (int i=0; i<getPrecios().length;i++){
            total_costos += getPrecios()[i];
        }
    }
    public void mayorm(){
        mayor = getPrecios()[0];

    for (int i=0; i<getPrecios().length;i++){
        if (getPrecios()[i]>mayor){
            mayor = getPrecios()[i];

    }

}
    }
    public void menorm(){
        menor = getPrecios()[0];

    for (int i=0; i<getPrecios().length;i++){
        if (getPrecios()[i]<menor){
            menor = getPrecios()[i];
}
    }
}
    public void promediom(){
    promedio = total_costos/getPrecios().length;
    }
}


