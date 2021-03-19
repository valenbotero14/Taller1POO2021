package TourFrance.dominio;

import java.util.ArrayList;

public class Equipo {
    public ArrayList<Corredor> corredor;
    private String nombreEquipos;
    private byte cantidadCorredores;


    public Equipo(String nombreEquipos, byte cantidadCorredores) {
        this.nombreEquipos = nombreEquipos;
        this.cantidadCorredores = cantidadCorredores;
        this.corredor = new ArrayList<Corredor>();
    }

    public String getNombreEquipos() {
        return nombreEquipos;
    }

    public byte getCantidadCorredores() {
        return cantidadCorredores;
    }

}


