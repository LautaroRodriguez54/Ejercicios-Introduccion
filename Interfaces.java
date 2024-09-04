class Persona {

    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
    }
}

class Cliente extends Persona {

    private String nroSocio;
    private boolean mayorista;
    
    public Cliente(String nombre, String apellido, String dni, String nroSocio, boolean mayorista){
        super(nombre, apellido, dni);
        this.nroSocio = nroSocio;
        this.mayorista = mayorista;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNro de Socio: " + this.nroSocio + "\nMayorista: " + this.mayorista;
    }
}

class Seguridad extends Persona {

    private String sector;
    
    public Seguridad(String nombre, String apellido, String dni, String sector){
        super(nombre, apellido, dni);
        this.sector = sector;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSector: " + this.sector;
    }
}

class Empleado extends Persona {

    private double cantHoras;
    private double sueldo;
    
    public Empleado(String nombre, String apellido, String dni, double cantHoras, double sueldo){
        super(nombre, apellido, dni);
        this.cantHoras = cantHoras;
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPago del mes: " + (this.cantHoras * this.sueldo);
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public double getCantHoras(){
        return  this.cantHoras;
    }
}

interface Informe {

    public abstract void verSueldo(Empleado empleado);
    public abstract void verParticularidades(Cliente cliente);
}

class Cajero extends Empleado implements Informe{

    private String nroCaja;

    public Cajero(String nombre, String apellido, String dni, double cantHoras, double sueldo, String nroCaja){
        super(nombre, apellido, dni, cantHoras, sueldo);
        this.nroCaja = nroCaja;
    }

    @Override
    public void verSueldo(Empleado empleado){
        System.out.println(empleado.getSueldo());
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNro de Caja: " + this.nroCaja;
    }

    @Override
    public void  verParticularidades(Cliente cliente){
        System.out.println(cliente.toString());
    }
}