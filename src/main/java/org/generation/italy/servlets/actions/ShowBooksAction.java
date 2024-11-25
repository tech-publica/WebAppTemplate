package org.generation.italy.servlets.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.generation.italy.model.Book;
import org.generation.italy.model.repositories.AbstractBookRepository;
import org.generation.italy.model.repositories.BookRepository;

import java.util.List;

public class ShowBooksAction implements Action{
    private AbstractBookRepository bookRepo = new BookRepository();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        List<Book> all = bookRepo.getAll();
        request.setAttribute("ALL_BOOKS", all);
        return "allBooks.jsp";
    }
}
