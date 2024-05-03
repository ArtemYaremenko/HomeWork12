public class Book {
    private String titleBook;
    private String nameAuthor;
    private int dateRelease;

    public Book(String titleBook, String nameAuthor, int dateRelease) {
        this.titleBook = titleBook;
        this.nameAuthor = nameAuthor;
        this.dateRelease = dateRelease;
    }

    public Book(String titleBook, int dateRelease) {
        this(titleBook, "The author is unknown", dateRelease);
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }
}
