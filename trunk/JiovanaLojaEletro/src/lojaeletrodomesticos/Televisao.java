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
public class Televisao extends Produto{
    private Integer qtdvga;
    private Integer qtdhdmi;
    private String tela;

    public Integer getQtdvga() {
        return qtdvga;
    }

    public void setQtdvga(Integer qtdvga) {
        this.qtdvga = qtdvga;
    }

    public Integer getQtdhdmi() {
        return qtdhdmi;
    }

    public void setQtdhdmi(Integer qtdhdmi) {
        this.qtdhdmi = qtdhdmi;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }
    @Override
    public Double retornaPreco(){
        if(this.tela.equalsIgnoreCase("plasma")){
           this.precof = this.preco - (this.preco*0.5) ; 
        }else{
            this.precof = this.preco;
        }
        return this.precof;
    }
    @Override
    public String retornaInformacoes(){
        String retorno = "";
        if(this.isDisponivel()==true){
            retorno = super.retornaInformacoes() +" - " +this.qtdhdmi +" HDMI / " +this.qtdvga +" VGA - " +this.tela;
        }else if(this.isDisponivel()==false){
            retorno = this.getDescricao() +": PRODUTO INDISPONÍVEL";
        } 
        return retorno;
    }
    
}
