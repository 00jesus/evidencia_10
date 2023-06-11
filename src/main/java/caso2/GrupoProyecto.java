package caso2;

import java.util.ArrayList;
import java.util.Locale;

public class GrupoProyecto {
    private String areaEspecializacion;
    public ArrayList<Empleado> listaEmplados;

    public GrupoProyecto(String areaEspecializacion, ArrayList<Empleado> listaEmplados) {
        this.areaEspecializacion = areaEspecializacion;
        this.listaEmplados = listaEmplados;
    }
    public Empleado buscarEmpleado (String buscar) {
        for (Empleado emple: listaEmplados) {
            if (!listaEmplados.isEmpty()) {
            if (emple.getNombre().toLowerCase(Locale.ROOT).equals(buscar.toLowerCase(Locale.ROOT))) {
                return emple;
            }
            }
        }
        System.out.println("No se encontro");
        return null;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public ArrayList<Empleado> getListaEmplados() {
        return listaEmplados;
    }

    public void setListaEmplados(ArrayList<Empleado> listaEmplados) {
        this.listaEmplados = listaEmplados;
    }

    @Override
    public String toString() {
        return "GrupoProyecto{" +
                "areaEspecializacion='" + areaEspecializacion + '\'' +
                ", listaEmplados=" + listaEmplados +
                '}';
    }
}