/*
    Objetivo:   Receba a quantidade de horas trabalhadas,
                o valor por hora, o percentual de desconto e o número de descendentes.
                Calcule o salário que serão as horas trabalhadas x o valor por hora.
                Calcule o salário líquido (= Salário Bruto – desconto).
                A cada dependente será acrescido R$ 100 no Salário Líquido.
                Exiba o salário a receber.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 16/02/2018
*/
import javax.swing.JOptionPane;
public class ExercLt1_16 {
    public static void main (String args[]){
        double HTab,VHr,PDes,NDec,SLiq,SBru;
        HTab = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade de horas trabalhadas : "));
        VHr = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor por hora : "));
        PDes = Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual de desconto : "));
        NDec = Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero de decendentes : ")); 
        NDec *= 100;
        SBru = (HTab*VHr);
        SLiq = ((SBru -(SBru * (PDes/100))+NDec));
        JOptionPane.showMessageDialog(null,"O Salário a receber é : "+SLiq);
    }   
}