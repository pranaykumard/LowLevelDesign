package library_mgmt_system;

public class Librarian extends User {
    private String employeeNumber;
    public Librarian(String name,String contactInfo,String employeeNumber) {
        super(name,contactInfo);
        this.employeeNumber = employeeNumber;
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
