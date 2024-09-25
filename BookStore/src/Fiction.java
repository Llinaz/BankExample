public class Fiction extends Book {
    String genre;
    public Fiction(String name, int quatityOfPages, int year, String author, String[] pages, String genre) {
        super(name, quatityOfPages, year, author, pages);
        this.genre = genre;
    }
}
