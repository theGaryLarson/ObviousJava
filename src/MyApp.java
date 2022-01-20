/**
 * Client code that is going to use supplier code Book.java
 */
public class MyApp {

    public static void main(String[] args) {

        //creating a Textbook instance (object) from the Textbook class
        Book csc142 = new Book();
        csc142.title = "Building Java Programs: A Back to Basics Approach";
        csc142.author = "Stuart Reges & Marty Stepp";
        csc142.totalPages = 1194;


        //viewing the member variables of csc142 Textbook instance
        System.out.println("Title: " + csc142.title);
        System.out.println("Author: " + csc142.author);
        System.out.println("Total Pages: " + csc142.totalPages);
        System.out.println("Current page: " + csc142.currentPage);
        csc142.nextPage();
        System.out.println("Current page: " + csc142.currentPage);



        System.out.println(csc142.toString());

    }
}
