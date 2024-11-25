package org.generation.italy.servlets.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.generation.italy.model.Book;
import org.generation.italy.model.repositories.AbstractBookRepository;
import org.generation.italy.model.repositories.BookRepository;

public class CreateBookAction implements Action {
    private AbstractBookRepository bookRepo = new BookRepository();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
       String title = request.getParameter("title");
       int numPages = Integer.parseInt(request.getParameter("numPages"));
       double cost = Double.parseDouble(request.getParameter("cost"));
       int id = Integer.parseInt(request.getParameter("id"));
       Book b = new Book(id,title,numPages,cost);
       bookRepo.create(b);
        request.setAttribute("BOOK",b);
        return "confirmCreate.jsp";
    }
}
