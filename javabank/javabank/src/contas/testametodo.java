package contas;

public class testametodo {
    public static void main(String[] args) {
        conta contaDoMatheus = new conta();

        contaDoMatheus.saldo = 100;
        contaDoMatheus.deposita(50);
        System.out.println(contaDoMatheus.saldo);
    }
}
