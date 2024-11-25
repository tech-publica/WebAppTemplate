package org.generation.italy.servlets.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.generation.italy.model.Book;
import org.generation.italy.model.repositories.AbstractBookRepository;
import org.generation.italy.model.repositories.BookRepository;

public class FindBookByIdAction implements Action {
  //  private AbstractBookRepository bookRepo = new BookRepository();
   // private AbstractBookRepository bookRepo = RepositoryFactory.getInstance().getBookRepository();
   private AbstractBookRepository bookRepo;
   // public FindBookByIdAction(BookRepository br){NOOOO
   //     this.bookRepo = br;  NOOOO
   // }NOOOO
    public FindBookByIdAction(AbstractBookRepository abr){
        this.bookRepo = abr;
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Book found = bookRepo.findById(id);
        request.setAttribute("BOOK",found);
        return "bookDetails.jsp";
    }
}
