package library;

//MC: Task 1 Step 1.4 , //MB: Task 3 Step 3.2
public class testBookClass extends Book
{
    public testBookClass()
    {
        super();
    }

    public testBookClass(String isbn, String title, String author)
    {
        super(isbn, title, author);
    }

    public testBookClass(Book book)
    {
        super(book);
    }


    @Override
    public void displayBookDetails()
    {
        System.out.println("Book title:"+ getTitle());
        System.out.println("Book author:"+getAuthor());
        System.out.println("Book isbn:"+getisbn());
    }
}
