/*
    Objetivo:   Receba os valores em x e y.
                Efetua a troca de seus valores e mostre seus conteúdos.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/

import javax.swing.JOptionPane;
public class ExercLt1_06 {
    public static void main (String args[]){
        int X,Y,aux;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X :"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Y :"));
        aux = Y;
        Y = X;
        X = aux;
        JOptionPane.showMessageDialog(null,"O valor de X agora é : "+X+" e o valor de Y é : "+Y);
    }
}
