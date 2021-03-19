package mecato.dominio;

import java.util.ArrayList;

public class DispersadorMecato {
    public ArrayList<Producto> producto;
    private String serial;
    private String marca;

    public DispersadorMecato(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
        this.producto = new ArrayList<Producto>();
    }

    /*-------------------------------------------------*/
    public static boolean sacarProducto(byte valorARetirar, Producto nombre) {
        if (nombre.getCantidad() < valorARetirar) {
            System.out.println("No se puede retirar");
            return false;
        } else {
            nombre.setCantidad((byte) (nombre.getCantidad() - valorARetirar));
            return true;
        }
    }

    /*------------------------------------------------------------------------*/
    public static boolean aumentarCantidadProducto(byte valorAAgregar, Producto mecato) {
        if (mecato.getCantidad() < 8 && mecato.getCantidad() >= 0) {
            if (mecato.getCantidad() + valorAAgregar > 8) {
                System.out.println("No se puede agregar cantidad");
                return false;
            } else {
                mecato.setCantidad((byte) (mecato.getCantidad() + valorAAgregar));
                return true;
            }
        } else {
            return false;

        }
    }

    public static boolean verificarCantidadProducto(Producto mecato) {
        if (mecato.getCantidad() == 0) {
            return true;
        } else {
            return false;

        }
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public String nombre() {
        String nombre = null;

        switch (nombre) {
            case "De todito": {
                sacarProducto((byte) 1);
                nombre = "De todito";
                break;
            }
            case "Choclitos": {
                sacarProducto((byte) 1);
                nombre = "Choclitos";
                break;
            }
            case "Minichips": {
                sacarProducto((byte) 1);
                nombre = "Minichips";
                break;
            }
            case "Chocolatinas": {
                sacarProducto((byte) 1);
                nombre = "Chocolatinas";
                break;
            }
            case "Chocorramo": {
                sacarProducto((byte) 1);
                nombre = "Chocorramo";
                break;
            }
            case "Cheetos": {
                sacarProducto((byte) 1);
                nombre = "Cheetos";
                break;
            }
            case "Doritos": {
                sacarProducto((byte) 1);
                nombre = "Doritos";
                break;
            }
            case "Palomitas": {
                sacarProducto((byte) 1);
                nombre = "Palomitas";
                break;
            }
            case "Pasabocas": {
                sacarProducto((byte) 1);
                nombre = "Pasabocas";
                break;
            }
            case "Mani": {
                sacarProducto((byte) 1);
                nombre = "Mani";
                break;
            }
            default:
                break;
        }
        return nombre;
    }

    private void sacarProducto(byte b) {
    }

    /*------------------------------------------------------------------------*/

    public String codigo() {
        String codigo = null;

        switch (codigo) {
            case "A": {
                sacarProducto((byte) 1);
                codigo = "A";
                break;
            }
            case "B": {
                sacarProducto((byte) 1);
                codigo = "B";
                break;
            }
            case "C": {
                sacarProducto((byte) 1);
                codigo = "C";
                break;
            }
            case "D": {
                sacarProducto((byte) 1);
                codigo = "D";
                break;
            }
            case "E": {
                sacarProducto((byte) 1);
                codigo = "E";
                break;
            }
            case "F": {
                sacarProducto((byte) 1);
                codigo = "F";
                break;
            }
            case "G": {
                sacarProducto((byte) 1);
                codigo = "G";
                break;
            }
            case "H": {
                sacarProducto((byte) 1);
                codigo = "H";
                break;
            }
            case "I": {
                sacarProducto((byte) 1);
                codigo = "I";
                break;
            }
            case "J": {
                sacarProducto((byte) 1);
                codigo = "J";
                break;
            }
            default:
                break;
        }
        return codigo;
    }
}

