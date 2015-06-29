/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;



/**
 *
 * @author Juscelino
 */
public class JogoTodo {
    private Jogador jogador;
    private Integer pular;
    private Integer cartas;
    private Integer placas;
    private Integer  ganhos;
    private Ranking ranking;

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }
    public Date getRankingdata(){
    Date data = new Date();
    this.ranking.setData(data);
    return this.ranking.getData();
    
    }
    public JogoTodo(){
        
        this.jogador = null;
        this.cartas = 0;
        this.ganhos = 0;
        this.placas = 0;
        this.pular = 0;
        this.ranking = null;
        
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Integer getPular() {
        return pular;
    }

    public void setPular(Integer pular) {
        this.pular = pular;
    }

    public Integer getCartas() {
        return cartas;
    }

    public void setCartas(Integer cartas) {
        this.cartas = cartas;
    }

    public Integer getPlacas() {
        return placas;
    }

    public void setPlacas(Integer placas) {
        this.placas = placas;
    }

    public Integer getGanhos() {
        return ganhos;
    }

    public void setGanhos(Integer ganhos) {
        this.ganhos = ganhos;
    }
    
    
}
