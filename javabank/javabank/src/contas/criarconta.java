package contas;

public class criarconta {
    public static void main(String[] args) {
        conta primeiraConta = new conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo da primeira conta e : " + primeiraConta.saldo + " reais.");
    }
}
