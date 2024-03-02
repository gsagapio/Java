package exercicio_01;

public class Exercicio_01 {

    public static void main(String[] args) {
        System.out.println("Ola, bem vindo ao exercicio 01 sobre Classes e Objetos.\n");
        
            Cliente cliente01 = new Cliente();
            cliente01.setId(1);
            cliente01.setNome("Gustavo");
            cliente01.setIdade(19);
            cliente01.setGenero("Masculino");
            cliente01.setTelefone(987654321);

            Curso curso01 = new Curso();
            curso01.setId_curso(5);
            curso01.setNome_curso("Java");
            curso01.setCarga_horas(40);
            curso01.setValor((float) 50.00);

        
        System.out.println("Detalhes sobre o Cliente numero 01:");
        System.out.println("ID: " + cliente01.getId());
        System.out.println("Nome: " + cliente01.getNome());
        System.out.println("Idade: " + cliente01.getIdade());
        System.out.println("Genero: " + cliente01.getGenero());
        System.out.println("Telefone: " + cliente01.getTelefone());

        System.out.println("\nDetalhes sobre o Curso numero 01:");
        System.out.println("ID Curso: " + curso01.getId_curso());
        System.out.println("Nome Curso: " + curso01.getNome_curso());
        System.out.println("Carga de Horas: " + curso01.getCarga_horas());
        System.out.println("Valor do Curso: " + curso01.getValor());
    }
}