/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fastfood;

/**
 *
 * @author Aluno
 */
public class Caixa {
    private String nome;
    private String nascimento;
    private String cpf;
    private String horariotrab;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHorariotrab() {
        return horariotrab;
    }

    public void setHorariotrab(String horariotrab) {
        this.horariotrab = horariotrab;
    }
    
    
    public Double retornaSalario(){
        Double salario = 1200.00;
        return salario;
    }
    
}
