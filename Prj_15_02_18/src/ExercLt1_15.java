/*
    Objetivo:   Receba os valores de 2 catetos de um triângulo retângulo.
                Calcule e mostre a hipotenusa.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_15 {
    public static void main(String args[]){
        double Cat1,Cat2,Hip;
        Cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° cateto : "));
        Cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° cateto : "));
        Hip = Math.sqrt((Cat1*Cat1)+(Cat2*Cat2));
        JOptionPane.showMessageDialog(null,"A Hipotenusa é :"+ Hip);
    }
}
