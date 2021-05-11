package TiendaColchones.dominio;

public class Promotor extends Empleado {
    /**creamos variables**/
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    /**constructor**/
    public Promotor(String nombre, int volantesRepartidos ,long valorVolante, int comprasVolante){
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;

    }

    /**override**/
    @Override
    public long calcularSalario() {
        return  (getValorVolante() * getVolantesRepartidos()) + (17000L * getComprasVolante());
    }

    /**get y set**/
    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }

}
