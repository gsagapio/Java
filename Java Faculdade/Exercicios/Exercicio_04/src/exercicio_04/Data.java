package exercicio_04;

public class Data {
    //Atributos
    int dia;
    int mes;
    int ano;
    
    //Metodo construtor sem parametros
    public Data(){
        
    }
    
    //Metodo construtor com parametros
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    //Metodos
    void cadastraDados(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    void imprimeData(){
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
    
}
