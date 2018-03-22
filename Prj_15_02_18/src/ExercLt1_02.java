/*
    Objetivo:   Receba o salário de um funcionário e
                mostre o novo salário com reajuste de 15%.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_02 {
    public static void main(String args[]){
        double Salario;
        Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu Salario"));
        Salario = Salario*1.15;
        JOptionPane.showMessageDialog(null,"O reajuste do seu Salario é: "+ Salario);
    }
}
