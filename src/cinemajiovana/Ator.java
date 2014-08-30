/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemajiovana;

/**
 *
 * @author Jiovana
 */
public class Ator {
    private String nome;
    private String nascimento;
    private Double cache;
    private String nacionalidade;
    private Boolean vencedoroscar = null;
    private String auxoscar;
    private Integer totalfilmes;
    private String filmesultimoano;
    private Integer numbermovielastyear;
    
            
    
    public void atribuirNomeAtor(String valor){
        nome = valor;
    }
    public String retornarNomeAtor( ){
        return nome;
    }
    public void atribuirNascimento(String valor){
        nascimento = valor;
    }
    public String retornarNascimento(){
        return nascimento;
    }
    public void  atribuirCache(Double valor){
        cache = valor;
    }
    public Double retornarCache(){
        return cache;
    }
    public void atribuirNacionalidade(String valor){
        nacionalidade = valor;
    }
    public String retornarNacionalidade(){
        return nacionalidade;
    }
    public void atribuirVencedorOscar(String valor){
       auxoscar = valor;
        switch (auxoscar) {
            case "S":
                vencedoroscar = true;
                break;
            case "N":
                vencedoroscar = false;
                break;
        }
    }
    public Boolean retornarVencedorOscar(){
        return vencedoroscar;
    }
    public void atribuirTotalFilmes(Integer valor){
        totalfilmes = valor;
    } 
    public Integer retornarTotalFilmes(){
        return totalfilmes;
    }
    public void atribuirFilmesUltimoAno(String valor, Integer numero){
        filmesultimoano= valor;
        numbermovielastyear = numero;
    }
    public String retornarFilmesUltimoAno(){
        return filmesultimoano;    
    }
    public Double retornarGanhos(){
        Double total;
        total = cache * numbermovielastyear;
        return total;
    }
}
