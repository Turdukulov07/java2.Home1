public class Books {
    public Genre genre;
    private String author_name;
    private int price;

    public Books(Genre genre, int i, String author_name, int price) {
        this.genre = genre;
        this.author_name = author_name;
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public int getPrice() {
        return price;
    }
}
