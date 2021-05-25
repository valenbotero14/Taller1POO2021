package AgenciaDeArrendamiento.dominio;

public class Lote extends Inmueble{

    public Lote(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public String toString() {
        return "LOTE: "+ " "+ "Direccion --> " + this.getDireccion()+","+ " "+
                "Valor de Venta --> " + this.getValorVenta()+","+ " "+
                "Valor de Arriendo --> " + this.getValorArriendo()+","+ " "+
                "Arrendado --> " + isArrendado() + " ";
    }
}


