package br.com.renatoff;

import javax.swing.JOptionPane;

public class Exercicio9 {

    private float km;
    private float litro;

    public void kmLitro() {
        this.km = Float.parseFloat(JOptionPane.showInputDialog("Informe o KM percorridos"));
        this.litro = Float.parseFloat(JOptionPane.showInputDialog("Informe Litros cosumidos"));
        JOptionPane.showMessageDialog(null, "A média de KM/L:   " + this.media());
    }
    public float media() {
        return (this.km / this.litro);
    }
}