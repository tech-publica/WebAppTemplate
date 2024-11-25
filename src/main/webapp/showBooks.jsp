<%@ page import = "org.generation.italy.model.Book, java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tutti i libri a disposizione</title>
</head>
<body>
    <%
    List<Book> books = (List <Book>)request.getAttribute("ALL_BOOKS");
    %>
</body>
</html>