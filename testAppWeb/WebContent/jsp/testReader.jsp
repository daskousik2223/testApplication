<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Reader Utility</title>
</head>
<body>
<h1>This is a file reader utility</h1>
<hr color="red">
<form action="/testAppWeb/FileHandlerServlet" method="post">
File path : <input type="text" size="50" name="fname">
<input type="submit" value="Read File">
</form>
</body>
</html>