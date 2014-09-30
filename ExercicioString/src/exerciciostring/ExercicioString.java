/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciostring;

import javax.swing.JOptionPane;
/**
 *
 * @author Jiovana
 */
public class ExercicioString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String escalacao = "      Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L. Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk    ";


        JOptionPane.showMessageDialog(null, "Tamanho da String: " +escalacao.length() +"\nSem espaços: " +escalacao.trim() +"\nSubstituição: " +escalacao.replace("Fred", "Jô") );
        
        if(escalacao.contains("Ronaldinho")==true){
            JOptionPane.showMessageDialog(null,"Ronaldinho está presente");
        }else if(escalacao.contains("Ronaldinho")==false){
            JOptionPane.showMessageDialog(null,"Ronaldinho não está presente");
        }
        
        String[] array = escalacao.split(",");
        for(int cont = 0; cont == 10; cont++){
            System.out.println("Nº " +cont +": " +array[cont]);
            JOptionPane.showMessageDialog(null,"Nº " +cont +": " +array[cont] );
        }
    }
    
}
