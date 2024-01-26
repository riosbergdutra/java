package contas;

import cliente.Cliente;

public class testeGetterseSetters {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        conta.setNumero(13);
        System.out.println(conta.getNumero());
        conta.setTitular(cliente);
        cliente.setCPF("111.111.111-11");

        System.out.println(conta.getTitular().getCPF());

    }
}
