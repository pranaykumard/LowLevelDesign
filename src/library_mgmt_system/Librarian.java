package library_mgmt_system;

public class Librarian extends User {
    private final String employeeNumber;
    public Librarian(String name,String contactInfo) {
        super(name,contactInfo);
        this.employeeNumber = generateUniqueId();
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard and Employee Number: "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book){
        //implement
    }
    public void removeBook(Book book){
        //implement
    }

}
