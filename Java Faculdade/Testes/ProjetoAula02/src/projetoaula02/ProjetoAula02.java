package projetoaula02;

import java.util.Scanner;

public class ProjetoAula02 {
    
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de N1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o valor de N2: ");
        n2 = entrada.nextInt();
        
        System.out.println("N1 + N2 = " + (n1 + n2));
        System.out.println("N1 - N2 = " + (n1 - n2));
        System.out.println("N1 x N2 = " + (n1 * n2));
        System.out.println("N1 / N2 = " + (n1 / n2));   
    }
}