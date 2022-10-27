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
	
	
 <script src="https://code.jquery.com/jquery-3.5.0.js"></script>

</head>
<body>
	<div class="col-md-8 format">

		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h4 style="text-align: center; margin-top: 20px">DANH SACH
						NHAN VIEN</h4> 
									<a href="/home/can-bo"
											style="border-radius: 45px;width: 150px;"
											class="btn btn-primary">Them Moi</a>
									

					<br />


					<table class="table table-bordered">
						<thead>
							<tr>
								<th>STT</th>
								<th>Ho ten</th>
								<th>Nu</th>
								<th>Dia chi</th>
								<th>Dien thoai</th>
								<th>Email</th>
								<th>Chuc vu</th>
								
								<th>Sua</th>
								<th>Xoa</th>
								<th>cap nhat chuc vu</th>
							</tr>
						</thead>
						<tbody>
							<%
							int i = 1;
							%>
							<c:forEach items="${listCanBo}" var="item">
								<tr>
									<td><%=i++%></td>
									<td>${item.name}</td>
									<td>${item.gender}</td>
									<td>${item.address}</td>
									<td>${item.phone}</td>
									<td>${item.email}</td>
									<td>${item.chucVu.chucVu}</td>
									
									
									<td>
									<a href="/home/update-can-bo?id=${item.id}"
											style="border-radius: 45px;width: 150px;"
											class="btn btn-primary">Sua</a>
									</td>
									
									<td>
									<a href="/home/canbo-delete?id=${item.id}"
									 onclick="return confirm('Do you want delete canBo?')"
											style="border-radius: 45px;width: 150px;"
											class="btn btn-primary">Xoa</a>
									</td>
									
									<td>
									<a href="/home/update-can-bo-chuc-vu?id=${item.id}"
											style="border-radius: 45px;width: 150px;"
											class="btn btn-primary">update_CV</a>
									</td>
								</tr>
							</c:forEach>

							

						</tbody>
					</table>

				</div>
			</div>
		</div>

	</div>


</body>
</html>