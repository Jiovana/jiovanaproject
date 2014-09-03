/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dados conta
        Conta c = new Conta();
        Boolean deucerto;
        String aux;
        //dados banco
        Banco b = new Banco();
        String auxImo = " ", auxCar = " ";
        //dados cliente
        Cliente pessoa = new Cliente();
        
        
        
        //entrada e saida dados conta
        c.AbrirConta("059750" ,"1489","Jiovana");       
        JOptionPane.showMessageDialog(null," Informações da conta: \nCorrentista: " +c.getNomeCorrentista()+"\nAgencia: "+c.getAgencia()+"\nNumero da conta: "+c.getNumeroConta());
        deucerto = c.Depositar(150.0);
        if(deucerto==true){
            JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso.\nSaldo:" +c.retornoSaldo());
            }
        else{
            JOptionPane.showMessageDialog(null, "Deposito não realizado");
        }
        deucerto = c.Sacar(90.0);
        if(deucerto==true){
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso.\nSaldo:" +c.retornoSaldo());
        }
        else{
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }    
        aux = JOptionPane.showInputDialog("Deseja fechar sua conta? (S/N");
        if(aux.equals("S")){
            c.fecharConta(false); 
            JOptionPane.showMessageDialog(null, "Conta cancelada.");
        }else if (aux.equals("N")){
            c.fecharConta(true); 
            JOptionPane.showMessageDialog(null, "A conta permanece ativa.");
        }
        //entrada dados banco
        b.setNome(JOptionPane.showInputDialog(null, " Digite o nome: "));
        b.setNumero(JOptionPane.showInputDialog(null, " Digite o numero:"));
            
            while(!auxImo.equals("S")&&!auxImo.equals("N")){
            {
                auxImo = JOptionPane.showInputDialog("Oferece Empréstimo Imovel?(S/N) ");
            }
                if(auxImo.equals("S")){
                     b.setEmprestimoimovel(true);
                }
                else{
                    b.setEmprestimoimovel(false);
                }
            }
         while(!auxCar.equals("S")&&!auxCar.equals("N")){
             { 
                 auxCar = JOptionPane.showInputDialog("Oferece Empréstimo Carro?(S/N) ");
             }
             if(auxCar.equals("S")){
                b.setEmprestimocarro(true);
            }
            else{
                b.setEmprestimocarro(false);
            }
         }       
        //saida dados banco
         JOptionPane.showMessageDialog(null, "Banco: " +b.getNome() +"\nNúmero: " +b.getNumero()
                                     +"\nEmpréstimo de imóveis: " +b.isEmprestimoimovel()
                                     +"\nEmpréstimo de carros: " +b.isEmprestimocarro());
         aux = " ";
        //entrada dados cliente
         pessoa.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
         pessoa.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf do cliente: ")));
         pessoa.setNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do cliente: "));
         pessoa.setEndereço(JOptionPane.showInputDialog("Informe o endereço do cliente: "));
         aux = JOptionPane.showInputDialog("O cliente se encontra negativado no SPC? S/N");
         if(aux.equals("S")){
             pessoa.setNegativadoSPC(true);
         }else{
             pessoa.setNegativadoSPC(false);
         }
         aux = JOptionPane.showInputDialog("O cliente se encontra negativado no SERASA? S/N");
         if(aux.equals("S")){
             pessoa.setNegativadoSerasa(true);
         }else{
             pessoa.setNegativadoSerasa(false);
         }
         //saida dados cliente
         JOptionPane.showMessageDialog(null,"==DADOS DO CLIENTE== \nNome:" +pessoa.getNome() +"\nCPF:" +pessoa.getCpf()
                                       +"\nData de nascimento:" +pessoa.getNascimento() +"\nEndereço:" +pessoa.getEndereço() 
                                       +"\nNegativado SPC ou SERASA:" +pessoa.verificaPendencias());
    }   
}
