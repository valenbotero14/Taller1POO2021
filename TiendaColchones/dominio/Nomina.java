package TiendaColchones.dominio;


import java.util.ArrayList;
import java.util.List;

public class Nomina {
    /**creamos la lista de empleados**/
    private ArrayList<Empleado> empleados;

    /**get y set**/
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**operacion**/

    public void calcularNomina(List<Empleado> empleados) {

        empleados.forEach(empleado -> System.out.println(empleado.getNombre() + "\n su salario es: " + empleado.calcularSalario() + "\n sigue trabajando duro!"));
    }

     /**listar**/
    public void listarDirectos(List<Empleado> empleados) {
        empleados.forEach(tipoEmpleado -> {
            if (tipoEmpleado instanceof Vendedor) {
                System.out.println(tipoEmpleado.getNombre() + " Es un vendedor");
            } else if (tipoEmpleado instanceof Directo) {
                System.out.println(tipoEmpleado.getNombre() + " Es un empleado directo");
            }
        });
    }

    public void listarFreelance(List<Empleado> empleados) {
        empleados.forEach(tipoEmpleado1 -> {
            if (tipoEmpleado1 instanceof Freelance) {
                System.out.println(tipoEmpleado1.getNombre() + " Es un empleado Freenlace");
            }
        });
    }

    public void listarPromotores(List<Empleado> empleados) {
        empleados.forEach(tipoEmpleado2 -> {
            if (tipoEmpleado2 instanceof Promotor) {
                System.out.println(tipoEmpleado2.getNombre() + " Es un Promotor");
            }
        });
    }
}
