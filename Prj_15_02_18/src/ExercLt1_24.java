
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_24 {

    public static void main(String args[]) {
        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o 1° valor :"));
        
        if (((n1 % 2)== 0) &&((n1%3)==0) ) {
           JOptionPane.showMessageDialog(null, "O numero "+n1+" é divisivel por 2 e 3 ");
        } else {
            JOptionPane.showMessageDialog(null, "O numero "+n1+"  não é divisivel por 2 e 3 ");
        }
    }
}
