package br.com.gsagapio.desenvolvimento006;
//Exercício 2 Com Selection Sort
public class Desenvolvimento006 {

    public static void main(String[] args) {
        int numeros[] = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};

        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Troca os elementos
            int temp = numeros[i];
            numeros[i] = numeros[indiceMinimo];
            numeros[indiceMinimo] = temp;
        }

        // Exibe o vetor ordenado
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
