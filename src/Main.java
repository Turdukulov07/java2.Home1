public class Main {

    public static void main(String[] args) {
        ReadBook readBook = new ReadBook("Читать книгу это полезно" );
        PopularBooks object1 = new PopularBooks(Genre.FANTASTIC, "Роулинг ", 3000, "Гарри Поттер", 1997);
        WorldBooks object2;
        object2 = new WorldBooks(Genre.NOVEL, "Ремерка", 1500,  "Три товарища ", 1936, 10000, 2);
        WorldBooks object3;
        object3 = new WorldBooks(Genre.POETRY, " С.Есенин", 500, "Стихотворения ", 1925, 1000, 1);
        System.out.println("Year - " + object1.getYear_of_issue()+ "\nName - " + object1.getBook_Name()+
                "\nReadBook - " + readBook.getString()+ "\nGenre - "+ object1.getGenre());
        System.out.println("Year - " + object2.getYear_of_issue()+ "\nName - " + object2.getBook_Name()+
                "\nReadBook - " + readBook.getString()+ "\nGenre - "+ object2.getGenre());
        System.out.println("Year - " + object3.getYear_of_issue()+ "\nName - " + object3.getBook_Name()+
                "\nReadBook - " + readBook.getString()+ "\nGenre - "+ object3.getGenre());


        object1.getInfo();
        object2.getInfo();
        object3.getInfo();

    }
}
