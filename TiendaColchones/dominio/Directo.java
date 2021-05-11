package TiendaColchones.dominio;


public class Directo extends Empleado {
    /**creamos variables y variables estaticas**/
    private long salario;

    /**Constructor**/
    public Directo(String nombre, long salario){
        super(nombre);
        this.salario = salario;
    }

    /**override**/
    @Override
    public long calcularSalario() {
        return getSalario() - calcularSalud() - calcularPension();
    }

    /**get y set**/
    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    /**operaciones**/
    public long calcularSalud(){
        long calcular;
        calcular = (long) (getSalario() * 0.07);
        return calcular;
    }

    public long calcularPension(){
        long calcular;
        calcular = (long) (getSalario() * 0.065);
        return calcular;
    }

}

