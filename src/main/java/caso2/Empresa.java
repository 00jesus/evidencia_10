package caso2;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Empresa {
    private String rolEmpresa;
    public ArrayList<Departamento> listaDepartamentos;
    public Empresa(String rolEmpresa, ArrayList<Departamento> listaDepartamentos) {
        this.rolEmpresa = rolEmpresa;
        this.listaDepartamentos = listaDepartamentos;
    }
    public Empresa () {
        this.rolEmpresa = "";
        this.listaDepartamentos = null;
    }

    public void agregarEmpleadoEn(String dep, String grup,Empleado empleado) {
// departamento --> grupo --> empleado
        buscarDepartamento(dep).buscarGrupoProyecto(grup).getListaEmplados().add(empleado);
    }
   public Departamento buscarDepartamento (String buscar) {
       for (Departamento dep: listaDepartamentos) {
           if (dep.getNombre().toLowerCase(Locale.ROOT).equals(buscar.toLowerCase(Locale.ROOT))) {
               return dep;
           }
       }
       System.out.println("no esta dep");
       return null;
   }

    public void eliminarEmpleado(String nombreEmpleado) throws IndexOutOfBoundsException {
        for (Departamento dep : listaDepartamentos) {
            for (GrupoProyecto grup : dep.getGruposDeProyectos()) {
                for (Iterator<Empleado> iterator = grup.getListaEmplados().iterator(); iterator.hasNext(); ) {
                    Empleado emple = iterator.next();
                    if (emple.getNombre().toLowerCase(Locale.ROOT).equals(nombreEmpleado.toLowerCase(Locale.ROOT))) {
                        iterator.remove();
                    }
                }
                }
            }
        }


    public void editarDireccionEmpleado(String nombreEmpleado, Domicilio nuevoDomicilio) {
        for (Departamento dep : listaDepartamentos) {
            for (GrupoProyecto grup : dep.gruposDeProyectos) {
                for (Empleado emple : grup.listaEmplados) {
                    if (emple.getNombre().toLowerCase(Locale.ROOT).equals(nombreEmpleado.toLowerCase(Locale.ROOT))) {
                        emple.setDomicilio(nuevoDomicilio);
                    }
                }
            }
        }
    }

    public Empleado obtenerInformacionEmpleado(String nombreEmpleado) {
            for (Departamento dep : listaDepartamentos) {
                for (GrupoProyecto grup : dep.getGruposDeProyectos()) {
                    for (Empleado emple : grup.getListaEmplados()) {
                        if (emple.getNombre().toLowerCase(Locale.ROOT).equals(nombreEmpleado.toLowerCase(Locale.ROOT))) {
                            return emple;
                        }
                    }
                }
            }
        System.out.println("no se encontro");
            return null;
    }
    public void mostrarTodosLosEmpleados () {
        for (Departamento dep : listaDepartamentos) {
            for (GrupoProyecto grup : dep.getGruposDeProyectos()) {
                for (Empleado emple : grup.getListaEmplados()) {
                    System.out.println(emple);
                }
            }
        }
    }



    public String getRolEmpresa() {
        return rolEmpresa;
    }

    public void setRolEmpresa(String rolEmpresa) {
        this.rolEmpresa = rolEmpresa;
    }

    public ArrayList<Departamento> getListaDepartamentos() throws IndexOutOfBoundsException {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "rolEmpresa='" + rolEmpresa + '\'' +
                ", listaDepartamentos=" + listaDepartamentos +
                '}';
    }
}