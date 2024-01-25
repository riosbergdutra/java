package contas;
//saldo, agencia, numero e titular.
public class conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

  public void deposita(double valor) {
    this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
      if(this.saldo >= valor) {
        this.saldo -= valor;
        return true;
      }else{
        System.out.println("não há saldo suficiente saque negado");
        return false;
      }
    }
    public boolean transfere(double valor, conta destino) {
      if(this.saldo >= valor) {
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
      } else {
        return false;
      }
    }
}
