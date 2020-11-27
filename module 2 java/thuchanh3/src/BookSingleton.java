public class BookSingleton {
    private  String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Pattens";
        book = null;
        isLoanedOut = false;
    }

    
}
