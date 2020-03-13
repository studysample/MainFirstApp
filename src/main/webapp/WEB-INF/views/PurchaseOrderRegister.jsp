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
<%@include file="UserMenu.jsp" %>
<div class="container">
<div class="card">
<div class="card-header bg-primary text-center text-white text-uppercase">
<h4>Welcome to Purchase Order Register Page</h4>
</div>

<div class="card-body">
<form:form action="save" method="POST" modelAttribute="purchaseOrder">
<div class="row">
<div class="col-4"><label for="pcordCode">Order Code</label></div>
<div class="col-4"><form:input path="pcordCode" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="shipCode">Shipment Code</label></div>
<div class="col-4">
<form:select path="shipOb.shipId" class="form-control">
<form:option value="">-SELECT-</form:option>
<form:options items="${shipMap}"/>
</form:select>
</div>
</div>

<div class="row">
<div class="col-4"><label for="Vendor">Vendor</label></div>
<div class="col-4">
<form:select path="Vendor.userType" class="form-control">
<form:option value="">-SELECT-</form:option>
<form:options items="${whMap}"/>
</form:select>
</div>
</div>


<div class="row">
<div class="col-4"><label for="pcordReferanceNumber">Referance Number</label></div>
<div class="col-4"><form:input path="pcordReferanceNumber" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="pcordQualityCheck">Quality check</label></div>
<div class="col4">
<form:radiobutton path="pcordQualityCheck" value="Required"/>Required
<form:radiobutton path="pcordQualityCheck" value="Not Required"/>Not Required
</div>
<div class="col-4"></div>
</div>

<div class="row">
<div class="col-4"><label for="pcordDefaultStatus">Default Status</label></div>
<div class="col-4"><form:input path="pcordDefaultStatus" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="pordDesc">Description</label></div>
<div class="col-4"><form:textarea path="pordDesc" class="form-control"/></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"></div>
<div class="col-4">
<input type="submit" value="Place Order" class="btn btn-success" /> 
<input type="reset" value="Clear" class="btn btn-danger" />
</div>
</div>

</form:form>
</div>
<c:if test="${!empty message }">
<div class="card-footer bg-info text-white text-center">
<b>${message}</b>
</div>
</c:if>
</div>
</div>
</body>
</html>