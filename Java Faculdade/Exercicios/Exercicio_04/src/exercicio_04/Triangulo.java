package exercicio_04;

public class Triangulo {
    //Atributos
    float base;
    float altura;
    
    //Metodo construtor sem parametros
    public Triangulo(){ 
    }
    
    //Metodo construtor com parametros
    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }
    
    //Metodos
    float calculaArea(){
        return (base * altura) / 2;
    }
    
    String imprimeDados(){
        return "Base: " + base + ", Altura: " + altura;
    }
}
