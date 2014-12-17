/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jiovanadoacao;

/**
 *
 * @author Jiovana
 */
public class Animal {
    private String raca;
    private Boolean raiva;
    private String data;
    private Boolean adotado;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Boolean isRaiva() {
        return raiva;
    }

    public void setRaiva(Boolean raiva) {
        this.raiva = raiva;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(Boolean adotado) {
        this.adotado = adotado;
    }
    
    public String retornarInformacao(){
        String retorno = "";
        if (adotado==false){
            retorno = this.raca +": Vacina p/ raiva- " +this.raiva +" - " +this.data +" Custo: " +valorVacinas();
        }else if(adotado==true){
            retorno = this.raca +": Vacina p/ raiva- " +this.raiva +" - " +this.data +" Custo: " +valorVacinas() +" -> ADOTADO";
        }
        return retorno;
    }
    public Double valorVacinas(){
       Double retorno = 0.0;
            if(this.raiva == false)
                retorno = 25.00;
            else if(this.raiva == true){
                retorno = 0.0;
            }
        
        return retorno;
    }
    
}
