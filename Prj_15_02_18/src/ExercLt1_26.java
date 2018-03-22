
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_26 {

    public static void main(String args[]) {
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o 1° valor :"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o 2° valor :"));
        
        if ((n1 > n2) && ((n1%n2)==0)) {
           JOptionPane.showMessageDialog(null, n1 + " é multiplo de " + n2);
           
        }else if ((n2 > n1)&&((n2%n1)==0)) {
            JOptionPane.showMessageDialog(null, n2 + " é multiplo de " + n1);
             } else {
                JOptionPane.showMessageDialog(null, "nao é multiplo");
             }
    }
}
