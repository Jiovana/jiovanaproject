/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JiovanaGProjectBooks;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Informacoesautor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autor a = new Autor();
        
        a.setNome(JOptionPane.showInputDialog("Informe o nome do autor: "));
        a.setSobrenome(JOptionPane.showInputDialog("Informe o sobrenome do autor: "));
        a.setNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do autor: "));
        a.setQtdlivros(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros publicados pelo autor: ")));
        
        JOptionPane.showMessageDialog(null, "Informações sobre o autor: \n " +a.getInformacoes() +"\n " +a.getNascimento());
    }
    
}
