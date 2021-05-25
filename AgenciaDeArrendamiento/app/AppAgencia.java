package AgenciaDeArrendamiento.app;

import AgenciaDeArrendamiento.dominio.Agencia;
import AgenciaDeArrendamiento.dominio.Apartamento;
import AgenciaDeArrendamiento.dominio.Casa;
import AgenciaDeArrendamiento.dominio.Lote;

import java.util.stream.Collectors;

public class AppAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("La vale");
        Apartamento apartamento = new Apartamento("calibio", 13000000, 600, true);
        Casa casa = new Casa("Maria Auxiliadora", 3000000, 900, true);
        Lote lote = new Lote("Cayetano", 2900000, 1000, false);

        /**agregados**/
        agencia.agregarInmueble(apartamento);
        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(lote);

        /**disponibles**/
        System.out.println(agencia.getArrendablesDisponibles());

        /**Arrendados**/
        System.out.println(agencia.getArrendados());

        /**arrendar**/
        System.out.println(agencia.arrendar(apartamento,apartamento));

        /**devolver**/
        System.out.println(agencia.devolver(casa,casa));

        /**vender**/
        System.out.println(agencia.vender(lote,lote));
    }
}