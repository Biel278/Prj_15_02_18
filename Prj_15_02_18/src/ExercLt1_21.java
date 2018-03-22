
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_21 {

    public static void main(String args[]) {
        int n1, n2, n3, n4, media;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("coloque sua 1° nota! "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("coloque sua 2° nota! "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("coloque sua 3° nota! "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("coloque sua 4° nota! "));
        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "aprovado");
        } else if (media < 3) {
            JOptionPane.showMessageDialog(null, "retido");
        } else {
            JOptionPane.showMessageDialog(null, "exame");

        }
    }
}