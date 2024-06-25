package provaexercicio02;

public class Torneio {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificaCategoria() {
        String retorno;

        if (idade >= 5 && idade <= 7) {
            retorno = "Infantil";

        } else if (idade <= 10) {
            retorno = "Juvenil";

        } else if (idade <= 15) {
            retorno = "Adolescente";

        } else if (idade <= 30) {
            retorno = "Adulto";

        } else {
            retorno = "Senior";

        }

        return retorno;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Categoria: " + verificaCategoria());
    }
}