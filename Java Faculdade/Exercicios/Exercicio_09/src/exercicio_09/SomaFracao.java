package exercicio_09;

import java.util.Scanner;

public class SomaFracao {
    
    Scanner scanner = new Scanner(System.in);
    
    public int valor(){
        // Solicita que o usuário insira o valor de n
        System.out.print("Digite o valor de n (inteiro e positivo): ");
        int n = scanner.nextInt();
        
        return n;
    }
        
    public double soma(int n){
        double soma = 0;
        
        // Calcula a soma especificada
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        
        return soma;
    }    
        
    public void retorno(double resultado){
        // Exibe o resultado
        double resultadoSoma = soma((int) resultado);
        System.out.println("A soma é: " + resultadoSoma);
    }    
        
}
