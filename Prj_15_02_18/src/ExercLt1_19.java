/*
    Objetivo:   Receba 2 valores reais.
                Calcule e mostre o maior deles.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_19 {
    public static void main(String args[]){
        double N1,N2;
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero : "));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero : "));
        
        if(N1>N2){
            JOptionPane.showMessageDialog(null,"O Maior numero é : "+N1);
        } else if (N2>N1){
            JOptionPane.showMessageDialog(null,"O Maior numero é : "+N2);
            } else{
                JOptionPane.showMessageDialog(null,"Ambos são Iguais , 1° numero : "+N1+" e 2° numero : "+N2);
        } 
    }
}
