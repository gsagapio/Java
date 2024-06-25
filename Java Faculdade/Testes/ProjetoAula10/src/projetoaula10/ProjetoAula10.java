package projetoaula10;

import java.util.Random;
import java.util.Scanner;

public class ProjetoAula10 {

    public static void main(String[] args) {
       Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = aleatorio.nextInt(20) + 1;
        int adivinhacao;

        System.out.println("==== Bem-Vindo ao Jogo da Advinhação ====");
        System.out.println("Estou pensando em um número entre 1 e 20...");

        do {
            System.out.println("Em que número estou pensando?");
            adivinhacao = scanner.nextInt();

            if (adivinhacao < num) {
                System.out.println("O número que estou pensando é maior.");
                
            } else if (adivinhacao > num) {
                System.out.println("O número que estou pensando é menor.");
                
            }
            
        } while (adivinhacao != num);

        System.out.println("Parabéns! Você acertou o número " + num + "!");
    }
    
}
