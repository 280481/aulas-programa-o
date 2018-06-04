package br.com.renatoff;

import javax.swing.JOptionPane;

public class Exercicio3 {

    private String operacao;
    private float numero;
    private float resultado;

    public Exercicio3() {
        operacao = "";
        numero = 0;
        resultado = 0;
    }

    public void operacoes() {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));

        while (true) {
            String tmpOp = JOptionPane.showInputDialog("Qual é a operação que você deseja?\r\n"
                    + "+     SOMA\r\n"
                    + "-     SUBTRAÇÃO\r\n"
                    + "*     MULTIPLICAÇÃO\r\n"
                    + "/     DIVISÃO\r\n"
                    + "\r\nS    para SAIR");

            if (tmpOp.equals(".")) {
                System.out.printf("O resultado final: %.2f\r\n", this.resultado);
                break;
            } else {
                this.operacao = tmpOp;
                float tmpNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
                this.calculo(tmpNumero);
                JOptionPane.showMessageDialog(null, "Resultado: " + this.resultado);
                System.out.printf("O resultado é: %.2f\r\n", this.resultado);
            }
        }
    }

    public void calculo(float tmpNumero2) {
        switch (this.operacao) {
            case "+":
                this.resultado = this.numero + tmpNumero2;
                break;
            case "-":
                this.resultado = this.numero - tmpNumero2;
                break;
            case "*":
                this.resultado = this.numero * tmpNumero2;
                break;
            case "/":
                this.resultado = this.numero / tmpNumero2;
                break;
            default:
                System.out.println("???");
                break;
        }
        this.numero = this.resultado;

    }
}