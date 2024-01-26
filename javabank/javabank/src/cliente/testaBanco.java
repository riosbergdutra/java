package cliente;

import contas.Conta;

public class testaBanco {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Lucas");
        matheus.setCPF("111.111.111-11");
        matheus.setProfissao("programador");

        Conta contaDoMatheus = new Conta();
        contaDoMatheus.deposita(100);
        System.out.println(contaDoMatheus.getSaldo());

    }
}
