class Humane {

    private String nombre;
    private String apellido;

    public Humane(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido;
    }

}

class Empleado extends Humane {

    private Caja nroCaja;
    private double sueldo;
    
    public Empleado(String nombre, String apellido, double sueldo, Caja nroCaja){
        super(nombre, apellido);
        this.nroCaja = nroCaja;
        this.sueldo = sueldo;
    }

    public String toString(){
        return super.toString() + nroCaja.toString() + "\nSueldo: " + sueldo;
    }

}

class Caja {

    private int nroCaja;

    public Caja(int nroCaja){
        this.nroCaja = nroCaja;
    }

    public String toString(){
        return "\nNro de Caja: " + nroCaja;
    }

}

class Cliente extends Humane {

    private boolean mayorista;
    
    public Cliente(String nombre, String apellido, boolean mayorista){
        super(nombre, apellido);
        this.mayorista = mayorista;
    }

    public String toString(){
        return super.toString() + "\nDescuento mayorista: " + mayorista;
    }

}

class Producto {

    private String item;
    private double precio;
    private int cantidad;

    public Producto(String item, double precio, int cantidad){
        this.item = item;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String toString(){
        return "Producto: " + item + "\nPago: $" + precio*cantidad; 
    }

}