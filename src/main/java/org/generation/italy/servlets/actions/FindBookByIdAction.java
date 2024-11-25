package org.generation.italy.servlets.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.generation.italy.model.Book;
import org.generation.italy.model.repositories.AbstractBookRepository;
import org.generation.italy.model.repositories.BookRepository;

public class FindBookByIdAction implements Action {
    private AbstractBookRepository bookRepo = new BookRepository();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Book found = bookRepo.findById(id);
        request.setAttribute("BOOK",found);
        return "bookDetails.jsp";
    }
}
