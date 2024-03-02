package projetoaula05;

public class People {
   String Nome;
   int Idade;
   double Renda;
   
   public People(String nome, int Idade, double Renda){
       this.Nome = Nome;
       this.Idade = Idade;
       this.Renda = Renda;
   }

    public People(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }
}