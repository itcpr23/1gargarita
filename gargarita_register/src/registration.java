
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class registration {
    protected String driver = "com.mysql.jdbc.Driver";
    protected String url = "jdbc:mysql://localhost/reg?";
    protected String username = "root";
    protected String password = "";
    
    connection con = new connection();
     public int register(String firstname,String lastname,String username, String password){
        int r = 0;
        try{
             Class.forName(driver);
             Connection conn = (Connection) DriverManager.getConnection(url, username,password);
             
              String sql = "insert into register values(null,?,?,?,?)";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            
            pstmt.setString(1, username);
             pstmt.setString(2, password);
             pstmt.setString(3, lastname);
              pstmt.setString(4, firstname);
              
               r = pstmt.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
     }}
     

