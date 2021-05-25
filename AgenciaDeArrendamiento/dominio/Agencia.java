package AgenciaDeArrendamiento.dominio;

import TiendaColchones.dominio.Freelance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Agencia {
    private String nombre;
    private ArrayList<Inmueble> inmuebles;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    /** agregar inmueble**/
    public void agregarInmueble(Inmueble i) {
        if (i != null) {
            this.inmuebles.add(i);
        }
    }

    /**arrendar inmueble**/
    public boolean arrendar(Arrendable inmueble, Inmueble arrendar) {
        if(!arrendar.isArrendado()) {
            assert inmueble != null;
            inmueble.arrendar();
            System.out.println("El inmueble fue arrendado por ti");
        }
        else{
            System.out.println("El inmueble ya se encuentra arrendado");
        }
        return true;
    }

    /**devolver inmueble**/
    public boolean devolver(Arrendable inmueble, Inmueble devolver) {
        if(devolver.isArrendado()) {
            assert inmueble != null;
            inmueble.devolver();
            System.out.println("El inmueble fue devuelto");
        }
        else{
            System.out.println("El inmueble no esta arrendado");
        }
        return false;
    }

    /**vender inmueble**/
    public boolean vender(Inmueble inmueble, Inmueble vender){
        if(vender.isArrendado()) {
            assert inmueble != null;
            System.out.println("No se puede vender por que el inmueble esta arrendado");
            return true;
        }
        else{
            List<Inmueble> vender1 = new ArrayList<>();
            vender1.add(vender);
            inmuebles.removeAll(vender1);
            System.out.println("El inmueble se vendio");
        }
        return true;
    }


    /**lista de disponibles**/
    public List<Inmueble> getArrendablesDisponibles() {
        System.out.println("Disponibles para arrendar");
        return inmuebles
                .stream()
                .filter(d -> !d.isArrendado())
                .collect(Collectors.toList());
    }

    /**lista de arrendados**/
    public List<Inmueble> getArrendados(){
        System.out.println("Arrendados");
        return inmuebles
                .stream()
                .filter(Inmueble::isArrendado)
                .collect(Collectors.toList());
    }

}