package contas;

public class testereferencia {
    public static void main(String[] args) {
        conta primeiraconta = new conta();
        // a primeiraconta é somente uma referencia
        primeiraconta.saldo = 300;
        System.out.println(primeiraconta.saldo);
    }
    
}
