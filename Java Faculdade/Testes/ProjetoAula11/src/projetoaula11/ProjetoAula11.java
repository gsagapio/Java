package projetoaula11;

import java.util.Scanner;

public class ProjetoAula11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        Torneio candidato = new Torneio();
        candidato.setNome(nome);
        candidato.setIdade(idade);

        candidato.imprimeDados();
    }
}