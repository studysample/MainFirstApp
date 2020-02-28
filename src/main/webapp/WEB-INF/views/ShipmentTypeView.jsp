<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCONE TO SHIPMENT TYPE VIEW PAGE</h3>

<table border="1">

<tr>
<th>ID</th><td>${ob.shipId}</td>
</tr>
<tr>
<th>MODE</th><td>${ob.shipMode}</td>
</tr>
<tr>
<th>CODE</th><td>${ob.shipCode}</td>
</tr>
<tr>
<th>ENABLE</th><td>${ob.enbShip}</td>
</tr>
<tr>
<th>GRADE</th><td>${ob.shipGrade}</td>
</tr>
<tr>
<th>NOTE</th><td>${ob.shipDesc}</td>
</tr>


</table>
<a href="excel?id=${ob.shipId}"><img src="../resources/images/excel.png" width="30" height="30"/></a> | 
<a href="pdf?id=${ob.shipId}"><img src="../resources/images/pdf.png" width="30" height="30"/></a>

</body>
</html>