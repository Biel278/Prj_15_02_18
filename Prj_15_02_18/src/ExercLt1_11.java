/*
    Objetivo:   Receba o raio de uma circunferência.
                Calcule e mostre o comprimento da circunferência.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_11 {
    public static void main(String args[]){
        double Raio,Comp;
        Raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferencia"));
        Comp = (Math.PI*Raio*2);
        JOptionPane.showMessageDialog(null,"O comprimento da circunferencia mede : "+Comp);
    }
}
