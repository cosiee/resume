package ac;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.*;
public class App 
{
    
    /**
     * @param args
     */
    public static void main( String[] args)
    {
        final String DB_URL = "jdbc:mysql://localhost/BoostMyTool?ServerTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        Connection conn = null;
        Statement stmt = null;

        try{
            System.out.println("XXXXXXXXXXXXXXXXX");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected database successfully...");

            stmt = conn.createStatement();
            String sql = "INSERT INTO users (username, email, phone)" +
                        "VALUES ('Sara', 'contact@boostmytool.com'), '+21698765432')";
            stmt.executeUpdate(sql);

            System.out.println("Added");
        } catch (Exception e) {
                System.out.println("ooopsie");
            }
            finally{
                System.out.println("boo");
            }
        
    }
}
