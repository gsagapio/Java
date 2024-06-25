package br.com.gsagapio.desenvolvimento005;
//Exercício 1 Com Insertion Sort
public class Desenvolvimento005 {

    public static void main(String[] args) {
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};

        for (int i = 1; i < paises.length; i++) {
            String chave = paises[i];
            int j = i - 1;

            while (j >= 0 && paises[j].compareToIgnoreCase(chave) > 0) {
                paises[j + 1] = paises[j];
                j--;
            }

            paises[j + 1] = chave;
        }

        // Exibe o vetor ordenado
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
