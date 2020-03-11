<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="UserMenu.jsp" %>

<div class="container">
<div class="card">

<div class="card-header bg-success text-center text-white text-uppercase">
<h4>Welcome To Purchase Order Data Page </h4>
</div>

<div class="card-body">
<a href="excel"><img src="../resources/images/excel.png" width="60" height="60" /></a> 
<a href="pdf"><img src="../resources/images/pdf.png" width="60" height="60" /></a>
<div class="row">
<div class="col-4"></div>
<c:choose>
<c:when test="${!empty list }">
<table class="table table-hover table-border" >
<tr class="bg-primary text-black"> 
<th>ID</th>
<th>ORDER CODE</th>
<th>SHIPMENT CODE</th>
<th>VENDOR</th>
<th>REFERENCE NUMBER</th>
<th>QYALITY CHECK</th>
<th>DEFAULT STATUS</th>
<th>DESCRIPTION</th>
<th colspan="3">OPERATIONS</th>
</tr>

<c:forEach items="${list }" var="ob">
<tr>
<td>${ob.pcordId }</td>
<td>${ob.pcordCode }</td>
<td>${ob.pcordShipmentCode }</td>
<td>${ob.pcordVendor }</td>
<td>${ob.pcordReferanceNumber }</td>
<td>${ob.pcordQualityCheck }</td>
<td>${ob.pcordDefaultStatus }</td>
<td>${ob.pordDesc }</td>

<td><a href="delete?purchaseid=${ob.pcordId}" class="btn btn-danger">
<img src="../resources/images/delete.png" width="20" height="20" /></a></td>

<td><a href="edit?purchaseid=${ob.pcordId}" class="btn btn-info">
<img src="../resources/images/edit.png" width="20" height="20" />  </a></td>
											
<td><a href="view?purchaseid=${ob.pcordId}" class="btn btn-warning">
<img src="../resources/images/view.png" width="20" height="20" />  </a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<H4>NO DATA FOUND!!</H4>
</c:otherwise>
</c:choose>
</div>
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