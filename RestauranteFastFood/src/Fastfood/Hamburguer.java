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
public class Hamburguer extends Produto{
    private String nomeh;
    private Double precoh;
    private Integer codigoh;
    private Boolean novoh;

    public String getNomeH() {
        return nomeh;
    }

    public void setNomeH(String nomeh) {
        this.nomeh = nomeh;
    }

    public Double getPrecoH() {
        return precoh;
    }

    public void setPrecoH(Double precoh) {
        this.precoh = precoh;
    }

    public Integer getCodigoH() {
        return codigoh;
    }

    public void setCodigoH(Integer codigoh) {
        this.codigoh = codigoh;
    }

    public Boolean isNovoH() {
        return novoh;
    }

    public void setNovoH(Boolean novoh) {
        this.novoh = novoh;
    }
    public String descricaoCardapioH(){
        String retorna;
        retorna = super.CadastraCardapio() +", " +this.novoh;
        return retorna;
    }
    
}
