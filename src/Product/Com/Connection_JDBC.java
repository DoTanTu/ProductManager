
package Product.Com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_JDBC {
    public static Connection Connection_JDBC(){
        final String Url = "jdbc:sqlserver://localhost;database=BAN_HANG";
        final String user = "sa";
        final String pass = "sa123";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
