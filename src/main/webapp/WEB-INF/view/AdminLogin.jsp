<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Admin Login</title>

<link rel="stylesheet" href="/CSS/admin.css">

</head>


<body>



	<div class="login-container">

		<div class="login-box">

			<h2>Welcome Back</h2>

			<p class="subtitle">Login to your account</p>

			<h3 style="color: red">${msg}</h3>
			<form action="/admin/loginProcess" method="post">


				<!-- EMAIL -->

				<div class="form-group">

					<label for="email"> Email Address </label> <input type="email"
						id="email" name="email" placeholder="Enter your email" required
						autocomplete="email">

				</div>


				<!-- PASSWORD -->

				<div class="form-group">

					<label for="password"> Password </label> <input type="password"
						id="password" name="password" placeholder="Enter your password"
						required autocomplete="current-password">

				</div>


				<!-- REMEMBER ME -->

				<div class="remember"></div>


				<!-- LOGIN BUTTON -->

				<button type="submit" value="login" class="login-btn">
					Login</button>


				<!-- MESSAGE -->

				<div id="message"></div>


			</form>


		</div>

	</div>


	<script src="JS/login.js"></script>

</body>

</html>