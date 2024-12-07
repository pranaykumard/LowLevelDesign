package library_mgmt_system;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public List<Book> bookInventory;
    public List<User> registeredUsers;
    public LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }
    public void addBook(Book book){
        bookInventory.add(book);
    }
    public void registerUser(User user){
        registeredUsers.add(user);
    }
    public List<Book> searchBooks(String criteria){
        List<Book> books = new ArrayList<>();
        for(Book book : bookInventory){
            if(book.getTitle().equalsIgnoreCase(criteria)||book.getAuthor().equalsIgnoreCase(criteria)){
                books.add(book);
            }
        }
        return books;
    }
    public List<Book> searchBooks(String criteria, String type){
        List<Book> books = new ArrayList<>();
        for(Book book : bookInventory){
            if((book.getTitle().equalsIgnoreCase(criteria)||book.getAuthor().equalsIgnoreCase(criteria))&&book.getType().equals(type)){
                books.add(book);
            }
        }
        return books;
    }
    public void displayAllBooks(){
        for(Book book : bookInventory){
            book.displayBookDetails();
        }
    }
    public void displayAllUsers(){
        for(User user : registeredUsers){
            System.out.println("user id is:"+user.getUserId()+" user name is: "+user.getName());
        }
    }
}
