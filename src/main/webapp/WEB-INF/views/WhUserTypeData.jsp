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
<div class="class-header bg-primary text-white texr-center">
<h3>WELCOME TO WHUSER TYPE DATA</h3></div>
<div class="card-body">
<a href="excel"><img src="../resources/images/excel.png" width="60" height="60"></a>
<a href="pdf"><img src="../resources/images/pdf.png" width="60" height="60"></a>
<c:choose>
<c:when test="${!empty list}">
<table class="table table-hover">
 <tr class="bg-success text-white">
<td>USER ID</td> 
<td>USER TYPE</td>
<td>USER CODE</td>
<td>USER FOR</td>
<td>USER EMAIL</td>
<td>USER CONTACT</td>
<td>USER ID TYPE</td>
<td>USER IF OTHER</td>
<td>USER IDNUMBER</td>
<td colspan="3">USER OPERATIONS</td>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.userId}</td>
<td>${ob.userType}</td>
<td>${ob.userCode}</td>
<td>${ob.userFor}</td>
<td>${ob.userEmail}</td>
<td>${ob.userContact}</td>
<td>${ob.userIdType}</td>
<td>${ob.userIfOther}</td>
<td>${ob.userIdNumber}</td>

<td><a href="delete?usid=${ob.userId}" class="btn btn-danger">
<img src="../resources/images/delete.png" width="20" height="20" /></a></td>
											 
<td><a href="edit?usid=${ob.userId}" class="btn btn-info">
<img src="../resources/images/edit.png" width="20" height="20" /> </a></td>
											
<td><a href="view?usid=${ob.userId}" class="btn btn-warning">
<img src="../resources/images/view.png" width="20" height="20" /></a></td>
											
</tr>
</c:forEach>

</table>
</c:when>
<c:otherwise><h4>!!NO DATA FOUNT!!</h4></c:otherwise>
</c:choose>
</div>
<c:if test="${!empty list}">
<c:choose>
<c:when test="${opr eq 'DEL'}">
<div class="card-footer bg-danger text-white text-center"><b>${message}</b></div>
</c:when>
<c:otherwise><div class="card=footer bg-info text-white text-cneter">
<b>${message}</b>
</div>
</c:otherwise>
</c:choose>
</c:if>

</div>
</div>

</body>
</html>
