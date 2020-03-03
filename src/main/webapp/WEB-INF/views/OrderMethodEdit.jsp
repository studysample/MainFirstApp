<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Opening Order Method Edit Page</title>
</head>
<body>
<h1>WELCOME TO OERDER METHOD REGISTER PAGE</h1>
<form:form action="update" method="POST" modelAttribute="orderMethod">
<pre>

Order Id:<form:input path="omId"/>

Order Mode:<form:radiobutton path="omMode" value="Sale"/>Sale
           <form:radiobutton path="omMode" value="Purchase"/>Purchase
           
Order Code:<form:input path="omCode"/>

Order Method:<form:select path="omMethod">
             <form:option value="">--SELECT--</form:option>
             <form:option value="FIFO">FIFO</form:option>
             <form:option value="LIFO">LIFO</form:option>
             <form:option value="FCFO">FCFO</form:option>
             <form:option value="FOLC">FOLC</form:option>
</form:select>

Order Accept:<form:checkbox path="omAccept" value="Multi-Model"/>Multi-Model
             <form:checkbox path="omAccept" value="Accept-Return"/>Accept-Return

Description:<form:textarea path="omDesc"/>
            <input type="submit" value="UPDATE ORDER METHOD">
</pre>
</form:form>
${message}
</body>
</html>