package exercicio_02;

public class Paciente {
    private String Nome;
    private String RG;
    private String Endereco;
    private String Telefone;
    private String DataNascimento;
    private String Profissao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String Profissão) {
        this.Profissao = Profissao;
    }
  
}