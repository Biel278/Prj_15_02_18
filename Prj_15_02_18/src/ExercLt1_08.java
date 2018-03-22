/*
    Objetivo:   Receba o valor de um depósito em poupança.
                Calcule e mostre o valor após 1 mês de aplicação 
                sabendo que rende 1,3% a. m.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_08 {
    public static void main(String args[]){
        double Dep,Ren;
        Dep = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor a ser depositado ?"));
        Ren = (Dep*1.013);
        JOptionPane.showMessageDialog(null,"O valor do deposito apó 1 mes é :"+Ren);
    }
}
