/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelprincipal;

/**
 *
 * @author Jiovana
 */
public class Hotel {
    private String nome;
    private String localizacao;
    private Double valordiaria;
    private Integer telefone;
    private Integer anofundacao;
    
    private Integer dias;
    private Double aux;
    
    public void atribuirNome(String valor){
        nome = valor;
    }
    public String retornarNome(){
        return nome;
    }
    public void atribuirLocalizacao(String valor){
        localizacao = valor;
    }
    public String retornarLocalizacao(){
        return localizacao;    
    }
    public void atribuirDiaria(Double valor){
        valordiaria = valor;
    }
    public Double retornarDiaria(){
        return valordiaria;
    }
    public void atribuirTelefone(Integer valor){
        telefone = valor;
    }
    public Integer retornarTelefone(){
        return telefone;
    }
    public void atribuirFuncacao(Integer valor){
        anofundacao = valor;
    }
    public Integer retornarFundacao(){
        return anofundacao;
    }
    public void atribuirDias (Integer valor){
        dias = valor;
    }
    public Double retornarPacotes (){
        Double total = 0.0;
        Double retorno = 0.0;
        if (dias <= 6){
            total = valordiaria * dias;
            retorno = total;
        }else if( dias >= 7 && dias <= 10){
            total = valordiaria * dias;
            total = total-(total*0.1);
            retorno = total;
        }else if (dias > 10){
            total = valordiaria * dias;
            total = total-(total*0.3);
            retorno = total;
        }
        aux = retorno;
        return retorno;
        
    }
    public Double retornarDolar(){
        double valordolar = 0.0;
        valordolar = (aux*2.0);
        return valordolar;
    }
    public Double retornarEuro(){
        double valoreuro = 0.0;
        valoreuro = (aux*3.0);
        return valoreuro;
    }
}
