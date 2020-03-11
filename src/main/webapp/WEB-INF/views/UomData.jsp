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
<%@include file="UserMenu.jsp"%>
<div class="container">
<div class="card ">
<div class="card-header bg-primary text-dark text-uppercase text-center">

<h3>WELCOME TO UOM DATA PAGE</h3>
</div>
<div class="card-body">
<a href="excel"><img src="../resources/images/excel.png" width="30" height="30"/></a>
<a href="pdf"><img src="../resources/images/pdf.png" width="30" height="30"/></a>
<c:choose>
<c:when test="${!empty list}">
<table class="table table-hover">

<tr class="bg-dark text-white">
<th>ID</th>
<th>TYPE</th>
<th>MODEL</th>
<th>DESCRIPTION</th>
<th colspan="3">Operation</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr class="bg-dark text-white">
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
</div>
<c:if test="${!empty message }">
				<c:choose>
					<c:when test="${opr eq 'DEL'}">
						<div class="card-footer bg-danger text-white text-center">
							<b>${message }</b>
						</div>
					</c:when>
					<c:otherwise>
						<div class="card-footer bg-info text-white text-center">
							<b>${message }</b>
						</div>

					</c:otherwise>
				</c:choose>
			</c:if>


</div>
</div>
</body>
</html>