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
            //stmt.execute("insert into Customers (CustomerID, FirstName, LastName, EMail, Phone) values (5, 'Sidorov', 'Fedya', 'sidrov.fed@mail.ru', '+375 25 5678903');");
            //stmt.execute("insert into Customers (CustomerID, FirstName, LastName, EMail, Phone) values (6, 'Kolesova', 'Masha', 'kolrsova.m@gmail.com', '+375 33 2678903');");
            int res = stmt.executeUpdate("update Customers set LastName = 'Marina' where CustomerID= 6;");
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
