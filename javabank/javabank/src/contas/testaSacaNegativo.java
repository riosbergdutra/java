package contas;

public class testaSacaNegativo {
    public static void main(String[] args) {
        
    Conta conta = new Conta();
    conta.deposita(100);
    conta.saca(200);
    System.out.println(conta.saldo);

    //proibida
    conta.saldo = conta.saldo - 200;
    System.out.println(conta.saldo); 
}
}
