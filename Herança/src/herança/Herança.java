/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herança;

/**
 *
 * @author Jiovana
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arquivovideo arquivoV = new Arquivovideo();
        
        arquivoV.setNome("Videosom");
        arquivoV.setTipo(".mp4");
        arquivoV.setTamanho("100MB");
        arquivoV.setDuracao("30 min");
        arquivoV.setAutor("Mathews");
        
        System.out.println(arquivoV.retornaInformaToda());
    }
    
}
