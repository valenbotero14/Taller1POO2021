package Parcial.dominio;

import TourFrance.dominio.Corredor;

public class Material {
    private int codigo;
    private String nombre;
    private int duracion;
    private String tipo;

    public Material(int codigo, String nombre, int duracion, String tipo){
        this.duracion = duracion;
        this.tipo = tipo;
        this.nombre = nombre;
        this.codigo = codigo;
    }



    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getTipo() {
        return tipo;
    }
}
