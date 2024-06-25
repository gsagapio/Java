package exercicio_06;
import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        double n1, n2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota 1: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = entrada.nextDouble();
        
        Boletim b1 = new Boletim(n1, n2);
        b1.imprimeBoletim();
        b1.verificaConceito();
                
    }
}