<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</head>
<body>
	<div class="container">
		<h4>
		${message}
			<b>Them</b>
		</h4>
		<form class="container" action="/home/can-bo" method="POST">

			<div class="form-group row">
				<label for="name" class="col-md-3 col-form-label"><b>Ho
						ten </b></label>
				<div class="col-sm-9">
					
					<input type="text" class="form-control mb-2 mr-sm-2 "
						required="required" name="name" placeholder="Enter category"
						id="name" >
				</div>

			</div>

			<div class="form-group row">
				<label for="name" class="col-md-3 col-form-label"><b>Gioi
						Tinh </b></label>
				<div class="col-sm-9">
					<input type="radio" name="gender" value="1" checked> Nam <input
						type="radio" name="gender" value="0"
						> Nu
				</div>

			</div>
			
			<div class="form-group row">
				<label for="name" class="col-md-3 col-form-label"><b>Dia Chi</b></label>
				<div class="col-sm-9">
					
					<input type="text" class="form-control mb-2 mr-sm-2 "
						required="required" name="address" placeholder="Enter address"
						id="address" >
				</div>

			</div>
			
			
			<div class="form-group row">
				<label for="phone" class="col-md-3 col-form-label"><b>Dien Thoai</b></label>
				<div class="col-sm-9">
					
					<input type="text" class="form-control mb-2 mr-sm-2 "
						required="required" name="phone" placeholder="Enter address"
						id="phone" >
				</div>

			</div>
			
				<div class="form-group row">
				<label for="email" class="col-md-3 col-form-label"><b>Email</b></label>
				<div class="col-sm-9">
					
					<input type="email" class="form-control mb-2 mr-sm-2 "
						required="required" name="email" placeholder="Enter address"
						id="email" >
				</div>

			</div>
			

			<div class="form-group row">
				<div class="col-md-3 "></div>
				<div class="col-sm-9 form-group">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>

			</div>


		</form>

	</div>
</body>
</html>





