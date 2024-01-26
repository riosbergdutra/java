package contas;

import cliente.Cliente;

//saldo, agencia, numero e titular.
public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;

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
    //getters
    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public Cliente getTitular() {
        return titular;
    }

    //setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

}
