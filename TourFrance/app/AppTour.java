package TourFrance.app;

import TourFrance.dominio.Corredor;
import TourFrance.dominio.Equipo;
import TourFrance.dominio.Etapa;
import TourFrance.dominio.Tour;

import java.util.Arrays;


public class AppTour {
    public static void main(String[] args) {
        /*Equipo 1*/
        Corredor[] corredor = new Corredor[7];
        corredor[0] = new Corredor("valentina", (byte) 20, 59, 162);
        corredor[1] = new Corredor("Jhonatan", (byte) 30, 65, 170);
        corredor[2] = new Corredor("Douglas", (byte) 27, 30, 120);
        corredor[3] = new Corredor("Albenis", (byte) 10, 20, 110);
        corredor[4] = new Corredor("Marta", (byte) 60, 40, 160);
        corredor[5] = new Corredor("Santiago", (byte) 37, 54, 160);
        corredor[6] = new Corredor("Juan David", (byte) 29, 36, 180);


        Equipo Equipo1 = new Equipo("Dinamita", (byte) 5);
        Equipo1.corredor.add(corredor[0]);
        Equipo1.corredor.add(corredor[1]);
        Equipo1.corredor.add(corredor[2]);
        Equipo1.corredor.add(corredor[3]);
        Equipo1.corredor.add(corredor[4]);
        Equipo1.corredor.add(corredor[5]);
        Equipo1.corredor.add(corredor[6]);


        /*Equipo 2*/
        Corredor Corredor8 = new Corredor("Jaime", (byte) 18, 80, 180);
        Corredor Corredor9 = new Corredor("Joseph", (byte) 20, 75, 170);
        Corredor Corredor10 = new Corredor("Pedro", (byte) 18, 85, 185);
        Corredor Corredor11 = new Corredor("Nora", (byte) 21, 70, 168);
        Corredor Corredor12 = new Corredor("Juaquin", (byte) 19, 78, 175);
        Corredor Corredor13 = new Corredor("Pepe", (byte) 23, 87, 188);
        Corredor Corredor14 = new Corredor("Pablo", (byte) 20, 68, 168);

        Equipo Equipo2 = new Equipo("los rocos", (byte) 5);
        Equipo2.corredor.add(Corredor8);
        Equipo2.corredor.add(Corredor9);
        Equipo2.corredor.add(Corredor10);
        Equipo2.corredor.add(Corredor11);
        Equipo2.corredor.add(Corredor12);
        Equipo2.corredor.add(Corredor13);
        Equipo2.corredor.add(Corredor14);

        /*Equipo3*/
        Corredor Corredor15 = new Corredor("Marco Polo", (byte) 22, 85, 185);
        Corredor Corredor16 = new Corredor("Mariana", (byte) 20, 75, 172);
        Corredor Corredor17 = new Corredor("Juliana", (byte) 18, 78, 175);
        Corredor Corredor18 = new Corredor("Julian", (byte) 24, 88, 189);
        Corredor Corredor19 = new Corredor("Ruben", (byte) 20, 70, 168);
        Corredor Corredor20 = new Corredor("Bety", (byte) 22, 86, 188);
        Corredor Corredor21 = new Corredor("Andres", (byte) 20, 79, 178);


        Equipo Equipo3 = new Equipo("Estrellitas", (byte) 5);
        Equipo3.corredor.add(Corredor15);
        Equipo3.corredor.add(Corredor16);
        Equipo3.corredor.add(Corredor17);
        Equipo3.corredor.add(Corredor18);
        Equipo3.corredor.add(Corredor19);
        Equipo3.corredor.add(Corredor20);
        Equipo3.corredor.add(Corredor21);

        /*Equipo4*/
        Corredor Corredor22 = new Corredor("Saul", (byte) 18, 68, 170);
        Corredor Corredor23 = new Corredor("Raul", (byte) 23, 87, 188);
        Corredor Corredor24 = new Corredor("Federico", (byte) 20, 68, 168);
        Corredor Corredor25 = new Corredor("Hardin", (byte) 22, 85, 185);
        Corredor Corredor26 = new Corredor("Tessa", (byte) 20, 75, 172);
        Corredor Corredor27 = new Corredor("Tomas", (byte) 18, 78, 175);
        Corredor Corredor28 = new Corredor("Samuel", (byte) 22, 90, 190);

        Equipo Equipo4 = new Equipo("Los españoles", (byte) 5);
        Equipo4.corredor.add(Corredor22);
        Equipo4.corredor.add(Corredor23);
        Equipo4.corredor.add(Corredor24);
        Equipo4.corredor.add(Corredor25);
        Equipo4.corredor.add(Corredor26);
        Equipo4.corredor.add(Corredor27);
        Equipo4.corredor.add(Corredor28);

        /*Equipo5*/
        Corredor Corredor29 = new Corredor("El chicki", (byte) 20, 70, 172);
        Corredor Corredor30 = new Corredor("Vicente", (byte) 19, 70, 170);
        Corredor Corredor31 = new Corredor("Valeria", (byte) 21, 79, 181);
        Corredor Corredor32 = new Corredor("Yuli", (byte) 18, 67, 170);
        Corredor Corredor33 = new Corredor("Stiven", (byte) 20, 70, 172);
        Corredor Corredor34 = new Corredor("Dahian", (byte) 19, 70, 170);
        Corredor Corredor35 = new Corredor("Dennis", (byte) 21, 79, 181);

        Equipo Equipo5 = new Equipo("tutucanes", (byte) 5);
        Equipo5.corredor.add(Corredor29);
        Equipo5.corredor.add(Corredor30);
        Equipo5.corredor.add(Corredor31);
        Equipo5.corredor.add(Corredor32);
        Equipo5.corredor.add(Corredor33);
        Equipo5.corredor.add(Corredor34);
        Equipo5.corredor.add(Corredor35);

        /*---------------------------------------------------------------*/
        /* Equipos y participantes*/
        System.out.println(Equipo1.getNombreEquipos());
        Equipo1.corredor.forEach(x -> System.out.println("El corredor es: " + x.getNombreCorredor()));
        System.out.println("\n");
        System.out.println(Equipo2.getNombreEquipos());
        Equipo2.corredor.forEach(x -> System.out.println("El corredor es: " + x.getNombreCorredor()));
        System.out.println("\n");
        System.out.println(Equipo3.getNombreEquipos());
        Equipo3.corredor.forEach(x -> System.out.println("El corredor es: " + x.getNombreCorredor()));
        System.out.println("\n");
        System.out.println(Equipo4.getNombreEquipos());
        Equipo4.corredor.forEach(x -> System.out.println("El corredor es: " + x.getNombreCorredor()));
        System.out.println("\n");
        System.out.println(Equipo5.getNombreEquipos());
        Equipo5.corredor.forEach(x -> System.out.println("El corredor es: " + x.getNombreCorredor()));

        System.out.println("\n");
        /*------------------------------------------------------------------------------------------------------------------*/
        /*Todos los equipos del tour*/
        Tour tourFrance = new Tour("Francia", 250, "Valentina");
        System.out.println("El tour es el de: " + tourFrance.getNombreTour() + " " + "Y su distancia es de: " + tourFrance.getDistanciaTour() + " " + "ademas el ganador del tour es: " + tourFrance.getGanadorTour());
        System.out.println("\n");
        tourFrance.corredores.add(corredor[0]);
        tourFrance.corredores.add(corredor[1]);
        tourFrance.corredores.add(corredor[2]);
        tourFrance.corredores.add(corredor[3]);
        tourFrance.corredores.add(corredor[4]);
        tourFrance.corredores.add(corredor[5]);
        tourFrance.corredores.add(corredor[6]);

        tourFrance.corredores.add(Corredor8);
        tourFrance.corredores.add(Corredor9);
        tourFrance.corredores.add(Corredor10);
        tourFrance.corredores.add(Corredor11);
        tourFrance.corredores.add(Corredor12);
        tourFrance.corredores.add(Corredor13);
        tourFrance.corredores.add(Corredor14);
        tourFrance.corredores.add(Corredor15);
        tourFrance.corredores.add(Corredor16);
        tourFrance.corredores.add(Corredor17);
        tourFrance.corredores.add(Corredor18);
        tourFrance.corredores.add(Corredor19);
        tourFrance.corredores.add(Corredor20);
        tourFrance.corredores.add(Corredor21);
        tourFrance.corredores.add(Corredor22);
        tourFrance.corredores.add(Corredor23);
        tourFrance.corredores.add(Corredor24);
        tourFrance.corredores.add(Corredor25);
        tourFrance.corredores.add(Corredor26);
        tourFrance.corredores.add(Corredor27);
        tourFrance.corredores.add(Corredor28);
        tourFrance.corredores.add(Corredor29);
        tourFrance.corredores.add(Corredor30);
        tourFrance.corredores.add(Corredor31);
        tourFrance.corredores.add(Corredor32);
        tourFrance.corredores.add(Corredor33);
        tourFrance.corredores.add(Corredor34);
        tourFrance.corredores.add(Corredor35);

        /*----------------------------------------------------------------------------------------------*/
        /*Son 21 etapas pero para la muestra solo puse 4 */
        Etapa Etapa1 = new Etapa("Media Montaña", "187 km", "Brest", "Landerneau", "26/06/2020");
        System.out.println("La etapa 1 es de tipo: " + Etapa1.getTipoEtapa());
        System.out.println("La longitud de la etapa 1 es de : " + Etapa1.getLongitudEtapa());
        System.out.println("El punto de partida de la etapa 1 es : " + Etapa1.getPuntoPartida());
        System.out.println("El punto de llegada de la etapa 1 es : " + Etapa1.getPuntoLlegada());
        System.out.println("La fecha de la etapa 1 es el : " + Etapa1.getFechaEtapa());
        System.out.println("\n");
        Etapa Etapa2 = new Etapa("Media Montaña", "182 km", "Perros-Guirec", "Mur-De-Bretagne-Guerledan", "27/06/2020");
        System.out.println("La etapa 2 es de tipo: " + Etapa2.getTipoEtapa());
        System.out.println("La longitud de la etapa 2 es de : " + Etapa2.getLongitudEtapa());
        System.out.println("El punto de partida de la etapa 2 es : " + Etapa2.getPuntoPartida());
        System.out.println("El punto de llegada de la etapa 2 es : " + Etapa2.getPuntoLlegada());
        System.out.println("La fecha de la etapa 2 es el : " + Etapa2.getFechaEtapa());
        System.out.println("\n");
        Etapa Etapa3 = new Etapa("LLana", "182 km", "Lorient", "Pontivy", "28/06/2020");
        System.out.println("La etapa 3 es de tipo: " + Etapa3.getTipoEtapa());
        System.out.println("La longitud de la etapa 3 es de : " + Etapa3.getLongitudEtapa());
        System.out.println("El punto de partida de la etapa 3 es : " + Etapa3.getPuntoPartida());
        System.out.println("El punto de llegada de la etapa 3 es : " + Etapa3.getPuntoLlegada());
        System.out.println("La fecha de la etapa 3 es el : " + Etapa3.getFechaEtapa());
        System.out.println("\n");
        Etapa Etapa4 = new Etapa("LLana", "152 km", "Redon", "Fougeres", "29/06/2020");
        System.out.println("La etapa 4 es de tipo: " + Etapa4.getTipoEtapa());
        System.out.println("La longitud de la etapa 4 es de : " + Etapa4.getLongitudEtapa());
        System.out.println("El punto de partida de la etapa 4 es : " + Etapa4.getPuntoPartida());
        System.out.println("El punto de llegada de la etapa 4 es : " + Etapa4.getPuntoLlegada());
        System.out.println("La fecha de la etapa 4 es el : " + Etapa4.getFechaEtapa());
        System.out.println("\n");


        /*-----------------------------------------------------------------------*/
        /*Ganador de cada una de las etapas*/
        System.out.println("Los ganadores de las etapas son ");
        for (int i = 1; i <= 21; i++) {
            System.out.println("El ganador en la etapa " + " " + i + " es: " + " " + (tourFrance.corredores.get(i + 1).getNombreCorredor()));
        }
        /*---------------------------------------------------------------------------*/
        System.out.println("\n");
        /* Tabla de posiciones del top 10 del tour*/
        System.out.println("Tabla de posiciones del top 10 del tour ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("El" + " " + i + " es: " + " " + tourFrance.corredores.get(i + 2).getNombreCorredor());
        }

        /*---------------------------------------------------------------------------*/
        System.out.println("\n");
        /*Ordenar los corredores de un equipo de menor a mayor*/
        Arrays.sort(corredor);
        System.out.println("Los corredores ordenados por edad son: ");
        System.out.println(Equipo1.getNombreEquipos());
        Corredor.InfoCorredor(corredor);

    }
}
