package projetoaula05;

public class ProjetoAula05 {

    public static void main(String[] args) {
        People p1 = new People("Gustavo", 19, 10000.00);
        People p2 = new People("Ovatesug", 91, 00000.01);
        
        System.out.println(
                "Nome: " + p1.Nome + 
                "\nSalario = " + p1.Renda + 
                "\nIdade = " + p1.Idade + "\n");
        
        System.out.println(
                "Nome: " + p2.Nome + 
                "\nSalario = " + p2.Renda + 
                "\nIdade = " + p2.Idade);
    }  
}