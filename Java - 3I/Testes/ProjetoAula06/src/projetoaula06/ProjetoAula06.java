package projetoaula06;

public class ProjetoAula06 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10f, 5f);
       
        float area = (t1.altura + t1.base) / 2;
        
        System.out.println("Area = " + area);
        
        Data d1 = new Data(2, 9, 2015);
        Data d2 = new Data();
        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
    }
}
