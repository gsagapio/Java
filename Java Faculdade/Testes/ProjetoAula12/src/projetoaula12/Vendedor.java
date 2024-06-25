package projetoaula12;

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public float calcularComissao() {
        float bonus = 0.0f;
        
        if (vendas >= 1000 && vendas < 2000) {
            bonus = (vendas / 100) * 10; // Correção aqui
        } else if (vendas >= 2000) {
            bonus = (vendas / 100) * 15;
        }
        
        return bonus;
    }

    public float descontoFalta() {
        return (salario / 30) * falta;
    }

    public void calcularSalario() {
        float comissao = calcularComissao();
        float desconto = descontoFalta();
        
        salario = salario + comissao - desconto;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Vendas: R$" + vendas);
        System.out.println("Salário: R$" + salario);
        System.out.println("Faltas: " + falta + " dias");
    }
}

