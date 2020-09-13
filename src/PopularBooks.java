public class PopularBooks extends Books {
    private String book_Name;
    private int year_of_issue;

    public PopularBooks(Genre genre, String author_name, int price, String book_Name, int year_of_issue) {
        super(genre, price, author_name, price);
        this.book_Name = book_Name;
        this.year_of_issue = year_of_issue;
    }

    public PopularBooks(Genre genre, int price, String namebook, int year) {
        super(genre, price, namebook, year);
    }

    public String getBook_Name() {
        return book_Name;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }
    public void getInfo(){
        System.out.println(" Названия книга " + book_Name +
                " Год выпуска " + getYear_of_issue() + " Имя " + getAuthor_name() + " Жанр книга " + getGenre() + " Цена книг " + getPrice());

    }
    public final void book (String book_Name, int year_of_issue){
        System.out.println(" Названия книга " + getBook_Name() + " Год выпуска " + getYear_of_issue());
    }
    public final  void getInfo(int year_of_issue){
        System.out.println(" Год выпуска " + year_of_issue);
    }

}
