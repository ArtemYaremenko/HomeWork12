public class Book {
    private String titleBook;
    Author author;
    private int dateRelease;

    public Book(String titleBook, Author author, int dateRelease) {
        this.titleBook = titleBook;
        this.author = author;
        this.dateRelease = dateRelease;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }
}
