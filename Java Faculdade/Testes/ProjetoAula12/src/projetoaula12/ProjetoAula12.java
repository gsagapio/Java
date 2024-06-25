package projetoaula12;


public class ProjetoAula12 {

    public static void main(String[] args) {
        // Criando um objeto Vendedor
        Vendedor vendedor1 = new Vendedor(1500, 2000, "João", 2);

        // Imprimindo os dados do vendedor
        System.out.println("Dados do Vendedor:");
        vendedor1.imprimeDados();

        // Calculando a comissão
        float comissao = vendedor1.calcularComissao();
        System.out.println("Comissão: R$" + comissao);

        // Calculando o desconto de faltas
        float descontoFalta = vendedor1.descontoFalta();
        System.out.println("Desconto de Faltas: R$" + descontoFalta);

        // Calculando o salário final
        vendedor1.calcularSalario();
        System.out.println("Salário Final: R$" + vendedor1.getSalario());
    }
}