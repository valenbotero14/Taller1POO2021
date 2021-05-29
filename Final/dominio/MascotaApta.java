package Final.dominio;

public class MascotaApta extends Mascota implements Operable{
    /**constructor**/
    public MascotaApta(String nombre, String sexo, int edad, boolean esterilizado) {
        super(nombre, sexo, edad, esterilizado);
    }

    /**override**/
    @Override
    public void operar() {
        setEsterilizado(true);
    }

    @Override
    public String toString() {
        return "Nombre mascota: " + getNombreM() +"\n" +"Edad: " + getEdad() +"\n"+ "Sexo: " + getSexo() +"\n"+"Castrado: " + isEsterilizado() +"\n"+ "La mascota es Apta"+"\n";
    }
}
