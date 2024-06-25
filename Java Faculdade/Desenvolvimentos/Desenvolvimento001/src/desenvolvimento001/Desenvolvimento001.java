
package desenvolvimento001;

public class Desenvolvimento001 {

    public static void main(String[] args) {
        // Teste com vetor de tamanho 5
        double[] vetor1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        int tamanho1 = 5;
        inverta(vetor1, tamanho1);
        System.out.println("Vetor invertido:");
        imprimirVetor(vetor1, tamanho1);

        // Teste com vetor de tamanho 7
        double[] vetor2 = {10.5, 20.5, 30.5, 40.5, 50.5, 60.5, 70.5};
        int tamanho2 = 7;
        inverta(vetor2, tamanho2);
        System.out.println("Vetor invertido:");
        imprimirVetor(vetor2, tamanho2);
    }

    public static void inverta(double vet[], int n) {
        // Invertendo o vetor
        for (int i = 0; i < n / 2; i++) {
            double temp = vet[i];
            vet[i] = vet[n - i - 1];
            vet[n - i - 1] = temp;
        }
    }

    public static void imprimirVetor(double vet[], int n) {
        // Imprimindo o vetor
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
}
