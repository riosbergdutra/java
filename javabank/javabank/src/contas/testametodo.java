package contas;

public class testametodo {
    public static void main(String[] args) {
        conta contaDoMatheus = new conta();

        contaDoMatheus.saldo = 100;
        contaDoMatheus.deposita(70);
        System.out.println(contaDoMatheus.saldo);

        contaDoMatheus.saca(30);
        System.out.println(contaDoMatheus.saldo);

        contaDoMatheus.saca(200);
        System.out.println(contaDoMatheus.saldo);
    }
}
