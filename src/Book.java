import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int dateRelease;

    public Book(String titleBook, Author author, int dateRelease) {
        this.titleBook = titleBook;
        this.author = author;
        this.dateRelease = dateRelease;
    }

    public Book(String titleBook, int dateRelease) {
        this.titleBook = titleBook;
        Author author = new Author(null, null);
        this.dateRelease = dateRelease;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return author.getFullName();
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        return author.toString() + " - " + titleBook + ", " + dateRelease + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book newBook = (Book) other;
        return titleBook.equals(newBook.titleBook) && author.equals(newBook.author) && dateRelease == newBook.dateRelease;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, dateRelease);
    }
}
