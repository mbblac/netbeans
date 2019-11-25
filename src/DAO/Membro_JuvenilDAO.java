/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoSql;
import Dados.Membro_Juvenil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 277841
 */
public class Membro_JuvenilDAO {    
    private ConexaoSql conn; 
    
    public Membro_JuvenilDAO(){
        try{
            this.conn = new ConexaoSql();
            }
        catch (ClassNotFoundException ex){
            Logger.getLogger(Membro_JuvenilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(Membro_JuvenilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public boolean inserir(Membro_Juvenil membroj) throws SQLException {
         try {
            String sql = "INSERT INTO MEMBRO_JUVENIL (REG_MEMBRO, NOME_MEMBRO, RAMO_MEMBRO) VALUES (?, ?, ?)";
            PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
            
            ps.setInt(1, membroj.getreg_membro());
            ps.setString(2, membroj.getnome_membro());
            ps.setString(3, membroj.getramo_membro());
            
            ps.execute();
            
            this.conn.confirmar();
            return true;
         }
         
            catch(Exception e){
                    e.printStackTrace();
                    return false;  
         }
        }
    
        public boolean alterar(Membro_Juvenil membroj){
            try{
                String sql = "UPDATE MEMBRO_JUVENIL SET NOME_MEMBRO=?, RAMO_MEMBRO=? WHERE REG_MEMBRO=?";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                
            ps.setString(1, membroj.getnome_membro());
            ps.setString(2, membroj.getramo_membro());
            ps.setInt(3, membroj.getreg_membro());
            
            ps.executeUpdate();
            
            this.conn.confirmar();
            return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        public Membro_Juvenil buscarPorId(Integer reg_membro){
            try{
                String sql = "SELECT * FROM MEMBRO_JUVENIL WHERE ID = " +reg_membro;
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                Membro_Juvenil membroj = new Membro_Juvenil();
                
                while(rs.next()){
                    membroj.setreg_membro(rs.getInt("REG_MEMBRO"));
                    membroj.setnome_membro(rs.getString("NOME_MEMBRO"));
                    membroj.setramo_membro(rs.getString("RAMO_MEMBRO"));

                }
                
                return membroj;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        
        public ArrayList<Membro_Juvenil>buscarTodos(){
            try{
                String sql = "SELECT * FROM MEMBRO_JUVENIL";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                ArrayList<Membro_Juvenil>arrayMembro_Juvenil = new ArrayList<>();
                
                while(rs.next()){
                    
                    Membro_Juvenil membroj = new Membro_Juvenil();
                    
                    membroj.setreg_membro(rs.getInt("REG_MEMBRO"));
                    membroj.setnome_membro(rs.getString("NOME_MEMBRO"));
                    membroj.setramo_membro(rs.getString("RAMO_MEMBRO"));
                    
                    arrayMembro_Juvenil.add(membroj);
                }
                return arrayMembro_Juvenil;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }    
        
        /*public boolean excluir (int reg_membro){
            try{
                String sql = "DELETE FROM MEMBRO_JUVENIL WHERE ID = '"+ reg_membro +"'";
                System.out.println(sql);
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ps.executeUpdate();
                this.conn.confirmar();
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }*/
}
