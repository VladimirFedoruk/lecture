import java.sql.*;
import java.util.Collection;

import static java.lang.System.out;

public class MySqlBookDao implements Dao {
    @Override
    public Collection<Book> findAllBooks() {
        return null;
    }

    @Override
    public Book findBookByIsbn(Book book) {
        return null;
    }

    @Override
    public void create(Book book) {
        String url = "jdbc:mysql://localhost:3306/BookDatebase";
        String user = "root";
        String pwd = "fDcbkbQ2017!";
        try {
            Connection conn =
                    DriverManager.getConnection(url, user, pwd); // GetConnection
            System.out.println("work");
            Statement stmt = ((java.sql.Connection) conn).createStatement(); // Create Statement
            stmt.executeUpdate("insert into Books (isbn, title, author) values ('"+book.getIsbn()+"', '"+book.getTitle()+"', '"+book.getAuthor()+"');");


        } catch (SQLException se) {
            System.out.println(se);
        }

    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public void update(Book book) {

    }
}
