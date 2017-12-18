<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Order Form</h2>
		
		<table>
			<form action="allModelOrders">
				<tr><td>OrderNumber     : </td><td><input type="text" name="orderNumber"/>
				<tr><td>ProductCode      : </td><td><input type="text" name="productCode"/></td></tr>
				
				<tr><td><input type="submit" value="Place Order"/></td></tr>
			</form>
		</table>
</body>
</html>