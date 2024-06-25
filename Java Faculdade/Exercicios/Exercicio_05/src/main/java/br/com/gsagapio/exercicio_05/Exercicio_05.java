package br.com.gsagapio.exercicio_05;
//Exercicio de Aplicação 1 Triangulo/Data e Ex 2 Conta Corrente COM inserção
//de dados com o usuário.
import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instanciando o Scanner para entrada do teclado

        // Objeto baseado na classe Triangulo
        System.out.println("Digite a base do Triangulo 1:");
        float base1 = scanner.nextFloat(); // Solicita ao usuário que insira a base do Triangulo 1

        System.out.println("Digite a altura do Triangulo 1:");
        float altura1 = scanner.nextFloat(); // Solicita ao usuário que insira a altura do Triangulo 1

        Triangulo triangulo1 = new Triangulo(base1, altura1);

        // Objeto baseado na classe Data
        System.out.println("Digite o dia:");
        int dia1 = scanner.nextInt(); // Solicita ao usuário que insira o dia

        System.out.println("Digite o mês:");
        int mes1 = scanner.nextInt(); // Solicita ao usuário que insira o mês

        System.out.println("Digite o ano:");
        int ano1 = scanner.nextInt(); // Solicita ao usuário que insira o ano

        Data data1 = new Data(dia1, mes1, ano1);

        // Utilizando os métodos
        System.out.println("Area do Triangulo 1: " + triangulo1.calculaArea());
        System.out.println("Dados do Triangulo 1: " + triangulo1.imprimeDados());

        data1.imprimeData();

        // Objeto baseado na classe ContaCorrente
        System.out.println("\nDigite o nome da pessoa para Conta 1:");
        String nomeConta1 = scanner.next(); // Solicita ao usuário que insira o nome para Conta 1

        System.out.println("Digite o saldo inicial para Conta 1:");
        float saldoConta1 = scanner.nextFloat(); // Solicita ao usuário que insira o saldo inicial para Conta 1

        System.out.println("Digite o limite para Conta 1:");
        float limiteConta1 = scanner.nextFloat(); // Solicita ao usuário que insira o limite para Conta 1

        System.out.println("Digite o tipo de conta para Conta 1 (C para Corrente, P para Poupança):");
        char tipoConta1 = scanner.next().charAt(0); // Solicita ao usuário que insira o tipo de conta para Conta 1

        ContaCorrente conta1 = new ContaCorrente(nomeConta1, saldoConta1, limiteConta1, tipoConta1);

        // Utilizando os Métodos
        System.out.println("\nDados da Conta 1: " + conta1.imprimeDados());

        conta1.depositar(500);
        System.out.println("\nDados da Conta 1 depois do deposito: " + conta1.imprimeDados());

        System.out.println("\nDigite o nome da pessoa para Conta 2:");
        String nomeConta2 = scanner.next(); // Solicita ao usuário que insira o nome para Conta 2

        System.out.println("Digite o saldo inicial para Conta 2:");
        float saldoConta2 = scanner.nextFloat(); // Solicita ao usuário que insira o saldo inicial para Conta 2

        System.out.println("Digite o limite para Conta 2:");
        float limiteConta2 = scanner.nextFloat(); // Solicita ao usuário que insira o limite para Conta 2

        System.out.println("Digite o tipo de conta para Conta 2 (C para Corrente, P para Poupança):");
        char tipoConta2 = scanner.next().charAt(0); // Solicita ao usuário que insira o tipo de conta para Conta 2

        ContaCorrente conta2 = new ContaCorrente(nomeConta2, saldoConta2, limiteConta2, tipoConta2);

        // Utilizando os Métodos
        System.out.println("\nDados da Conta 2: " + conta2.imprimeDados());

        conta2.sacar(1500);
        System.out.println("\nDados da Conta 2 depois do saque: " + conta2.imprimeDados());

        scanner.close(); // Fechando o Scanner para liberar os recursos
    }
}