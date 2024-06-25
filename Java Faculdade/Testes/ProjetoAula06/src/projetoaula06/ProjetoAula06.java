package projetoaula06;

public class ProjetoAula06 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10f, 5f);
        
        float area = (t1.altura + t1.base) / 2;
        
        System.out.println("Area = " + area);
    }
}
