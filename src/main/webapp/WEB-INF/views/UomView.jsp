<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Opening Uom View Page</title>
</head>
<body>
<%@include file="UserMenu.jsp" %>
<div class="container">
<div class="card">
<div class="card-header bg-dark text-white text-uppercase text-italic">
<h4>WELCOME TO UOM VIEW PAGE</h4>
</div>

<div class="card-body">
<div class="row"></div>

<table class="table table-border bg-dark text-white">

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
</div>
<c:if test="${!empty message }">
				<c:choose>
					<c:when test="${opr eq 'DEL'}">
						<div class="card-footer bg-danger text-white text-center"><b>${message }</b></div>
					</c:when>
					<c:otherwise>
						<div class="card-footer bg-info text-white text-center"><b>${message }</b></div>
					
					</c:otherwise>
				</c:choose>
			</c:if>

</div>
</div>
</body>
</html>