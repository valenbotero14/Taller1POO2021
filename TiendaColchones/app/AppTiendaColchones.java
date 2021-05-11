package TiendaColchones.app;

import TiendaColchones.dominio.*;

import java.util.ArrayList;
import java.util.List;

    public class AppTiendaColchones {
        public static void main(String[] args) {

            /**creamos los empleados**/
            Nomina nomina = new Nomina();
            Directo primerEmpleado = new Directo("Juan", 5360000);
            Vendedor segundoEmpleado = new Vendedor("Julian", 2450000, 55510000);
            Freelance tercerEmpleado = new Freelance("Johanna", 76000, 85);
            Vendedor cuartoEmpleado = new Vendedor("Carolina", 990000,62487000);
            Directo quintoEmpleado = new Directo("David", 2895000);
            Freelance sextoEmpleado = new Freelance("Gustavo", 52500, 60);
            Promotor septimoEmpleado = new Promotor("Pedro", 250,1500,48);

            /**los agregamos a la lista**/
            List<Empleado> empleados = new ArrayList<>();
            empleados.add(primerEmpleado);
            empleados.add(segundoEmpleado);
            empleados.add(tercerEmpleado);
            empleados.add(cuartoEmpleado);
            empleados.add(quintoEmpleado);
            empleados.add(sextoEmpleado);
            empleados.add(septimoEmpleado);

            /**imprimimos los resultados**/
            System.out.println("Listado de los empleados directos y los vendedores");
            nomina.listarDirectos(empleados);
            System.out.println("\n");
            System.out.println("Listado de los Freenlace");
            nomina.listarFreelance(empleados);
            System.out.println("\n");
            System.out.println("Listado de los Promotores");
            nomina.listarPromotores(empleados);
            System.out.println("\n");
            System.out.println("Salarios generales");
            nomina.calcularNomina(empleados);
        }
    }
