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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            date = (java.util.Date)formatter.parse(data);  
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    }  
    public List<Ranking> listar() throws Exception{
        //criar lista
        List<Ranking> lista = new ArrayList<Ranking>();
        String sql = "SELECT * FROM ranking";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //executa sql e joga em um resultSet
            ResultSet res = pst.executeQuery();
            //enquanto tiver registro vai relacionar com a classe jogador e adicionar na lista
            while(res.next()){
                Ranking r= new Ranking();
                r.setId(res.getInt("id"));
                r.setLogin(res.getString("login"));
                r.setData(formataData(res.getString("data")));
                r.setPontos(Integer.parseInt(res.getString("pontos")));
                lista.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
