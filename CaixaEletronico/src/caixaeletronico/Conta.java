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
public class Conta {
    /*
    private = protegido, só a classe ve
    public = todos ver
    */
    private String Agencia, NumeroConta, NomeCorrentista;
    private Double Saldo;
    private Boolean Ativo;
    
    public Conta(){
        Saldo =  15.78;
        Agencia = "000124";
        Ativo = true;
        
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public String getNomeCorrentista() {
        return NomeCorrentista;
    }

    public void setNomeCorrentista(String NomeCorrentista) {
        this.NomeCorrentista = NomeCorrentista;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public Boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(Boolean Ativo) {
        this.Ativo = Ativo;
    }
    
    
    public void AbrirConta (String vag, String vconta, String vcorrentista){
        Agencia = vag;
        NumeroConta = vconta;
        NomeCorrentista = vcorrentista;
        Saldo = 0.0;
        Ativo = true;
    }
    public Boolean Sacar (Double valor){
        Boolean retorno = null;
        if(Ativo = true){
            if(valor<=Saldo){
                Saldo = Saldo - valor;
                retorno = true;
            }else {
                retorno = false;
            }
        }else { 
            retorno = false;
        }
        return retorno;
    }
    public Boolean Depositar (Double valor){
        Boolean retorno = null;
        if (Ativo = true){
            Saldo = Saldo + valor;
            retorno = true;
        }else{
        retorno = false;
        }
    
        return retorno;
    }
    public void fecharConta(Boolean valor){
        
        Ativo = valor;
    }
    public Double retornoSaldo(){
        return Saldo;
    }



}


