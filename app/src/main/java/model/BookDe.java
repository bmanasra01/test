package model;

import java.util.ArrayList;
import java.util.List;

public class BookDe implements ibookDa{
    private ArrayList<Book> books = new ArrayList<>();

    public BookDe(){
        books.add(new Book(300,"hgh","dfghj"));
        books.add(new Book(320,"hgh","dfghj"));
        books.add(new Book(350,"hgh","dfghj"));

    }
    public List<Book> getBooks(String cat){
        ArrayList<Book> data = new ArrayList<>();
        for (Book b : books){
            if (b.getCatogry().equals(cat)){
                data.add(b);
            }
        }
        return data;


    }
}
