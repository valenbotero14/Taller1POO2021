package TiendaColchones.dominio;

public abstract class Empleado {
    /**creamos variable**/
    private String nombre;

    /**constructor**/
    public Empleado (String nombre){
        this.nombre = nombre;
    }

    /**get y set**/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**operacion abstracta**/
    public abstract long calcularSalario();

}

