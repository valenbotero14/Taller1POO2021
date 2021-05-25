package AgenciaDeArrendamiento.dominio;

public class Casa extends Inmueble implements Arrendable{
    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
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
        return "CASA: "+ " "+ "Direccion --> " + this.getDireccion()+","+ " "+
                "Valor de Venta --> " + this.getValorVenta()+","+ " "+
                "Valor de Arriendo --> " + this.getValorArriendo()+","+ " "+
                "Arrendado --> " + isArrendado() + " ";
    }
}
