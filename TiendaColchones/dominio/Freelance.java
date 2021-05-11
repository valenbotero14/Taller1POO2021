package TiendaColchones.dominio;

public class Freelance extends Empleado {
    /**creamos variables**/
    private long valorHora;
    private int horasTrabajadas;

    /**constructor**/
    public Freelance(String nombre, long valorHora, int horasTrabajadas ){
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**override**/
    @Override
    public long calcularSalario() {
        return this.getValorHora() * this.getHorasTrabajadas();
    }

    /**get y set**/

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
