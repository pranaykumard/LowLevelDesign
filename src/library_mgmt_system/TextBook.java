package library_mgmt_system;

public class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook(String isbn,String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }


    @Override
    public void displayBookDetails() {
        System.out.println("isbn: "+this.getIsbn());
        System.out.println("title: "+this.getTitle());
        System.out.println("author: "+this.getAuthor());
        System.out.println("genre: "+this.subject);
        System.out.println("edition: "+this.edition);
    }

}
