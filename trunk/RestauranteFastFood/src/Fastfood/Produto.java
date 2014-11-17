/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fastfood;

import java.util.ArrayList;
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
    
    public Produto(){
        nome = null;
        preco = null;
        codigo = null;
        bebida = new ArrayList<Bebida>();
        hamburguer = new ArrayList<Hamburguer>();
        fritas = new ArrayList<Fritas>();
        oferta = new ArrayList<Oferta>();
    }

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
    
    public String CadastraCardapio (){
        /**/
        String retorna;
        retorna = this.nome +", " +this.preco + " - " +this.codigo;
        return retorna;
    }
    public void CadastraListaBebida(Bebida be){
        Bebida b = new Bebida();
        b.setNome(this.nome);
        b.setCodigo(this.codigo);
        b.setPreco(this.preco);
        b.setQuantidadeB(be.getQuantidadeB());
        b.setUnidademedidB(be.getUnidademedidaB());
        bebida.add(b);
    }
    public void CadastraListaHamburguer(Hamburguer ha){
        Hamburguer h = new Hamburguer();
        h.setNome(this.nome);
        h.setPreco(this.preco);
        h.setCodigo(this.codigo);
        h.setNovoH(ha.isNovoH());
        hamburguer.add(h);
    }
    public void CadastraListaFritas(Fritas fr){
        Fritas f = new Fritas();
        f.setNome(this.nome);
        f.setCodigo(this.codigo);
        f.setPreco(this.preco);
        f.setTamanhoF(fr.getTamanhoF());
        fritas.add(f);
    }
    public void CadastraListaOferta(Oferta of){
        Oferta o = new Oferta();
        o.setNome(this.nome);
        o.setCodigo(this.codigo);
        o.setPreco(this.preco);
        //incompleto
    }
    public String descricaoCardapio(String opcao){
        String retorna = "";
        if (opcao.equalsIgnoreCase("B")){
            Bebida b = new Bebida();
            retorna = b.descricaoCardapioB();        
        }else if(opcao.equalsIgnoreCase("H")){
            Hamburguer h = new Hamburguer();
            retorna = h.descricaoCardapioH();
        }else if(opcao.equalsIgnoreCase("F")){
            Fritas f = new Fritas();
            retorna = f.descricaoCardapioF();
        }else if(opcao.equalsIgnoreCase("O")){
            Oferta o = new Oferta();
            retorna = o.descricaoCardapioO();
        }
        return retorna; 
    }
    
}
