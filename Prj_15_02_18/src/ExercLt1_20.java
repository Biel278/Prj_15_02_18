/*
    Objetivo:   Receba 3 coeficientes A, B, e C de uma equação do 
                2º grau da fórmula AX²+BX+C=0.
                Verifique e mostre a existência de raízes reais 
                e se caso exista, calcule e mostre.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_20 {
    public static void main(String args[]){
        double A,B,C,Del,X1,X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A : "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B : "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de C : "));
        
        Del = ((B*B)-(4*A*C));
        
        if (Del<0){
            JOptionPane.showMessageDialog(null,"Essa Equação não possui raizes reais");
        }else{
            X1 = (((-B)+Math.sqrt(Del))/(2*A));
            X2 = (((-B)-Math.sqrt(Del))/(2*A));
            JOptionPane.showMessageDialog(null,"Os Valor de X1 é : "+X1+" e de X2 é : "+X2+" del é "+Del);
        }
    }
}
