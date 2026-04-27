package library;

//M:B Task 4 Step 4.1
public class TextBook extends Book
{
    private String subject; //M:B Task 4 Step 4.1
    private int edition; //M:B Task 4 Step 4.1

    //M:B Task 4 Step 4.2
    public TextBook(String isbn, String title, String author, String subject, int edition)
    {
        super(isbn,title,author);
        this.subject=subject;
        this.edition=edition;
    }


    //M:B Task 4 Step 4.3
    @Override
    public void displayBookDetails()
    {
        System.out.println("Textbook-> ISBN:"+getisbn());
        System.out.println("Title:"+getTitle());
        System.out.println("Author:"+getAuthor());
        System.out.println("Subject:"+subject);
        System.out.println("Edition:"+edition);
    }



}
