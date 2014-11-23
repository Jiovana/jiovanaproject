/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrodesapatos;

/**
 *
 * @author Jiovana
 */
public class Salto extends Sapato{
    
    private Integer tamanhosalto;

    public Integer getTamanhosalto() {
        return tamanhosalto;
    }

    public void setTamanhosalto(Integer tamanhosalto) {
        this.tamanhosalto = tamanhosalto;
    }
    
    @Override
    public String retornaInformacoes(){
        String retorno;
        retorno = super.retornaInformacoes() + " Tamanho do Salto: " +this.tamanhosalto;
        return retorno;
    }

}
