//Prova de Programação Orientada a Objetos em JAVA - A2 - 25/04
//Exercício 02

package provaexercicio02;

import java.util.Scanner;

public class ProvaExercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine(); 

        int idade;
        do {
            System.out.println("Digite sua idade (deve ser um número positivo): ");
            idade = sc.nextInt();
            
            if(idade <= 0) { 
                System.out.println("Idade inválida. Digite sua idade novamente: ");
                idade = sc.nextInt(); 
            }
            
        } while (idade <= 0);

        Torneio candidato = new Torneio();
        
        candidato.setNome(nome);
        candidato.setIdade(idade);

        candidato.imprimeDados();
    }
}