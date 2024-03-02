package projetoaula03;


public class Cachorro {
    private String nome;
    private String raça;

    public Cachorro(String nome, String raça) {
        this.nome = nome;
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
