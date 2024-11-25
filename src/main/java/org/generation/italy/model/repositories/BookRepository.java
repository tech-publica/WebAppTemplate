package org.generation.italy.model.repositories;

import org.generation.italy.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements AbstractBookRepository {
    private static Map <Integer, Book> data = new HashMap<>();

    @Override
    public List<Book> getAll() {

        return new ArrayList<>(data.values());
    }

    @Override
    public Book findById(int id)
    {
        return data.get(id);
    }

    @Override
    public Book create(Book b) {
        data.put(b.getId(), b);
        return b ;
    }
}
