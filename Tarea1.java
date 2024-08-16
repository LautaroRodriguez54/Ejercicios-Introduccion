public class Tarea1 {
    public static void main(String[] args) {
        
        Producto product1 = new Producto("Tomate", 100, 3);
        Producto product2 = new Producto("Cebolla", 75, 2);
        Producto product3 = new Producto("Lechuga", 250, 1);

        Transaccion trans1 = new Transaccion(product1.getItem(), product1.getPrecio(), product1.getCantidad(), 123);

        System.out.println(trans1.toString());
        trans1.sumador(product1.getPrecio());
        System.out.println(trans1.toString());
    }
    
}
