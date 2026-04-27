package library;


//M:B Task 5 Step 5.1
public class NovelBook extends Book
{
    private String genre; //M:B Task 5 Step 5.1

    //M:B Task 5 Step 5.2
    public NovelBook(String isbn, String title, String author, String genre)
    {
        super(isbn,title,author);
        this.genre=genre;
    }

    //M:B Task 5 Step 5.3
    @Override
    public void displayBookDetails()
    {
        System.out.println("Textbook-> ISBN:"+getisbn());
        System.out.println("Title:"+getTitle());
        System.out.println("Author:"+getAuthor());
        System.out.println("Genre:"+genre);
    }

}
