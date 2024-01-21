package condicionais;

public class condicionais {
    public static void main(String[] args) {
        int idade = 20;
        int quantidadedePessoas = 2;
        if(idade >= 18) {
            System.out.println("ok voce tem mais de 18 anos. "+ "sua idade e " + idade);
        } else if (quantidadedePessoas >=2){
            System.out.println("ok, voce pode comprar pois esta acompanhado por um maior de idade");
        } else {
            System.out.println("voce nem esta acompanhado, e nem e maior de idade, xispa");
        }
    }
}   
