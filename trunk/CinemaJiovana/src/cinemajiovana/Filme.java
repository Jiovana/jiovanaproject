/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemajiovana;

/**
 *
 * @author Aluno
 */
public class Filme {
    String nome;
    Integer duracao;
    Integer classificacao;
    String genero;
    String atores;
    
    void atribuirNome(String valor){
        nome = valor;
    }
    String retornarNome(){
        return nome;
    }
   void atribuirDuracao(Integer valor){
       duracao = valor;
   }
   Integer retornarDuracao(){
       return duracao; 
   }
   void atribuirClassificacao(Integer valor){
       classificacao = valor;
   }
   Integer retornarClassificacao(){
       return classificacao;
   }
   void atribuirGenero(String valor){
       genero = valor;
   }
   String retornarGenero(){
       return genero;
   }
   void atribuirAtores(String valor){
       atores = valor;
   }
}
