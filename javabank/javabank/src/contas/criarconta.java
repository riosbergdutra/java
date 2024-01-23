package contas;

public class criarconta {
    public static void main(String[] args) {
        conta primeiraConta = new conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo da primeira conta e : " + primeiraConta.saldo + " reais.");

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        conta segundaConta = new conta();
        segundaConta.saldo = 50;
        System.out.println("primeira conta = " + primeiraConta.saldo);
        System.out.println("segunda conta = " + segundaConta.saldo);

    }
}