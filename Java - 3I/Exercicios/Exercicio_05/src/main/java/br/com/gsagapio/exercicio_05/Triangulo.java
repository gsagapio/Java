/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gsagapio.exercicio_05;

/**
 *
 * @author Gustavo
 */
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