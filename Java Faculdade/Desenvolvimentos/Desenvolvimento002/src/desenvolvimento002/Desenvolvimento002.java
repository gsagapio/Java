
package desenvolvimento002;
import java.util.ArrayList;
import java.util.Collections;

public class Desenvolvimento002 {
    
    public static void main(String[] args) {

        // Criando e preenchendo o ArrayList de teste
        ArrayList<Double> arrayList1 = new ArrayList<>();
        arrayList1.add(1.0);
        arrayList1.add(2.0);
        arrayList1.add(3.0);
        arrayList1.add(4.0);
        arrayList1.add(5.0);

        // Testando o método inverta
        System.out.println("ArrayList original:");
        System.out.println(arrayList1);
        inverta(arrayList1);
        System.out.println("ArrayList invertido:");
        System.out.println(arrayList1);
        
        // Criando e preenchendo outro ArrayList de teste
        ArrayList<Double> arrayList2 = new ArrayList<>();
        arrayList2.add(10.5);
        arrayList2.add(20.5);
        arrayList2.add(30.5);
        arrayList2.add(40.5);
        arrayList2.add(50.5);
        arrayList2.add(60.5);
        arrayList2.add(70.5);

        // Testando o método inverta com outro ArrayList
        System.out.println("\nArrayList original:");
        System.out.println(arrayList2);
        inverta(arrayList2);
        System.out.println("ArrayList invertido:");
        System.out.println(arrayList2);
    }

    public static void inverta(ArrayList<Double> arr) {
        // Utilizando o método reverse da classe Collections para inverter o ArrayList
        Collections.reverse(arr);
    }
}