<%@ page import = "org.generation.italy.model.Book"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dettagli del libro</title>
</head>
<body>
    <h1>Libro correttamente inserito</h1>
    <%
        Book book = (Book)request.getAttribute("BOOK");
    %>
    <p>Id: <%=book.getId()%></p>
    <p>Nome: <%=book.getTitle()%></p>
    <p>Numero Pagine: <%=book.getNumPages()%></p>
    <p>Costo: <%=book.getCost()%></p>
    <a href="showBooks.do">Mostra tutti i libri!!</a>
</body>
</html>