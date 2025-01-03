package library_mgmt_system;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    public static int totalUsers = 0;

    public User() {
        this.userId = generateUniqueId();

    }

    public User(String name,String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User user) {
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public static int getTotalUsers(){
        return totalUsers;
    }
    public final String generateUniqueId(){
        totalUsers += 1;
        return ""+(totalUsers+1);
    }

    public String getUserId() {
        return userId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    //since Students and Professor inherit from User and we only need those objects and not User object
    //we made it abstract class
    //we will display dashboard for Student and professor differently
    public abstract void displayDashboard();
    //we will have different rules of borrowing books for Student and professor
    public abstract boolean canBorrowBooks();
}
