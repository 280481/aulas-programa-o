/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renatoff;

public class Exercicio1 {
    
    
    private int variavel1;
    private double variavel2;
    private float variavel3;
    private boolean variavel4;
    private String variavel5;

    public Exercicio1() {
        variavel1 = 8;
        variavel2 = 800.5;
        variavel3 = 8.8f;
        variavel4 = true;
        variavel5 = "RENATO FIGUEIRA FRANCESCATTO";
    }
    
    public void imprimir() {
        
        System.out.printf("A variável int: %d\r\nA variável double: %f\r\n"
                + "A variável float: %f\r\nA variável boolean: %b\r\n"
                + "A variável String: %s\r\n", this.variavel1, this.variavel2, this.variavel3, this.variavel4, this.variavel5);
        
    }
}

