
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>List Of Contact Messages</title>

<link rel="stylesheet" href="/CSS/listOfContactMessages.css">

</head>

<body>

	<!-- Menu Bar -->

	<jsp:include page="Menu.jsp"></jsp:include>

	<c:if test="${not empty msg}">

		<div style="color: green; text-align: center; margin: 10px 0;">

			<h5>${msg}</h5>

		</div>

	</c:if>

	<div class="contact-container">


		<h3>Total Contacted Users: ${messages.size()}</h3>

		<div class="table-container">

			<table class="contact-table">

				<thead>

					<tr>

						<th>S.No</th>

						<th>Created At</th>

						<th>Email Address</th>

						<th>Full Name</th>

						<th>Looking For</th>

						<th>Message</th>

						<th>Phone Number</th>

						<th>Action</th>

					</tr>

				</thead>

				<tbody>

					<c:forEach var="list" items="${messages}">

						<tr>

							<td><c:out value="${list.id}" /></td>

							<td class="createdAt-column"><c:out
									value="${list.createdAt}" /></td>

							<td class="email-column"><c:out value="${list.emailAddress}" />
							</td>

							<td class="fullName-column"><c:out value="${list.fullName}" />
							</td>

							<td class="looking-column"><c:out value="${list.lookingFor}" />
							</td>

							<td class="message-column"><c:out value="${list.message}" />
							</td>

							<td><c:out value="${list.phoneNumber}" /></td>

							<td>
							

									<form action="/deleteContactMessageById/${list.id}"
										method="post" style="display: inline;"
										onsubmit="return confirm('Are you sure you want to delete this user?');">

										<button type="submit" class="btn btn-danger">Delete</button>

									</form>
							</td>

						</tr>

					</c:forEach>

				</tbody>

			</table>

		</div>

	</div>

	<jsp:include page="Footer.jsp"></jsp:include>

</body>

</html>