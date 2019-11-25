/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 277841
 */
public class ConexaoSql {
      
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/geart";
    private final String USER = "root";
    private final String PASS = "";
    
    private Connection conn;
    
    public ConexaoSql()throws ClassNotFoundException, SQLException {
    
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(URL, USER, PASS);
            conn.setAutoCommit(false);
            System.out.println("Conexão criada com SGBD com sucesso!");
        }
        
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException e){
            throw new ClassNotFoundException("O Driver não foi localizado e "  
            + "adicionado.Talvez a biblioteca JDBC não foi adicionado "
            + "ao projeto.\n"+ e.getMessage());
        }
           
        catch (SQLException e) {
            throw new SQLException("Deu erro na conexão com a fonte de dados.\n"
                    + e.getMessage());
        }
        
        }
    
    public Connection getConexao(){
        return conn;
    }
    public void confirmar()throws SQLException{
        try{
            conn.commit();
        }
        catch(SQLException e){
            throw new SQLException ("Nãp foi possível executar o comando SQL. \n" + e.getMessage());
        }
        finally{
            conn.close();
        }
    }
}

