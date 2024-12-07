package library_mgmt_system;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String type;
    public Book(){
        this.isAvailable = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean lend(User user){
        if(user.canBorrowBooks()&&isAvailable){
            isAvailable = false;
            return true;
        }
        return false;
    }
    @Override
    public void returnBook(User user){
        isAvailable = true;
    }
    @Override
    public boolean isAvailable(){
        return isAvailable;

    }
    public abstract void displayBookDetails();
}
