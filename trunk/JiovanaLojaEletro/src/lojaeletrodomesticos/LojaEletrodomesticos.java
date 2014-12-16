/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lojaeletrodomesticos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jiovana
 */
public class LojaEletrodomesticos extends Produto{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //loja 1
         Produto p1  = new Produto();
         p1.setDescricao("Liquidificador C/ Filtro");
         p1.setMarca("Electrolux");
         p1.setPreco(89.90);
         p1.setDisponivel(true);
         
         Produto p2 = new Produto();
         p2.setDescricao("Torradeira");
         p2.setMarca("Cadence");
         p2.setPreco(50.00);
         p2.setDisponivel(true);
         
         Televisao tv1 = new Televisao();
         tv1.setDescricao("Televisão  ");
         tv1.setMarca("LG");
         tv1.setPreco(375.80);
         tv1.setQtdhdmi(10);
         tv1.setQtdvga(5);
         tv1.setTela("LED");
         tv1.setDisponivel(true);
         
         Produto p3 = new Produto();
         p3.setDescricao("Panela Elétrica");
         p3.setMarca("Brastemp");
         p3.setPreco(123.60);
         p3.setDisponivel(false);
         
         Televisao tv2 = new Televisao();
         tv2.setDescricao("Televisão ");
         tv2.setMarca("Samsung");
         tv2.setPreco(799.90);
         tv2.setQtdhdmi(10);
         tv2.setQtdvga(10);
         tv2.setTela("4K HD");
         tv2.setDisponivel(true);
         
         ArCondicionado ar1 = new ArCondicionado();
         ar1.setDescricao("Ar Condicionado");
         ar1.setMarca("Britania");
         ar1.setPreco(1500.00);
         ar1.setPainel(true);
         ar1.setQtdbtu(12000);
         ar1.setDisponivel(true);
         
         //loja 2
         Produto p4 = new Produto();
         p4.setDescricao("Máquina de Lavar");
         p4.setMarca("Consul");
         p4.setPreco(479.89);
         p4.setDisponivel(true);
         
         Produto p5 = new Produto();
         p5.setDescricao("Notebook");
         p5.setMarca("LG");
         p5.setPreco(1999.90);
         p5.setDisponivel(true);
         
         Televisao tv3 = new Televisao();
         tv3.setDescricao("Televisão");
         tv3.setMarca("Bosh");
         tv3.setPreco(250.00);
         tv3.setQtdhdmi(1);
         tv3.setQtdvga(3);
         tv3.setTela("Plasma");
         tv3.setDisponivel(true);
         
         Produto p6 = new Produto();
         p6.setDescricao("Cortador de Grama");
         p6.setMarca("Toshiba");
         p6.setPreco(69.50);
         p6.setDisponivel(true);
         
         Televisao tv4 = new Televisao();
         tv4.setDescricao("Televisão ");
         tv4.setMarca("Komecco");
         tv4.setPreco(410.90);
         tv4.setQtdhdmi(3);
         tv4.setQtdvga(5);
         tv4.setTela("LED");
         tv4.setDisponivel(false);
         
         ArCondicionado ar2 = new ArCondicionado();
         ar2.setDescricao("Ar Condicionado");
         ar2.setMarca("Dako");
         ar2.setPreco(999.99);
         ar2.setPainel(false);
         ar2.setQtdbtu(6000);
         ar2.setDisponivel(true);
         
         Loja l1 = new Loja();
         l1.setNome("FeriasLegais");
         l1.lista.add(p1);
         l1.lista.add(p2);
         l1.lista.add(p3);
         l1.lista.add(tv1);
         l1.lista.add(tv2);
         l1.lista.add(ar1);
                 
        Loja l2 = new Loja();
         l2.setNome("IFEletro");
         l2.lista.add(p4);
         l2.lista.add(p5);
         l2.lista.add(p6);
         l2.lista.add(tv3);
         l2.lista.add(tv4);
         l2.lista.add(ar2); 
         
        JOptionPane.showMessageDialog(null,l1.mostraLoja());
        JOptionPane.showMessageDialog(null,l2.mostraLoja());
        
         
    } 
}
