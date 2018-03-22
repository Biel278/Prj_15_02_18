/*
    Objetivo:   Receba a temperatura em graus Celsius.
                Calcule e mostre a sua temperatura 
                convertida em fahrenheit F = (9*C+160) /5.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/

import javax.swing.JOptionPane;
public class ExercLt1_04 {
    public static void main(String args[]){
        double Cels,Fahr;
        Cels = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius :"));
        Fahr=((9*Cels+160)/5);
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é :"+ Fahr);
    }
}
