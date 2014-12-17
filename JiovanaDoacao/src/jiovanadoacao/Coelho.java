/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jiovanadoacao;

/**
 *
 * @author Jiovana
 */
public class Coelho extends Animal {
    private String pelo;

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    
    @Override
    public String retornarInformacao(){
        String retorno ="";
        
        retorno = super.retornarInformacao() +" / " +this.pelo;
       
        return retorno;
    }
}
