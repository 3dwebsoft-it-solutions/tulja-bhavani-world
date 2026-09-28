<%-- 
>




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Request Price - Construction Materials</title>
	<jsp:include page="Menu.jsp"></jsp:include>
	<link rel="stylesheet" href="/CSS/cementAndTMTRequestPrice.css">
</head>



<body>

<!-- Message from Controller -->

<%
	String success=request.getParameter("success");
	
	if("true".equals(success)){
	
	%>		
	<div class="success-message">
		<h3>Thank you! Your message has been sent successfully.</h3>
	</div>
		
	<%
	}

%>



<!-- Header -->

<!-- Main -->

<div class="container">
    <div class="title">

        <h1>Request Price</h1>

        <p>
            Get competitive pricing for your required construction materials.
        </p>

    </div>


    <!-- Form -->

    <div class="form-box">

        <form action="/requestPrice" method="post">


            <!-- Product Information -->

            <h2>Product Information</h2>

            <br>

            <div class="form-row">

                <div class="form-group">

                    <label>Product Category</label>

                    <select name="productCategory" required>

                        <option value="">-- Select Category --</option>

                        <option value="Cement">Cement</option>

                        <option value="TMT Steel">TMT Steel</option>

                        <option value="Bricks & Blocks">Bricks & Blocks</option>

                        <option value="Sand & Aggregates">
                            Sand & Aggregates
                        </option>

                        <option value="Structural Steel">
                            Structural Steel
                        </option>

                        <option value="Plumbing Materials">
                            Plumbing Materials
                        </option>

                        <option value="Electrical Materials">
                            Electrical Materials
                        </option>

                        <option value="Tiles">
                            Tiles & Flooring
                        </option>

                        <option value="Construction Chemicals">
                            Construction Chemicals
                        </option>

                        <option value="Other">
                            Other
                        </option>

                    </select>

                </div>


                <div class="form-group">

                    <label>Product / Brand</label>

                    <input type="text"
                           name="productName"
                           placeholder="Example: UltraTech Cement"
                           required>

                </div>

            </div>


            <!-- Quantity -->

            <div class="form-row">

                <div class="form-group">

                    <label>Required Quantity</label>

                    <input type="number"
                           name="quantity"
                           placeholder="Enter quantity"
                           min="1"
                           required>

                </div>


                <div class="form-group">

                    <label>Unit</label>

                    <select name="unit" required>

                        <option value="">-- Select Unit --</option>

                        <option value="Bags">Bags</option>

                        <option value="MT">Metric Ton (MT)</option>

                        <option value="Kg">Kg</option>

                        <option value="Nos">Numbers</option>

                        <option value="CFT">CFT</option>

                        <option value="CuM">Cubic Meter</option>

                        <option value="SqFt">Sq. Ft.</option>

                    </select>

                </div>

            </div>


            <!-- Customer Information -->

            <h2>Customer Information</h2>

            <br>

            <div class="form-row">

                <div class="form-group">

                    <label>Full Name</label>

                    <input type="text"
                           name="name"
                           placeholder="Enter your name"
                           required>

                </div>


                <div class="form-group">

                    <label>Mobile Number</label>

                    <input type="tel"
                           name="mobile"
                           placeholder="Enter 10-digit mobile number"
                           pattern="[0-9]{10}"
                           maxlength="10"
                           required>

                </div>

            </div>


            <div class="form-row">

                <div class="form-group">

                    <label>Email Address</label>

                    <input type="email"
                           name="email"
                           placeholder="Enter your email">

                </div>


                <div class="form-group">

                    <label>Company / Contractor Name</label>

                    <input type="text"
                           name="company"
                           placeholder="Company name">

                </div>

            </div>


            <!-- Delivery Information -->

            <div class="form-row">

                <div class="form-group full">

                    <label>Delivery Location</label>

                    <input type="text"
                           name="location"
                           placeholder="Enter construction site / delivery location"
                           required>

                </div>

            </div>


            <!-- Additional Requirement -->

            <div class="form-row">

                <div class="form-group full">

                    <label>Additional Requirements</label>

                    <textarea name="message"
                              placeholder="Mention grade, size, brand preference, delivery date or any other requirements..."></textarea>

                </div>

            </div>


            <!-- Submit -->

            <button type="submit"  value="submit" class="submit-btn">
                Request Price
            </button>


            <div class="note">

                <strong>Note:</strong>
                Prices may vary depending on brand, grade, quantity,
                availability, market conditions and delivery location.
                Our team will contact you with the latest quotation.

            </div>

        </form>

    </div>

</div>

</body>
</html>

 --%>