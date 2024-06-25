/*@author Gustavo*/
package br.com.gsagapio.exercicio_03;

public class Aluno {
    String Nome;
    String RG;
    String Endereco;
    String Telefone;
    String DataNascimento;
    String Profissao;
    
    public Aluno(){}

    public Aluno(String Nome, String RG, String Endereco, String Telefone, String DataNascimento, String Profissao) {
        this.Nome = Nome;
        this.RG = RG;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.DataNascimento = DataNascimento;
        this.Profissao = Profissao;
    }
}