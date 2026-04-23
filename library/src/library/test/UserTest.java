package library.test;
import library.users.Librarian;
import library.users.Member;
import library.users.User;
// import library.users.Librarian;
// import library.users.Member;
// M:A Task 2 Step 2.1

public class UserTest
{
    public static void main(String[] args)
    {
        //Creating because I wanted to test MA: Task 6 Step 6.3
        User defaultUser= new Member();
        User paramUser= new Member("Anaya","anaya.kan@gmail.com");
        User copyUser=new Librarian(defaultUser);

        System.out.println(paramUser.getName());
        System.out.println(paramUser.getContactInfo());
        System.out.println(defaultUser.getName());
        System.out.println(copyUser.getContactInfo());
        System.out.println(User.getTotalUsers());
    }
}
