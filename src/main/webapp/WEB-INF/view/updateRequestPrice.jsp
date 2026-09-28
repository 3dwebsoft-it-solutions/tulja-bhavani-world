<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Update Request Price - Construction Materials</title>
<jsp:include page="Menu.jsp"></jsp:include>
<link rel="stylesheet" href="/CSS/requestPrice.css">
</head>



<body>

	<!-- Message from Controller -->

	<!-- Header -->

	<!-- Main -->

	<div class="container">
		<div class="title">

			<h1>Update Request Price</h1>

			<p>Get competitive pricing for your required construction
				materials.</p>

		</div>

		<!-- Form -->

		<div class="form-box">

			<form action="/updateRequestPriceById/${requestPrice.id}"
				method="post">


				<!-- Product Information -->

				<h2>Product Information</h2>

				<br>

				<div class="form-row">

					<div class="form-group">

						<label>Product Category</label> <select name="productCategory"
							required>

							<option value="">-- Select Category --</option>

							<option value="Cement"
								${requestPrice.productCategory =='Cement'? 'selected': '' }>Cement</option>

							<option value="TMT Steel"
								${requestPrice.productCategory =='TMT Steel'? 'selected': ''}>TMT
								Steel</option>

							<option value="Bricks & Blocks"
								${requestPrice.productCategory =='Bricks & Blocks'? 'selected': ''}>Bricks
								& Blocks</option>

							<option value="Sand & Aggregates"
								${requestPrice.productCategory =='Sand & Aggregates'? 'selected': ''}>
								Sand & Aggregates</option>

							<option value="Structural Steel"
								${requestPrice.productCategory =='Structural Steel'? 'selected': ''}>
								Structural Steel</option>

							<option value="Plumbing Materials"
								${requestPrice.productCategory =='Plumbing Materials'? 'selected': ''}>
								Plumbing Materials</option>

							<option value="Electrical Materials"
								${requestPrice.productCategory =='Electrical Materials'? 'selected': ''}>
								Electrical Materials</option>

							<option value="Tiles"
								${requestPrice.productCategory =='Tiles'? 'selected': ''}>
								Tiles & Flooring</option>

							<option value="Construction Chemicals"
								${requestPrice.productCategory =='Construction Chemicals'? 'selected': ''}>
								Construction Chemicals</option>

							<option value="Other"
								${requestPrice.productCategory =='Other'? 'selected': ''}>
								Other</option>

						</select>

					</div>


					<div class="form-group">

						<label>Product / Brand</label> <input type="text"
							name="productName" value="${requestPrice.productName}"
							placeholder="Example: UltraTech Cement" required>

					</div>

				</div>


				<!-- Quantity -->

				<div class="form-row">

					<div class="form-group">

						<label>Required Quantity</label> <input type="number"
							name="quantity" value="${requestPrice.quantity}"
							placeholder="Enter quantity" min="1" required>

					</div>


					<div class="form-group">

						<label>Unit</label> <select name="unit" required>

							<option value="">-- Select Unit --</option>

							<option value="Bags"
								${requestPrice.productCategory =='Bags'? 'selected': '' }>Bags</option>

							<option value="MT"
								${requestPrice.productCategory =='MT'? 'selected': '' }>Metric
								Ton (MT)</option>

							<option value="Kg"
								${requestPrice.productCategory =='Kg'? 'selected': '' }>Kg</option>

							<option value="Nos"
								${requestPrice.productCategory =='Nos'? 'selected': '' }>Numbers</option>

							<option value="CFT"
								${requestPrice.productCategory =='CFT'? 'selected': '' }>CFT</option>

							<option value="CuM"
								${requestPrice.productCategory =='CuM'? 'selected': '' }>Cubic
								Meter</option>

							<option value="SqFt"
								${requestPrice.productCategory =='SqFt'? 'selected': '' }>Sq.
								Ft.</option>

						</select>

					</div>

				</div>


				<!-- Customer Information -->

				<h2>Customer Information</h2>

				<br>

				<div class="form-row">

					<div class="form-group">

						<label>Full Name</label> <input type="text" name="name"
							value="${requestPrice.name}" placeholder="Enter your name"
							required>

					</div>



					<div class="form-group">

						<label>Mobile Number</label> <input type="tel" name="mobile"
							value="${requestPrice.mobile}"
							placeholder="Enter 10-digit mobile number" pattern="[0-9]{10}"
							maxlength="10" required>

					</div>

				</div>


				<div class="form-row">

					<div class="form-group">

						<label>Email Address</label> <input type="email" name="email"
							value="${requestPrice.email}" placeholder="Enter your email">

					</div>


					<div class="form-group">

						<label>Company / Contractor Name</label> <input type="text"
							name="company" value="${requestPrice.company}"
							placeholder="Company name">

					</div>

				</div>


				<!-- Delivery Information -->

				<div class="form-row">

					<div class="form-group full">

						<label>Delivery Location</label> <input type="text"
							name="location" value="${requestPrice.location}"
							placeholder="Enter construction site / delivery location"
							required>

					</div>

				</div>


				<!-- Additional Requirement -->

				<div class="form-row">

					<div class="form-group full">

						<label>Additional Requirements</label>

						<textarea name="message"
							placeholder="Mention grade, size, brand preference, delivery date or any other requirements...">${requestPrice.message }</textarea>

					</div>

				</div>


				<!-- Submit -->

				<button type="submit" value="submit" class="submit-btn">
					Request Price</button>


				<div class="note">

					<strong>Note:</strong> Prices may vary depending on brand, grade,
					quantity, availability, market conditions and delivery location.
					Our team will contact you with the latest quotation.

				</div>

			</form>

		</div>

	</div>

</body>
</html>

