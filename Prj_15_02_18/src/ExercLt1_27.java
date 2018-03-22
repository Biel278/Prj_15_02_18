
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_27 {

    public static void main(String args[]) {
        int nVolta;
        double  exCirc,tempo,vm;
        
        nVolta = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de voltas :"));
        exCirc = Double.parseDouble(JOptionPane.showInputDialog("digite o comprimento do circuito (em metros) :"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("digite o tempo de duracao (em minutos) :"));
        
        exCirc *= 1000;
        tempo *=60;
         vm = (exCirc * nVolta)/tempo;
        
            JOptionPane.showMessageDialog(null,"velocidade media é "+vm );
    }
}
