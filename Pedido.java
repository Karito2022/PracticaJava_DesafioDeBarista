import java.util.ArrayList;

public class Pedido{
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> articulos;

    public Pedido() {
        this.nombre = "Invitado";
        this.articulos = new ArrayList<Articulo>();
    }
    public Pedido(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<Articulo>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public boolean isListo(){
        return listo;
    }
    public void setListo(boolean listo) {
        this.listo = listo;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public String getStatusMessage(){
        if(listo){
            return "Tu pedido está listo.";
        }
        return "Gracias por esperar. Tu pedido estará listo pronto.";
    }

    public double getOrderTotal(){
        double total = 0;
        for(Articulo articulo : articulos){
            total+=articulo.getPrecio();
        }
        return total;
    }

    public void display(){
        System.out.println(String.format("Nombre Cliente: %s", nombre));
        for(Articulo articulo : articulos){
            System.out.println(String.format("%s: %,.2f", articulo.getNombre(), articulo.getPrecio()));
        }
        System.out.println(String.format("Total: %,.2f", getOrderTotal()));
    }

}