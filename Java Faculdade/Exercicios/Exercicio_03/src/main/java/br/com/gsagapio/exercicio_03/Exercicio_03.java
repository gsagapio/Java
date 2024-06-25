package br.com.gsagapio.exercicio_03;

public class Exercicio_03 {

    public static void main(String[] args) {
        System.out.println("A seguir, a saída de dois objetos de cada classe criada. \nUm com parâmetros atribuídos e o outro não.");
        
        Curso c1 = new Curso(7, "Curso de Java e Orientação a Objetos");
        Curso c2 = new Curso();
        System.out.println("Id: " + c1.Id + "\nDescrição do Curso: " + c1.Descricao);
        System.out.println("\n\nId: " + c2.Id + "\nDescrição do Curso: " + c2.Descricao);
        
        Aluno a1 = new Aluno("Gustavo", "292340342", "djskhdksa", "39012091", "080322", "ahdskj");
        Aluno a2 = new Aluno();
        System.out.println("\n\nNome do Aluno: " + a1.Nome + "\nRG do Aluno: " + a1.RG + 
                "\nEndereco do Aluno: " + a1.Endereco + "\nTelefone do Aluno: " + a1.Telefone + 
                "\nData de Nascimento do Aluno: " + a1.DataNascimento + "\nProfissao do Aluno: " + a1.Profissao);
        System.out.println("\n\nNome do Aluno: " + a2.Nome + "\nRG do Aluno: " + a2.RG + 
                "\nEndereco do Aluno: " + a2.Endereco + "\nTelefone do Aluno: " + a2.Telefone + 
                "\nData de Nascimento do Aluno: " + a2.DataNascimento + "\nProfissao do Aluno: " + a2.Profissao);
    }
}
