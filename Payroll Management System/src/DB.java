// Program for Connection

import java.sql.*;
import javax.swing.JOptionPane;

public class DB
{
    Connection connection = null;
    
    public static Connection java_db()
    {
        String url = "jdbc:mysql://localhost:3306/paydb?useSSL=false";
        String username = "root";
        String password = "sesame";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}