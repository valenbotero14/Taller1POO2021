package AgenciaDeArrendamiento.dominio;

public class Apartamento extends Inmueble implements Arrendable{
    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arrendar() {
    }

    @Override
    public void devolver() {
    }

    @Override
    public String toString(){
        return "APARTAMENTO: "+ " "+ "Direccion --> " + this.getDireccion()+","+ " "+
                "Valor de Venta --> " + this.getValorVenta()+","+ " "+
                "Valor de Arriendo --> " + this.getValorArriendo()+","+ " "+
                "Arrendado --> " + isArrendado() + " ";
    }
}

