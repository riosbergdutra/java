package condicionais;

public class condicionais {
    public static void main(String[] args) {
        int idade = 20;
        int quantidadePessoas = 1;
        boolean acompanhado = quantidadePessoas >= 2;
        if(idade >= 18 && acompanhado) {
            System.out.println("voce pode comprar bebida");
        }  else {
            System.out.println("voce nao pode comprar bebida");
        }
        
    }
}   
