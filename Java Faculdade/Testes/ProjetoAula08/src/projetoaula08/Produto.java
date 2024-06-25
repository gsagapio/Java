package projetoaula08;
import java.util.Scanner;

public class Produto {
    String marca;
    float valor;

    public Produto(String marca, float valor) {
        this.marca = marca;
        this.valor = valor;
    }

    public Produto() {
    }
    
    void cadastraDados(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a marca: \n");
        marca = entrada.nextLine();
  
        System.out.println("Digite o valor: \n");
        valor = entrada.nextFloat();
    }
    
    void imprimeDados(){
        System.out.println("\nProduto");
        System.out.println("Marca: " + marca + "\nValor: " + valor);
    }
    
    float calculaImposto(){
        
        return 0;
    }
    
    Produto duplicar(){
        Produto p = new Produto();
        p.marca = this.marca;
        p.valor = this.valor;
        return(p);
    }
    
    boolean compara(Produto p){
        return(this.valor == p.valor);
    }
}