package contas;

public class criarconta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println("O saldo da primeira conta e : " + primeiraConta.getSaldo() + " reais.");

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(50); 
        System.out.println("primeira conta = " + primeiraConta.getSaldo());
        System.out.println("segunda conta = " + segundaConta.getSaldo());

    }
}