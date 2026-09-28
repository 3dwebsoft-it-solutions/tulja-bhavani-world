
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Tulja Bhavani World</title>

<link rel="stylesheet" href="/CSS/addUser.css">

</head>


<body>

	<!-- ================= MENU ================= -->
	<jsp:include page="Menu.jsp"></jsp:include>

	<!-- ================= MENU ================= -
		
<		!-- User Message -->

	<c:if test="${not empty successMessage}">
		<div class="alert alert-success">${successMessage}</div>
	</c:if>

	<c:if test="${not empty errorMessage}">
		<div class="alert alert-danger">${errorMessage}</div>
	</c:if>


	<!-- ================= MAIN CONTENT ================= -->

	<main class="add-user-container">

		<form action="/addUser" method="post">

			<!-- First Name -->
			<label>First Name</label> <input type="text" name="firstName"
				placeholder="Enter First Name" required>


			<!-- Last Name -->
			<label>Last Name</label> <input type="text" name="lastName"
				placeholder="Enter Last Name" required>


			<!-- Mobile Number -->
			<label>Mobile Number</label> <input type="tel" name="mobileNumber"
				placeholder="Enter Mobile Number" pattern="[0-9]{10}" maxlength="10"
				required>


			<!-- Email -->
			<label>Email</label> <input type="email" name="email"
				placeholder="Enter Email" required>

			<!-- Password -->
			<label>Password</label> <input type="text" name="password"
				placeholder="Enter password" required>


			<!-- Role -->
			<label>Role</label> <select name="role" required>

				<option value="">-- Select Role --</option>

				<option value="ADMIN">Admin</option>

				<option value="EMPLOYEE">Employee</option>

				<option value="EMPLOYEE">User</option>

			</select>


			<!-- Gender -->
			<label>Gender</label>

			<div class="gender-group">

				<label> <input type="radio" name="gender" value="Male"
					required> Male
				</label> <label> <input type="radio" name="gender" value="Female">
					Female
				</label> <label> <input type="radio" name="gender" value="Other">
					Other
				</label>

			</div>


			<!-- Submit -->
			<button type="submit" value="submit">Register</button>

		</form>

	</main>


	<!-- ================= FOOTER ================= -->

	<footer>

		<jsp:include page="Footer.jsp"></jsp:include>

	</footer>


</body>

</html>