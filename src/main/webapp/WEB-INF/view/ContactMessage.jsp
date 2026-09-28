
<%
String success = request.getParameter("success");

if ("true".equals(success)) {
%>

<div class="success-message">Thank you! Your message has been sent
	successfully.</div>

<%
}
%>
<html>
<head>

<link rel="stylesheet" href="/CSS/contactMessage.css">

<jsp:include page="Menu.jsp"></jsp:include>

</head>
<body>

	<div class="contact-form">

		<form action="/contactMessage" method="post">

			<div class="form-row">

				<div class="form-group">

					<label>Full Name</label> <input type="text" name="fullName"
						required>

				</div>


				<div class="form-group">

					<label>Phone Number</label> <input type="tel" name="phoneNumber"
						required>

				</div>

			</div>


			<div class="form-row">

				<div class="form-group">

					<label>Email Address</label> <input type="email"
						name="emailAddress" required>

				</div>


				<div class="form-group">

					<label>What are you looking for?</label> <input type="text"
						name="lookingFor" required>

				</div>

			</div>


			<div class="form-group">

				<label>Message</label>

				<textarea name="message" rows="5" required></textarea>

			</div>


			<button type="submit" class="submit-btn">Send Message</button>

		</form>

	</div>

</body>

<jsp:include page="Footer.jsp"></jsp:include>

</html>