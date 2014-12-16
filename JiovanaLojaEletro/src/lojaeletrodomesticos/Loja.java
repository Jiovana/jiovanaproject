/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lojaeletrodomesticos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jiovana
 */
public class Loja {
    private String nome;
    List<Produto> lista;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }
    public Loja(){
    lista = new ArrayList<Produto>();
    }
    
    public String mostraLoja(){
      String saida;
      saida = "Loja: " +this.nome  +"\nProdutos: \n";
        for (Produto produto : lista) {
           saida = saida +produto.retornaInformacoes() +"\n";
        }
      return saida;
        
    }
}
