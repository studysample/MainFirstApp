<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uom Data Page Is Here</title>
</head>
<body>
<h1>WELCOME TO UOM DATA PAGE</h1>
<a href="excel"><img src="../resources/images/excel.png" width="30" height="30"/></a>
<a href="pdf"><img src="../resources/images/pdf.png" width="30" height="30"/></a>
<c:choose>
<c:when test="${!empty list}">
<table border="1">

<tr>
<th>ID</th>
<th>TYPE</th>
<th>MODEL</th>
<th>DESCRIPTION</th>
<th colspan="3">Operation</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.uomId}</td>
<td>${ob.uomType}</td>
<td>${ob.uomModel}</td>
<td>${ob.uomDesc}</td>
<td><a href="delete?uid=${ob.uomId}"><img src="../resources/images/delete.png" width="30" height="30"/></a></td>
<td><a href="edit?uid=${ob.uomId}"><img src="../resources/images/edit.png" width="30" height="30"/></a></td>
<td><a href="view?uid=${ob.uomId}"><img src="../resources/images/view.png" width="30" height="30"/></a>
</td>

</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h2>NO DATA FOUND</h2>
</c:otherwise>
</c:choose>
${message}
</body>
</html>