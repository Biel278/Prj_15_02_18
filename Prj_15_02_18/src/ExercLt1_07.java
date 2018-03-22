/*
    Objetivo:   Receba os valores do comprimento,
                largura e altura de um paralelepípedo.
                Calcule e mostre seu volume.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_07 {
    public static void main (String args[]){
        double Com,Alt,Lar,Vol;
        Com = Double.parseDouble(JOptionPane.showInputDialog("Digite o Comprimento : "));
        Alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura : "));
        Lar = Double.parseDouble(JOptionPane.showInputDialog("Digite a Largura : "));
        Vol = (Com*Alt*Lar);
        JOptionPane.showMessageDialog(null,"O Volume deste Paralelepipedo é : "+ Vol);
    }
}
