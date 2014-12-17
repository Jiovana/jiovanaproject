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
public class Cachorro extends Animal{
    private Boolean paravirose;
    private String porte;

    public Boolean isParavirose() {
        return paravirose;
    }

    public void setParavirose(Boolean paravirose) {
        this.paravirose = paravirose;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    @Override
    public String retornarInformacao(){
        String retorno ="";
        
        retorno = super.retornarInformacao() +" / " +this.porte;
       
        return retorno;
    }
    
    
    @Override
    public Double valorVacinas(){
        Double retorno = 0.0;
        if(this.paravirose == false && this.isRaiva() == false){
            retorno = 65.00;
        }else if( this.isRaiva() == false ){
            retorno = 25.00;
        }else if(this.paravirose==false){
            retorno = 40.00;
        }else if (this.isRaiva() == true || this.paravirose == true){
                retorno = 0.0;
            }
        return retorno;
    }
}
