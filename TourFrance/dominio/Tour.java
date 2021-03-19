package TourFrance.dominio;

import java.util.ArrayList;

public class Tour {
    public ArrayList<Equipo> equipos;
    public ArrayList<Corredor> corredores;
    private String nombreTour;
    private double distanciaTour;
    private Etapa numeroEtapa;
    private String ganadorTour;

    public Tour(String nombreTour, double distanciaTour, String ganadorTour) {
        this.nombreTour = nombreTour;
        this.distanciaTour = distanciaTour;
        this.ganadorTour = ganadorTour;
        this.equipos = new ArrayList<Equipo>();
        this.corredores = new ArrayList<Corredor>();
    }

    public Tour(Etapa numeroEtapa) {
        this.numeroEtapa = numeroEtapa;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public double getDistanciaTour() {
        return distanciaTour;
    }

    public Etapa getNumeroEtapas() {
        return numeroEtapa;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public String getGanadorTour() {
        return ganadorTour;
    }
}
