public class TestPedidos{
    public static void main(String[] args) {

        Articulo cafe = new Articulo("Café",10.00);
        Articulo cafePasado = new Articulo("Café Pasado",8.00);
        Articulo capuchino = new Articulo("Capuchino", 15.50);
        Articulo moccachino = new Articulo("Moccachino", 13.00);
        Articulo frappuchino = new Articulo("Frappuchino", 17.00);


        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido("Karen");
        Pedido pedido4 = new Pedido("Mayra");
        Pedido pedido5 = new Pedido("Elsa");

        pedido1.addArticulo(frappuchino);
        pedido1.addArticulo(capuchino);

        pedido2.addArticulo(cafePasado);
        pedido2.addArticulo(cafe);

        pedido3.addArticulo(frappuchino);
        pedido3.addArticulo(moccachino);

        pedido4.addArticulo(frappuchino);
        pedido4.addArticulo(capuchino);

        pedido5.addArticulo(moccachino);
        pedido5.addArticulo(cafePasado);

        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();

        pedido2.setListo(true);
        pedido3.setListo(true);

        System.out.println( pedido1.getStatusMessage());
        System.out.println( pedido2.getStatusMessage());
        System.out.println( pedido3.getStatusMessage());
        System.out.println( pedido4.getStatusMessage());
        System.out.println( pedido5.getStatusMessage());

    }
}