package Final.dominio;

public class MascotaEsterilizada extends Mascota{
    /**constructor**/
    public MascotaEsterilizada(String nombre, String sexo, int edad, boolean esterilizado) {
        super(nombre, sexo, edad, esterilizado);
    }

    /**override**/
    @Override
    public String toString() {
        return "Nombre mascota: " + getNombreM() +"\n" +"Edad: " + getEdad() +"\n"+ "Sexo: " + getSexo() +"\n"+"Castrado: " + isEsterilizado() +"\n"+ "La mascota no es Apta"+"\n";
    }
}

