package library;
import library.users.User;

//M:B Task 1 Step 1.3
public class DummyLendable implements Lendable {

    private boolean available=true;
    @Override
    public boolean lend(User user){
        if(available){
            available=false;
            System.out.println("Dummy item lent to:"+user.getName());
            return true;
        }

        return false;
    }

    @Override
    public void returnBook(User user){
        available = true;
        System.out.println("Dummy item returned by:"+user.getName());
    }

    @Override
    public boolean isAvailable(){
        return available;
    }
}
