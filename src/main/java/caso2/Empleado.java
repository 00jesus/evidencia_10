package caso2;

public class Empleado extends Persona {
    //concepto de herencia --> clase hija
    public Empleado(String nombre, Domicilio domicilio, Vehiculo vehiculo) {
        super(nombre, domicilio, vehiculo);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", vehiculo=" + vehiculo +
                '}';
    }
}