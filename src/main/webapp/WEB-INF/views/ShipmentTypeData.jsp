<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shipment Data</title>
</head>
<body>
	<%@include file="UserMenu.jsp"%>
	<div class="container">

		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<H3>WELCOME TO SHIPMENT TYPE DATA PAGE</H3>

			</div>
			<div class="card-body">
				<a href="excel"><img src="../resources/images/excel.png"
					width="60" height="60" /></a> 
			    <a href="pdf"><img src="../resources/images/pdf.png" 
			        width="60" height="60" /></a>
				<c:choose>
					<c:when test="${!empty list }">
						<table class="table table-hover">
							<tr class="bg-success text-white">
							    <th>ID</th>
								<th>MODE</th>
								<th>CODE</th>
								<th>ENABLE</th>
								<th>GRADE</th>
								<th>NOTE</th>
								<th colspan="3">OPERATIONS</th>
							</tr>
							<!-- for(ShipmentType ob:list){} -->
							<c:forEach items="${list}" var="ob">
								<tr>
                                    <td>${ob.shipId}</td>
									<td>${ob.shipMode}</td>
									<td>${ob.shipCode}</td>
									<td>${ob.enbShip}</td>
									<td>${ob.shipGrade}</td>
									<td>${ob.shipDesc}</td>
									<td><a href="delete?sid=${ob.shipId}"
										class="btn btn-danger">  <img src="../resources/images/delete.png" width="20" height="20" />
											
									</a></td>
									<td><a href="edit?sid=${ob.shipId}" class="btn btn-info">
											 <img	src="../resources/images/edit.png" width="20" height="20" /> 
											
									</a></td>
									<td><a href="view?sid=${ob.shipId}"
										class="btn btn-warning"><img src="../resources/images/view.png" width="20" height="20" /> 
											

									</a></td>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<H4>NO DATA FOUND!!</H4>
					</c:otherwise>
				</c:choose>
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
		<!-- card end -->


	</div>
	<!-- container end -->
</body>
</html>
