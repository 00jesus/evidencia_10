package caso2;


import java.util.ArrayList;
import java.util.Locale;

public class Departamento {
    private String nombre;
    public ArrayList<GrupoProyecto> gruposDeProyectos;

    public Departamento(String nombre, ArrayList<GrupoProyecto> gruposDeProyectos) {
        this.nombre = nombre;
        this.gruposDeProyectos = gruposDeProyectos;
    }

    public GrupoProyecto buscarGrupoProyecto (String buscar) throws NullPointerException , IndexOutOfBoundsException {
        for (GrupoProyecto grup: gruposDeProyectos) {
            if (!gruposDeProyectos.isEmpty()) {
            if (grup.getAreaEspecializacion().toLowerCase(Locale.ROOT).equals(buscar.toLowerCase(Locale.ROOT))) {
                return grup;
            }
            }
        }
        System.out.println("no esta grup");
        return null;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<GrupoProyecto> getGruposDeProyectos() {
        return gruposDeProyectos;
    }

    public void setGruposDeProyectos(ArrayList<GrupoProyecto> gruposDeProyectos) {
        this.gruposDeProyectos = gruposDeProyectos;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", gruposDeProyectos=" + gruposDeProyectos +
                '}';
    }
}