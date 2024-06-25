package exercicio_06;

public class Boletim {
    double n1;
    double n2;
    double media;
    
    //construtor com parametros
    public Boletim(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //construtor sem parametros
    public Boletim(){}
    
    //metodo double que retorna a media dos valores
    double calculaMedia(){
        media = (n1 + n2) / 2;
        return media;
    }
    
    //Chama o metodo que calcula a media para inserir as informações na tela
    void imprimeBoletim(){
        calculaMedia();
        System.out.println("Sua nota 1: " + n1);
        System.out.println("Sua nota 2: " + n2);
        System.out.println("Sua media: " + media);
    }
    
    void verificaConceito(){
        calculaMedia(); // Calcula a média antes de verificar o conceito
        
        if(media >= 8 && media <= 10){
            System.out.println("Conceito A");
            
        } else if(media >= 6 && media < 8){
            System.out.println("Conceito B");
            
        } else if(media >= 4 && media < 6){
            System.out.println("Conceito C");
            
        } else if (media < 0){
            media = 0;
            System.out.println("Conceito D");
            
        } else{
            System.out.println("Conceito D");
        }
    }
}