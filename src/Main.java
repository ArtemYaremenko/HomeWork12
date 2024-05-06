public class Main {
    public static void main(String[] args) {

        Author rowlingJoanne = new Author("Rowling", "Joanne");
        Author martinGeorge = new Author("Martin", "George");

        Book harryPotterOne = new Book("Harry Potter and the Philosopher's Stone", rowlingJoanne, 1997);
        Book aSongOfIceAndFire = new Book("A Game of Thrones", martinGeorge, 1991);
        aSongOfIceAndFire.setDateRelease(1996);
    }
}
