/*
    Objetivo:   Calcule a quantidade de litros gastos em uma viagem,
                sabendo que o automóvel faz 12 km/l.
                Receber o tempo de percurso e a velocidade média.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_17 {
    public static void main(String args[]){
        double TPer,VMed,QLit;
        TPer = Double.parseDouble(JOptionPane.showInputDialog("Digite o Tempo percorrido em Horas : "));
        VMed = Double.parseDouble(JOptionPane.showInputDialog("Digite a Velocidade média em Km/H : "));
        QLit = ((VMed*TPer)/12);
        JOptionPane.showMessageDialog(null,"A Quantidade de litros Gastos nessa viagem foi : "+QLit);
    }
}
