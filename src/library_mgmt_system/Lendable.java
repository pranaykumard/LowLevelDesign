package library_mgmt_system;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
