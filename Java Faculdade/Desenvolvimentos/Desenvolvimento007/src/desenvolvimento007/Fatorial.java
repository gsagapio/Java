package desenvolvimento007;
import java.util.Scanner;

public class Fatorial {

    public Fatorial() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero para ver seu fatorial: ");
        int numero = sc.nextInt();
        
        System.out.println(
                "Fatorial Iterativo de " + numero + " vale " + 
                        fatorialIterativo(numero));
        
        System.out.println("Fatorial recursivo de " + numero + " vale " +
                 fatorialRecursivo(numero));
    }
    
    private static int fatorialIterativo(int n){
        int fat = 1;
        
        if(n < 0){
            throw new IllegalArgumentException(
            "Não existe o fatorial de numeros negativos. ");
        }
        
        for(;n > 1; n--){
           fat *= n;
       
        }
        return fat;
    }
    
    public static int fatorialRecursivo(int n){
        
        int fat = 1;
        
        if(n < 0){
            throw new IllegalArgumentException(
            "Não existe o fatorial de numeros negativos. ");
        }
        
        if(n > 1){
            fat = n * fatorialRecursivo(n - 1);
        }
        return fat;
    }
        
}