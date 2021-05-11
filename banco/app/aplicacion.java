package banco.app;

import banco.dominio.CuentaBnacaria;
import banco.dominio.persona;

public class aplicacion {
    public static void main(String[] args){

         persona valentina = new persona();
        persona juliana = new persona();

        CuentaBnacaria miCuenta = new CuentaBnacaria();
        CuentaBnacaria cuentaJuliana = new CuentaBnacaria();

        valentina.nombre = "valentina";
        miCuenta.titular = valentina;
        miCuenta.saldo = 316000;
        miCuenta.estado = "A";

        juliana.nombre = "juliana";
        cuentaJuliana.titular = juliana;
        cuentaJuliana.saldo = 0;
        cuentaJuliana.estado = "A";


        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaJuliana.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir( 216000,cuentaJuliana);
        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaJuliana.consultarSaldo());

    }

}
