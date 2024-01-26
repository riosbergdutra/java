package contas;

public class testereferencia {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        // a primeiraconta é somente uma referencia
        primeiraconta.saldo = 300;
        System.out.println(primeiraconta.saldo);
    }
    
}
