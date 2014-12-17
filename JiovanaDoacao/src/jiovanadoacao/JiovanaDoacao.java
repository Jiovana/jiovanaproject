/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jiovanadoacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Jiovana
 */
public class JiovanaDoacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String aux;
        Animal a1 = new Animal();
        a1.setRaca(JOptionPane.showInputDialog("Informe a raça do animal: "));
        aux=(JOptionPane.showInputDialog("Informe se o animal é vacinado contra raiva: S/N "));
        if(aux.equals("S")){ 
          a1.setRaiva(true);
        }else{
            a1.setRaiva(false);
        }
        a1.setData("20/09/2014");
        a1.setAdotado(true);
        
        Cachorro c1 = new Cachorro();
        c1.setRaca(JOptionPane.showInputDialog("Informe a raça do cachorro: "));
        aux=(JOptionPane.showInputDialog("Informe se o cachorro é vacinado contra raiva: S/N "));
        if(aux.equals("S")){ 
          c1.setRaiva(true);
        }else{
            c1.setRaiva(false);
        }
        c1.setParavirose(false);
        c1.setData("14/05/2014");
        c1.setAdotado(false);
        c1.setPorte("Grande");
        
        Gato g1 = new Gato();
        g1.setRaca(JOptionPane.showInputDialog("Informe a raça do gato: "));
        aux=(JOptionPane.showInputDialog("Informe se o gato é vacinado contra raiva: S/N "));
        if(aux.equals("S")){ 
          g1.setRaiva(true);
        }else{
            g1.setRaiva(false);
        }
        g1.setToquisoplasmose(false);
        g1.setData("21/10/2014");
        g1.setAdotado(true);
        g1.setTemperamento("Agitado");
        
        Coelho co1 = new Coelho();
        co1.setRaca(JOptionPane.showInputDialog("Informe a raça do coelho: "));
        aux=(JOptionPane.showInputDialog("Informe se o coelho é vacinado contra raiva: S/N "));
        if(aux.equals("S")){ 
          co1.setRaiva(true);
        }else{
            co1.setRaiva(false);
        }
        co1.setData("17/03/2014");
        co1.setPelo("Ralo");
        co1.setAdotado(false);
        
        Ong o1 = new Ong();
        o1.setNome("AdotePET");
        o1.setTelefone("33124619");
        o1.setEndereco("Rua dos Animais Sem Dono, 19");
        o1.lista.add(a1);
        o1.lista.add(c1);
        o1.lista.add(g1);
        o1.lista.add(co1);
        
        JOptionPane.showMessageDialog(null, o1.mostraLista());
    }
}
    