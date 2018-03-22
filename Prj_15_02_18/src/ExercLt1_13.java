/*
    Objetivo:   Receba a quantidade de alimento em quilos.
                Calcule e mostre quantos dias durará esse alimento 
                sabendo que a pessoa consome 50g ao dia.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_13 {
    public static void main(String args[]){
        int Ali,Con;
        Ali = Integer.parseInt(JOptionPane.showInputDialog("Digite em Kg a quantidade de alimento :"));
        Con = (Ali/50);
        JOptionPane.showMessageDialog(null,"Esta quantidade de alimento durará : "+Con+" Dias");
    }
}
