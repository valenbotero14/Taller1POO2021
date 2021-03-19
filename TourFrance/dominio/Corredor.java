package TourFrance.dominio;

public class Corredor implements Comparable<Corredor> {
    private String nombreCorredor;
    private byte edad;
    private double peso;
    private double altura;

    public Corredor(String nombreCorredor, byte edad, double peso, double altura) {
        this.nombreCorredor = nombreCorredor;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public static void InfoCorredor(Corredor[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("El corredor es: " + " " + lista[i].nombreCorredor + " " + "y su edad es: " + " " + lista[i].edad);
        }
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public byte getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Corredor o) {
        if (edad < o.edad) {
            return -1;
        }
        if (edad > o.edad) {
            return 1;
        }
        return 0;
    }

}
