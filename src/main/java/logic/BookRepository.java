package logic;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        books.add(new Book("Harry Potter P1", "Rouling"));
        books.add(new Book("Harry Potter P2", "Rouling"));
        books.add(new Book("Harry Potter P3", "Rouling"));
    }
    public void addNewBook(Book book){
        books.add(book);
    }
    public void removeBook(int id){
        books.remove(id);
    }
    public List<Book> getBooks(){
        return books;
    }
    /*public Book getBookById(int id){

    }*/
}
