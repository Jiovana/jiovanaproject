/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lojaeletrodomesticos;

/**
 *
 * @author Jiovana
 */
public class ArCondicionado extends Produto{
    Integer qtdbtu;
    private Boolean painel;

    public Integer getQtdbtu() {
        return qtdbtu;
    }

    public void setQtdbtu(Integer qtdbtu) {
        this.qtdbtu = qtdbtu;
    }

    public Boolean isPainel() {
        return painel;
    }

    public void setPainel(Boolean painel) {
        this.painel = painel;
    }
    @Override
    public Double retornaPreco(){
        if(this.qtdbtu < 9000){
                this.precof = this.preco - 200;
        }else{
            this.precof = this.preco;
        }
        return this.precof;
    }
    @Override
    public String retornaInformacoes(){
        String retorno = "";
        if(this.isDisponivel()==true){
            retorno = super.retornaInformacoes() +" - " +this.qtdbtu +" BTUs - Painel Eletrônico: " +this.painel;
        }else if(this.isDisponivel()==false){
            retorno = this.getDescricao() +": PRODUTO INDISPONÍVEL";
        }  
        return retorno;
    }
}
