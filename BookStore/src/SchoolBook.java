public class SchoolBook extends Book {
    String subject;
    int grade;

    public SchoolBook(String name, int quantityOfPages, int year, String author, String[] pages, String subject, int grade) {
        super(name, quantityOfPages, year, author, pages);
        this.subject = subject;
        this.grade = grade;
    }
}
