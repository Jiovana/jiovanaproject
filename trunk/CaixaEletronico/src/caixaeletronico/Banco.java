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
public class Banco {
    private String nome;
    private String numero;
    private Boolean emprestimoimovel = null;
    private Boolean emprestimocarro = null;
    private String aux = " ";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean isEmprestimoimovel() {
        return emprestimoimovel;
    }

    public void setEmprestimoimovel(Boolean emprestimoimovel) {
        this.emprestimoimovel = emprestimoimovel;
    }

    public Boolean isEmprestimocarro() {
        return emprestimocarro;
    }

    public void setEmprestimocarro(Boolean emprestimocarro) {
        this.emprestimocarro = emprestimocarro;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    
    }
    
    
    
    
    

