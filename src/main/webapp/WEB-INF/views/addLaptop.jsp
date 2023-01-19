<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>add new laptop</title>
<style>
body {
	background-image: url('img_girl.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
</style>
</head>
<body>

	<div class="conatiner mt-5">
		<div class="row">
			<div class="col-md-5 offset-md-3">
				<h1 class="text-center mb-3">
					<i>Fill the product details</i>
				</h1>
				<form action="handledata" method="post">
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" placeholder="name" name="name">
					</div>

					<div class="form-group">
						<label for="desc">Product Description</label>
						<textarea class="form-control" id="desc" rows="3" name="desc"
							placeholder="write here..."></textarea>
					</div>
					<div class="form-group">
						<label for="price">Product Price</label> <input
							class="form-control" id="price" name="price" placeholder="$$$$">
					</div>
					<br>

					<div class="conatiner text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>&nbsp;&nbsp;

						<button type="submit" class="btn btn-outline-primary">add</button>
					</div>
				</form>

			</div>
		</div>

	</div>

</body>
</html>