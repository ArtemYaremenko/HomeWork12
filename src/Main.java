public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Rowling", "Joanne");
        Author author2 = new Author("Martin", "George");

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1.getFullName(), 1997);
        Book book2 = new Book("A Game of Thrones", author2.getFullName(), 1991);

        book2.setDateRelease(1996);
    }
}