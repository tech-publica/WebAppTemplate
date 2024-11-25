package org.generation.italy.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/showData")
public class ReadParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().write("<h1>Dati del programmatore</h1>");
        String pName = request.getParameter("pName");
        String pLastname = request.getParameter("pLastname");
        String pLanguage = request.getParameter("pLanguage");
        PrintWriter out = response.getWriter();
        out.println("<p>nome: "+ pName +" cognome: "+ pLastname +" linguaggio preferito: "+pLanguage +"</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}