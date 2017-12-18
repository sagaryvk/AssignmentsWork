<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
body {background-color: powderblue;}
h1   {color: blue;}
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
.control-label {
    color: #B4886B;
font-weight: bold;
display: block;
width: 150px;
float: left;
}
</style>
</head>
<body>
	
	<h1 align="center">Classic Models</h1>
	<p>
	<a href="allOrders">
  <button type="button" class="btn btn-primary">View Orders</button>
</a>
 
<a href="allProducts">
  <button type="button" class="btn btn-primary">View Products</button>
</a>
</p>
<table>
			<form action="searchOrders">
			
				<tr><td> <label class="control-label">OrderNumber</label>     </td><td><input type="text" name="orderNumber" placeholder="Enter Order Num.." />
				<tr><td><label class="control-label">OrderNumber</label>  </td><td><input type="text" name="productCode" placeholder="Enter product Code.."/></td></tr>
				
				<tr><td><button type="submit" class="btn btn-primary">Place Order</button></td></tr>
				
			</form>
		</table>
</body>
</html>