package library.test;
import library.*;
import library.users.Librarian;
import library.users.Member;
import library.users.User;
import java.util.ArrayList;
import java.util.List;

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

        //M:C Task 2 Step 2.3
        List<Book> result1 = system.searchBooks("kite");
        for (Book b : result1) {
            b.displayBookDetails();
        }

        List<Book> result2 = system.searchBooks("suns", "NovelBook");

        for (Book b : result2) {
            b.displayBookDetails();
        }

        //M:C Task 3 Step 3.1
        Book tb1 = new TextBook("101", "Operating Systems", "Galvin", "CS", 5);
        Book tb2 = new TextBook("102", "Database Systems", "Korth", "CS", 4);

        Book nb1 = new NovelBook("201", "Harry Potter", "J.K. Rowling", "Fantasy");
        Book nb2 = new NovelBook("202", "The Alchemist", "Paulo Coelho", "Fiction");
        system.addBook(tb1);
        system.addBook(tb2);
        system.addBook(nb1);
        system.addBook(nb2);

        //M:C Task 3 Step 3.2

        User m1 = new Member("Lee", "lee@gmail.com");
        User m2 = new Member("Sam", "sam@gmail.com");
        User lbrn = new Librarian(m1);
        system.registerUser(m1);
        system.registerUser(m2);
        system.registerUser(lbrn);

        //M:C Task 3 Step 3.3
        system.printAllUsers();
        system.printAllBooks();


        //M:C Task 4 Step 4.1

        Book book = new TextBook("111", "OS", "Clein", "CS", 5);
        User meme = new Member("Moma", "moma@gmail.com");

        boolean success = book.lend(meme);

        if (success) {
            System.out.println("Book lent successfully!");
        } else {
            System.out.println("Book could not be lent.");
        }

        //M:C Task 4 Step 4.2  //M:C Task 5 Step 5.3
        boolean secondAttempt = book.lend(member);

        if (!secondAttempt) {
            System.out.println("Book already lent! Cannot borrow again.");
        }

        //M:C Task 4 Step 4.3
        boolean success2=book.lend(lbrn);
        if (success2) {
            System.out.println("Book lent successfully!");
        } else {
            System.out.println("Book could not be lent.");
        }

        Book b11 = new NovelBook("301", "Book1", "Author1", "Fiction");
        Book b12 = new NovelBook("302", "Book2", "Author2", "Fiction");
        Book b13 = new NovelBook("303", "Book3", "Author3", "Fiction");
        Book b14 = new NovelBook("304", "Book4", "Author4", "Fiction");
        Book b15 = new NovelBook("305", "Book5", "Author5", "Fiction");
        Book b16 = new NovelBook("306", "Book6", "Author6", "Fiction");

        b11.lend(m1);
        b12.lend(m1);
        b13.lend(m1);
        b14.lend(m1);
        b15.lend(m1);
        b16.lend(m1);

        boolean success3=book.lend(m1);
        if (success3) {
            System.out.println("Book lent successfully!");
        } else {
            System.out.println("Limit Exceeded!");
        }

        //M:C Task 5 Step 5.3
        book.returnBook(meme);

        system.addBook(new TextBook("601", "Operating Systems", "Galvin", "CS", 5));
        system.addBook(new TextBook("602", "Database Systems", "Korth", "CS", 4));
        system.addBook(new NovelBook("603", "Harry Potter", "J.K. Rowling", "Fantasy"));
        system.addBook(new NovelBook("604", "The Alchemist", "Paulo Coelho", "Fiction"));

        List<Book> result4 = system.searchBooks("systems");
        for (Book b : result4) {
            b.displayBookDetails();
        }

        List<Book> result5 = system.searchBooks("harry", "NovelBook");

        for (Book b : result5) {
            b.displayBookDetails();
        }


    }
}

