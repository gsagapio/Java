package br.com.gsagapio.mergesort;

import java.util.Random;

public class Pessoa {

    String nome;
    int idade;
    double altura;

    public static final int NOME = 0;
    public static final int IDADE = 1;
    public static final int ALTURA = 2;

    public Pessoa() {
        this("", 0, 0.0);
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
                return this.idade - p.idade;
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

    public static Pessoa criarPessoaAleatoria() {
        String[] nomes = {"Ellen Ripley", "Luke Skywalker", "James T. Kirk", "Mark Watney",
            "Paul Atreides", "Neo", "Mr. Robot", "Tony Stark", "Sarah Connor",
            "Dr. Emmett Brown"};
        Random rand = new Random();
        String nome = nomes[rand.nextInt(nomes.length)];
        int idade = rand.nextInt(80) + 18; // Idade entre 18 e 97 anos
        double altura = rand.nextDouble() * 2 + 1; // Altura entre 1.0 e 3.0 metros
        return new Pessoa(nome, idade, altura);
    }
}
