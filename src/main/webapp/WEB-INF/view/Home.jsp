<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<html>
<head>
<title>Tulja Bhavani World</title>
<link rel="stylesheet" href="/CSS/home.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
</head>


<h3 style="color: white">${msg}</h3>
<body>


	<jsp:include page="Menu.jsp">
		<jsp:param name="title" value="Home" />
	</jsp:include>


	<div class=mainDiv>
		<h4>Tulja Bhavani World</h4>

		<h1>Construction Building Material Supplier</h1>

		<h5>Complete Website Product & Brand Catalogue</h5>
	</div>



	<marquee behavior="scroll" direction="left" scrollamount="15"
		onmouseover="this.stop()" onmouseout="this.start()">

		<img src="Gallery/home/TBW-Logo.png" class="home-slide-image">
		&nbsp; <img src="Gallery/home/AllKindsOfMaterials.png" class="home-slide-image">
		&nbsp; <img src="Gallery/home/3BHK.png" class="home-slide-image">
		&nbsp; <img src="Gallery/home/3Bhk_Plan.png" class="home-slide-image">
		&nbsp; <img src="Gallery/home/Supply1.png" class="home-slide-image">
		&nbsp; <img src="Gallery/home/Supply2.png" class="home-slide-image">

	</marquee>




	<h2>
		<a class="nav-link" href="products">
		Product & Brand Catalogue
		</a>
	</h2>

	<img src="Gallery/home/weSupply.png" class="home-main-image">


</body>




<footer>
	<jsp:include page="Footer.jsp"></jsp:include>
</footer>
</html>

