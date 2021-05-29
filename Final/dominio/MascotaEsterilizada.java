package Final.dominio;

public class MascotaEsterilizada extends Mascota{
    /**constructor**/
    public MascotaEsterilizada(String nombre, String sexo, int edad, boolean esterilizado) {
        super(nombre, sexo, edad, esterilizado);
    }

    /**override**/
    @Override
    public String toString() {
        return "Nombre mascota: " + getNombreM() +","+" " +"Sexo: " + getSexo()+","+" "+"Edad: " + getEdad() +","+" " +","+" " +"Esterilizado: " + isEsterilizado() +","+" " + "La mascota no es Apta."+"\n";
    }

    public String noApta() {
        return "Nombre mascota: " + getNombreM() +"," +" "+"Sexo: " + getSexo() +","+" " +"Edad: " + getEdad() +","+" "+"Esterilizado: " + isEsterilizado() +","+" " + "La mascota no necesito la operación."+"\n";
    }
}

