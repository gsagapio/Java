package br.com.gsagapio.trabalhosort;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;
    public static final int NOME = 0;
    public static final int IDADE = 1;
    public static final int ALTURA = 2;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int compare(Pessoa p, int atributo) {
        switch (atributo) {
            case NOME:
                return this.nome.compareTo(p.nome);
            case IDADE:
                return Integer.compare(this.idade, p.idade);
            case ALTURA:
                return Double.compare(this.altura, p.altura);
            default:
                throw new IllegalArgumentException("Atributo inválido");
        }
    }

    public String leia(int atributo) {
        switch (atributo) {
            case NOME:
                return this.nome;
            case IDADE:
                return String.valueOf(this.idade);
            case ALTURA:
                return String.valueOf(this.altura);
            default:
                throw new IllegalArgumentException("Atributo inválido");
        }
    }

}
