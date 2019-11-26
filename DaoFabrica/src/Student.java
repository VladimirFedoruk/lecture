public class Student {
    public static void main(String[] args) {
        Factory factory = new FactoryImpl();
        Dao dao = new factory.createDao();

        Book book = new Book("1", "Fedoruk", "Beloe");
        dao.create(book);
        book.setTitle("Update");
        dao.update(book);
        dao.delete(book);
        dao.findAllBooks(); // переписать базу данных в коллекцию и из коллекции выводить на консоль

    }
}
