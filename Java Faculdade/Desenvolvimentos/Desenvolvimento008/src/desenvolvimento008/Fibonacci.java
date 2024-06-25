package desenvolvimento008;

import java.util.Scanner;

public class Fibonacci {

    public Fibonacci() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        System.out.println("O " + numero + "º número pelo algoritimo iterativo na sequência de Fibonacci é " + fibonacciIterativo(numero));
        System.out.println("O " + numero + "º número pelo algoritimo recursivo na sequência de Fibonacci é " + FibonacciRecursivo(numero));
    }
    
    public static int fibonacciIterativo(int n){
        int fibonacci = 0;
        if(n < 0){
            throw new IllegalArgumentException("Índice da sequência de Fibonacci deve ser positivo.");
        }
        
        if(n == 0){
            fibonacci = 0;
            
        } else if(n == 1){
            fibonacci = 1;
            
        } else{
            int penultimo = 0;
            int ultimo = 1;
                
            for(int i = 2; i <= n; i++){
                fibonacci = penultimo + ultimo;
                    
                penultimo = ultimo;
                ultimo = fibonacci;
            }
        }
        return fibonacci;
    }

    public static int FibonacciRecursivo(int n){
        
        int fibonacci = 0;
        if(n < 0){
            throw new IllegalArgumentException("Índice da sequência de Fibonacci deve ser positivo.");
        }
        
        if(n == 0){
            fibonacci = 0;
            
        } else if(n == 1){
            fibonacci = 1;
            
        } else{ 
            fibonacci = FibonacciRecursivo(n - 1) + FibonacciRecursivo(n - 2);
            
        }
        return fibonacci;
    }
}
