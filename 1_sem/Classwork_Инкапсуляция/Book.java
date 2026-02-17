public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int pageCount;

    private static int totalBooks = 0;
    public static final int MAX_YEAR = 2025;

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
        totalBooks++;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return isAvailable; }
    public int getPageCount() { return pageCount; }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        }
    }

    public void setYear(int year) {
        if (year >= 1 && year <= MAX_YEAR) {
            this.year = year;
        }
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String displayInfo() {
        return title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
    }

    public String displayInfo(boolean detailed) {
        if (detailed) {
            return "Название: " + title + "\n" +
                    "Автор: " + author + "\n" +
                    "Год издания: " + year + "\n" +
                    "Доступность: " + (isAvailable ? "Доступна" : "Не доступна") + "\n" +
                    "Количество страниц: " + pageCount;
        } else {
            return title + " - " + author + " (" + year + ")";
        }
    }

    public boolean borrowBook(){
        this.isAvailable = false;
        return isAvailable;
    }

    public boolean borrowBook(String borrowerName){
        this.isAvailable = false;
        System.out.println("Книгу '" + title + "' взял(а): " + borrowerName);
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