/*
    Objetivo:   Receba os coeficientes A,B e C de uma equação do 2º grau (AX²+BX+C=0).
                Calcule e mostre as raízes reais(considerar que a equação possue2 raízes).
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_05 {
    public static void main(String args[]){
        int A,B,C;
        double Delta,X1,X2;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A :"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B :"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de C :"));
        Delta = ((B*B)-4*A*C);
        X1 = (-B+Math.sqrt(Delta))/(2*A);
        X2 = (-B-Math.sqrt(Delta))/(2*A);
        JOptionPane.showMessageDialog(null,"O valor de X1 é: "+X1+" e o valor de X2 é: "+X2);
    }
}
