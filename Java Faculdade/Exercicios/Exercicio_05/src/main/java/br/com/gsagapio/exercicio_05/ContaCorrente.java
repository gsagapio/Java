/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gsagapio.exercicio_05;

/**
 *
 * @author Gustavo
 */
public class ContaCorrente {
    String nome;
    float saldo;
    float limite;
    char tipo;
    
    ContaCorrente(){
        
    }

    public ContaCorrente(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }
    
    void cadastraDados(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }

    // Método para imprimir dados
    String imprimeDados() {
        return "Nome: " + nome + ", Saldo: " + saldo + ", Limite: " + limite + ", Tipo: " + tipo;
    }

    // Método para depositar
    void depositar(float valor) {
        saldo += valor;
    }

    // Método para sacar
    void sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
}
