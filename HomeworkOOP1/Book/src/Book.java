public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int pageCount;

    public Book(){
        this("TestBook", "It's me", 1111, true, 5);
    }
    public Book(String title, String author, int year){
        this(title, author, year, true, 5);
    }
    public Book(String title, String author, int year, boolean isAvailable, int pageCount){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pageCount = pageCount;
    }
    public String displayInfo(){
        String InfoBookRes = title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
        return InfoBookRes;
    }
    public boolean borrowBook(){
        this.isAvailable = false;
        return isAvailable;
    }
    public boolean returnBook(){
        this.isAvailable = true;
        return isAvailable;
    }
    public int updateYear(int newYear){
        this.year = newYear;
        return year;
    }
}
