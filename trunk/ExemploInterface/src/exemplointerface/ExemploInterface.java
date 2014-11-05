/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplointerface;

/**
 *
 * @author Aluno
 */
public class ExemploInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Novela novela = new Novela();
        
        novela.setAutor("Manoel Carlos");
        Emissora emi = new Emissora();
        emi.setNome("Globo");
        emi.setEndereco("Rua projac");
        emi.setTipo(true);
        
        novela.setEmissora(emi);
        System.out.println(novela.getEmissora().getEndereco());
        
    }
    
}
