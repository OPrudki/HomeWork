public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Dobry Slonia", "Ivan", "Pomidorow",
                1895, 48, 32);
        Book book2 = new Book("Dobry Piton", "Maria", "Ogurtsowa",
                1985, 84, 23);
        Book book3 = new Book("Zoo", "Ivan", "Pomidorow",
                "Maria", "Ogurtsowa", 2017, 148, 54);

        Author author1 = new Author("Ivan", "Pomidorow", 688018930,
                "ivan_sobaka@net.ue", "London", 1871);
        Author author2 = new Author("Maria", "Ogurtsowa", "London", 1884);

        System.out.println(book1.equalsBookAuthors());
        System.out.println(book2.equalsBookAuthors());
        System.out.println(book3.equalsBookAuthors());
        System.out.println(book1.toStringBook());
        System.out.println(book2.toStringBook());
        System.out.println(book3.toStringBook());

        System.out.println(author1.equalsAuthors());
        System.out.println(author2.equalsAuthors());
        System.out.println(author1.toStringAuthor());
        System.out.println(author2.toStringAuthor());
    }
}
