<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="/CSS/admin-dashboard.css">

<title>Admin Dashboard</title>

<jsp:include page="Menu.jsp"></jsp:include>
</head>

<body>

<div class="dashboard-container">
	
	
	<div class="dashboard-header">
	
		<div class="card-icon">👤</div>
	
		<h4>Admin login successful.</h4>
		<h2>Welcome to Admin Dashboard</h2>
		
	
</div>

	<a href="/listOfAllContactMessages" class="dashboard-card">
		<div class="card-icon">📩</div>
		<h3>Contact Messages</h3>
		<p>View all messages received from visitors</p> <span>View
			Messages →</span>
	</a>

	<a href="/listOfRequestPrice" class="dashboard-card">
		<div class="card-icon">💰</div>
		<h3>Request Price</h3>
		<p>View and manage customer price requests</p> <span>View
			Requests →</span>
	</a>

	<a href="/" class="dashboard-card logout-card">
		<div class="card-icon">🚪</div>
		<h3>Logout</h3>
		<p>Logout from the Admin account</p> <span>Logout →</span>
	</a>

</div>

</body>

<jsp:include page="Footer.jsp"></jsp:include>
</html>