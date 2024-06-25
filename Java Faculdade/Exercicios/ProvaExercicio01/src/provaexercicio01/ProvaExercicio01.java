//Prova de Programação Orientada a Objetos em JAVA - A2 - 25/04
//Exercício 01

package provaexercicio01;

import java.util.Random;
import java.util.Scanner;

public class ProvaExercicio01 {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numSorteado = random.nextInt(101); 
        int tentativas = 0;

        System.out.println("Tente adivinhar o número sorteado (de 0 a 100):");

        while (true) {
            
            int palpite = sc.nextInt();
            tentativas++;

            if (palpite == numSorteado) {
                System.out.println("Parabéns! Você acertou o número " + 
                                    numSorteado + " em " + tentativas + 
                                    " tentativa(s).");
                break;
                
            } else if (palpite < numSorteado) {
                System.out.println("O número sorteado é maior que " + palpite + 
                                    ". Tente novamente:");
                
            } else {
                System.out.println("O número sorteado é menor que " + palpite + 
                                    ". Tente novamente:");     
            }
        }
    }
}