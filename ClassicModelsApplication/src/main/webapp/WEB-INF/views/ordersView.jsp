<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h2 style="color:green;"align="center">ORDER DETAILS</h2>

<div align="center">
		<table class="table table-bordered">
		
			<tr class="success">
				
				<th>orderNumber</th><th>productCode</th><th>quantityOrdered</th><th>priceEach</th><th>orderLineNumber</th>				
			</tr>
			
			<c:forEach items="${orders}" var="order">
				<tr class="active">
					<td>${order.orderId.orderNumber}</td>
					<td>${order.orderId.productCode}</td>
					<td>${order.quantityOrdered}</td>
					<td>${order.priceEach}</td>
					<td>${order.orderLineNumber}</td>
					
				</tr>
			</c:forEach>
			
		</table>
		</div>
		
	
		
</body>
</html>