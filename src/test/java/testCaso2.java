import caso2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testCaso2 {

    @Test
    void test1agregarEmpleado () {
        ArrayList <Departamento> listaDepartamentos = new ArrayList<>();
        ArrayList <GrupoProyecto> gruposDeProyectos = new ArrayList<>();
        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        Departamento departamento = new Departamento("Adquisiciones", gruposDeProyectos);
        listaDepartamentos.add(departamento);
        GrupoProyecto grupo_contadores = new GrupoProyecto("Contadores", listaEmpleados);
        gruposDeProyectos.add(grupo_contadores);

        Vehiculo vehiculo1 = new Vehiculo("moto", "Harley Davison", "1200 Custom");
        Domicilio domicilioCompartido = new Domicilio("San martin 1212", "Villa Boldos");
        Empleado nuevoEmpleado = new Empleado("juan", domicilioCompartido, vehiculo1);

        Empresa empresa = new Empresa("Tesoros del mar S.A.", listaDepartamentos);
        empresa.agregarEmpleadoEn("adquisiciones", "contadores", nuevoEmpleado);

        String resultado = String.valueOf(empresa.buscarDepartamento("adquisiciones").buscarGrupoProyecto("contadores").buscarEmpleado("JUAN"));
        String esperado = String.valueOf(nuevoEmpleado);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void test2EliminarEmpleado () {
        ArrayList <Departamento> listaDepartamentos = new ArrayList<>();
        ArrayList <GrupoProyecto> gruposDeProyectos = new ArrayList<>();
        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        Departamento departamento = new Departamento("Adquisiciones", gruposDeProyectos);
        listaDepartamentos.add(departamento);
        GrupoProyecto grupo_contadores = new GrupoProyecto("Contadores", listaEmpleados);
        gruposDeProyectos.add(grupo_contadores);

        Vehiculo vehiculo1 = new Vehiculo("moto", "Harley Davison", "1200 Custom");
        Domicilio domicilioCompartido = new Domicilio("San martin 1212", "Villa Boldos");
        Empleado nuevoEmpleado = new Empleado("juan", domicilioCompartido, vehiculo1);
        Empleado nuevaEmpleado2 = new Empleado("carlos", domicilioCompartido, null);

        Empresa empresa = new Empresa("Tesoros del mar S.A.", listaDepartamentos);
        empresa.agregarEmpleadoEn("Adquisiciones", "Contadores", nuevoEmpleado);
        empresa.agregarEmpleadoEn("adquisiciones", "contadores", nuevaEmpleado2);
        System.out.println((empresa.buscarDepartamento("Adquisiciones").buscarGrupoProyecto("Contadores").buscarEmpleado("juan")));
//aqui esta Juan
        empresa.eliminarEmpleado("juan");
        //aqui se borra Juan, queda solo Carlos
        Empleado verdadero = (empresa.buscarDepartamento("Adquisiciones").buscarGrupoProyecto("Contadores").buscarEmpleado("juan"));

        Assertions.assertNull(verdadero);

    }

    @Test
    void test3modificarDireccion () {
        ArrayList <Departamento> listaDepartamentos = new ArrayList<>();
        ArrayList <GrupoProyecto> gruposDeProyectos = new ArrayList<>();
        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        Departamento departamento = new Departamento("Adquisiciones", gruposDeProyectos);
        listaDepartamentos.add(departamento);
        GrupoProyecto grupo_contadores = new GrupoProyecto("Contadores", listaEmpleados);
        gruposDeProyectos.add(grupo_contadores);

        Vehiculo vehiculo1 = new Vehiculo("moto", "Harley Davison", "1200 Custom");
        Domicilio domicilioCompartido = new Domicilio("San martin 1212", "Villa Boldos");
        Domicilio mudanza = new Domicilio("Houston 4343", "Villa South");
        Empleado nuevoEmpleado = new Empleado("juan", domicilioCompartido, vehiculo1);
        Empleado nuevaEmpleado2 = new Empleado("carlos", domicilioCompartido, null);

        Empresa empresa = new Empresa("Tesoros del mar S.A.", listaDepartamentos);
        empresa.agregarEmpleadoEn("Adquisiciones", "Contadores", nuevoEmpleado);
        empresa.agregarEmpleadoEn("adquisiciones", "contadores", nuevaEmpleado2);

        Domicilio esperado = mudanza;
        Domicilio resultado = empresa.buscarDepartamento("adquisiciones").buscarGrupoProyecto("contadores").buscarEmpleado("juan").getDomicilio();
        empresa.editarDireccionEmpleado("juan", mudanza);
        Assertions.assertNotEquals(esperado, resultado);
    }

    @Test
    void test4 () {

    }
}
