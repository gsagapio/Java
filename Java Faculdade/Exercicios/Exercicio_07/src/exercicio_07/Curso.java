
package exercicio_07;

public class Curso {
    public String nome;
    public int quantidadeAlunos;
    public String turma;
    public float mensalidade;

    Curso() {}
    
    public void Curso(){};

    public Curso(String n, int q, String t, float m) {
        this.nome = n;
        this.quantidadeAlunos = q;
        this.turma = t;
        this.mensalidade = m;
    }
    
    public void cadastraCurso(String n, int q, String t, float m){
       nome = n;
       quantidadeAlunos = q;
       turma = t;
       mensalidade = m;
    }
    
    public void imprimeDados(){
        System.out.println("Os dados do curso: \nNome do Curso: " + nome + 
                "\nQuantidade de Alunos: " + quantidadeAlunos + "\nTurma: " + 
                turma + "\nMensalidade: " + mensalidade);
    }
    
    public float calculaTotalMensalidade(){
        return (mensalidade * quantidadeAlunos);
    }
}
