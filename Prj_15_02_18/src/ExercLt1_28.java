
import javax.swing.JOptionPane;
/*
    Objetivo:   Coletar o valor do lado de um quadrado,
                calcular sua área e apresentar o resultado.
    Nome do Programador: Gabriel Filipp
    Data de desenvolvimento: 15/02/2018
*/
public class ExercLt1_28 {

    public static void main(String args[]) {
        double preco,mdmensal;

        preco = Double.parseDouble(JOptionPane.showInputDialog("digite o preco atual :"));
        mdmensal= Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de venda mensal :"));
        
        if ((preco <500) &&(mdmensal<30)) {
            preco += preco*0.1;
        } else if(((preco>=500)||(preco<1000)) &&((mdmensal>=30)||(mdmensal<80))){
                    preco += preco*0.15;
               }else if ((preco>=1000)&&(mdmensal>=80)){
                        preco-=preco*0.05;
                     }
                        
            JOptionPane.showMessageDialog(null,  "O preco novo é :" + preco);
    }
}
