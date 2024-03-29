import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryBookDao implements Dao{
    private static Map<String, Book> bookstore = new HashMap<String, Book>();

    public Collection<Book> findAllBooks() {
        return bookstore.values();

    }

    public Book findBookByIsbn(Book book) {
        return bookstore.get(book.getIsbn());
    }

    public void create(Book book){
        bookstore.put(book.getIsbn(),book);
    }
    public void delete(Book book){
        bookstore.remove(book.getIsbn());
    }
    public void update(Book book){
        bookstore.equals(book.getIsbn());
    }
}
