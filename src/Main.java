public class Main {

    public static void main(String[] args) {

        //creating a Textbook instance (object) from the Textbook class
        Textbook csc142 = new Textbook();
        csc142.isbn10 = "0-13-432276-2";
        csc142.title = "Building Java Programs: A Back to Basics Approach";
        csc142.author = "Stuart Reges & Marty Stepp";
        csc142.totalPages = 1194;

        Textbook csc143 = new Textbook();
        csc143.isbn10 = "0-13-432276-2";
        csc143.title = "Building Java Programs: A Back to Basics Approach";
        csc143.author = "Stuart Reges & Marty Stepp";
        csc143.totalPages = 1194;


        //viewing the member variables of csc142 Textbook instance
        System.out.println("Title: " + csc142.title);
        System.out.println("Author: " + csc142.author);
        System.out.println("Total Pages: " + csc142.totalPages);
        System.out.println("ISBN-10: " + csc142.isbn10);

        System.out.println("Title: " + csc143.title);
        System.out.println("Author: " + csc143.author);
        System.out.println("Total Pages: " + csc143.totalPages);
        System.out.println("ISBN-10: " + csc143.isbn10);

    }
}
