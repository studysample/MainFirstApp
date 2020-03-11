<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pdf View</title>
</head>
<body>
<%@include file="UserMenu.jsp"%>
<div class="container">

<div class="card">
<div class="card-body">
<a href="excel"><img src="../resources/images/excel.png" width="60" height="60" /></a> 
<a href="pdf"><img src="../resources/images/pdf.png" width="60" height="60" /></a>
<c:choose>
<c:when test="${!empty list}">
<table class="table table-hover">
<tr class="bg-success text-white">
<th>ID</th>
<th>PART CODE</th>
<th>LENGTH</th>
<th>WIDTH</th>
<th>HEIGHT</th>
<th>BASE COST</th>
<th>BASE CURRENCY</th>
<th>NOTE</th>
<th>UOMOB</th>
<th>OMSALEOB</th>
<th>OMPURCHASEOB</th>
<th colspan="3">OPERATIONS</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.id}</td>
<td>${ob.partCode}</td>
<td>${ob.partLen}</td>
<td>${ob.partWid}</td>
<td>${ob.partHgt}</td>
<td>${ob.baseCost}</td>
<td>${ob.baseCurrency}</td>
<td>${ob.note}</td>
<td>${ob.uomob.uomModel}</td>
<td><c:out value="${ob.omSaleOb.omCode}"/></td>
<td><c:out value="${ob.omPurchaseOb.omMode}"/></td>
<td><a href="delete?prid=${ob.id}"class="btn btn-danger">
<img src="../resources/images/delete.png" width="20" height="20" /></a></td>
<td><a href="edit?prid=${ob.id}" class="btn btn-info">
<img src="../resources/images/edit.png" width="20" height="20" /></a></td>
<td><a href="view?prid=${ob.id}"class="btn btn-warning">
<img src="../resources/images/view.png" width="20" height="20" /></a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise><H4>NO DATA FOUND!!</H4>
</c:otherwise>

</c:choose>
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