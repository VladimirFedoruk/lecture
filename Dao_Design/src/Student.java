public class Student {
    public static void main(String[] args) {
        MySqlBookDao dao= new MySqlBookDao();
        Book book = new Book("1", "Fedoruk", "Beloe");
        dao.create(book);
        book.setTitle("Update");
        dao.update(book);
        dao.delete(book);
        dao.findAllBooks(); // переписать базу данных в коллекцию и из коллекции выводить на консоль

    }
}
