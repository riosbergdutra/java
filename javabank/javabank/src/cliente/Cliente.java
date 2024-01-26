package cliente;

public class Cliente {
   private  String CPF;
   private String nome;
   private String profissao;

   //getters
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }
    public String getProfissao() {
        return profissao;
    }
   //setters
   public void setCPF(String CPF) {
       this.CPF = CPF;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public void setProfissao(String profissao) {
       this.profissao = profissao;
   }
}
