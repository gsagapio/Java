package br.com.gsagapio.exercicio_10;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //--------------------------------------------------------------------
        // Objeto com construtor com parâmetros
        Triangulo t1 = new Triangulo(4, 10);
        t1.imprimeDados();
        
        //--------------------------------------------------------------------
        // Objeto com construtor sem parâmetros
        Triangulo t2 = new Triangulo();
        
        // Pega valor da base, atribui à variável e depois à classe
        System.out.println("Digite o valor da base do triângulo: ");
        double base = sc.nextDouble();
        t2.setBase(base);
        
        // Pega valor da altura, atribui à variável e depois à classe
        System.out.println("Digite o valor da altura do triângulo:");
        double altura = sc.nextDouble();
        t2.setAltura(altura);
        
        t2.calculaArea();
        t2.imprimeDados();
    }
}