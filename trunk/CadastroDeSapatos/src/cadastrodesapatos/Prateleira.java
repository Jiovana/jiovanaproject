/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrodesapatos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jiovana
 */
public class Prateleira {
    private String nomedaprateleira;
    private List<Sapato> lista;

    public String getNomedaprateleira() {
        return nomedaprateleira;
    }

    public void setNomedaprateleira(String nomedaprateleira) {
        this.nomedaprateleira = nomedaprateleira;
    }

    public List<Sapato> getLista() {
        return lista;
    }

    public void setLista(List<Sapato> lista) {
        this.lista = lista;
    }
    public Prateleira(){
        lista = new ArrayList<Sapato>();
    }
    public String mostrarPrateleira(){
        String saida = "";
        if(this.nomedaprateleira.equalsIgnoreCase("A")){
            for (Sapato sapato : lista) {
                saida = saida +sapato.retornaInformacoes()+ "\n";
            }
        }else if(this.nomedaprateleira.equalsIgnoreCase("B")){
            for (Sapato sapato : lista) {
                saida = saida +sapato.retornaInformacoes()+ "\n";
            }
        }else if(this.nomedaprateleira.equalsIgnoreCase("C")){
            for (Sapato sapato : lista) {
                saida = saida +sapato.retornaInformacoes()+ "\n";
            }
        }
        return saida;
    }
    
}
