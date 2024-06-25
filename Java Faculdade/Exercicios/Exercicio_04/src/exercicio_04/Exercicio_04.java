package exercicio_04;
//Exercicio de Aplicação 1 Triangulo/Data e Ex 2 Conta Corrente sem inserção
//de dados com o usuário.
public class Exercicio_04 {

    public static void main(String[] args) {
        //Objetos baseados na classe Triangulo e Data
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo(5, 3);
        
        Data data1 = new Data();
        Data data2 = new Data(14, 3, 2024);
        
        //Utilizando os métodos
        System.out.println("Area do Triangulo 1: " + triangulo1.calculaArea());
        System.out.println("Dados do Triangulo 1: " + triangulo1.imprimeDados());

        System.out.println("\nArea do Triangulo 2: " + triangulo2.calculaArea());
        System.out.println("Dados do Triangulo 2: " + triangulo2.imprimeDados()+"\n");

        data1.imprimeData();
        data2.imprimeData();
        
        //Objetos baseados na classe Conta Corrente
        ContaCorrente conta1 = new ContaCorrente("\nPedro", 1000, 500, 'C');
        ContaCorrente conta2 = new ContaCorrente("Maria", 2000, 1000, 'P');
        
        //Utilizando os Métodos
        System.out.println("\nDados da Conta 1: " + conta1.imprimeDados());
        System.out.println("\nDados da Conta 2: " + conta2.imprimeDados());
        
        conta1.depositar(500);
        System.out.println("\nDados da Conta 1 depois do deposito: " + conta1.imprimeDados());

        conta2.sacar(1500);
        System.out.println("\nDados da Conta 2 depois do saque: " + conta2.imprimeDados());
    }
}