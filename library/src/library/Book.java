package library;

import library.users.User;
import library.users.Member;

public abstract class Book implements Lendable {
    private String isbn; //M:B Task 2 Step 2.1
    private String title; //M:B Task 2 Step 2.1
    private String author; //M:B Task 2 Step 2.1
    private boolean isAvailable; //M:B Task 2 Step 2.1

    @Override
    public boolean lend(User user)  //M:B Task 2 Step 2.2  M:C Task 4 Step 4.2
    {
        if (!(user instanceof Member)) {
            System.out.println("Only members can borrow books.");
            return false;
        }

        Member member = (Member) user;

        if (!isAvailable) {
            System.out.println("Book is not available.");
            return false;
        }

        if (!member.canBorrowBooks()) {
            System.out.println("Borrowing limit reached.");
            return false;
        }

        isAvailable = false;
        member.incrementBorrowedBooks();

        return true;
    }

    @Override
    public void returnBook(User user)   //M:B Task 2 Step 2.2  M:C Task 5 Step 5.1
    {
        if (user instanceof Member) {
            Member member = (Member) user;
            member.decrementBorrowedBooks();
        }

        isAvailable = true;  //M:C Task 5 Step 5.2
    }

    @Override
    public boolean isAvailable()    //M:B Task 2 Step 2.2
    {
        return isAvailable;
    }

    public abstract void displayBookDetails();  //M:B Task 2 Step 2.3

    public Book()  //M:B Task 3 Step 3.1
    {
        this.isAvailable=true;
    }
    public Book(String isbn, String title, String author) //M:B Task 3 Step 3.1
    {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }

    public Book(Book book)  //M:B Task 3 Step 3.1
    {
        this.isbn=book.isbn;
        this.title=book.title;
        this.author=book.author;
        this.isAvailable=book.isAvailable;
    }

    //MC: Task 1 Step 1.4
    public String getTitle() {
        return title;
    }

    //MC: Task 1 Step 1.4
    public String getAuthor() {
        return author;
    }
        //MC: Task 1 Step 1.4
    public String getisbn(){
            return isbn;
    }

}
