<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Opening Uom View Page</title>
</head>
<body>
<h1>WELCOME TO UOM VIEW PAGE</h1>
<table border="1">

<tr>
<th>ID</th><td>${ob.uomId}</td>
</tr>
<tr>
<th>TYPE</th><td>${ob.uomType}</td>
</tr>
<tr>
<th>MODEL</th><td>${ob.uomModel}</td>
</tr>
<tr>
<th>DESCRIPTION</th><td>${ob.uomDesc}</td>
</tr>

</table>
<a href="excel?id=${ob.uomId}"><img src="../resources/images/excel.png" width="30" height="30"/></a>
<a href="pdf?id=${ob.uomId}"><img src="../resources/images/pdf.png" width="30" height="30"/></a>
</body>
</html>