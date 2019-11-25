/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoSql;
import Dados.Mensalidade;
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
public class MensalidadeDAO {
    private ConexaoSql conn; 
    
    public MensalidadeDAO(){
        try{
            this.conn = new ConexaoSql();
            }
        catch (ClassNotFoundException ex){
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public boolean inserir(Mensalidade mens) throws SQLException {
         try {
            String sql = "INSERT INTO MENSALIDADE (COD_MENS, MES_ANO_MENS, DATA_PAG_MENS, SITUACAO_MENS, ATRASO_MENS, RENOVACAO_MENS) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
            
            ps.setInt(1, mens.getcod_mens());
            ps.setString(2, mens.getmes_ano_mens());
            ps.setString(3, mens.getdata_pag_mens());
            ps.setString(4, mens.getsituacao_mens());
            ps.setInt(5, mens.getatraso_mens());
            ps.setDouble(6, mens.getrenovacao_mens());
            
            ps.execute();
            
            this.conn.confirmar();
            return true;
         }
         
            catch(Exception e){
                    e.printStackTrace();
                    return false;  
         }
        }
    
        public boolean alterar(Mensalidade mens){
            try{
                String sql = "UPDATE MENSALIDADE SET MES_ANO_MENS=?, DATA_PAG_MENS=?, SITUACAO_MENS=?, ATRASO_MENS=?, RENOVACAO_MENS=? WHERE COD_MENS=?";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                
            ps.setString(1, mens.getmes_ano_mens());
            ps.setString(2, mens.getdata_pag_mens());
            ps.setString(3, mens.getsituacao_mens());
            ps.setInt(4, mens.getatraso_mens());
            ps.setDouble(5, mens.getrenovacao_mens());            
            ps.setInt(6, mens.getcod_mens());
            
            ps.executeUpdate();
            
            this.conn.confirmar();
            return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
            public Mensalidade buscarPorId(Integer cod_mens){
            try{
                String sql = "SELECT * FROM MENSALIDADE WHERE ID = " +cod_mens;
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                Mensalidade mens = new Mensalidade();
                
                while(rs.next()){
                    mens.setcod_mens(rs.getInt("COD_MENS"));
                    mens.setmes_ano_mens(rs.getString("MES_ANO_MENS"));
                    mens.setdata_pag_mens(rs.getString("DATA_PAG_MENS"));
                    mens.setsituacao_mens(rs.getString("SITUACAO_MENS"));
                    mens.setatraso_mens(rs.getInt("ATRASO_MENS"));
                    mens.setrenovacao_mens(rs.getDouble("RENOVACAO_MENS"));  
                }
                
                return mens;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        
        public ArrayList<Mensalidade>buscarTodos(){
            try{
                String sql = "SELECT * FROM MENSALIDADE";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                ArrayList<Mensalidade>arrayMensalidade = new ArrayList<>();
                
                while(rs.next()){
                    
                    Mensalidade mens = new Mensalidade();
                    
                    mens.setcod_mens(rs.getInt("COD_MENS"));
                    mens.setmes_ano_mens(rs.getString("MES_ANO_MENS"));
                    mens.setdata_pag_mens(rs.getString("DATA_PAG_MENS"));
                    mens.setsituacao_mens(rs.getString("SITUACAO_MENS"));
                    mens.setatraso_mens(rs.getInt("ATRASO_MENS"));
                    mens.setrenovacao_mens(rs.getDouble("RENOVACAO_MENS"));
                    
                    arrayMensalidade.add(mens);
                }
                return arrayMensalidade;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }    
        
        /*public boolean excluir (int cod_mens){
            try{
                String sql = "DELETE FROM ESCOTISTA WHERE ID = '"+ cod_mens +"'";
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
