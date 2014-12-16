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
public class Produto {
    private String descricao;
    private String marca;
     Double preco, precof;
    private Boolean disponivel;

    public Double getPrecof() {
        return precof;
    }

    public void setPrecof(Double precof) {
        this.precof = precof;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
    /*public Double retornaPreco(ArCondicionado ar, Televisao tv){
        if(this.descricao.equalsIgnoreCase("Ar Condicionado")){
            if(ar.qtdbtu < 9000){
                precof = preco - 200;
            }
        }else if(this.descricao.equalsIgnoreCase("Televisão")){
            if(tv.tela.equalsIgnoreCase("plasma")){
                precof = preco - (preco* 0.5);
            }
        }else {
            precof = preco;
        }
        return precof;
    }*/
    public Double retornaPreco(){
        precof = preco;
        return precof;
    }
    public String retornaInformacoes(){
        String retorno = "";
        if(this.disponivel==true){
            retorno = this.descricao + ": " + this.marca +", " +retornaPreco();
        }else if(this.disponivel==false){
            retorno = this.descricao +": PRODUTO INDISPONÍVEL";
        }
        return retorno; 
    }
    
}
