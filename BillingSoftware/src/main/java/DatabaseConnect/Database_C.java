
package DatabaseConnect;

import java.sql.*;

/**
 *
 * @author hp
 */
public class Database_C {
    private static Connection con;
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/BillingDatabase", "root", "1234");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
