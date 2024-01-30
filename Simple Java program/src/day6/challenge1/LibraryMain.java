package day6.challenge1;

public class LibraryMain {
    public static void main(String[] args) {

        Book fictionBook= new FictionBook("HO","amine","111111","EN");
        Book fictionBook2= new FictionBook("HZO","amine","111111","ES");

        Book fictionBook3= new FictionBook("HBO","amine","2222","AR");
        Book romanceBook= new RomanceBook("Romance","amine","333","Ro");

        Library library = new Library();
        library.addBook(fictionBook);
        library.addBook(fictionBook2);
        library.addBook(fictionBook3);
        library.addBook(romanceBook);


        library.showAllBooks();





    }
}
