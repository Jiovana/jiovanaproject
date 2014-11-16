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
public class Oferta extends Produto {
    private String nomeo;
    private Double precoo;
    private Integer codigoo;
    private Hamburguer hamburgero;
    private Bebida bebidao;
    private Fritas fritaso;

    public String getNomeo() {
        return nomeo;
    }

    public void setNomeo(String nomeo) {
        this.nomeo = nomeo;
    }

    public Double getPrecoo() {
        return precoo;
    }

    public void setPrecoo(Double precoo) {
        this.precoo = precoo;
    }

    public Integer getCodigoo() {
        return codigoo;
    }

    public void setCodigoo(Integer codigoo) {
        this.codigoo = codigoo;
    }

    public Hamburguer getHamburgerO() {
        return hamburgero;
    }

    public void setHamburgerO(Hamburguer hamburger) {
        this.hamburgero = hamburger;
    }

    public Bebida getBebidaO() {
        return bebidao;
    }

    public void setBebidaO(Bebida bebida) {
        this.bebidao = bebida;
    }

    public Fritas getFritasO() {
        return fritaso;
    }

    public void setFritasO(Fritas fritas) {
        this.fritaso = fritas;
    }
    
    public Double valorEconomia(){
       Double total = 0.0;
       //total = valor das coisas normal - valor com oferta
       return total;
    }
    public String descricaoCardapioO(){
        String retorno;
        retorno = this.descricaoCardapio() +": " +this.hamburgero.getNomeH() +", " +this.fritaso.getNomeF() +" "
                +this.fritaso.getTamanhoF() +", " +this.bebidao.getNomeB() +this.bebidao.getQuantidadeB() +" "
                +this.bebidao.getUnidademedidaB();
        return retorno;
    }
}
