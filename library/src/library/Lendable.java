package library;
import library.users.User;


//M:B Task 1 Step 1.1
public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
