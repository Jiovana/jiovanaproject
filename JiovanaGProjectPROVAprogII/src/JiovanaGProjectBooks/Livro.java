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
public class Livro {
    private String titulo, autor;
    private Integer ano, tiragem, nvendido;
    private Double preco, auxiliar;
    private Boolean importado;
    
    public Livro(){
        titulo = null;
        autor = null;
        ano = 0;
        tiragem = 0;
        nvendido = 0;
        preco = 0.0;
        importado = null;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getTiragem() {
        return tiragem;
    }

    public void setTiragem(Integer tiragem) {
        this.tiragem = tiragem;
    }

    public Integer getNvendido() {
        return nvendido;
    }

    public void setNvendido(Integer nvendido) {
        this.nvendido = nvendido;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean isImportado() {
        return importado;
    }

    public void setImportado(Boolean importado) {
        this.importado = importado;
    }
    public String getSucesso(){
        String aux =" ";
        if(nvendido<=20000){
            aux = "Fracasso";
        }else if(nvendido > 20000 && nvendido <= 40000){
            aux = "Regular";
        }else if(nvendido > 40000){
            aux = "Sucesso";
        }
        return aux;
    }
    public Double getValortotal(){
        Double total = 0.0;
        total = (preco*nvendido);
        auxiliar=total;
        return total;
    }
    public Double getGanhoautor(){
        Double ganhos = 0.0;
        if(importado==true){
            ganhos=(auxiliar*0.2);
        }else if(importado==false){
            ganhos=(auxiliar*0.3);
        }
        return ganhos;
    }
}
