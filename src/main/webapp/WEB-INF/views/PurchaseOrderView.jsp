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
<div class="card-header bg-primary text-white text-center text-uppercase">
<h4>welcome to purchse order data view page</h4>
</div>

<div class="card-body">
<div class="row"></div>

<table class="table table-hover table-dark background-color: transparent ">
<tr class="bg-success text-white ">
<tr>
<th>ID</th><td>${ob.pcordId }</td>
</tr>

<tr>
<th>SHIPMENT CODE</th><td>${ob.pcordShipmentCode }</td>
</tr>

<tr>
<th>ORDER CODE</th><td>${ob.pcordCode }</td>
</tr>

<tr>
<th>VENDOR</th><td>${ob.pcordVendor }</td>
</tr>

<tr>
<th>REFERENCE NUMBER</th><td>${ob.pcordReferanceNumber }</td>
</tr>

<tr>
<th>QYALITY CHECK</th><td>${ob.pcordQualityCheck }</td>
</tr>

<tr>
<th>DEFAULT STATUS</th><td>${ob.pcordDefaultStatus }</td>
</tr>

<tr>
<th>DESCRIPTION</th><td>${ob.pordDesc }</td>
</tr>
</table>

<a href="excel?purchaseid=${ob.pcordId}"><img src="../resources/images/excel.png" width="30" height="30"/></a> | 
<a href="pdf?purchaseid=${ob.pcordId}"><img src="../resources/images/pdf.png" width="30" height="30"/></a>

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