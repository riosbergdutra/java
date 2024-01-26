package cliente;

import contas.Conta;

public class testaBanco {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.nome = "Lucas";
        matheus.CPF = "111.111.111-11";
        matheus.profissao = "programador";

        Conta contaDoMatheus = new Conta();
        contaDoMatheus.deposita(100);

        contaDoMatheus.titular = matheus;

        System.out.println(contaDoMatheus.titular.nome);

    }
}
