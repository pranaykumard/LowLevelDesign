package library_mgmt_system;

public class Member extends User {
    private int borrowedBooksCount;
    static int MAX_BORROW_LIMIT = 5;
    public Member(String name,String contactInfo,int borrowedBooksCount) {
        super(name,contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard and Books Borrowed: "+borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
