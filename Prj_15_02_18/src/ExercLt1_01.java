/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_01 {
    public static void main(String args[]){
        int Lado,Area;
        Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado"));
        Area = (Lado*Lado);
        JOptionPane.showMessageDialog(null,"Area do Quadrado é: "+ Area);
    }
}
