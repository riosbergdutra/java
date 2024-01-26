package contas;

import cliente.Cliente;

//saldo, agencia, numero e titular.
public class Conta {
   private double saldo;
    int agencia;
    int numero;
   public Cliente titular;

  public void deposita(double valor) {
    this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
      if(this.saldo >= valor) {
        this.saldo -= valor;
        return true;
      }else{
        System.out.println("nao ha saldo suficiente saque negado");
        return false;
      }
    }
    public boolean transfere(double valor, Conta destino) {
      if(this.saldo >= valor) {
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
      } else {
        return false;
      }
    }

    public double getSaldo() {
      return this.saldo;
    }
}
