/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelprincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author Jiovana
 */
public class HotelPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel h = new Hotel();
        String name = " ", local = " ";
        Double diaria = 0.0;
        Integer tel = 0, ano = 0, ndias = 0;
        
        name = JOptionPane.showInputDialog(" Digite o nome do hotel: ");
        h.atribuirNome(name);
        local = JOptionPane.showInputDialog(" Digite o endereço do hotel: ");
        h.atribuirLocalizacao(local);
        diaria = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor da diaria do hotel: "));
        h.atribuirDiaria(diaria);
        tel = Integer.parseInt(JOptionPane.showInputDialog(" Digite o telefone do hotel: "));
        h.atribuirTelefone(tel);
        ano = Integer.parseInt(JOptionPane.showInputDialog(" Digite o ano de fundação do hotel: "));
        h.atribuirFuncacao(ano);
        ndias = Integer.parseInt(JOptionPane.showInputDialog(" Digite o numero de dias que passarás no hotel: "));
        h.atribuirDias(ndias);
        
        JOptionPane.showMessageDialog(null,"Informações do hotel:\nNome: " +h.retornarNome() +"\nEndereço: " +h.retornarLocalizacao()
                                     +"\nValor da diária: " +h.retornarDiaria()+"\nTelefone: " +h.retornarTelefone() +"\nAno de fundação: "
                                     +h.retornarFundacao()+"\n Valor do pacote de estadia: " +h.retornarPacotes() +"\nValor em dólares: "
                                     +h.retornarDolar() +"\nValor em euros: " +h.retornarEuro());
        
        
        
    }
    
}
