package exercicio_02;

import java.util.Scanner;

public class Exercicio_02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bem vindo ao exercicio 02. \n");
        
        // Paciente sem construtor
        Paciente paciente01 = new Paciente();
        
        //Paciente com construtor
        Paciente paciente02 = new Paciente();
        
        //Produto sem construtor
        Produto produto01 = new Produto();
        
        //Produto com construtor
        Produto produto02 = new Produto();
        
        //Paciente 02 com informações preenchidas pelo usuário
        System.out.println("\nPreencha as informações do Paciente número 02:");
        System.out.print("Nome: ");
        paciente02.setNome(entrada.nextLine());
        System.out.print("RG: ");
        paciente02.setRG(entrada.nextLine());
        System.out.print("Endereco: ");
        paciente02.setEndereco(entrada.nextLine());
        System.out.print("Telefone: ");
        paciente02.setTelefone(entrada.nextLine());
        System.out.print("Data de Nascimento: ");
        paciente02.setDataNascimento(entrada.nextLine());
        System.out.print("Profissao: ");
        paciente02.setProfissao(entrada.nextLine());
        
        //Produto 02 com informações pelo usuário
        System.out.println("\nPreencha as informações do Produto número 02:");
        System.out.print("Marca: ");
        produto02.setMarca(entrada.nextLine());
        System.out.print("Fabricante: ");
        produto02.setFabricante(entrada.nextLine());
        System.out.print("Codigo de Barras: ");
        produto02.setCod_barras(entrada.nextLine());
        System.out.print("Preco: ");
        produto02.setPreco((float) entrada.nextDouble());
        
        // Hora das impressões vazias.
        System.out.println("\nInformações do Paciente número 01:");
        System.out.println("Nome: " + paciente01.getNome());
        System.out.println("RG: " + paciente01.getRG());
        System.out.println("Endereco: " + paciente01.getEndereco());
        System.out.println("Telefone: " + paciente01.getTelefone());
        System.out.println("Data de Nascimento: " + paciente01.getDataNascimento());
        System.out.println("Profissao: " + paciente01.getProfissao());
        
        //Impressões com as informações do usuário.
        System.out.println("\nInformações do Paciente número 02:");
        System.out.println("Nome: " + paciente02.getNome());
        System.out.println("RG: " + paciente02.getRG());
        System.out.println("Endereco: " + paciente02.getEndereco());
        System.out.println("Telefone: " + paciente02.getTelefone());
        System.out.println("Data de Nascimento: " + paciente02.getDataNascimento());
        System.out.println("Profissao: " + paciente02.getProfissao());
        
        // Hora das impressões vazias.
        System.out.println("\nInformações do Produto número 01:");
        System.out.println("Marca: " + produto01.getMarca());
        System.out.println("Fabricante: " + produto01.getFabricante());
        System.out.println("Código de Barras: " + produto01.getCod_barras());
        System.out.println("Preço: " + produto01.getPreco());
        
        //Impressões com as informações do usuário.
        System.out.println("\nInformações do Produto número 02:");
        System.out.println("Marca: " + produto02.getMarca());
        System.out.println("Fabricante: " + produto02.getFabricante());
        System.out.println("Código de Barras: " + produto02.getCod_barras());
        System.out.println("Preço: " + produto02.getPreco());
    }  
}