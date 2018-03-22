
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_25 {

    public static void main(String args[]) {
        int hi, hf, mi, mf, ht, mt;

        hi = Integer.parseInt(JOptionPane.showInputDialog("digite a hora inicial :"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("digite o minuto inicial :"));
        hf = Integer.parseInt(JOptionPane.showInputDialog("digite a hora final :"));
        mf = Integer.parseInt(JOptionPane.showInputDialog("digite o minuto final :"));
        
        
         if (mi > mf) {
            mt = (mi+mf) - 60;
        } else if (mf > mi) {
                    mt = mf - mi;
              } else {
                    mt = 0;
                }
        if (hi > hf) {
            ht = (hi + hf)-24;
            JOptionPane.showMessageDialog(null,"tempo de jogo restante é "+ht+":"+mt);
        } else if (hf > hi) {
                    ht = hf - hi;
                    JOptionPane.showMessageDialog(null,"tempo de jogo restante é "+ht+":"+mt);
              } else {
                    JOptionPane.showMessageDialog(null,"Acabou o tempo de jogo ");
                }
    }
}
