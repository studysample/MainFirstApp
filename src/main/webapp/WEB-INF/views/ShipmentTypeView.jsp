 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="UserMenu.jsp"%>
<div class="container">
<div class="card">
<div class="card-header bg-success text-white text-uppercase">
<h3>WELCONE TO SHIPMENT TYPE VIEW PAGE</h3>
</div>
<div class="card-body">
<div class="row"></div>

<table class="table table-hover table-dark">
<tr class="bg-success text-white">

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