/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisaojiovana;

/**
 *
 * @author Aluno
 */
public class Professor {
    private String nome, endereço,escola;
    private Double salario;
    private Boolean aulaTecnico, aulaSuperior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean isAulaTecnico() {
        return aulaTecnico;
    }

    public void setAulaTecnico(Boolean aulaTecnico) {
        this.aulaTecnico = aulaTecnico;
    }

    public Boolean isAulaSuperior() {
        return aulaSuperior;
    }

    public void setAulaSuperior(Boolean aulaSuperior) {
        this.aulaSuperior = aulaSuperior;
    }
    
    
    
}
