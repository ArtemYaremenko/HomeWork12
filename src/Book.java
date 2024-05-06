public class Book {
    private String titleBook;
    Author author;
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
}
