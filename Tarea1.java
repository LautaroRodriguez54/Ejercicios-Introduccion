import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        Caja nroCaja = new Caja(123);
        Scanner sc = new Scanner(System.in);

        boolean flag1 = true;
        double total= 0;

        while (flag1) { 
            System.out.println("Bienvenido cliente! ¿Que desea comprar hoy?");
            System.out.println("1: Tomate");
            System.out.println("2: Cebolla");
            System.out.println("3: Lechuga");
            System.out.println("4: Papa");
            System.out.println("5: Zanahoria");
            System.out.println("6: Pagar y salir");

            int choice1 = sc.nextInt();
            int choice2;

            switch (choice1){
                case 1 -> { 
                    System.out.println("¿Cuantas unidades desea llevar?");
                    choice2 =  sc.nextInt();
                    Producto product1 = new Producto("Tomate", 100, choice2);
                    total += product1.getPrecio() * product1.getCantidad();
                    product1.toString();
                }

                case 2 -> {
                    System.out.println("¿Cuantas unidades desea llevar?");
                    choice2 =  sc.nextInt();
                    Producto product2 = new Producto("Cebolla", 75, choice2);
                    total += product2.getPrecio() * product2.getCantidad();
                    product2.toString();
                }

                case 3 -> {
                    System.out.println("¿Cuantas unidades desea llevar?");
                    choice2 =  sc.nextInt();
                    Producto product3 = new Producto("Lechuga", 250, choice2);
                    total += product3.getPrecio() * product3.getCantidad();
                    product3.toString();
                }

                case 4 -> {
                    System.out.println("¿Cuantas unidades desea llevar?");
                    choice2 =  sc.nextInt();
                    Producto product4 = new Producto("Papa", 50, choice2);
                    total += product4.getPrecio() * product4.getCantidad();
                    product4.toString();
                }

                case 5 -> {
                    System.out.println("¿Cuantas unidades desea llevar?");
                    choice2 =  sc.nextInt();
                    Producto product5 = new Producto("Zanahoria", 150, choice2);
                    total += product5.getPrecio() * product5.getCantidad();
                    product5.toString();
                }

                case 6 -> flag1 = false;

            }
            
            sc.close();
        }

        //Ahora viene el pago
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.next();

        System.out.println("Es usted cliente mayorista");
        System.out.println("1-Si / 2-No");
        boolean mayorista = false;
        int choice3 = sc.nextInt();
        if (choice3 == 1) {
            mayorista = true;
            total = total * 0.8;
        }
        
        Cliente cliente = new Cliente(nombre, apellido, mayorista);

        System.out.println(cliente.toString());
        System.out.println("Total a pagar: $" + total);
        System.out.println(nroCaja.toString());
    }   

}