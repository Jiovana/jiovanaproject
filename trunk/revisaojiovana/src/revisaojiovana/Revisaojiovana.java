/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisaojiovana;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Revisaojiovana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Professor p = new Professor();
        String aux;
        
        
        p.setNome(JOptionPane.showInputDialog("Informe o nome do professor: "));
        p.setEndereço(JOptionPane.showInputDialog("Informe o endereço do professor: "));
        p.setEscola(JOptionPane.showInputDialog("Informe a escola onde trabalha o professor: "));
        p.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do professor: ")));
        aux = JOptionPane.showInputDialog("O professor dá aulas em nivel tecnico? S/N ");
        if (aux.equals("S")){
            p.setAulaTecnico(true);
        }else {
            p.setAulaTecnico(false);
        }
        aux = JOptionPane.showInputDialog("O professor dá aulas em nivel superior? S/N ");
        if (aux.equals("S")){
            p.setAulaSuperior(true);
        }else {
            p.setAulaSuperior(false);
        }
        JOptionPane.showMessageDialog(null," Dados: \nNome: " +p.getNome() +"\nEndereço: " +p.getEndereço() +"\nEscola: " +p.getEscola()
                                     +"\nSalario: " +p.getSalario() +"\nLeciona Técnico: " +p.isAulaTecnico() +"\nLeciona Superior: " +p.isAulaSuperior());
    }
    
}
