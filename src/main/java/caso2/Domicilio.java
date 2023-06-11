package caso2;

public class Domicilio {
    private String direccion;
    private String poblacion;

    public Domicilio(String direccion, String poblacion) {
        this.direccion = direccion;
        this.poblacion = poblacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "direccion='" + direccion + '\'' +
                ", poblacion='" + poblacion + '\'' +
                '}';
    }
}