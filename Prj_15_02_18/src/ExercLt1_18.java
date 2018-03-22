/*
    Objetivo:   Receba 2 valores inteiros.
                Calcule e mostre o resultado da diferença 
                do maior pelo menos valor.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_18 {
    public static void main(String args[]){
        int N1,N2,Dif;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero : "));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero : "));
        
        if (N1 >= N2){
            Dif = (N1 -N2);
        } else {
            Dif = (N2 -N1);
        }
        
        JOptionPane.showMessageDialog(null,"A Diferença entre os Numeros é : "+Dif);

    }
}    
