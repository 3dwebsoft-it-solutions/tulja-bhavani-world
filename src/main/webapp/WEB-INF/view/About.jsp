```jsp
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Tulja Bhavani World</title>

    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/about.css">
</head>

<body>

    <!-- Navbar -->
    <jsp:include page="Menu.jsp"></jsp:include>


    <!-- About Header -->
    <section class="mainDiv">

        <h4>ABOUT</h4>

        <h1>Tulja Bhavani World.in</h1>

        <h5>Building Strong Foundations with Quality Materials.</h5>

    </section>


    <!-- About Content -->
    <section class="about-section">

        <!-- Images -->
        <div class="image-box">

            <img src="${pageContext.request.contextPath}/About/work.jpg"
                 alt="Construction Work">

            <img src="${pageContext.request.contextPath}/About/work2.jpg"
                 alt="Construction Work">
                 
            <img src="${pageContext.request.contextPath}/About/about1.jpg"
                 alt="Construction Work">

            <img src="${pageContext.request.contextPath}/About/about2.jpg"
                 alt="Construction Work">    

        </div>


        <!-- Content -->
        <div class="content-box">

            <h2>-- Who We Are?</h2>

            <h1>
                Driving Technology, Talent & Social Impact
            </h1>

            <p>
                At Tulja Bhavani World, we provide a wide range of
                construction materials including Cement, TMT Steel,
                Building Materials, and other essential construction
                products.
            </p>

            <p>
                Whether you are constructing a home, commercial building,
                industrial facility, or large infrastructure project,
                our team works to understand your requirements and
                provide suitable materials based on quality, quantity,
                specifications, availability, and budget.
            </p>


            <h2>-- Our Mission</h2>

            <p>
                Our mission is to become a dependable construction material
                supply partner by providing:
            </p>

            <ul class="mission-list">
                <li>Quality construction materials</li>
                <li>Competitive and transparent pricing</li>
                <li>Reliable material availability</li>
                <li>Timely delivery</li>
                <li>Professional customer support</li>
                <li>Easy quotation and price-request services</li>
                <li>Complete project material assistance</li>
            </ul>

        </div>

    </section>


    <!-- Footer -->
    <footer>
        <jsp:include page="Footer.jsp"></jsp:include>
    </footer>

</body>

</html>
```
