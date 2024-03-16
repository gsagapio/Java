package projetoaula07;

import javax.swing.JOptionPane;

public class ProjetoAula07 {

    public static void main(String[] args) {
        
        ContaPoupanca contpoup;
        
        float valorDep, rend, saldo, taxa;
        String agencia, numero;
        
        agencia = JOptionPane.showInputDialog("Digite o numero da agencia: ");
        numero = JOptionPane.showInputDialog("Digite o numero da Conta Poupanca: ");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: "));
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros: "));
        
        contpoup = new ContaPoupanca(agencia, numero, saldo, taxa);
        
        //metodos
        contpoup.imprimeDados();
        rend = contpoup.calculaRendimento();
        
        JOptionPane.showInputDialog(null, "O rendimento: " + rend);
        
        valorDep = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite o valor a ser depositado: "));
        
        contpoup.depositar(valorDep);
        contpoup.imprimeDados();
    }
}