/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//objeto de acesso a dados = dao
package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;

/**
 *
 * @author Jiovana
 */
public class JogadorDAO {
    
    //monta sql de insert na tabela

    public Boolean inserir(Jogador jogador) {
        Boolean retorno;
        String sql = "INSERT INTO jogador(login,senha,email)" + "VALUES(?,?,?)";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setString(1, jogador.getLogin());
            pst.setString(2, jogador.getSenha());
            pst.setString(3, jogador.getEmail());
            //executa sql no banco
            pst.executeUpdate();
            retorno = true;

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Jogador> listar(){
        //cirar lista de jogador
        List<Jogador> lista = new ArrayList<Jogador>();
        String sql = "SELECT * FROM jogador";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //executa sql e joga em um resultSet
            ResultSet res = pst.executeQuery();
            //enquanto tiver registro vai relacionar com a classe jogador e adicionar na lista
            while(res.next()){
                Jogador j= new Jogador();
                j.setLogin(res.getString("login"));
                j.setSenha(res.getString("senha"));
                j.setEmail(res.getString("email"));
                lista.add(j);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    public Boolean excluir(Jogador jogador) {
        Boolean retorno;
        //monta sl e inseren na tabela
        String sql = "DELETE FROM jogador WHERE login=?";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setString(1, jogador.getLogin());
            
            //executa sql no banco
            pst.executeUpdate();
            retorno = true;

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

}
