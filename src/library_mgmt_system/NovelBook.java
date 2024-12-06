package library_mgmt_system;

public class NovelBook extends Book {
    private String genre;
    public NovelBook(String isbn,String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        //display
        System.out.println("isbn: "+this.getIsbn());
        System.out.println("title: "+this.getTitle());
        System.out.println("author: "+this.getAuthor());
        System.out.println("genre: "+this.genre);
    }
}
