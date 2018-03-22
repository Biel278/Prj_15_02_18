
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import javax.swing.JOptionPane;

/*



 */
public class ExercLt1_30 {

    public static void main(String args[]) {
        int d_nas, m_nas, a_nas, d_atu, m_atu, a_atu, dias, mes, meses, m_aux, dia, dia_max;
        int aux_nas, aux_atu;
        double qtd_anos,qtd_meses,qtd_dias,tot_dias;
        boolean result_nas, result_atu;
        result_nas = false;
        result_atu = false;
        mes = 0;
        dia = 0;
        //pega o ano atual
        do {
            a_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o  ano atual"));
        } while (a_atu > 2018 || a_atu < 1950);

        //pega o ano de nascimento
        do {
            a_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o  seu ano de Nascimento"));
        } while (a_nas > 2018 || a_nas < 1950 || a_nas > a_atu);

        //pega o mes de nascimento
        do {
            m_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o  seu mes de Nascimento"));
        } while (m_nas <= 0 || m_nas > 12);

        //pega o mes atual
        do {
            m_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o  mes atual"));

        } while (m_atu <= 0 || m_atu > 12);

        //verifica se o ano DE NASCIMENTO é bissexto e devolve resultado true or false
        if (a_nas % 4 == 0) {
            if (a_nas % 400 == 0 && a_nas % 100 == 0) {
                result_nas = true;
            } else if (a_nas % 400 == 0 && a_nas % 100 != 0) {
                result_nas = true;
            } else {
                result_nas = true;
            }
        } else {
            result_nas = false;
        }

        //recebe dia de nascimento
        if (m_nas == 1 || m_nas == 3 || m_nas == 5 || m_nas == 7 || m_nas == 8 || m_nas == 10 || m_nas == 12) {
            do {
                d_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o  seu dia de Nascimento"));
            } while (d_nas <= 0 || d_nas > 31);

        } else if (m_nas == 4 || m_nas == 6 || m_nas == 9 || m_nas == 11) {
            do {
                d_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o  seu dia de Nascimento"));
            } while (d_nas <= 0 || d_nas > 30);

        } else {
            if (result_nas == false) {
                do {
                    d_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o  seu dia de Nascimento"));
                } while (d_nas <= 0 || d_nas > 28);
            } else {
                do {
                    d_nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o  seu dia de Nascimento"));
                } while (d_nas <= 0 || d_nas > 29);
            }
        }

        //verifica se o ano atual é bissexto e devolve resultado true or false
        if (a_atu % 4 == 0) {
            if (a_atu % 400 == 0 && a_atu % 100 == 0) {
                result_atu = true;
            } else if (a_atu % 400 == 0 && a_atu % 100 != 0) {
                result_atu = true;
            } else {
                result_atu = true;
            }
        } else {
            result_atu = false;
        }

        //recebe dia de atual
        if (m_atu == 1 || m_atu == 3 || m_atu == 5 || m_atu == 7 || m_atu == 8 || m_atu == 10 || m_atu
                == 12) {
            do {
                d_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o  dia atual"));
            } while (d_atu <= 0 || d_atu > 31);

        } else if (m_atu == 4 || m_atu == 6 || m_atu == 9 || m_atu
                == 11) {
            do {
                d_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o  dia atual"));
            } while (d_atu <= 0 || d_atu > 30);

        } else {
            if (result_atu == false) {
                do {
                    d_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o  dia atual"));
                } while (d_atu <= 0 || d_atu > 28);
            } else {
                do {
                    d_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o  dia atual"));
                } while (d_atu <= 0 || d_atu > 29);
            }
        }

        aux_nas = a_nas;
        //transformar anos em dias 
        for (dias = 0; aux_nas <= (a_atu - 2); aux_nas++) {
            //verifica se o ano é bissexto e devolve resultado true or false
            if (aux_nas % 4 == 0) {
                if (aux_nas % 400 == 0 && aux_nas % 100 == 0) {
                    result_nas = true;
                } else if (aux_nas % 400 == 0 && aux_nas % 100 != 0) {
                    result_nas = true;
                } else {
                    result_nas = true;
                }
            } else {
                result_nas = false;
            }

            // soma 365 ou 366 dias 
            if (result_nas == true) {
                dias += 366;
            } else {
                dias += 365;
            }
        }
        // Soma em dias o resto dos meses do a_atu-1 ate a_atu   
        if (a_atu % 4 == 0) {
            if (a_atu % 400 == 0 && a_atu % 100 == 0) {
                result_atu = true;
            } else if (a_atu % 400 == 0 && a_atu % 100 != 0) {
                result_atu = true;
            } else {
                result_atu = true;
            }
        } else {
            result_atu = false;
        }
        
        for (; m_nas <= 12; m_nas++) {
            switch (m_nas) {
                case 1:
                    dias += 31;
                    break;
                case 2:
                    if (result_atu == true) {
                        dias += 29;
                    } else {
                        dias += 28;
                    }
                    break;
                case 3:
                    dias += 31;
                    break;
                case 4:
                    dias += 30;
                    break;
                case 5:
                    dias += 31;
                    break;
                case 6:
                    dias += 30;
                    break;
                case 7:
                    dias += 31;
                    break;
                case 8:
                    dias += 31;
                    break;
                case 9:
                    dias += 30;
                    break;
                case 10:
                    dias += 31;
                    break;
                case 11:
                    dias += 30;
                    break;
                case 12:
                    dias += 31;
                    break;
            }
            System.out.println(dias);
        }

        //soma em dias a quantidade de dias de mes restante ate o proximo aniversário 
        for (mes = 1; mes <= m_atu; mes++) {
            switch (mes) {
                case 1:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 31;
                    }
                    break;
                case 2:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        if (result_atu == true) {
                            dias += 29;
                        } else {
                            dias += 28;
                        }
                    }
                    break;
                case 3:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 31;
                    }
                    break;
                case 4:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 30;
                    }
                    break;
                case 5:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 31;
                    }
                    break;
                case 6:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 30;
                    }
                    break;
                case 7:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 31;
                    }
                    break;
                case 8:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 31;
                    }
                    break;
                case 9:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 30;
                    }
                    break;
                case 10:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 31;
                    }
                    break;
                case 11:
                    if (mes == m_atu) {
                        dias += d_atu;
                    } else {
                        dias += 30;
                    }
                    break;
                case 12:
                    dias += d_atu;
                    break;
            }
        }
        //tira o dia de nascimendo de dias
        dias-= d_nas;
        
       tot_dias = (dias/365);
       //sai 19.0
       qtd_anos = (dias/365);
       qtd_meses =  ((tot_dias - qtd_anos) *12);
       
        System.out.println(tot_dias+"---"+qtd_anos+"---"+qtd_meses);
       /*
       qtd_dias = (qtd_meses 
        //ok ate aqui*/
    }
}
