package projetoaula08;
import java.util.Scanner;

public class ProjetoAula08 {

    public static void main(String[] args) {
        
        //Instanciação dos objetos
        Produto p1= new Produto();
        Produto p2 = new Produto("Camisa Nike", 150);
        Produto p3 = p2.duplicar();
        
        //Chama os metodos da classe Produto
        p1.cadastraDados();
        p1.imprimeDados();
        
        p2.imprimeDados();
        //Modifica os dados dentro do objeto
        p2.marca = "camisa 2 Nike";
        p2.imprimeDados();
        
        p3.imprimeDados();
        
        
        if(p1.compara(p2)){
            System.out.println("São iguais p1 = p2");
        }
        else if(p1.compara(p3)){
            System.out.println("São iguais p1 = p3");
        }
    } 
}