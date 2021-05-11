package TiendaColchones.dominio;

public class Vendedor extends Directo{
    /**creamos variables**/
    private long ventasDelMes;

    /**constructor**/
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    /**override**/
    @Override
    public long calcularSalud() {
        return super.calcularSalud();
    }

    @Override
    public long calcularPension() {
        return super.calcularPension();
    }

    @Override
    public long calcularSalario() {
        return getSalario() - calcularSalud() - calcularPension() + calcularComision();
    }


    /**get y set**/
    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    /**operacion**/
    public long calcularComision(){
        long ventasDelMes = this.getVentasDelMes();
        long pagoMensual = 0;
        if (getSalario() < 999999){
            pagoMensual = (long) (ventasDelMes * 0.05);
        } else if (getSalario() > 1000000){
            pagoMensual = (long) (ventasDelMes * 0.045);
        }
        return pagoMensual;
    }

}
