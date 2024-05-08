public class Main {
    public static void main(String[] args) {

        Author rowlingJoanne = new Author("Rowling", "Joanne");
        Author martinGeorge = new Author("Martin", "George");

        Book harryPotterOne = new Book("Harry Potter and the Philosopher's Stone", rowlingJoanne, 1997);
        Book aSongOfIceAndFireOne = new Book("A Game of Thrones", martinGeorge, 1991);
        aSongOfIceAndFireOne.setDateRelease(1996);

        System.out.println(rowlingJoanne.toString());
        System.out.println(harryPotterOne.toString());
    }
}
