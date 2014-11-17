/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herança;

/**
 *
 * @author Jiovana
 */
public class GerenciadordeArquivo {
    private String sistemaoperacional;

    public String getSistemaoperacional() {
        return sistemaoperacional;
    }

    public void setSistemaoperacional(String sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }
    public String visualizarArquivo (Arquivo olha){
        String retorno;
        retorno = this.sistemaoperacional +"Arquivo: " +olha.retornaInformacoes();
        return retorno;
    }
    
}
