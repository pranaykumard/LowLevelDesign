package library_mgmt_system;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        Book book1 = new TextBook("123","Ncert","Pranay","Science",1);
        Book book2 = new NovelBook("245","Champa","Hari","Adventure");

        libraryManagementSystem.addBook(book1);
        libraryManagementSystem.addBook(book2);
        User user = new Member("Pranay","",0);
        User user2 = new Librarian("Hari","");

        if(book1.lend(user)){
            System.out.println("Book Lended the book");
        }
        book1.returnBook(user);

        List<Book> bookList = libraryManagementSystem.searchBooks("Pranay");
        for(Book book : bookList){
            System.out.println(book.getTitle());
        }


    }
}
