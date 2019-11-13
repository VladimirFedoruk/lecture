import java.sql.*;
import static java.lang.System.*;

public class RabotaSBazoj {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql"+
                "?verifyServerCertificate=false"+
                "&useSSL=false"+
                "&requireSSL=false"+
                "&useLegacyDatetimeCode=false"+
                "&amp"+
                "&serverTimezone=UTC";
        String user = "root";
        String pwd = "fDcbkbQ2017!";
        try {
            Connection conn =
                    DriverManager.getConnection(url, user, pwd); // GetConnection
            System.out.println("work");
            Statement stmt = ((java.sql.Connection) conn).createStatement(); // Create Statement
            String query = "select * from Customers";
            ResultSet rs = stmt.executeQuery(query);  // ExecuteQuery
            while (rs.next()) {                         // Process Results
                out.print(rs.getInt("CustomerID") + " ");  //PrintColumns
                out.print(rs.getString("FirstName") + " ");
                out.print(rs.getString("LastName") + " ");
                out.print(rs.getString("EMail") + " ");
                out.print(rs.getString("Phone"));
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}

