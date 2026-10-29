class Book{
    static String bname;
    static String author;
    static void create(){
        bname="Core java";
        author="james";
    }
    static void bookDetails(){
        System.out.println("Book Name="+Book.bname);
        System.out.println("Book Author="+Book.author);
    }
    /*public static void main(String[] args) {
        create();
        bookDetails();
    }*/

}

public class Static{
    public static void main(String[] args) {
        Book.create();
        Book.bookDetails();
    }
}
