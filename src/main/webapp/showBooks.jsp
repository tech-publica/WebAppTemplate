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
    <table>
        <thead>
            <th>Id</th><th>Titolo</th><th>Costo</th><th>Numero Pagine</th><th>Operazione</th>
        </thead>
        <tbody>
            <%
                for(Book b : books) {
            %>
            <tr>
                <td><%= b.getId() %></td>
                <td><%= b.getTitle() %></td>
                <td><%= b.getCost() %></td>
                <td><%= b.getNumPages() %></td>
                <td><a href ='findBook.do?id=<%= b.getId() %>'>Mostra dettagli</a></td>
            </tr>
            <%
            }
            %>
        </tbody>
     </table>
</body>
</html>