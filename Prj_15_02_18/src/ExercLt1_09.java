/*
    Objetivo:   Receba os 2 números inteiros.
                Calcule e mostre a soma dos quadrados
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_09 {
    public static void main(String args[]){
        int N1,N2,Soma;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero :"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero :"));
        Soma = ((N1*N1)+(N2*N2));
        JOptionPane.showMessageDialog(null,"A Soma dos quadrados é : "+ Soma);
    }
}
