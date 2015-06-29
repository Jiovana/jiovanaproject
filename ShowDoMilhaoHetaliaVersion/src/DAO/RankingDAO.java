/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;
import modelo.JogoTodo;
import modelo.Ranking;

/**
 *
 * @author Jiovana
 * TENTATIVA FALHADA :'(
 */
public class RankingDAO {
    /** 
     * Converte uma String para um objeto Date. Caso a String seja vazia ou nula,  
     * retorna null - para facilitar em casos onde formulários podem ter campos 
     * de datas vazios. 
     * @param data String no formato dd/MM/yyyy a ser formatada 
     * @return Date Objeto Date ou null caso receba uma String vazia ou nula 
     * @throws Exception Caso a String esteja no formato errado 
     */  
    public static Date formataData(String data) throws Exception {   
        if (data == null || data.equals(""))  
            return null;  
          
        Date date = null;  
        try {  
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            date = (Date)(java.util.Date)formatter.parse(data);  
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    }  
    public List<Ranking> listar() throws Exception{
        //criar lista
        List<Ranking> lista = new ArrayList<Ranking>();
        String sql = "SELECT login, pontos, data FROM ranking ORDER BY pontos DESC";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //executa sql e joga em um resultSet
            ResultSet res = pst.executeQuery();
            //enquanto tiver registro vai relacionar com a classe jogador e adicionar na lista
            while(res.next()){
                Ranking r= new Ranking();
                Jogador j = new Jogador();
                
                j.setLogin(res.getString("login"));
                r.setJ(j);
                r.setData(res.getDate("data"));
                r.setPontos(res.getInt("pontos"));
                lista.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    public Boolean inserir(Ranking ranking) {
        Boolean retorno;
        String sql = "INSERT INTO ranking(login, pontos,data)" + "VALUES(?,?,?)";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            
            pst.setString(1, ranking.getJ().getLogin());
            pst.setInt(2, ranking.getPontos());
            pst.setDate(3,new java.sql.Date(ranking.getData().getTime()));
            
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
