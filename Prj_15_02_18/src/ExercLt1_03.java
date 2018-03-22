/*
    Objetivo:   Receba a base e a altura de um triângulo.
                Calcule e mostre a sua área.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;

public class ExercLt1_03 {
    public static void main(String args[]){
        int Base,Altura;
        double Area;
        
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do Triangulo: "));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Triagulo: "));
        Area = ((Base * Altura)/2);
        JOptionPane.showMessageDialog(null,"A area do Triangulo é igual a : "+Area);
    }
}
