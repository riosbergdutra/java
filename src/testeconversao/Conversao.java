package testeconversao;

public class Conversao {
    public static void main(String[] args) {
        double salario = 2700.50;
        int valor = (int) salario;
        System.out.println(valor);

        float pontoFlutuante = (float) 3.14;

        int valor2 = 2000000;
        long numeroGrande = 221380938219712789L;
        short numeroPequeno = 1234;
        byte b = 127;
    }
}
