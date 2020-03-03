<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uom Register Page</title>
</head>
<body>
<h1>WELCOME TO UOM REGISTER PAGE</h1>
<form:form action="save" method="POST" modelAttribute="uom">
<pre>
Uom Type:<form:select path="uomType">
         <form:option value="">----Select----</form:option>
         <form:option value="PACKING">PACKING</form:option>
         <form:option value="NOPACKING">NOPACKING</form:option>
         <form:option value="NOPACKING">NOPACKING</form:option>
         <form:option value="NA">--NA--</form:option>

Uom Model:<form:input path="uomModel"/>

Description:<form:textarea path="uomDesc"/>
            <input type="submit" value="CREATE UOM"/>

</form:select>



</pre>


</form:form>
${message}
</body>
</html>