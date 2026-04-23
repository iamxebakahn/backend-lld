package library.users;

public class Librarian extends User  //M:A Task 5 Step 5.1
{
    private String employeeNumber;  //M:A Task 5 Step 5.2

    @Override
    public void displayDashboard() //M:A Task 5 Step 5.3
    {
        System.out.println("Librarian Dashboard and Employee Number:" + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() //M:A Task 5 Step 5.3
    {
        return true;
    }

    public Librarian(User u)   //Creating because I wanted to test MA: Task 6 Step 6.3
    {
        super(u);
    }

    /*
    public void addNewBook(Book book) //M:A Task 5 Step 5.4
    {
        //Yet to be implemented
    }
    public void removeBook(Book book)  //M:A Task 5 Step 5.4
    {
        //Yet to be implemented
    } */

}
