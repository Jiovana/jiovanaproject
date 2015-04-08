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
import modelo.Pergunta;


/**
 *
 * @author Jiovana
 */
public class PerguntaDAO {
    
    //monta sql de insert na tabela

    public Boolean inserir(Pergunta pergunta) {
        Boolean retorno;
        String sql = "INSERT INTO pergunta(enunciado,a,b,c,d,certa,nivel)" + "VALUES(?,?,?,?,?,?,?)";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setString(1, pergunta.getEnunciado());
            pst.setString(2, pergunta.getA());
            pst.setString(3, pergunta.getB());
            pst.setString(3, pergunta.getC());
            pst.setString(3, pergunta.getD());
            pst.setString(3, pergunta.getCerta());
            pst.setString(3, pergunta.getNivel().toString());
            //executa sql no banco
            pst.executeUpdate();
            retorno = true;

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Pergunta> listar(){
        //cirar lista de jogador
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //executa sql e joga em um resultSet
            ResultSet res = pst.executeQuery();
            //enquanto tiver registro vai relacionar com a classe jogador e adicionar na lista
            while(res.next()){
                Pergunta j= new Pergunta();
                j.setId(res.getInt("Id"));
                j.setEnunciado(res.getString("enunciado"));
                j.setA(res.getString("A"));
                j.setB(res.getString("B"));
                j.setC(res.getString("C"));
                j.setD(res.getString("D"));
                j.setCerta(res.getString("Certa"));
                j.setNivel(res.getInt("Nivel"));
                lista.add(j);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
