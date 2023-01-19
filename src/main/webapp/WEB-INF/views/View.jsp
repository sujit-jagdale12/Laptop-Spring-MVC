<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="base.jsp"%>
<style type="text/css">
.container {
	align-content: center;
}
</style>
</head>

<body>
	<div class="container mt-5">
		<h1>*** Product Details ***</h1>
		<table border="4">
			<thead>
				<tr>
					<td>Product ID</td>
					<td>Product Name</td>
					<td>Product Description</td>
					<td>Product Price</td>
					<td>Actions</td>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${laps }" var="l">
					<tr>
						<td>PSNO.${l.id }</td>
						<td>${l.name }</td>
						<td>${l.desc }</td>
						<td>$${l.price }</td>

						<td><a href="update/${l.id }/" class="btn btn-success">edit</a>&nbsp;&nbsp;
							<a href="delete/${l.id }/" class="btn btn-danger">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<br> To add new product <a
			href="${pageContext.request.contextPath }/" class="btn btn-info">click
			here</a>
	</div>

</body>
</html>