
package br.com.renatoff;

import javax.swing.JOptionPane;

public class Atividade2405 {

 public static void main(String[] args) {
        boolean tmp = true;
        while (tmp == true) {
            String opcao = JOptionPane.showInputDialog("O QUE DESEJA?\r\n"
                    + "1 para 1° EXERCICIO\r\n"
                    + "2 para 2° EXERCICIO\r\n"
                    + "3 para 3° EXERCICIO\r\n"
                    + "4 para 4° EXERCICIO\r\n"
                    + "5 para 5° EXERCICIO\r\n"
                    + "6 para 6° EXERCICIO\r\n"
                    + "7 para 7° EXERCICIO\r\n"
                    + "8 para 8° EXERCICIO\r\n"
                    + "9 para 9° EXERCICIO\r\n"
                    + "10 para 10° EXERCICIO\r\n"
                    + "S para sair");
            if (opcao.toUpperCase().equals("X")) {
                tmp = false;
            } else if( (opcao.equals("1")) || (opcao.equals("2")) || (opcao.equals("3"))
                    || (opcao.equals("4")) || (opcao.equals("5")) || (opcao.equals("6"))
                    || (opcao.equals("7")) || (opcao.equals("8")) || (opcao.equals("9"))
                    || (opcao.equals("10"))) {
                int opcao2 = Integer.parseInt(opcao);
                switch (opcao2) {
                    case 1:
                        Exercicio1 one = new Exercicio1();
                        one.imprimir();
                        break;
                    case 2:
                        Exercicio2 two = new Exercicio2();
                        two.imprimir();
                        break;
                    case 3:
                        Exercicio3 three = new Exercicio3();
                        three.operacoes();
                        break;
                    case 4:
                        Exercicio4 four = new Exercicio4();
                        four.ordemCrescente();
                        break;
                    case 5:
                        Exercicio5 five = new Exercicio5();
                        five.frase();
                        break;
                    case 6:
                        Exercicio6 six = new Exercicio6();
                        six.posto();
                        break;
                    case 7:
                        Exercicio7 seven = new Exercicio7();
                        seven.inicio();
                        break;
                    case 8:
                        Exercicio8 eight = new Exercicio8();
                        eight.nomeReverso();
                        break;
                    case 9:
                        Exercicio9 nine = new Exercicio9();
                        nine.kmLitro();
                        break;
                    case 10:
                        Exercicio10 ten = new Exercicio10();
                        ten.litroNecessario();
                        break;

                }
            }
        }
    }

}

