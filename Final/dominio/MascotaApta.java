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
        return "Nombre mascota: " + getNombreM() +"," +"Sexo: " + getSexo() + " " +"Edad: " + getEdad() +","+ " " +"Esterilizado: " + isEsterilizado() +","+" " + "La mascota es Apta."+"\n";
    }

    public String operar1() {
        return "Nombre mascota: " + getNombreM() +","+ " "+ "Sexo: " + getSexo() +","+ " "+"Edad: " + getEdad() +","+" "+"Esterilizado: " + isEsterilizado() +","+" " + "La mascota ha sido operada con exito."+"\n";
    }
}
