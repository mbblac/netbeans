/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoSql;
import Dados.DIP;
import Dados.Escotistas;
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
public class DIPDAO {
    
    private ConexaoSql conn; 
    
    public DIPDAO(){
        try{
            this.conn = new ConexaoSql();
            }
        catch (ClassNotFoundException ex){
            Logger.getLogger(DIPDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(DIPDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public boolean inserir(DIP dip) throws SQLException {
         try {
            String sql = "INSERT INTO DIP (COD_PT_DIP, PT_MT_DIP, ATIVIDADE_DIP, PONT_DIP, PONT_GANHA_DIP, DATA_DIP) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
            
            ps.setInt(1, dip.getcodpt_dip());
            ps.setString(2, dip.getpt_mt_dip());
            ps.setString(3, dip.getatividade_dip());
            ps.setInt(4, dip.getpont_dip());
            ps.setInt(5, dip.getpont_ganha_dip());
            ps.setString(6, dip.getdata_dip());
            
            ps.execute();
            
            this.conn.confirmar();
            return true;
         }
         
            catch(Exception e){
                    e.printStackTrace();
                    return false;  
         }
        }
    
        public boolean alterar(DIP dip){
            try{
                String sql = "UPDATE DIP SET PT_MT_DIP=?, ATIVIDADE_DIP=?, PONT_DIP=?, PONT_GANHA_DIP=?, DATA_DIP=? WHERE CODPT_DIP=?";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                
            ps.setString(1, dip.getpt_mt_dip());
            ps.setString(2, dip.getatividade_dip());
            ps.setInt(3, dip.getpont_dip());
            ps.setInt(4, dip.getpont_ganha_dip());
            ps.setString(5, dip.getdata_dip());
            ps.setInt(6, dip.getcodpt_dip ());
            
            ps.executeUpdate();
            
            this.conn.confirmar();
            return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        public DIP buscarPorId(Integer codpt_dip){
            try{
                String sql = "SELECT * FROM DIP WHERE ID = " +codpt_dip;
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                DIP dip = new DIP();
                
                while(rs.next()){
                    dip.setcodpt_dip(rs.getInt("CODPT_DIP"));
                    dip.setpt_mt_dip(rs.getString("PT_MT_DIP"));
                    dip.setatividade_dip(rs.getString("ATIVIDADE_DIP"));
                    dip.setpont_dip(rs.getInt("PONT_DIP"));
                    dip.setpont_ganha_dip(rs.getInt("PONT_GANHA_DIP"));
                    dip.setdata_dip(rs.getString("DATA_DIP"));
                }
                
                return dip;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        
        public ArrayList<DIP>buscarTodos(){
            try{
                String sql = "SELECT * FROM DIP";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                ArrayList<DIP>arrayDIP = new ArrayList<>();
                
                while(rs.next()){
                    
                    DIP dip = new DIP();
                    
                    dip.setcodpt_dip(rs.getInt("CODPT_DIP"));
                    dip.setpt_mt_dip(rs.getString("PT_MT_DIP"));
                    dip.setatividade_dip(rs.getString("ATIVIDADE_DIP"));
                    dip.setpont_dip(rs.getInt("PONT_DIP"));
                    dip.setpont_ganha_dip(rs.getInt("PONT_GANHA_DIP"));
                    dip.setdata_dip(rs.getString("DATA_DIP"));
                    
                    arrayDIP.add(dip);
                }
                return arrayDIP;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }    
        
        /*public boolean excluir (int codpt_dip){
            try{
                String sql = "DELETE FROM ESCOTISTA WHERE ID = '"+ codpt_dip +"'";
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
