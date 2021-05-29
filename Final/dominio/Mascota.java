package Final.dominio;

public abstract class Mascota {
    private String nombreM;
    private String sexo;
    private int edad;
    public boolean esterilizado;

    /**constructor**/
    public Mascota(String nombreM, String sexo, int edad, boolean esterilizado) {
        this.nombreM = nombreM;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizado = esterilizado;
    }

    /**get y set**/
    public String getNombreM() {
        return nombreM;
    }

    public void setNombre(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
