/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JiovanaGProjectBooks;

/**
 *
 * @author Aluno
 */
public class Autor {
    private String nome, sobrenome, nascimento;
    private Integer qtdlivros;

    public Autor(){
        nome = null;
        sobrenome = null;
        nascimento = null;
        qtdlivros=0;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getQtdlivros() {
        return qtdlivros;
    }

    public void setQtdlivros(Integer qtdlivros) {
        this.qtdlivros = qtdlivros;
    }
    public String getInformacoes(){
        String coisa = " ";
        coisa = nome +" " +sobrenome +", " +qtdlivros +" livros publicados.";
        return coisa;
    }
}
