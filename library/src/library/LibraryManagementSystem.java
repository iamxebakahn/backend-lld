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

    //MC: Task 1 Step 1.4 MC: Task 6 Step 6.2
    public void printAllUsers()
    {
        if(registeredUsers.isEmpty())
        {
            System.out.println("No users registered.");
            return;
        }
        System.out.println("List of Users");
        for(User user: registeredUsers)
        {
            System.out.println(user.getName());
            System.out.println(user.getContactInfo());
            System.out.println(user.generateUniqueId());
        }

    }

    //MC: Task 1 Step 1.4  MC: Task 6 Step 6.1
    public void printAllBooks()
    {
        if (bookInventory.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("List of Books");
        for(Book book:bookInventory)
        {
            book.displayBookDetails();
        }
    }

    //M:C Task 2 Step 2.1

    public List<Book> searchBooks(String criteria)
    {
        List<Book> result = new ArrayList<>();
        criteria=criteria.toLowerCase();

        for(Book book:bookInventory)
        {
                if(book.getTitle().toLowerCase().contains(criteria) ||book.getAuthor().toLowerCase().contains(criteria))
                    result.add(book);
        }

        return result;
    }


    //M:C Task 2 Step 2.2
    public List<Book> searchBooks(String criteria, String type)
    {
        List<Book> result = new ArrayList<>();
        criteria=criteria.toLowerCase();

        for(Book book:bookInventory)
        {
            boolean criteria_match = (book.getTitle().toLowerCase().contains(criteria)) || (book.getAuthor().toLowerCase().contains(criteria));

            boolean type_match = (type.equals("TextBook") && book instanceof TextBook) || (type.equals("NovelBook") && book instanceof NovelBook)   ;

            if (criteria_match && type_match)
                result.add(book);
        }

        return result;
    }

}
