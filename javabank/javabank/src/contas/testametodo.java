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
        System.out.println("O saldo do matheus antes da transferencia:"+contaDoMatheus.saldo);

        conta contaDaMaria = new conta();
        contaDaMaria.deposita(1000);

        contaDaMaria.transfere(300, contaDoMatheus);
        System.out.println("o saldo da maria depois da transferencia :"+contaDaMaria.saldo);
        System.out.println("o saldo do matheus depois da transferencia :"+contaDoMatheus.saldo);
    }
}
