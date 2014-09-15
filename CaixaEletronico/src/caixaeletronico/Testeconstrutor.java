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
public class Testeconstrutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta c = new Conta();
        System.out.println("saldo: " +c.retornoSaldo());
        System.out.println("agencia: " +c.getAgencia());
        System.out.println("ativa: " +c.isAtivo());
    }
    
}
