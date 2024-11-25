package org.generation.italy.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.generation.italy.model.repositories.BookRepository;
import org.generation.italy.servlets.actions.*;

import java.io.IOException;

@WebServlet("*.do")
public class  ControllerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String path = request.getServletPath();
        System.out.println(path);
        String actionString = path.substring(path.lastIndexOf("/") +1,path.lastIndexOf(".do"));
        Action action = createAction(actionString);
        String jspName = action.execute(request, response);
        RequestDispatcher dispatcher = request.getRequestDispatcher(jspName);
        dispatcher.forward(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       doGet(request,response);
    }
    private Action createAction(String actionString){
       Action action = null;
        switch(actionString){
            case "showCreateBookForm":
                action = (request, response) ->"bookCreateForm.jsp";
                break;
            case "createBook":
                action = new CreateBookAction();
                break;
            case "showBooks":
                action = new ShowBooksAction();
                break;
            case "findBook":
                action = new FindBookByIdAction(new BookRepository());
                break;
            default:
               // action = new DefaultAction();
                action = (request, response) -> "actionNotFound.jsp";
        }
        return action;
    }

}
