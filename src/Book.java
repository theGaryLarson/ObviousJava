/**
 * supplier code to be used in MyApp
 */
public class Book {
    //fields
    String title;
    String author;
    int totalPages;
    int currentPage = 1;

    //constructors and constructor overloading
    public Book() {

    }
    public Book(String title, String author, int totalPages, int currentPage) {
        //this refers to the implicit parameter pg 552
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        //enforcing rules (class invariants)
        setPage(currentPage);
    }
    public Book(Book book) {
        title = book.getTitle();
        author = book.getAuthor();
        totalPages =book.getTotalPages();
        setPage(1);
    }

    //getters or accessors
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    //setters or mutators
    public void setPage(int page) {
        //class invariants pg 562
        if (page > 0 || page <= totalPages){
            currentPage = page;
        }
        else {
            if (page < 0) {
                System.out.println("Negative page numbers doesn't make sense");
            }
            else {
                System.out.println("There aren't that many pages in this book");
            }
            throw new IllegalArgumentException();
        }
    }
    public int nextPage(){
        setPage(currentPage + 1);
        return currentPage;
    }
    public int prevPage(){
        setPage(currentPage - 1);
        return currentPage;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author +"\nTotal Pages: " + totalPages;
    }
}
