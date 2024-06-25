
package exercicio_07;


public class Exercicio_07 {

  
    public static void main(String[] args) {
       
        Curso c1 = new Curso();
        
        Curso c2 = new Curso( "Analise e Desenvolvimento de Sistemas",
                30, "3i", 700);
        
        c2.imprimeDados();
        
        c1.cadastraCurso("Pscologia", 50, "1J", 450);
        c1.imprimeDados();
        System.out.println(c1.calculaTotalMensalidade());
    }
    
}
