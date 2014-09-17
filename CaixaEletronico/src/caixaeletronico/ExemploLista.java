/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ExemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /*List<String> alunos = new ArrayList<String>();
            alunos.add("Jiovana");
            alunos.add("Rafael");
            alunos.add("Adriel");
            alunos.add("Thayna");
            alunos.add("Jean");
            alunos.add("Isabela");
            alunos.remove(1);
            /*for (int i = 0; i < alunos.size(); i++) {//size retorna n elementos da lista
                System.out.println(alunos.get(i));
            *
            for (String al : alunos) {
                System.out.println(al);
            }
            }*/
        /*List<Conta> contas = new ArrayList<Conta>();
        Conta acc = new Conta();
        acc.AbrirConta("1235413","12352" ,"Eu");
        //adiociona
        contas.add(acc);
        acc = new Conta();
        acc.AbrirConta("563673", "637843", "VocÊ");
        //adiciona
        contas.add(acc);
        acc = new Conta();
        acc.AbrirConta("7347237", "65415", "E o zooboomafoo");
        contas.add(acc);
        for (Conta conta : contas) {
            System.out.println(conta.getNomeCorrentista());  
        }
        List<Cliente> correntista = new ArrayList<Cliente>();
        Cliente c = new Cliente();
        c.setNome("Pézio");
        c.setCpf("1074519571");
        c.setNascimento("05/08/1988");
        correntista.add(c);
        
        c = new Cliente();
        c.setNome("Madelaine");
        c.setCpf("13480561");
        c.setNascimento("27/09/1987");
        correntista.add(c);
        
        c = new Cliente();
        c.setNome("Kuroko");
        c.setCpf("917536512");
        c.setNascimento("05/08/1996");
        correntista.add(c);
        
        for (Cliente cliente : correntista) {
            System.out.println(cliente.getNome() +" \t " + cliente.getCpf() +" \t " + cliente.getNascimento());
            
        }*/
        List<Banco> banquinho = new ArrayList<Banco>();
        Banco bb = new Banco();
        bb.setNome("Itau");
        bb.setNumero("03");
        banquinho.add(bb);
        
        bb = new Banco();
        bb.setNome("Bradesco");
        bb.setNumero("02");
        banquinho.add(bb);
        
        for (Banco banco : banquinho) {
            System.out.println(banco.getNome()+": "+banco.getNumero());
        }
    } 
}
    

