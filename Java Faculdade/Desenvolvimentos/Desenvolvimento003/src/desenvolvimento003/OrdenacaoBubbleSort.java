package desenvolvimento003;

import java.util.Random; // Movido a importação para fora do escopo da classe

public class OrdenacaoBubbleSort {
    
    public static void main(String[] args) {
        new OrdenacaoBubbleSort();
                
    }

    public OrdenacaoBubbleSort() {
        double vetnulo[] = null;

        if (!bubbleSort_v01(vetnulo)) {
            System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em bubbleSort_v01.");
        }

        try {
            bubbleSort_v02(vetnulo);
        } catch (IllegalArgumentException ex) {
            System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em bubbleSort_v02.\n");
        }

        // declaramos um vetor:
        //double vet[] = { 4.5, 6.3, 1.2, 78.3, 0.15, 4.3 };
        double vet [] = crieVetorAleatorio(10);
        System.out.println("Vetor desordenado:");
        visualizar(vet);

        bubbleSort_v01(vet); // ou executar as outras versões disponíveis

        System.out.println("Vetor ordenado:");
        visualizar(vet);
    }

    public boolean bubbleSort_v01(double vetor[]) {
        boolean resultado = false;
        if (vetor != null) {
            resultado = true;
            for (int i = 0; i < vetor.length - 1; i++) {
                for (int j = 0; j < vetor.length - 1 - i; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        double tmp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = tmp;
                    }
                }
            }
        }
        return resultado;
    }

    public void bubbleSort_v02(double vetor[]) throws IllegalArgumentException {
        if (vetor == null)
            throw new IllegalArgumentException("O vetor não pode ser nulo.");
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                }
            }
        }
    }

    public boolean bubbleSort_v03(double vetor[]) {
        boolean resultado = false;
        if (vetor != null) {
            resultado = true;
            for (int i = 0; i < vetor.length - 1; i++)
                for (int j = 0; j < vetor.length - 1 - i; j++)
                    if (vetor[j] > vetor[j + 1])
                        troca(vetor, j, j + 1);
        }
        return resultado;
    }

    public void troca(double vetor[], int posa, int posb) {
        double temp = vetor[posa];
        vetor[posa] = vetor[posb];
        vetor[posb] = temp;
    }

    public boolean bubbleSort_v04(double vetor[]) {
        boolean resultado = false;
        if (vetor != null) {
            resultado = true;
            for (int i = 0; i < vetor.length - 1; i++) {
                int trocas = 0;
                for (int j = 0; j < vetor.length - 1 - i; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        double tmp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = tmp;
                        trocas++;
                    }
                }
                if (trocas == 0)
                    break;
            }
        }
        return resultado;
    }

    public boolean bubbleSort_v05(double vetor[]) {
        boolean resultado = false;
        if (vetor != null) {
            resultado = true;
            boolean trocou;
            int i = 0;
            do {
                trocou = false;
                for (int j = 0; j < vetor.length - 1 - i; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        troca(vetor, j, j + 1);
                        trocou = true;
                    }
                }
                i++;
            } while (trocou);
        }
        return resultado;
    }

    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
        
    // Método para inserir números aleatórios em um vetor
    public double[] crieVetorAleatorio(int tamanho){
       double[] vet = new double[tamanho];
       Random random = new Random();
       
       for (int i = 0; i < tamanho; i++){
           vet[i] = random.nextDouble() * 100;
       }
       return vet;
    }
}
