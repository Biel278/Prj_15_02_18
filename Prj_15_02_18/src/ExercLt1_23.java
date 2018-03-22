
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_23 {

    public static void main(String args[]) {
        int n1, n2, n3, n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o 1° valor :"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o 2° valor :"));
        if (n1 > n2) {
            n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o 2° valor :"));
        }
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o 3° valor :"));
        if (n2 > n3) {
            n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o 3° valor :"));
        }
        n4 = n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o 4° valor :"));

        if (n4 <= n1) {
            JOptionPane.showMessageDialog(null, n4 + "/" + n1 + "/" + n2 + "/" + n3);
        } else if (n4 <= n2) {
                    JOptionPane.showMessageDialog(null, n1 + "/" + n4 + "/" + n2 + "/" + n3);
             } else if (n4 <= n3) {
                       JOptionPane.showMessageDialog(null, n1 + "/" + n2 + "/" + n4 + "/" + n3);
                  } else {
                       JOptionPane.showMessageDialog(null, n1 + "/" + n2 + "/" + n3 + "/" + n4);
                    }
    }
}
