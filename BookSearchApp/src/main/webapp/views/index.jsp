<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Details</title>
</head>
<body>
<form action="getBook">
BookId:<input type="text" name="id">
<input type="submit" value="Search">
<br>
<hr/>
</form>

Book Id: ${book.bookId}<br>
Book Name: ${book.bookName}<br>
Book Price: ${book.bookPrice}<br>
</body>
</html>