package exercicio_01;

class Curso {
    private int Id_curso;
    private String Nome_curso;
    private int Carga_horas;
    private float Valor;

    public int getId_curso() {
        return Id_curso;
    }

    public void setId_curso(int Id_curso) {
        this.Id_curso = Id_curso;
    }

    public String getNome_curso() {
        return Nome_curso;
    }

    public void setNome_curso(String Nome_curso) {
        this.Nome_curso = Nome_curso;
    }

    public int getCarga_horas() {
        return Carga_horas;
    }

    public void setCarga_horas(int Carga_horas) {
        this.Carga_horas = Carga_horas;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
}