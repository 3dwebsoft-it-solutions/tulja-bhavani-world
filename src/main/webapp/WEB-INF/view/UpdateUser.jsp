
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="Menu.jsp"></jsp:include>
<meta charset="UTF-8">

<title>Update User</title>

<link rel="stylesheet" href="/CSS/updateUser.css">

</head>

<body>

	<div class="update-page">

		<div class="container">

			<h2>Update User Profile</h2>

			<!--
        POST request will be sent to:

        /updateUserById/{id}
    -->

			<form action="/updateUserById/${user.id}" method="post">

				<!-- User ID -->
				<div class="form-group">
					<label>User ID</label> <input type="text" name="id"
						value="${user.id}" readonly>
				</div>


				<!-- First Name -->
				<div class="form-group">

					<label>First Name</label> <input type="text" name="firstName"
						value="${user.firstName}" placeholder="Enter first name" required>

				</div>


				<!-- Last Name -->
				<div class="form-group">

					<label>Last Name</label> <input type="text" name="lastName"
						value="${user.lastName}" placeholder="Enter last name" required>

				</div>


				<!-- Email -->
				<div class="form-group">

					<label>Email</label> <input type="email" name="email"
						value="${user.email}" placeholder="Enter email" required>

				</div>



				<!-- Mobile Number -->
				<div class="form-group">

					<label>Mobile Number</label> <input type="text" name="mobileNumber"
						value="${user.mobileNumber}" placeholder="Enter mobile number"
						required>

				</div>


				<!-- Role -->
				<div class="form-group">

					<label>Role</label> <select name="role">

						<option value="ADMIN" ${user.role == 'ADMIN' ? 'selected' : ''}>
							ADMIN</option>

						<option value="EMPLOYEE"
							${user.role == 'EMPLOYEE' ? 'selected' : ''}>EMPLOYEE</option>

						<option value="USER" ${user.role == 'USER' ? 'selected' : ''}>
							USER</option>

					</select>

				</div>


				<!-- Gender -->
				<div class="form-group">

					<label>Gender</label>

					<div class="gender">

						<input type="radio" name="gender" value="Male"
							${user.gender == 'Male' ? 'checked' : ''}> <label>Male</label>


						<input type="radio" name="gender" value="Female"
							${user.gender == 'Female' ? 'checked' : ''}> <label>Female</label>


						<input type="radio" name="gender" value="Other"
							${user.gender == 'Other' ? 'checked' : ''}> <label>Other</label>

					</div>

				</div>


				<!-- Buttons -->
				<div class="buttons">

					<a href="/home" class="btn cancel-btn"> Cancel </a>

					<button type="submit" class="btn update-btn">Update User</button>

				</div>

			</form>

		</div>

	</div>

</body>


</html>

