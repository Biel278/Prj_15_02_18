/*
    Objetivo:   Receba 2 números reais.
                Calcule e mostre a diferença desses valores.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_10 {
    public static void main(String args[]){
        double N1,N2,Di;
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite Um numero : "));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero : "));
        Di = (N1-N2);
        JOptionPane.showMessageDialog(null,"A diferença entre "+ N1 +" e "+ N2 +" é "+ Di);
    }
}
