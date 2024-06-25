package br.com.gsagapio.desenvolvimento004;
//Exercício 1 Com Bubble Sort
public class Desenvolvimento004 {

    public static void main(String[] args) {
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};

        for (int i = 0; i < paises.length - 1; i++) {
            for (int j = 0; j < paises.length - i - 1; j++) {
                if (paises[j].compareToIgnoreCase(paises[j + 1]) > 0) {
                    // Troca os elementos
                    String temp = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = temp;
                }
            }
        }

        // Exibe o vetor ordenado
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
