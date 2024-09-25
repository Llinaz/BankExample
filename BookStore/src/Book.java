public class Book extends PrintEdition {
    int quatityOfPages, year;
    String author;
    String[] pages;

    public Book(String name, int quatityOfPages, int year, String author, String[] pages) {
        super(name);
        this.quatityOfPages = quatityOfPages;
        this.year = year;
        this.author = author;
        this.pages = new String[quatityOfPages + 1];
        this.pages[0] = name + ", " + author;

        for (int i = 1; i < this.pages.length; i++) {
            this.pages[i] = pages[i - 1];
        }
    }
    public String getPage(int n) {
        return pages[n];
    }
}
