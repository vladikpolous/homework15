package ua.com.alevel.slides;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> books = new ArrayList<>();


    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }


    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        storage.addAll(albums);
    }

    static class Book{

    }

    static class Album extends Book{

    }
}
