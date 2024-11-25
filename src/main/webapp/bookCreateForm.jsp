<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Crea un  nuovo libro</title>
</head>
<body>
    <form method = 'post' action = 'createBook.do' >
    <label for = 'title'> titolo:  </label>
    <input type = 'text' name = 'title' id ='title'> <br>
    <label for = 'numPages'> numero pagine:</label>
    <input type = 'number' name = 'numPages' id ='numPages'> <br>
    <label for = 'cost'> costo:</label>
    <input type = 'number' name = 'cost'id = 'cost'> <br>
    <label for = 'id'>id: </label>
    <input type = 'number' name = 'id'id ='id'> <br>
    <button>Crea nuovo libro</button>
    </form>
</body>
</html>