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
<div class="card-header bg-secondary text-white text-uppercase ">
<h1>WELCOME TO UOM REGISTER PAGE</h1>
</div>
<div class="card-body">
<form:form action="save" method="POST" modelAttribute="uom">


<div class="row">
<div class="col-4"><label for="uomType">Uom Type</label></div>
<div class="row">
<form:select path="uomType" class="form-control">
<form:option value="">----Select----</form:option>
         <form:option value="PACKING">PACKING</form:option>
         <form:option value="NOPACKING">NOPACKING</form:option>
         <form:option value="NA">--NA--</form:option>
</form:select>
</div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="uomModel">Uom Model</label></div>
<div class="row">
<form:input path="uomModel" class="form-control"/>
</div>
</div>
<div class="col-4"><!-- Error Message --></div>						


<div class="row">
<div class="col-4"><label for="uomDesc">Uom Description</label></div>
<div class="row">
<form:textarea path="uomDesc" class="form-control"/>
</div>
</div>
<div class="col-4"><!-- Error Message --></div>						


<div class="row">
<div class="col-4"></div>
<div class="col-4">
<input type="submit" value="Create" class="btn btn-success" /> 
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