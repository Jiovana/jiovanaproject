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
public class Arquivovideo extends Arquivo{
    private String duracao;
    private String autor;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String retornaInformacoes(){
        String retorno;
        //super retorna coisas da classe "pai" 
        retorno = super.retornaInformacoes() +" / " +this.duracao +" - " + this.autor;
        return retorno;
    }
}
