<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<h4>
			<b>Update</b>${message}
		</h4>
		<form class="container" action="/home/update-can-bo-chuc-vu" method="POST">

			<div class="form-group row">
				<label for="name" class="col-md-3 col-form-label"><b>Ho
						ten </b></label>
				<div class="col-sm-9">
					<input type="hidden" name="id" id="id" value="${canBo.id}">
					<input type="text" class="form-control mb-2 mr-sm-2 "
						required="required" name="name" placeholder="Enter category"
						id="name" value="${canBo.name}">
				</div>
				

			</div>
			
			<div class="form-group row">
				<label for="chucvu" class="col-md-3 col-form-label"><b>Chuc Vu</b></label>
				<div class="col-sm-9">


					<select id="chucvu" class="form-control" name="chucVu">
						<c:forEach items="${listChucVu}" var="item">

							<option value="${item.id}"
								${item.id == canBo.chucVu.id? 'selected' : ''}>
								${item.chucVu}</option>

						</c:forEach>

					</select>
				</div>

			</div>
			
			
   <div class="form-group row">
    <label for="dateBoNhiem" class="col-md-3 col-form-label" ><b>Ngay</b></label>
     <div class="col-sm-9">
    <input type="date" class="form-control"  id="dateBoNhiem" name="dateBoNhiem"  partern="dd/MM/YYYY"
    value="<fmt:formatDate value='${canBo.dateBoNhiem}' pattern='yyyy-MM-dd' />">
    </div>
    
  </div>
  

			
			

			<div class="form-group row">
				<div class="col-md-3 "></div>
				<div class="col-sm-9 form-group">
					<button type="submit" class="btn btn-primary">update</button>
				</div>

			</div>


		</form>
</body>
</html>