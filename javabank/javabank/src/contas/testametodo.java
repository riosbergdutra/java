package contas;

public class testametodo {
    public static void main(String[] args) {
        Conta contaDoMatheus = new Conta();

        contaDoMatheus.deposita(100);
        contaDoMatheus.deposita(70);
        System.out.println(contaDoMatheus.getSaldo());

        contaDoMatheus.saca(30);
        System.out.println(contaDoMatheus.getSaldo());

        contaDoMatheus.saca(200);
        System.out.println("O saldo do matheus antes da transferencia:"+contaDoMatheus.getSaldo());

        Conta contaDaMaria = new Conta();
        contaDaMaria.deposita(1000);

        contaDaMaria.transfere(300, contaDoMatheus);
        System.out.println("o saldo da maria depois da transferencia :"+contaDaMaria.getSaldo());
        System.out.println("o saldo do matheus depois da transferencia :"+contaDoMatheus.getSaldo());

        System.out.println(contaDoMatheus.getNumero());
    }
}
