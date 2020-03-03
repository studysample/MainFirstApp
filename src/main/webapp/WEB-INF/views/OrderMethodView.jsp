<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Opening Order Method View Page</title>
</head>
<body>
<h1>WELCOME TO ORDER METHOD VIEW PAGE</h1>
<table border="1">

<tr>
<th>ID</th> <td>${ob.omId}</td>
</tr>
<tr>
<th>MODE</th> <td>${ob.omMode}</td>
</tr>
<tr>
<th>CODE</th> <td>${ob.omCode}</td>
</tr>
<tr>
<th>METHOD</th> <td>${ob.omMethod}</td>
</tr>
<tr>
<th>ACCEPT</th> <td>${ob.omAccept}</td>
</tr>
<tr>
<th>DESCRIPTION</th> <td>${ob.omDesc}</td>
</tr>
</table>
<a href="excel?id=${ob.omId}"><img src="../resources/images/excel.png" width="30" height="30"/></a>
<a href="pdf?id=${ob.omId}"><img src="../resources/images/pdf.png" width="30" height="30"/></a>
</body>
</html>