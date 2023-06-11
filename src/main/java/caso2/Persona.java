package caso2;

public class Persona {
    protected String nombre;
    public Domicilio domicilio;
    public Vehiculo vehiculo;

    public Persona(String nombre, Domicilio domicilio, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", vehiculo=" + vehiculo +
                '}';
    }
}