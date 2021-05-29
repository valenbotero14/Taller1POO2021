package Final.dominio;

import java.util.ArrayList;
import java.util.List;


public class Veterinaria {
    private String nombreV;
    private ArrayList<Mascota> mascotas;

    /**constructor**/
    public Veterinaria() {
        this.mascotas = new ArrayList<>();
    }
    /**get y set**/

    public String getNombreV() {
        return nombreV;
    }
    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**revisar mascota**/
    public Mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizado){
        /**no esta esterilizado , es macho y tiene mas de 1 año**/
        if (sexo.equals("macho") && edad > 1 && !esterilizado){
            MascotaApta mascotaApta = new MascotaApta(nombre, sexo, edad, esterilizado);
            mascotas.add(mascotaApta);
            return mascotaApta;
        }
        /**no esta esterilizado , es hembra y tiene mas de 18 meses de edad**/
        else if (sexo.equals("hembra") && edad > 18 && !esterilizado){
            MascotaApta mascotaApta = new MascotaApta(nombre, sexo, edad, esterilizado);
            mascotas.add(mascotaApta);
            return mascotaApta;
        }
        /** no es apto para la cirujua**/
        else {
            MascotaEsterilizada mascotaEsterilizada = new MascotaEsterilizada(nombre, sexo, edad, esterilizado);
            mascotas.add(mascotaEsterilizada);
            return mascotaEsterilizada;
        }
    }

    /** mascotas a operar**/
    public List<MascotaApta> getPacientesAOperar() {
        List<MascotaApta> mascotaAptas = new ArrayList<>();
        getMascotas().forEach(mascota -> {
            boolean operar = mascotas.stream().anyMatch(Mascota::isEsterilizado);
            if (mascota instanceof MascotaApta && operar){
                mascotaAptas.add((MascotaApta) mascota);
            }
        });
        return mascotaAptas;
    }

    /** castrar**/
    public void operar(){
        getMascotas().forEach(mascota -> {
            if(mascota instanceof MascotaApta && mascota.getSexo().equals("macho") && mascota.getEdad() > 1 && !mascota.isEsterilizado())
            {
                ((MascotaApta) mascota).operar();
                System.out.println("Ha sido operada con exito");
                System.out.println(mascota);
            }
            else if (mascota.getSexo().equals("hembra") && mascota.getEdad() > 18 && !mascota.isEsterilizado())
            {
                assert mascota instanceof MascotaApta;
                ((MascotaApta) mascota).operar();
                System.out.println("Ha sido operada con exito");
                System.out.println(mascota);
            }
            else if (mascota.isEsterilizado()){
                System.out.println(mascota);
            }
        });
    }
}
