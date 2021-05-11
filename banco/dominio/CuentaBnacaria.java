package banco.dominio;

import java.util.Date;

public class CuentaBnacaria {
    public Banco banco;
    public String tipo; //si es de ahorros o corriente
    public persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contrasena;
    public String estado;

    public String consultarSaldo() {
        return "Hola, "+ titular.nombre + " su saldo es: " + saldo;
    }

    public boolean retirar(double valorARetirar) {
        if (valorARetirar <= saldo && estado.equals("A")) {
            saldo = saldo - valorARetirar;
            //saldo -= valorARetirar;
            return true;
        } else {
            return false;
        }
    }

    public boolean consignar(double valorAConsignar) {
        if (valorAConsignar > 0 && estado.equals("A")) {
            saldo += valorAConsignar;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valorATrasferir, CuentaBnacaria cuentaDestino) {
        return this.retirar(valorATrasferir) && cuentaDestino.consignar(valorATrasferir);
       /* if (valorATrasferir <= saldo && cuentaDestino.estado.equals("A")) {
           cuentaDestino.saldo += valorATrasferir;
           saldo -= valorATrasferir;
            return true;
        } else {
            return false;
        }*/
    }
}
