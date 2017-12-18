<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h2 style="color:green;"align="center">ORDER PROCESSED SUCCESFULLY</h2>
<h2 align="center">ORDER DETAILS</h2>
<div class="container">
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
		
		<h2 align="center">PRODUCT DETAILS</h2>
		<div align="center">
		  <table class="table table-bordered">
		<thead>
			<tr class="success">
				<th>ProductCode</th><th>ProductName</th><th>productLine</th><th>productScale</th>
				<th>productVendor</th><th>productDescription</th><th>quantityInStock</th><th>buyPrice</th><th>MSRP</th>				
			</tr>
			 </thead>
			
			<c:forEach items="${products}" var="product">
				 <tr class="active">
					<td>${product.productCode}</td>
					<td>${product.productName}</td>
					<td>${product.productLine}</td>
					<td>${product.productScale}</td>
					<td>${product.productVendor}</td>
					<td>${product.productDescription}</td>
					<td>${product.quantityInStock}</td>
					<td>${product.buyPrice}</td>
					<td>${product.MSRP}</td>
				</tr>
			</c:forEach>
			
		</table>
		</div>
		
</body>
</html>