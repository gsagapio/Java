package br.com.gsagapio.trabalhosort;
import java.util.Random;
public class TrabalhoSort {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];
        String[] nomes = {"Ellen Ripley", "Luke Skywalker", "James T. Kirk", "Mark Watney",
                "Paul Atreides", "Neo", "Mr. Robot", "Tony Stark", "Sarah Connor", "Dr. Emmett Brown"};
        Random random = new Random();

        for (int i = 0; i < pessoas.length; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            int idade = random.nextInt(100); // idade entre 0 e 99
            double altura = 1 + random.nextDouble() * 2; // altura entre 1.0 e 3.0 metros
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        System.out.println("Lista de pessoas antes da ordenação:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome + ", Idade: " + pessoa.idade + ", Altura: " + pessoa.altura);
        }

        mergeSort(pessoas, NOME); // Ordenação pelo nome
        System.out.println("\nOrdenação pelo nome:");
        imprimirPessoas(pessoas);

        mergeSort(pessoas, IDADE); // Ordenação pela idade
        System.out.println("\nOrdenação pela idade:");
        imprimirPessoas(pessoas);

        mergeSort(pessoas, ALTURA); // Ordenação pela altura
        System.out.println("\nOrdenação pela altura:");
        imprimirPessoas(pessoas);
    }

    public static void mergeSort(Pessoa[] arr, int atributo) {
        if (arr == null || arr.length <= 1) return;

        Pessoa[] temp = new Pessoa[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1, atributo);
    }

    private static void mergeSort(Pessoa[] arr, Pessoa[] temp, int left, int right, int atributo) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid, atributo);
            mergeSort(arr, temp, mid + 1, right, atributo);
            merge(arr, temp, left, mid, right, atributo);
        }
    }

    private static void merge(Pessoa[] arr, Pessoa[] temp, int left, int mid, int right, int atributo) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i].compare(temp[j], atributo) <= 0) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }

    public static void imprimirPessoas(Pessoa[] pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome + ", Idade: " + pessoa.idade + ", Altura: " + pessoa.altura);
        }
    }
    }
}
