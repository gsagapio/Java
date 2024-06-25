/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gsagapio.exercicio_05;

/**
 *
 * @author Gustavo
 */
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
