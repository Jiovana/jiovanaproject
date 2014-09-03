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
import javax.swing.JOptionPane;
public class CinemaJiovana {

    /**
     * @param args the command line arguments
     */
    public static boolean maioridade (Integer idade){
    Integer faixa = 0;
    Filme id = new Filme();   
    id.atribuirClassificacao(faixa);
    
        if (idade >= faixa){
            return true;
        }
        else if(idade < faixa){
         return false;
        }
        return false;
        
    }
    public static String tipoduracao (Integer durac){
    if (durac <= )
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //JOPTIONPANE
        String nomef = " ";
        Filme f = new Filme();
        Filme dur = new Filme();
        Integer idade, durac = 0;
        
        
        //entrada
        idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe sua idade: "));
        
        
        nomef = JOptionPane.showInputDialog(" Digite o filme: ");
        f.atribuirNome(nomef);
        durac = Integer.parseInt(JOptionPane.showInputDialog(" Informe a duração do filme: "));
        dur.atribuirDuracao(durac);
        
        
        //saida
        JOptionPane.showMessageDialog(null, f.retornarNome());
     //classific = Integer.parseInt("50") converta para inteiro
    
    //classifc = Integer.parseInt(JOption.showImputDialog(""DIgite a classificacao "")
    
    }
    
}
