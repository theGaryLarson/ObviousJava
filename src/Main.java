public class Main {

    public static void main(String[] args) {
        Textbook csc142 = new Textbook();
        csc142.isbn10 = "0-13-432276-2";
        csc142.title = "Building Java Programs: A Back to Basics Approach";
        csc142.author = "Stuart Reges & Marty Stepp";
        csc142.totalPages = 1194;

        System.out.println("Title: " + csc142.title);
        System.out.println("Author: " + csc142.author);
        System.out.println("Total Pages: " + csc142.totalPages);
        System.out.println("ISBN-10: " + csc142.isbn10);

    }
}
