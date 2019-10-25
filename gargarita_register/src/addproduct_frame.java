
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
 * @author HP
 */
 public class addproduct_frame {
     protected String driver = "com.mysql.jdbc.Driver";
    protected String url = "jdbc:mysql://localhost/reg?";
    protected String username = "root";
    protected String password = "";
    connection cn = new connection();
    public int addproduct(String prname, int prqty, int prprice) throws ClassNotFoundException {
        int z = 0;
        String sql= "insert into product values (null,?,?,?)";
        
try{
    Class.forName(driver);
    Connection con = DriverManager.getConnection(url,username,password);
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, prname);
    ps.setInt(2,prqty);
    ps.setInt(3,prprice);
    ps.executeUpdate();
    
    
} catch (SQLException ex) {
    Logger.getLogger(addproduct_frame.class.getName()).log(Level.SEVERE, null, ex);
    
}
return z;

    }}
    
    

