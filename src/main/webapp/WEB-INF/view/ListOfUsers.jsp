
<%@page import="jakarta.persistence.EntityManager"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>All Users</title>

    <link rel="stylesheet" href="/CSS/listOfUsers.css">

    <jsp:include page="Menu.jsp"></jsp:include>

</head>

<body>


	<h3>Total Users: ${user.size()}</h3>

	<!-- Update Success Message -->

	<c:if test="${not empty successMsg}">

		<div class="success-message">${successMsg}</div>

	</c:if>


	<!-- for Update Error Message -->

	<c:if test="${not empty error}">

		<div class="error-message">${error}</div>

	</c:if>



<div class="table-container">
	<table>

		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile Number</th>
			<th>Role</th>
			<th>Gender</th>
			<th>Action</th>


		</tr>

		<c:forEach var="u" items="${user }">
			<tr>
				<td><c:out value="${u.id }"></c:out></td>
				<td><c:out value="${u.firstName}"></c:out></td>
				<td><c:out value="${u.lastName }"></c:out></td>
				<td><c:out value="${u.email}"></c:out></td>
				<td><c:out value="${u.mobileNumber }"></c:out></td>
				<td><c:out value="${u.role }"></c:out></td>
				<td><c:out value="${u.gender }"></c:out></td>


				<td><a href="/updateUserById/${u.id}" class="btn btn-success">
						Edit </a>

					<form action="/deleteUserById/${u.id}" method="post"
						style="display: inline;"
						onsubmit="return confirm('Are you sure you want to delete this user?');">

						<button type="submit" class="btn btn-danger">Delete</button>

					</form></td>

			</tr>

		</c:forEach>
	</table>
</div>
</body>

<jsp:include page="Footer.jsp"></jsp:include>

</html>