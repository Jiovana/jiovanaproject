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
public class Bebida extends Produto {
    private String nomeb;
    private Double precob;
    private Integer codigob;
    private Double quantidadeb;
    private String unidademedidab;

    public String getNomeB() {
        return nomeb;
    }

    public void setNomeB(String nome) {
        this.nomeb = nome;
    }

    public Double getPrecoB() {
        return precob;
    }

    public void setPrecoB(Double preco) {
        this.precob = preco;
    }

    public Integer getCodigoB() {
        return codigob;
    }

    public void setCodigoB(Integer codigo) {
        this.codigob = codigo;
    }

    public Double getQuantidadeB() {
        return quantidadeb;
    }

    public void setQuantidadeB(Double quantidade) {
        this.quantidadeb = quantidade;
    }

    public String getUnidademedidaB() {
        return unidademedidab;
    }

    public void setUnidademedidB (String unidademedida) {
        this.unidademedidab = unidademedida;
    }
    
    public String descricaoCardapioB (){
        String retorno;
        retorno = super.CadastraCardapio() +", " +this.quantidadeb + " " +this.unidademedidab;
        return retorno;
    }
    
}
