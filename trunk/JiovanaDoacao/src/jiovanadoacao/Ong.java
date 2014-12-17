/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jiovanadoacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jiovana
 */
public class Ong extends Animal {
    private String nome;
    private String telefone;
    private String endereco;
    List<Animal> lista;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Animal> getLista() {
        return lista;
    }

    public void setLista(List<Animal> lista) {
        this.lista = lista;
    }
    public Ong(){
        lista=new ArrayList<Animal>();
    }
    /*public String custoDoacao(){
        String retorno = "";
        Double aux;
        aux = this.valorVacinas();
        if (this.valorVacinas() == null){
            retorno = "Sem custos";
        }else{
         retorno = aux.toString();
        }
        return retorno;
    }*/
    public String mostraLista(){
        String saida;
       saida = "ONG " +this.nome +", " +this.telefone + " - " +this.endereco +"\nAnimais: \n";
        for (Animal animal : lista) {
            saida = saida + animal.retornarInformacao() +"\n"; 
        }
        return saida;
    }
}
