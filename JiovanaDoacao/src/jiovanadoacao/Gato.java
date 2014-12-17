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
public class Gato extends Animal {
    private Boolean toquisoplasmose;
    private String temperamento;

    public Boolean isToquisoplasmose() {
        return toquisoplasmose;
    }

    public void setToquisoplasmose(Boolean toquisoplasmose) {
        this.toquisoplasmose = toquisoplasmose;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
    
    @Override
    public String retornarInformacao(){
        String retorno = "";
          retorno = super.retornarInformacao() +" / Temperamento " +this.temperamento;
        
        return retorno;
    }
    
    @Override
    public Double valorVacinas(){
        Double retorno= 0.0;
        if(this.isRaiva() == false){
            retorno =  25.00;
        }else if(this.isRaiva() == false && this.toquisoplasmose == false){
            retorno = 45.00;
        }else if(this.toquisoplasmose==false){
            retorno =  20.00;
        }else if(this.isRaiva() == true || this.toquisoplasmose == true){
                retorno = 0.0;
            }
        return retorno;
    }      
}

