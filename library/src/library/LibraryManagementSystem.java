package library;

import library.users.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem  //MC: Task 1 Step 1.1
{
    private List<Book> bookInventory; //MC: Task 1 Step 1.1
    private List<User> registeredUsers;  //MC: Task 1 Step 1.1

    public LibraryManagementSystem()
    {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book)  //MC: Task 1 Step 1.3
    {
        bookInventory.add(book);
    }
    public void registerUser(User user)   //MC: Task 1 Step 1.3
    {
        registeredUsers.add(user);
    }

    //MC: Task 1 Step 1.4
    public void printAllUsers()
    {
        System.out.println("List of Users");
        for(User user: registeredUsers)
        {
            System.out.println(user.getName());
        }

    }

    //MC: Task 1 Step 1.4
    public void printAllBooks()
    {
        System.out.println("List of Books");
        for(Book book:bookInventory)
        {
            book.displayBookDetails();
        }
    }

}
