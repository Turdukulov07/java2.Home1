final public class WorldBooks extends PopularBooks{
    private int quantity;
    private int volumeBook;

    public WorldBooks(Genre genre, String author_name, int price, String book_Name, int year_of_issue, int quantity, int volumeBook) {
        super(genre, author_name, price, book_Name, year_of_issue);
        this.quantity = quantity;
        this.volumeBook = volumeBook;
    }

    public WorldBooks(Genre genre, String author, int price, String namebook, int year) {
        super(genre, price, namebook, year);
    }

    @Override
    public void getInfo() {
        System.out.println("Количество = " + getQuantity() + " Том книг " + getVolumeBook());
        super.getInfo();
    }

    public int getQuantity() {
        return quantity;
    }

    public int getVolumeBook() {
        return volumeBook;
    }
}
