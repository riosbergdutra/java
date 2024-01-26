package contas;

public class testereferencia {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        // a primeiraconta é somente uma referencia
        primeiraconta.deposita(300);
        System.out.println(primeiraconta.getSaldo());
    }
    
}
