/*
    Objetivo:   Receba o ano de nascimento e o ano atual.
                Calcule e mostre a sua idade e
                quantos anos terá daqui a 17 anos.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_12 {
    public static void main(String args[]){
        int Nas,Ida,Nov;
        Nas = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
        Ida = (2018 - Nas);
        Nov = (Ida +17);
        JOptionPane.showMessageDialog(null,"Sua idade é : "+Ida+" daqui a 17 anos será : "+Nov);
    }
}
