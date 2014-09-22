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
public class Informacoeslivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro l = new Livro();
        String auxx;
        
        l.setTitulo(JOptionPane.showInputDialog("Informe o título do livro: "));
        l.setAutor(JOptionPane.showInputDialog("Informe o autor do livro: "));
        l.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publicação do livro: ")));
        l.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do livro: ")));
        l.setTiragem(Integer.parseInt(JOptionPane.showInputDialog("Informe a tiragem inicial do livro: ")));
        l.setNvendido(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de exemplares vendidos: ")));
        auxx=JOptionPane.showInputDialog("O livro é importado? S/N: ");
        if(auxx.equals("S")){
            l.setImportado(true);
        }else{
            l.setImportado(false);
        }
        
        JOptionPane.showMessageDialog(null,"Informações sobre o livro:\nTÍtulo: " +l.getTitulo() +"\nAutor: " +l.getAutor() 
                                    +"\nAno de publicação: " +l.getAno() +"\nPreço: " +l.getPreco() +"\nTiragem Inicial: " 
                                    +l.getTiragem() +"\nLivro Importado: " +l.isImportado() +"\nNº Exemplares Vendidos :"
                                    +l.getNvendido() +"\nNível de Sucesso: " +l.getSucesso() +"\nValor rendido: " +l.getValortotal()
                                    +"\nGanhos do autor: " +l.getGanhoautor());
    }
    
}
