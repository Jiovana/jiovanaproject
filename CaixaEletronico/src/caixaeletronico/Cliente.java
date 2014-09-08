/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    private String cpf;
    private String nome;
    private String nascimento;
    private String endereço;
    private Boolean negativadoSPC;
    private Boolean negativadoSerasa;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public void setNegativadoSPC(Boolean negativadoSPC) {
        this.negativadoSPC = negativadoSPC;
    }
    
    public void setNegativadoSerasa(Boolean negativadoSerasa) {
        this.negativadoSerasa = negativadoSerasa;
    }
    public String verificaPendencias(){
        String aux = " ";
        if(negativadoSPC == true){
            aux =  "Negativado SPC";
        }else if(negativadoSerasa == true){
            aux = "Negativado SERASA";
        }else if(negativadoSPC == true && negativadoSerasa == true){
            aux = "Negativado SPC e SERASA";
        }else{
            aux = "Cliente não está negativado.";
        }
    return aux;
    }
    
    






}
