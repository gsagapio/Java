package projetoaula01;

import java.util.Scanner;

public class ProjetoAula01 {

    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Sou programador, olá mundo!");
        imprime("Tenho " + idade + " anos.");
    }
    public static void imprime(String msg){
        System.out.println(msg);
    }
}
