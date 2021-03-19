package mecato.app;

import mecato.dominio.Producto;
import mecato.dominio.DispersadorMecato;

import java.util.Arrays;
import java.util.List;

public class AppDispersador {
    public static void main(String[] args) {
        /*prueba de funcion */
        Producto producto1 = new Producto("De todito", 1500, "A", (byte) 0);
        Producto producto2 = new Producto("Choclitos", 2000, "B", (byte) 3);
        Producto producto3 = new Producto("Minichips", 1000, "C", (byte) 5);
        Producto producto4 = new Producto("Chocolatinas", 2500, "D", (byte) 6);
        Producto producto5 = new Producto("Chocorramo", 1700, "E", (byte) 7);
        Producto producto6 = new Producto("Cheetos", 2500, "F", (byte) 8);
        Producto producto7 = new Producto("Doritos", 3000, "G", (byte) 1);
        Producto producto8 = new Producto("Palomitas", 500, "H", (byte) 2);
        Producto producto9 = new Producto("Pasabocas", 1650, "I", (byte) 4);
        Producto producto10 = new Producto("Mani", 750, "J", (byte) 7);

        /*Impresiones*/
        DispersadorMecato mecato = new DispersadorMecato("102013", "Yupi");
        List<Producto> producto = Arrays.asList(producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9, producto10);

        /*conocer cantidad, nombre y precio*/
        producto.forEach(x -> System.out.println("Hay " + x.getCantidad() + " unidades del prducto " + x.getNombre() + " " + "y tiene un precio de: " + " " + x.getPrecio() + "\n"));

        /*sacar una unidad de un producto*/
        System.out.println("Se saco una unidad al producto: " + producto7.getNombre() + " " + DispersadorMecato.sacarProducto((byte) 1, producto7) + ", y quedan " + producto7.getCantidad() + "\n");
        System.out.println("Se saco una unidad al producto con codigo: " + producto10.getCodigo() + " " + DispersadorMecato.sacarProducto((byte) 1, producto10) + ", y quedan " + producto10.getCantidad() + "\n");

        /*consultar productos agotados*/
        System.out.println("El nombre de los productos agotados son: " + DispersadorMecato.verificarCantidadProducto(producto1) + " , " + "" + producto1.getNombre() + "\n");

        /*consultar el total de unidades de un producto determinado*/
        System.out.println("El producto: " + producto8.getNombre() + " tiene " + producto8.getCantidad() + " " + "unidades" + "\n");

        /* total de unidades de todos los productos*/
        producto.forEach(x -> System.out.println("Hay " + x.getCantidad() + " unidades del prducto " + x.getNombre() + "\n"));

        /*aumentar la cantidad a un producto detrminado*/
        System.out.println("Se agregaron unidadades al producto: " + producto5.getNombre() + " " + DispersadorMecato.aumentarCantidadProducto((byte) 1, producto5) + " " + " y quedan " + producto5.getCantidad() + "\n");

    }
}


