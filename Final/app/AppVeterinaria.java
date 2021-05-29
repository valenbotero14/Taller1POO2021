package Final.app;

import Final.dominio.Veterinaria;

public class AppVeterinaria {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();
        System.out.println("Mascotas para revisión......");
        System.out.println(veterinaria.revisarMascota("Sasha", "hembra", 28, true));
        System.out.println(veterinaria.revisarMascota("Saia", "hembra", 21, false));
        System.out.println(veterinaria.revisarMascota("Diablo", "macho", 10, false));
        System.out.println(veterinaria.revisarMascota("Rosco", "macho", 54, true));
        System.out.println(veterinaria.revisarMascota("Torbellino", "macho", 20, false));

        System.out.println("\n");
        System.out.println("Mascotas que pasaran a la operacion de castreo...");
        System.out.println(veterinaria.getPacientesAOperar());

        System.out.println("\n");
        System.out.println("Mascotas operadas..... y mascotas no operadas....");
        veterinaria.operar();
    }
}
