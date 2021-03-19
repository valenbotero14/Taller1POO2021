package TourFrance.dominio;

public class Etapa {
    private short cantidadEtapa = 21;
    private String tipoEtapa;
    private String longitudEtapa;
    private String puntoPartida;
    private String puntoLlegada;
    private String fechaEtapa;

    public Etapa(String tipoEtapa, String longitudEtapa, String puntoPartida, String puntoLlegada, String fechaEtapa) {
        this.tipoEtapa = tipoEtapa;
        this.longitudEtapa = longitudEtapa;
        this.fechaEtapa = fechaEtapa;
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;

    }

    public short getCantidadEtapa() {
        return cantidadEtapa;
    }

    public void setCantidadEtapa(short cantidadEtapa) {
        this.cantidadEtapa = cantidadEtapa;
    }

    public String getTipoEtapa() {
        return tipoEtapa;
    }

    public void setTipoEtapa(String tipoEtapa) {
        this.tipoEtapa = tipoEtapa;
    }

    public String getLongitudEtapa() {
        return longitudEtapa;
    }

    public void setLongitudEtapa(String longitudEtapa) {
        this.longitudEtapa = longitudEtapa;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(String puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }

    public String getFechaEtapa() {
        return fechaEtapa;
    }

    public void setFechaEtapa(String fechaEtapa) {
        this.fechaEtapa = fechaEtapa;
    }
}

