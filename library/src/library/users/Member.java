package library.users;

public class Member extends User   //M:A Task 4 Step 4.1
{
    private int borrowedBooksCount;  //M:A Task 4 Step 4.2
    private static final int MAX_BORROW_LIMIT =5;  //M:A Task 4 Step 4.2


    @Override
    public void displayDashboard() //M:A Task 4 Step 4.3
    {
        System.out.println("Member Dashboard and Books Borrowed:" + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() //M:A Task 4 Step 4.3
    {
        return borrowedBooksCount<MAX_BORROW_LIMIT;
    }

    public Member(String name,String contactinfo) //M:A Task 4 Step 4.4
    {
        super(name,contactinfo);
        this.borrowedBooksCount=0;
    }

    public Member()  //Creating because I wanted to test MA: Task 6 Step 6.3
    {
        super("Default", "default@gmail.com");
        this.borrowedBooksCount = 0;
    }

    /*
    @Override  //Creating because I wanted to test MA: Task 6 Step 6.3
    public String generateUniqueId()
    {
        return "ABC";
    }

    //Below error message I got because I override a final User method

    //java: generateUniqueId() in library.users.Member cannot override generateUniqueId() in library.users.User
    //  overridden method is final */

    //M:C Task 3 Step 4.2
        public void incrementBorrowedBooks() {
        borrowedBooksCount++;
        }

        public void decrementBorrowedBooks() {
            if (borrowedBooksCount > 0) {
                borrowedBooksCount--;
            }
        }

        public int getBorrowedBooksCount()
        {
            return borrowedBooksCount;
        }

}
