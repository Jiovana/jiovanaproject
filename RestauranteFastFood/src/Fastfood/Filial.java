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
 * @author Aluno
 */
public class Filial {
    private String cidade;
    private Gerente gerente;
    private Double precomedio;
    private Integer qtdcomida;
    private List<Caixa> caixas;
    private List<Cozinheiro> cozinheiros;
    
    public Filial(){
        cidade = null;
        precomedio = null;
        qtdcomida = null;
        gerente = null;
        caixas = new ArrayList<Caixa>();
        cozinheiros = new ArrayList<Cozinheiro>();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Double getPrecomedio() {
        return precomedio;
    }

    public void setPrecomedio(Double precomedio) {
        this.precomedio = precomedio;
    }

    public Integer getQtdcomida() {
        return qtdcomida;
    }

    public void setQtdcomida(Integer qtdcomida) {
        this.qtdcomida = qtdcomida;
    }

    public List<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(List<Caixa> caixas) {
        this.caixas = caixas;
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(List<Cozinheiro> cozinheiros) {
        this.cozinheiros = cozinheiros;
    }

   
    
    
    public Double faturamentoMedio (){
        double total = 0.0;
        total = qtdcomida*precomedio;
        return total;
    }
}
