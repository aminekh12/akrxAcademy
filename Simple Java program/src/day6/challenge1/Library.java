package day6.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }

    public void showAllBooks(){

        for (Book book:books) {
            System.out.println(book.toString());
        }
        
    }
}
