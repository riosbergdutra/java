package cliente;

import contas.conta;

public class testaBanco {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.nome = "Lucas";
        matheus.CPF = "111.111.111-11";
        matheus.profissao = "programador";

        conta contaDoMatheus = new conta();
        contaDoMatheus.deposita(100);

        contaDoMatheus.titular = matheus;

        System.out.println(contaDoMatheus.titular.nome);

    }
}
