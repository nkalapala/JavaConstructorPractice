package love.programming;

public class Book {
    private String bookGenre;
    private String bookName;
    private String bookPages;
    private String bookAuthor;

    public Book(){
    this("default bookGenre","default bookName","default bookPages");
    }
    public Book(String bookGenre) {
        this.bookGenre = bookGenre;
        System.out.println(bookGenre);
    }
    public Book(String bookGenre,String bookName){
        this.bookGenre = bookGenre;
        this.bookName = bookName;
        System.out.println(bookGenre+bookName);
    }
    public Book(String bookGenre,String bookName,String bookPages){
        this.bookGenre = bookGenre;
        this.bookName = bookName;
        this.bookPages = bookPages;
        System.out.println(bookGenre+bookName+bookPages);
    }
    public Book(String bookGenre,String bookName,String bookPages,String bookAuthor){
        this.bookGenre = bookGenre;
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookAuthor = bookAuthor;
        System.out.println(bookGenre+bookName+bookPages+bookAuthor);
    }
}
