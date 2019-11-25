/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoSql;
import Dados.Almoxarifado;
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
public class AlmoxarifadoDAO {
    private ConexaoSql conn; 
    
    public AlmoxarifadoDAO(){
        try{
            this.conn = new ConexaoSql();
            }
        catch (ClassNotFoundException ex){
            Logger.getLogger(AlmoxarifadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(AlmoxarifadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public boolean inserir(Almoxarifado almox) throws SQLException {
         try {
            String sql = "INSERT INTO ALMOXARIFADO (COD_MATERIAL, NOME_MATERIAL, EST_ATUAL_MATERIAL, RAMO_MATERIAL, LOCAL_MATERIAL) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
            
            ps.setInt(1, almox.getcod_material());
            ps.setString(2, almox.getnome_material());
            ps.setString(3, almox.getest_atual_material());
            ps.setString(4, almox.getramo_material());
            ps.setString(5, almox.getlocal_material());
            
            ps.execute();
            
            this.conn.confirmar();
            return true;
         }
         
            catch(Exception e){
                    e.printStackTrace();
                    return false;  
         }
        }
    
        public boolean alterar(Almoxarifado almox){
            try{
                String sql = "UPDATE ALMOXARIFADO SET NOME_MATERIAL=?, EST_ATUAL_MATERIAL=?, RAMO_MATERIAL=?, LOCAL_MATERIAL=? WHERE COD_MATERIAL=?";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                
            ps.setString(1, almox.getnome_material());
            ps.setString(2, almox.getest_atual_material());
            ps.setString(3, almox.getramo_material());
            ps.setString(4, almox.getlocal_material());
            ps.setInt(5, almox.getcod_material());
            
            ps.executeUpdate();
            
            this.conn.confirmar();
            return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        public Almoxarifado buscarPorId(Integer cod_material){
            try{
                String sql = "SELECT * FROM ALMOXARIFADO WHERE ID = " +cod_material;
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                Almoxarifado almox = new Almoxarifado();
                
                while(rs.next()){
                    almox.setcod_material(rs.getInt("COD_MATERIAL"));
                    almox.setnome_material(rs.getString("NOME_MATERIAL"));
                    almox.setest_atual_material(rs.getString("EST_ATUAL_MATERIAL"));
                    almox.setramo_material(rs.getString("RAMO_MATERIAL"));
                    almox.setlocal_material(rs.getString("LOCAL_MATERIAL"));
                }
                
                return almox;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        
        public ArrayList<Almoxarifado>buscarTodos(){
            try{
                String sql = "SELECT * FROM ALMOXARIFADO";
                PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                ArrayList<Almoxarifado>arrayAlmoxarifado = new ArrayList<>();
                
                while(rs.next()){
                    
                    Almoxarifado almox = new Almoxarifado();
                    
                    almox.setcod_material(rs.getInt("COD_MATERIAL"));
                    almox.setnome_material(rs.getString("NOME_MATERIAL"));
                    almox.setest_atual_material(rs.getString("EST_ATUAL_MATERIAL"));
                    almox.setramo_material(rs.getString("RAMO_MATERIAL"));
                    almox.setlocal_material(rs.getString("LOCAL_MATERIAL"));
                    
                    arrayAlmoxarifado.add(almox);
                }
                return arrayAlmoxarifado;
            }
            catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }    
        
        /*public boolean excluir (int cod_material){
            try{
                String sql = "DELETE FROM ALMOXARIFADO WHERE ID = '"+ cod_material +"'";
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
