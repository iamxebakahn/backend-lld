package library;

import library.users.User;

public abstract class Book implements Lendable {
    private String isbn; //M:B Task 2 Step 2.1
    private String title; //M:B Task 2 Step 2.1
    private String author; //M:B Task 2 Step 2.1
    private boolean isAvailable; //M:B Task 2 Step 2.1

    @Override
    public boolean lend(User user)  //M:B Task 2 Step 2.2
    {
        if(isAvailable && user.canBorrowBooks())
        {
            isAvailable=false;
            return true;
        }

        return false;
    }

    @Override
    public void returnBook(User user)   //M:B Task 2 Step 2.2
    {
        isAvailable=true;
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
