package library.test;
import library.*;
import library.users.Librarian;
import library.users.Member;
import library.users.User;

// M:A Task 2 Step 2.1

public class UserTest
{
    public static void main(String[] args)
    {
        /*
        //Creating because I wanted to test MA: Task 6 Step 6.3

        User defaultUser= new Member();
        User paramUser= new Member("Anaya","anaya.kan@gmail.com");
        User copyUser=new Librarian(defaultUser);

        System.out.println(paramUser.getName());
        System.out.println(paramUser.getContactInfo());
        System.out.println(defaultUser.getName());
        System.out.println(copyUser.getContactInfo());
        System.out.println(User.getTotalUsers());

        //M:B Task 1 Step 1.3

        User user = new Member("Zeba","zeva.kahn@gmail.com");
        Lendable item = new DummyLendable();
        System.out.println(item.isAvailable());
        item.lend(user);
        System.out.println(item.isAvailable());
        item.returnBook(user);
        System.out.println(item.isAvailable()); */


        //MC: Task 1 Step 1.4
        LibraryManagementSystem system = new LibraryManagementSystem();
        User member = new Member("Zeba","zeva.kahn@gmail.com");
        User member2= new Member("Anaya","anaya.kan@gmail.com");
        User librarian = new Librarian(member2);
        system.registerUser(member);
        system.registerUser(librarian);
        System.out.println("Users added successfully!");
        system.printAllUsers();
        Book book1=new testBookClass("101","My Experiments with Truth", "M.K.Gandhi");
        system.addBook(book1);
        system.printAllBooks();

        //MB: Task 3 Step 3.2
        Book b1= new testBookClass();
        b1.displayBookDetails();
        Book b2= new testBookClass("102","The White Tiger","Aravind Adiga");
        b2.displayBookDetails();
        Book b3= new testBookClass(book1);

        //M:B Task 4 Step 4.4
        Book txtbook= new TextBook("103","The Kite Runner","Khaled Hosseini","Polity",1);
        txtbook.displayBookDetails();

        //M:B Task 5 Step 5.4
        Book novel=new NovelBook("104","A Thousand Splendid Suns","Khaled Hossein","Polity");
        novel.displayBookDetails();
    }
}

