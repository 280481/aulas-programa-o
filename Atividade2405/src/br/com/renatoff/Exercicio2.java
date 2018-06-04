package br.com.renatoff;

import javax.swing.JOptionPane;

public class Exercicio2 {

    private int variavel1;
    private double variavel2;
    private float variavel3;
    private boolean variavel4;
    private String variavel5;

    public Exercicio2() {
        variavel1 = 8;
        variavel2 = 800.5;
        variavel3 = 8.8f;
        variavel4 = true;
        variavel5 = "RENATO FIGUEIRA FRANCESCATTO";
    }

    public void imprimir() {

        JOptionPane.showMessageDialog(null,
                "A variável int: " + this.variavel1
                + "\r\nA variável double: " + this.variavel2
                + "\r\nA variável float: " + this.variavel3
                + "\r\nA variável boolean: " + this.variavel4
                + "\r\nA variável String: " + this.variavel5);

    }
}