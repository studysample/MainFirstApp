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
<h3>Welcome To Part Register Page</h3>
</div>

<div class="card-body">
<form:form action="save" method="POST" modelAttribute="part">
<div class="row">
<div class="col-4"><label for="partCode">Code</label></div>
<div class="col-4"><form:input path="partCode" class="form-control" /></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="partLen">Length</label></div>
<div class="col-4"><form:input path="partLen" class="form-control" /></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="partWid">Width</label></div>
<div class="col-4"><form:input path="partWid" class="form-control" /></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="partHgt">Height</label></div>
<div class="col-4"><form:input path="partHgt" class="form-control" /></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="baseCost">Base Cost</label></div>
<div class="col-4"><form:input path="baseCost" class="form-control" /></div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="baseCurrency">Base Currency</label></div>
<div class="col-4">
   <form:select path="baseCurrency" class="form-control">
   <form:option value="">--SELECT--</form:option>
   <form:option value="INR">INR</form:option>
   <form:option value="AVS">AVS</form:option>
   <form:option value="USO">USO</form:option>
   <form:option value="ERO">ERO</form:option>
   </form:select>
</div>
<div class="col-4"><!-- Error Message --></div>
</div>

<div class="row">
<div class="col-4"><label for="uomob">UOM</label></div>
<div class="col-4">
   <form:select path="uomob.uomId" class="form-control">
   <form:option value="">--SELECT--</form:option>
   <form:options items="${uomMap}"/>
</form:select>
</div>
</div>

<div class="row">
<div class="col-4"><label for="omCode">Order Method code</label></div>
<div class="col-4">
<form:select path="omSaleOb.omId" class="form-control">
<form:option value="">-SELECT-</form:option>
<form:options items="${omSaleMap}"/>
</form:select>
</div>
</div>

<div class="row">
<div class="col-4"><label for="omMode">Order Method Mode</label></div>
<div class="col-4">
<form:select path="omPurchaseOb.omId" class="form-control">
<form:option value="">-SELECT-</form:option>
<form:options items="${omPurchaseMap}"/>
</form:select>
</div>
</div>


<div class="row">
<div class="col-4"><label for="note">Note</label></div>
<div class="col-4"><form:textarea path="note" class="form-control" /></div>
<div class="col-4"><!-- Error Message --></div>
</div>

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