package projetoaula03;

public class ProjetoAula03 {

    public static void main(String[] args) {
       System.out.println("Exemplo 03");
       System.out.println("Olá Pessoas viventes neste mundo humano cheio de fauna e flora, todavia, que estão morrendo. Mas o que é a vida além de uma antecipação da morte? Já dizia Imannuel Kant: Entre razoes e emoções a saida, é eu rimar o resto da minha vida, se ela será curta pouco me importa, pois pra viver basta respirar!");
       
        Pessoa p1 = new Pessoa();
        p1.nome = "Silvio";
        p1.renda = 1500;
        p1.codigo = 1;
        System.out.println("Codigo: " + p1.codigo + 
               " Nome = " + p1.nome);
        System.out.println("Renda = " + p1.renda);
        
        Cachorro cao1 = new Cachorro("Vira_Lata", "Adolfo");
        Cachorro cao2 = new Cachorro("Budogg", "Princesa");
        cao1.setNome("Ronalde");
        System.out.println("Cão 1 é "+ cao1.getNome() +
                "Raça é " + cao1.getRaça());
        System.out.println("Cão 1 é "+ cao1.getNome() +
                "Raça é " + cao1.getRaça());

    }
    
    
}