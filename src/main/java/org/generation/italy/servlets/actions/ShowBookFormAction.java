package org.generation.italy.servlets.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ShowBookFormAction implements Action{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        return "bookCreateForm.jsp";
    }
}
