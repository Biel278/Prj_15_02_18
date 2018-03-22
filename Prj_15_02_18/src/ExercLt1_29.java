
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_29 {

    public static void main(String args[]) {
        int tppoup;
        double invalor;
        
        invalor = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do investimento :"));
        tppoup = Integer.parseInt(JOptionPane.showInputDialog("digite o tipo de investimento sendo 1 para poupança e 2 para renda fixa :"));
        if ((tppoup<1)||(tppoup>2)){
            tppoup = Integer.parseInt(JOptionPane.showInputDialog("digite o tipo de investimento sendo 1 para poupança e 2 para renda fixa :"));
        }
        
        switch (tppoup){
            case 1:
                JOptionPane.showMessageDialog(null,"O valor após 30 dias é " +(tppoup+=tppoup*0.3));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O valor após 30 dias é " +(tppoup+=tppoup*0.5));
                break;    
        }
    }
}
