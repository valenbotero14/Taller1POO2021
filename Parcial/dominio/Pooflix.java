package Parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    public static int CAPACIDAD = 15;
    private List<Material> materiales;
    private String LosMateriales;

    public List<Material> getMateriales() {
        return materiales;
    }

    public String getLosMateriales() {
        return LosMateriales;
    }


    public boolean agregarMaterial(Material m, int codigo) {
        if (CAPACIDAD <= 0) {
            if (m.getCodigo() == codigo)
                return false;
            else{
                return false;
            }
        } else {
            materiales.add(m);
            CAPACIDAD = (byte) (CAPACIDAD - 1);
            return true;
        }
    }
    public boolean retirarMaterial(String nombre){
        int MaterialRetirado = 0;
        for (int i = 0; i <= 15; i++) {
            if (materiales.get(i).getNombre().equals(nombre)) {
                MaterialRetirado = materiales.get(i).getDuracion() - 1;
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }


    public Material buscarMaterial1(int codigo)
    {
        for (int k = 1; k <= 15; k++) {
            if (materiales.get(k).getCodigo() == codigo) {
                return getMateriales().get(k);

            } else {
                return null;
            }
        }
        return null;
    }
    public Material buscarMaterial2(String nombre){
        for (int j = 1; j <= 84; j++){
            if (materiales.get(j).getNombre().equals(nombre)){
                return getMateriales().get(j);
            }
            else{
                return null;
            }
        }
        return null;
    }

    public List<Material> buscarPorTipo (String tipo){
        ArrayList<Material> materiales1 = new ArrayList<>();
        for (int l = 1; l <= 38; l++){
            if (materiales.get(l).getTipo().equals(tipo)){
                return materiales;
            }
            else{
                return materiales1;
            }
        }
        return materiales;
    }

    public int calcularDuracionTotal(){
        int sumaCantidad = 0, sumaDuracion = 0, multiplicacion;
        for (int i = 1; i <= 84; i++){
            sumaCantidad = materiales.get(i).getDuracion() + sumaCantidad;
        }
        multiplicacion = sumaCantidad * sumaCantidad;
        return multiplicacion;
    }
}



