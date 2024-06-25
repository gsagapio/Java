package exercicio_09;

public class Exercicio_09 {

    public static void main(String[] args) {
        
        //Exercício 1 - Faça um algoritmo que calcula e mostra a média entre duas notas de 10 alunos. 
        //Use a estrutura de repetição enquanto
        Media media = new Media();
        media.dezAlunos();
        
        //Exercício 2 - Faça um algoritmo que calcula e mostra a soma dos números ímpares digitados pelo usuário. 
        //Para encerrar a entrada de dados, digite o número zero. Use a estrutura de repetição faça ... enquanto
        Impar impares = new Impar();
        impares.calculoSoma();
        
        //Exercício 3 - Faça um algoritmo que imprima os números de 1 a 50 de 1 em 1 e de 52 a 100 de 2 em 2. Use For.
        NumerosFor num = new NumerosFor();
        num.UmACinquenta();
        num.CinquentaDoisACem();
        
        //Exercício 4 - Faça um algoritmo que leia um valor n, inteiro e positivo, calcule e mostre a seguinte soma:
        //S = 1 + 1/2 + 1/3 + 1/4 +...+ 1/n
        //Use o for. 
        SomaFracao sf = new SomaFracao(); 
        int n = sf.valor(); 
        double resultadoSoma = sf.soma(n);
        sf.retorno(resultadoSoma);
 
        

    }
    
}
