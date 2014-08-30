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
    public static void main(String[] args) {
        // TODO code application logic here
        //JOPTIONPANE
        String nomef = " ", gener = " ", actors = " ";
        Filme f = new Filme();
        Integer  durac = 0, classifc, idd;
        
        Ator a = new Ator();
        String nomea = " ", data = " ", pais = " ", nomeultimo = " ";
        Double cachex = 0.0;
        String oscar = " "; 
        Integer total = 0, totalultimo = 0;
        //entrada
        //dados filme
        nomef = JOptionPane.showInputDialog(" Digite o nome do filme: ");
        f.atribuirNome(nomef);
        durac = Integer.parseInt(JOptionPane.showInputDialog(" Informe a duração do filme: "));
        f.atribuirDuracao(durac);
        classifc = Integer.parseInt(JOptionPane.showInputDialog(" Informe a classificação do filme"));
        f.atribuirClassificacao(classifc);
        gener = JOptionPane.showInputDialog(" Digite o gênero do filme: ");        
        f.atribuirGenero(gener);
        actors = JOptionPane.showInputDialog(" Digite os principais atores do filme: ");               
        f.atribuirAtores(actors);
        idd = Integer.parseInt(JOptionPane.showInputDialog(" Informe a sua idade ")); 
        f.receberIdade(idd);
        
        if(f.retornarPermissao() == true){
            JOptionPane.showMessageDialog(null, "Maior de idade, pode assistir o filme.");          
        }else {
            JOptionPane.showMessageDialog(null, "Menor de idade, não pode assistir o filme.");
        }
        //saida
        JOptionPane.showMessageDialog (null,"Informações:\n Nome: " +f.retornarNome() +"\n Duração: "+f.retornarCurtaLonga() 
                                        +f.retornarDuracao() +"minutos.\n Classificação: "
                                        +f.retornarClassificacao() +"\n Gênero: " 
                                        +f.retornarGenero() + "\n Atores: "+f.retornarAtores());
     
        //dados ator
        nomea = JOptionPane.showInputDialog(" Digite o nome do ator: ");
        a.atribuirNomeAtor(nomea);
        data = JOptionPane.showInputDialog(" Digite a data de nascimento do ator: ");
        a.atribuirNascimento(data);
        cachex = Double.parseDouble(JOptionPane.showInputDialog(" Digite o cache do ator por filme: "));
        a.atribuirCache(cachex);
        pais = JOptionPane.showInputDialog(" Digite a nacionalidade do ator: ");
        a.atribuirNacionalidade(pais);
        oscar = JOptionPane.showInputDialog("O ator(a) já ganhou um oscar? Digite S ou N:");
        a.atribuirVencedorOscar(oscar);
        total = Integer.parseInt(JOptionPane.showInputDialog("Em quantos filmes o ator já atuou?"));
        a.atribuirTotalFilmes(total);
        nomeultimo = JOptionPane.showInputDialog("Nome dos filmes realzados no ultimo ano: ");
        totalultimo = Integer.parseInt(JOptionPane.showInputDialog("Total de filmes realizados no ultimo ano: "));
        a.atribuirFilmesUltimoAno(nomeultimo, totalultimo);
        //saida ator
        
        JOptionPane.showMessageDialog(null, "Informações sobre Ator: \nNome: " +a.retornarNomeAtor()+"\nData de nascimento: "
                                      +a.retornarNascimento() +"\nCache: " +a.retornarCache()+"\nNascionalidade: " 
                                      +a.retornarNacionalidade()+"\n Ganhador do oscar? " +a.retornarVencedorOscar() 
                                      +"\n Número de filmes atuados: " +a.retornarTotalFilmes() +"\n Filmes participados no ultimo ano:"
                                      +a.retornarFilmesUltimoAno()+"\nGanhos no ultimo ano: "+a.retornarGanhos());
        
//classific = Integer.parseInt("50") converta para inteiro
    
    //classifc = Integer.parseInt(JOption.showImputDialog(""DIgite a classificacao "")
    
    }
    
}
