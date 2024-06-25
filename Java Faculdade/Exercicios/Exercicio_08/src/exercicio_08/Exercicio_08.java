package exercicio_08;

public class Exercicio_08 {

    public static void main(String[] args) {
        // Criando um funcionário com construtor vazio (cargo "assistente")
        Funcionarios funcionario1 = new Funcionarios();
        System.out.println("Funcionário 1:");
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$" + funcionario1.getSalario());

        // Criando um funcionário com parâmetros personalizados
        Funcionarios funcionario2 = new Funcionarios(123, 2500.0f, "Analista");
        System.out.println("\nFuncionário 2:");
        System.out.println("Crachá: " + funcionario2.getCracha());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Salário: R$" + funcionario2.getSalario());

        // Calculando aumento para o funcionário 2 (10 anos de serviço)
        funcionario2.calculaAumento(10);
        System.out.println("\nNovo salário após aumento: R$" + funcionario2.getSalario());
    }
    
}
