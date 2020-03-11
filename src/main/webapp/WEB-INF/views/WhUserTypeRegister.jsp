<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
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
<div class="card-header bg-primary text-center text-white text-uppercase">
<h3>Welcome to WhUserType Register Page</h3>

</div>
<div class="card-body">
<form:form action="save" method="POST" modelAttribute="whUserType">

<div class="row">
<div class="col-4"><label for="userType">User Type</label></div>
<div class="col-4">
<form:radiobutton path="userType" value="Vendor"/>Vendor
<form:radiobutton path="userType" value="Customer"/>Customer
</div>
<div class="col-4"></div>
</div>

<div class="row">
<div class="col-4"><label for="userCode">User Code</label></div>
<div class="col-4"><form:input path="userCode" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="userFor">User For</label></div>
<div class="col-4"><form:input path="userFor" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="userEmail">User Email</label></div>
<div class="col-4"><form:input path="userEmail" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="userContact">User Contact</label></div>
<div class="col-4"><form:input path="userContact" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="userIdType">User ID Type </label></div>
<div class="col-4">
<form:select path="userIdType" class="form-control">
<form:option value="">-Select-</form:option>
<form:option value="PANCARD">PANCARD</form:option>
<form:option value="AADHAR CARD">AADHAR CARD</form:option>
<form:option value="VOTER ID">VOTER ID</form:option>
<form:option value="OTHER">OTHER</form:option>
</form:select>
</div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="userIfOther">User If Other</label></div>
<div class="col-4"><form:input path="userIfOther" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="userIdNumber">User Id Number</label></div>
<div class="col-4"><form:input path="userIdNumber" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"></div>
<div class="col-4"><input type="submit" value="Create" class="btn btn-success" /> 
<input type="reset" value="Clear" class="btn btn-danger" /></div>
</div>

</form:form>

</div>

<c:if test="${!empty message}">
<div class="card-footer bg-info text-white text-center">
<b>${message}</b>
</div>
</c:if>
</div>


</div>

</body>
</html>