package org.generation.italy.model.repositories;

import org.generation.italy.model.Book;

import java.util.List;


public interface AbstractBookRepository {
    List<Book> getAll();
    Book findById(int id);
    Book create(Book b);
}
