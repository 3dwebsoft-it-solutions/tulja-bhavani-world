<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>List Of Request Price.</title>
<link rel="stylesheet" href="/CSS/listOfrequestPrice.css">
<jsp:include page="Menu.jsp"></jsp:include>
</head>

<body>

	<c:if test="${not empty message}">

		<div class="alert alert-success" role="alert">

			<h5>${message}</h5>

		</div>

	</c:if>

	<div class="contact-container">

		<h3>Total List of Request Price: ${messages.size()}</h3>

		<div class="table-container">

			<table class="contact-table">

				<thead>
					<tr>
						<th>S.No</th>
						<th>Created At</th>
						<th>Product Category</th>
						<th>Product Name</th>
						<th>Quantity</th>
						<th>Unit</th>
						<th>Name</th>
						<th>Mobile</th>
						<th>Email</th>
						<th>Company</th>
						<th>Location</th>
						<th>Message</th>
						<th>Action</th>

					</tr>

				</thead>

				<tbody class="body">

					<c:forEach var="requestPrice" items="${messages}"
						varStatus="status">

						<tr>


							<td class="id-column"><c:out value="${requestPrice.id }"></c:out></td>

							<td class="createdAt-column"><c:out
									value="${requestPrice.createdAt }"></c:out></td>

							<td><c:out value="${requestPrice.productCategory }"></c:out></td>

							<td><c:out value="${requestPrice.productName }"></c:out></td>

							<td><c:out value="${requestPrice.quantity }"></c:out></td>

							<td><c:out value="${requestPrice.unit }"></c:out></td>

							<td class="name-column"><c:out value="${requestPrice.name }"></c:out></td>

							<td><c:out value="${requestPrice.mobile }"></c:out></td>

							<td class="email-column"><c:out
									value="${requestPrice.email }"></c:out></td>

							<td><c:out value="${requestPrice.company }"></c:out></td>

							<td><c:out value="${requestPrice.location }"></c:out></td>

							<td class="message-column"><c:out
									value="${requestPrice.message }"></c:out></td>


							<td class="action-column">
							
								<c:if
									test="${sessionScope.user.role =='ADMIN' }">

									<a href="/updateRequestPriceById/${requestPrice.id}"
										class="btn btn-success"> Edit </a> |
					
					    			 <form action="/deleteRequestPriceById/${requestPrice.id}"
										method="post"
										style="display: inline-block; margin: 0; padding: 0;"
										onsubmit="return confirm('Are you sure you want to delete this request?');">

										<button type="submit" class="btn btn-danger"
											style="display: inline-block;">Delete</button>

									</form>

								</c:if>
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