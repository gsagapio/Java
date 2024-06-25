package exercicio_09;

public class NumerosFor {
    public int i;

    public NumerosFor() {
    }

    public NumerosFor(int i) {
        this.i = i;
    }
    
    
    public void UmACinquenta(){
        // Imprime os números de 1 a 50 de 1 em 1
        System.out.println("Números de 1 a 50 de 1 em 1:");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // Pula uma linha para separar as séries de números
    }
    
    public void CinquentaDoisACem(){
        // Imprime os números de 52 a 100 de 2 em 2
        System.out.println("Números de 52 a 100 de 2 em 2:");
        for (int i = 52; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }    
    
}