class Humane {

    private String nombre;
    private String apellido;

    public Humane(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido;
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

    @Override
    public String toString(){
        return super.toString() + this.nroCaja.toString() + "\nSueldo: " + this.sueldo;
    }

}

class Caja {

    private int nroCaja;

    public Caja(int nroCaja){
        this.nroCaja = nroCaja;
    }

    @Override
    public String toString(){
        return "\nNro de Caja: " + this.nroCaja;
    }

    public int getNroCaja(){
        return this.nroCaja;
    }
}

class Cliente extends Humane {

    private boolean mayorista;
    
    public Cliente(String nombre, String apellido, boolean mayorista){
        super(nombre, apellido);
        this.mayorista = mayorista;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDescuento mayorista: " + this.mayorista;
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

    @Override
    public String toString(){
        return "Producto: " + this.item + "\nPago: $" + this.precio * this.cantidad; 
    }

    public String getItem(){
        return this.item;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }

}