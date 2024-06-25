package exercicio_09;

import java.util.Scanner;

public class Media {

    public double media;
    public double nota1;
    public double nota2;
    
    public Media() {
    }

    public Media(double media, double nota1, double nota2) {
        this.media = media;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double calculaMedia(double nota1, double nota2){
        media = (nota1 + nota2) / 2;
    
        return media;
        
    }
     
    public void dezAlunos(){
        Scanner sc = new Scanner(System.in);
      
        int i = 0;
        while (i < 10) {
            
            System.out.println("Aluno " + (i + 1) + ":");
            
            System.out.println("Insira a primeira nota do aluno: ");
            double nota1 = sc.nextDouble();
            
            System.out.println("Insira a segunda nota do aluno: ");
            double nota2 = sc.nextDouble();
            
            double media = calculaMedia(nota1, nota2);
            
            System.out.println("Média do aluno " + (i+1) + ": " + media);
            
            i++;
        }
    
    }
        
        
}
