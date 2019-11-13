import java.sql.*;
import static java.lang.System.*;

public class Costum {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/MyOfice";
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
                out.print(rs.getInt("CustomerID") + "\t");  //PrintColumns
                out.print(rs.getString("FirstName") + "\t");
                out.print(rs.getString("LastName") + "\t");
                out.print(rs.getString("EMail") + "\t");
                out.print(rs.getString("Phone")+ "\n");
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

}
