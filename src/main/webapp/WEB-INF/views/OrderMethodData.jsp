<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Opening Order Method Data Page</title>
</head>
<body>
<h1>WECOME TO ORDER METHOD DATA PAGE </h1>
<a href="excel"><img src="../resources/images/excel.png" width="30" height="30"/></a>|
<a href="pdf"><img src="../resources/images/pdf.png" width="30" height="30"/></a>
<c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr>
<th>ID</th>
<th>MODE</th>
<th>CODE</th>
<th>METHOD</th>
<th>ACCEPT</th>
<th>DESCRIPTION</th>
<th colspan="3">OPERATION</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.omId}</td>
<td>${ob.omMode}</td>
<td>${ob.omCode}</td>
<td>${ob.omMethod}</td>
<td>${ob.omAccept}</td>
<td>${ob.omDesc}</td>

<td><a href="delete?oid=${ob.omId}"><img src="../resources/images/delete.png" width="30" height="30"/></a></td>
<td><a href="edit?oid=${ob.omId}"><img src="../resources/images/edit.png" width="30" height="30"/></a></td>
<td><a href="view?oid=${ob.omId}"><img src="../resources/images/view.png" width="30" height="30"/></a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h2>>NO DATA FOUND</h2>
</c:otherwise>
</c:choose>
${message}
</body>
</html>