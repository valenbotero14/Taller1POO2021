package Parcial.app;

import Parcial.dominio.Material;
import Parcial.dominio.Pooflix;
import Parcial.dominio.TipoMaterial;

import java.util.Arrays;
import java.util.List;

public class appPooflix {
    public static void main(String[] args) {
        Pooflix LosMateriales = new Pooflix();
        Material material1 = new Material(1,"Romeo", 130,"Pelicula");
        Material material2 = new Material(2,"Universo", 120,"Documental");
        Material material3 = new Material(3,"Shadowhunters", 210,"Serie");
        Material material4 = new Material(4,"El internado", 180,"Serie");
        Material material5 = new Material(5,"Tres leyes", 170,"Documental");
        Material material6 = new Material(6,"After", 160,"Pelicula");
        Material material7 = new Material(7,"La purge", 150,"Pelicula");
        Material material8 = new Material(8,"Julieta", 140,"Serie");
        Material material9 = new Material(9,"Religion", 130,"Documental");
        Material material10 = new Material(10,"Realidad", 120,"Documental");
        Material material11 = new Material(11,"Tecnologia", 110,"Documental");
        Material material12 = new Material(12,"Karate", 220,"Pelicula");
        Material material13 = new Material(13,"Ganadores", 230,"Serie");


        LosMateriales.agregarMaterial(material1, 1);
        LosMateriales.agregarMaterial(material2, 2);
        LosMateriales.retirarMaterial("La purge");
        LosMateriales.calcularDuracionTotal();
        LosMateriales.buscarMaterial2("Shadowhuenters");
        LosMateriales.buscarMaterial1(2);
        LosMateriales.buscarPorTipo("Serie");




    }

}
