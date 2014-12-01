/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrodesapatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jiovana
 */
public class Penny extends Sapato{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //prateleira 1
        Sapato s1 = new Sapato();
        s1.setModelo("Tênis Nike");
        s1.setCor("Rosa com Preto");
        s1.setNumero(37);
        s1.setPreferido(false);
        
        Salto st1 = new Salto();
        st1.setModelo("Melissa Confort");
        st1.setCor("Vermelho");
        st1.setNumero(38);
        st1.setTamanhosalto(10);
        st1.setPreferido(true);
        
        Bota b1 = new Bota();
        b1.setModelo("Bota Bottero");
        b1.setCor("Marrom");
        b1.setNumero(38);
        b1.setAlturacano(20);
        b1.setTiposolado("Borracha");
        b1.setPreferido(false);
        
        Sapato s2 = new Sapato();
        s2.setModelo("Sapatilha Moleca");
        s2.setCor("Salmão");
        s2.setNumero(37);
        s2.setPreferido(true);
        
        Sapato s3 = new Sapato();
        s3.setModelo("AllStar Simples");
        s3.setCor("Azul com Roxo");
        s3.setNumero(37);
        s3.setPreferido(true);
        
        //prateleira 2
        Sapato s4 = new Sapato();
        s4.setModelo("Sapatilha TotalConfort");
        s4.setCor("Preto com Brilho Dourado");
        s4.setNumero(37);
        s4.setPreferido(false);
        
        Sapato s5 = new Sapato();
        s5.setModelo("Rasterinha Grendene");
        s5.setCor("Dourado");
        s5.setNumero(38);
        s5.setPreferido(true);
        
        Sapato s6 = new Sapato();
        s6.setModelo("Havaianas");
        s6.setCor("Rosa, Marrom e Verde");
        s6.setNumero(38);
        s6.setPreferido(true);
        
        Salto st2 = new Salto();
        st2.setModelo("Sandália ChicMode");
        st2.setCor("Branco com Prateado");
        st2.setNumero(38);
        st2.setTamanhosalto(5);
        st2.setPreferido(false);
        
        Bota b2 = new Bota();
        b2.setModelo("Botina Adventure");
        b2.setCor("Marrom e Rosa");
        b2.setNumero(37);
        b2.setTiposolado("Couro");
        b2.setAlturacano(5);
        b2.setPreferido(false);
        
        //prateleira 3
       
        Bota b3 = new Bota();
        b3.setModelo("Bota SuperWinter");
        b3.setCor("Preto com Lã");
        b3.setNumero(38);
        b3.setTiposolado("Borracha");
        b3.setAlturacano(35);
        b3.setPreferido(false);
        
        Salto st3 = new Salto();
        st3.setModelo("Sapato MegaFesta ");
        st3.setCor("Preto com Strass");
        st3.setNumero(37);
        st3.setTamanhosalto(15);
        st3.setPreferido(false);
        
        Sapato s7 = new Sapato();
        s7.setModelo("Tênis Kolosh");
        s7.setCor("Vermelho");
        s7.setNumero(38);
        s7.setPreferido(true);
        
        Sapato s8 = new Sapato();
        s8.setModelo("Pantufa Pelego");
        s8.setCor("Rosa com Branco");
        s8.setNumero(38);
        s8.setPreferido(false);
        
        Sapato s9 = new Sapato();
        s9.setModelo("Rasterinha Melissa");
        s9.setCor("Bege e Rosa Claro");
        s9.setNumero(37);
        s9.setPreferido(false);
        
        Prateleira p1 = new Prateleira();
        p1.setNomedaprateleira("A");
        p1.lista.add(s1);
        p1.lista.add(s2);
        p1.lista.add(s3);
        p1.lista.add(st1);
        p1.lista.add(b1);
        
        Prateleira p2 = new Prateleira();
        p2.setNomedaprateleira("B");
        p2.lista.add(s4);
        p2.lista.add(s5);
        p2.lista.add(s6);
        p2.lista.add(b2);
        p2.lista.add(st2);
        
        Prateleira p3 = new Prateleira();
        p3.setNomedaprateleira("C");
        p3.lista.add(s7);
        p3.lista.add(s8);
        p3.lista.add(s9);
        p3.lista.add(st3);
        p3.lista.add(b3);
        
        //fazer joptiompane pra mostrar as informações
        JOptionPane.showMessageDialog(null,p1.mostrarPrateleira());
        JOptionPane.showMessageDialog(null,p2.mostrarPrateleira());
        JOptionPane.showMessageDialog(null,p3.mostrarPrateleira());
    }
    
}
