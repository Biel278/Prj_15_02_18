/*
    Objetivo:   Receba 2ângulos de um triângulo.
                Calcule e mostre o valor do 3º ângulo.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_14 {
    public static void main (String args[]){
        double Ang1,Ang2,Ang3;
        Ang1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° angulo"));
        Ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° angulo"));
        Ang3 = (180-(Ang1+Ang2));
        JOptionPane.showMessageDialog(null,"O 3° angulo é : "+ Ang3);
    }
}
