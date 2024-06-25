package exercicio_09;

import java.util.Scanner;

public class Impar {
    public int numero;
    public int soma;

    public Impar() {
    }
    
    public Impar(int numero) {
        this.numero = numero;
    }
    
    public int calculoSoma(){
        Scanner sc = new Scanner(System.in);
        
        int numero;
        soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

            if (numero % 2 != 0) { // Verifica se o número é ímpar
                soma += numero; // Adiciona o número à soma se for ímpar
            }

        } while (numero != 0); // Continua pedindo números até que 0 seja digitado

        System.out.println("A soma dos números ímpares digitados é: " + soma);
        
        return numero;
    }
}
