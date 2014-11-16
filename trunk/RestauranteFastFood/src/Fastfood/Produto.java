/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fastfood;

import java.util.List;

/**
 *
 * @author Jiovana
 */
public class Produto {
    private String nome;
    private Double preco;
    private Integer codigo;
    private List<Bebida> bebida;
    private List<Hamburguer> hamburguer;
    private List<Fritas> fritas;
    private List<Oferta> oferta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<Bebida> getBebida() {
        return bebida;
    }

    public void setBebida(List<Bebida> bebida) {
        this.bebida = bebida;
    }

    public List<Hamburguer> getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(List<Hamburguer> hamburguer) {
        this.hamburguer = hamburguer;
    }

    public List<Fritas> getFritas() {
        return fritas;
    }

    public void setFritas(List<Fritas> fritas) {
        this.fritas = fritas;
    }

    public List<Oferta> getOferta() {
        return oferta;
    }

    public void setOferta(List<Oferta> oferta) {
        this.oferta = oferta;
    }
    
    public String descricaoCardapio(){
        String retorno ;
        retorno = this.nome +", " +this.preco + " - " +this.codigo;
        return retorno; 
    }
    
}
