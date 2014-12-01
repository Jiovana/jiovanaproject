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
public class Bota extends Sapato{
    
    private String tiposolado;
    private Integer alturacano;

    public String getTiposolado() {
        return tiposolado;
    }

    public void setTiposolado(String tiposolado) {
        this.tiposolado = tiposolado;
    }

    public Integer getAlturacano() {
        return alturacano;
    }

    public void setAlturacano(Integer alturacano) {
        this.alturacano = alturacano;
    }
    @Override
    public String retornaInformacoes(){
        String retorno;
        retorno = super.retornaInformacoes() +", Solado: " +this.tiposolado +", Altura do Cano: " +this.alturacano;
        return retorno;
    }
    
}
