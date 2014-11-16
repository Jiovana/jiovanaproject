/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fastfood;

/**
 *
 * @author Jiovana
 */
public class Fritas extends Produto {
    private String nomef;
    private Double precof;
    private Integer codigof;
    private String tamanho;

    public String getNomeF() {
        return nomef;
    }

    public void setNomeF(String nomef) {
        this.nomef = nomef;
    }

    public Double getPrecoF() {
        return precof;
    }

    public void setPrecoF(Double precof) {
        this.precof = precof;
    }

    public Integer getCodigoF() {
        return codigof;
    }

    public void setCodigoF(Integer codigof) {
        this.codigof = codigof;
    }

    public String getTamanhoF() {
        return tamanho;
    }

    public void setTamanhoF(String tamanho) {
        this.tamanho = tamanho;
    }
    public String descricaoCardapioF(){
        String retorno;
        retorno = this.descricaoCardapio() +", " +this.tamanho;
        return retorno;
    }
}
