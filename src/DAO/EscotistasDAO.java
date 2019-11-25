 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Conexao.ConexaoSql;
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
public class EscotistasDAO {
    
    private ConexaoSql conn; 
    
    public EscotistasDAO(){
        try{
            this.conn = new ConexaoSql();
            }
        catch (ClassNotFoundException ex){
            Logger.getLogger(EscotistasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(EscotistasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public boolean inserir(Escotistas escot) throws SQLException {
         try {
            String sql = "INSERT INTO ESCOTISTA (REG_ESCOTISTA, SENHA_ESCOTISTA, NOME_ESCOTISTA, CARGO_ESCOTISTA, RAMO_ESCOTISTA) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
            
            ps.setInt(1, escot.getreg_escotista());
            ps.setString(2, escot.getsenha_escotista());
            ps.setString(3, escot.getnome_escotista());
            ps.setString(4, escot.getcargo_escotista());
            ps.setString(5, escot.getramo_escotista());
            
            ps.execute();
            
            this.conn.confirmar();
            return true;
         }
         
            catch(Exception e){
                    e.printStackTrace();
                    return false;  
         }
        }
    
        public boolean alterar(Escotistas escot){
            try{
                String sql = "UPDATE ESCOTISTA SET SENHA_ESCOTISTA=?, NOME_ESCOTISTA=?, CARGO_ESCOTISTA=?, RAMO_ESCOTISTA=? WHERE REG_ESCOTISTA=?";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                
            ps.setString(1, escot.getsenha_escotista());
            ps.setString(2, escot.getnome_escotista());
            ps.setString(3, escot.getcargo_escotista());
            ps.setString(4, escot.getramo_escotista());
            ps.setInt(5, escot.getreg_escotista());
            
            ps.executeUpdate();
            
            this.conn.confirmar();
            return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        public Escotistas buscarPorId(Integer reg_escotista){
            try{
                String sql = "SELECT * FROM ESCOTISTA WHERE ID = " +reg_escotista;
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                Escotistas escot = new Escotistas();
                
                while(rs.next()){
                    escot.setreg_escotista(rs.getInt("REG_ESCOTISTA"));
                    escot.setsenha_escotista(rs.getString("SENHA_ESCOTISTA"));
                    escot.setnome_escotista(rs.getString("NOME_ESCOTISTA"));
                    escot.setcargo_escotista(rs.getString("CARGO_ESCOTISTA"));
                    escot.setramo_escotista(rs.getString("RAMO_ESCOTISTA"));
                }
                
                return escot;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        
        public ArrayList<Escotistas>buscarTodos(){
            try{
                String sql = "SELECT * FROM ESCOTISTA";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                ArrayList<Escotistas>arrayEscotistas = new ArrayList<>();
                
                while(rs.next()){
                    
                    Escotistas escot = new Escotistas();
                    
                    escot.setreg_escotista(rs.getInt("REG_ESCOTISTA"));
                    escot.setsenha_escotista(rs.getString("SENHA_ESCOTISTA"));
                    escot.setnome_escotista(rs.getString("NOME_ESCOTISTA"));
                    escot.setcargo_escotista(rs.getString("CARGO_ESCOTISTA"));
                    escot.setramo_escotista(rs.getString("RAMO_ESCOTISTA"));
                    
                    arrayEscotistas.add(escot);
                }
                return arrayEscotistas;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }    
        
        /*public boolean excluir (int reg_escotista){
            try{
                String sql = "DELETE FROM ESCOTISTA WHERE ID = '"+ reg_escotista +"'";
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
