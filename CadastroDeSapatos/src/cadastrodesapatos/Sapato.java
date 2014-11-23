/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrodesapatos;

/**
 *
 * @author Jiovana
 */
public class Sapato {
    
    private String modelo;
    private Integer numero;
    private String cor;
    private Boolean preferido;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(Boolean preferido) {
        this.preferido = preferido;
    }
    
    public String retornaInformacoes (){
        String retorno = "";
        if(preferido==false){
            retorno = this.modelo + ": " + this.cor +", " +this.numero;
        }else if(preferido==true){
            retorno = "PREFERIDO!! " +this.modelo + ": " + this.cor +", " +this.numero;
        }
        return retorno;
    }
    
}
