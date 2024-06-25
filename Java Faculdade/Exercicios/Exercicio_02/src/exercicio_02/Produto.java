package exercicio_02;

public class Produto {
    private String Marca;
    private String Fabricante;
    private String Cod_barras;
    private float Preco;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getCod_barras() {
        return Cod_barras;
    }

    public void setCod_barras(String Cod_barras) {
        this.Cod_barras = Cod_barras;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }
    
}