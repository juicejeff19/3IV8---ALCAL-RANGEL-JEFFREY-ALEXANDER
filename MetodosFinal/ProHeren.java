public class ProHeren{
    private String nombre;
    private int id;
    private String[] productos = new String[10];
    private int[] precios = new int[10];
    private int[] cantidad = new int[10];
    public ProHeren(){

    }
    public ProHeren(String nombre, int id, String[] productos, int[] precios, int[]cantidad){
        this.nombre = nombre;
        this.id = id;
        this.productos = productos;
        this.precios = precios;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getId(){
        return id;        
    }

    public void setId(int id){
        this.id = id;
    }


    public String[] getProductos(){
        return productos;
    }

    public void setProductos(String[] productos){
        this.productos = productos;
    }

    public int[] getPrecios(){
        return precios;
    }

    public void setPrecios(int[] precios){
        this.precios = precios;
    }

    public int[] getCantidad(){
        return cantidad;
    }

    public void setCantidad(int [] cantidad){
        this.cantidad = cantidad;
    }
 
    

}