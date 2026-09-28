
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Construction Material Supply</title>
<script src="/JS/Menu.js"></script>
<link rel="stylesheet" href="/CSS/menu.css">
</head>


<body>


	<!-- =================================
     HEADER
================================= -->

	<header class="header">




		<!-- LOGO -->

		<div class="logo">

			<a href="/home">
			<img src="/Gallery/home/TBW-Logo.png" alt="TBW Logo">
			<span>TBW</span>
			
			</a>


		</div>

		<ul class="NavMenu">

			<c:if test="${sessionScope.user.role == 'ADMIN'}">



				<!-- ADMIN ONLY MENU -->
				<a href="/home" onclick="closeMenu()">HOME</a> &nbsp;&nbsp;&nbsp;
				
				<a href="/addUser" target="_blank" onclick="closeMenu()"> ADD USER</a>&nbsp;&nbsp;&nbsp;
				
				<a href="/getAllUsers" target="_blank" onclick="closeMenu()">
					LIST OF USERS</a>&nbsp;&nbsp;&nbsp;
				<a href="/listOfAllContactMessages" target="_blank"
					onclick="closeMenu()">LIST OF CONTACT</a>&nbsp;&nbsp;&nbsp;
				<a href="/listOfRequestPrice" target="_blank"
					onclick="closeMenu()"> LIST OF REQUEST PRICE</a>&nbsp;&nbsp;&nbsp;
				<a href="/updateUser" target="_blank" onclick="closeMenu()">
					PROFILE</a>&nbsp;&nbsp;&nbsp;
				<a href="/" target="_blank" onclick="closeMenu()"> LOGOUT</a>&nbsp;&nbsp;&nbsp;
				


			</c:if>

			<c:if
				test="${sessionScope.user.role == 'EMPLOYEE' or
						sessionScope.user.role == 'USER'}">

				<!-- ADMIN + EMPLOYEE MENU -->

				<a href="/home" onclick="closeMenu()">HOME</a> &nbsp;&nbsp;&nbsp;
				<a href="/listOfAllContactMessages" target="_blank"
					onclick="closeMenu()"> LIST OF CONTACT MESSAGES</a>&nbsp;&nbsp;&nbsp;
				<a href="/products" target="_blank" onclick="closeMenu()">
					PRODUCTS CART</a>&nbsp;&nbsp;&nbsp;
				<a href="/services" target="_blank" onclick="closeMenu()">
					SERVICES</a>&nbsp;&nbsp;&nbsp;
				<a href="/projects" target="_blank" onclick="closeMenu()">
					PROJECTS</a>&nbsp;&nbsp;&nbsp;
			 	<a href="/careers" target="_blank" onclick="closeMenu()">
					CAREER</a>&nbsp;&nbsp;&nbsp;
			 	<a href="/" target="_blank" onclick="closeMenu()"> Logout</a>&nbsp;&nbsp;&nbsp;
			</c:if>


		</ul>


		<!-- HAMBURGER BUTTON -->

		<button class="toggle-btn"
	        id="toggleBtn"
	        aria-label="Open Menu"
	        type="button"
	        onclick="toggleMenu()">
	    	<i class="fa-solid fa-bars"></i>
		</button>
		<!--
	 =================================
         OFF-CANVAS MENU
    ================================= -->

		<ul class="nav-menu" id="navMenu">



			<li><a href="home" onclick="closeMenu()"> HOME </a></li>

			<li><a href="/updateUser"  onclick="closeMenu()">PROFILE</a></li>

			<li><a href="about"  onclick="closeMenu()">ABOUT	US </a></li>

			<li><a href="contactMessage" onclick="closeMenu()"> CONTACT US </a></li>


			
			<li><a href="services" onclick="closeMenu()">
					SERVICES </a></li>


			<li><a href="projects" onclick="closeMenu()">
					PROJECTS </a></li>


			<li><a href="branches"  onclick="closeMenu()">
					BRANCHES </a></li>


			<li><a href="gallery"  onclick="closeMenu()">
					GALLERY </a></li>

			<li><a href="requestPrice" onclick="closeMenu()">
					REQUEST PRICE </a></li>


			<li><a href="ourTeam"  onclick="closeMenu()">
					OUR TEAM </a></li>


			<li><a href="products"  onclick="closeMenu()">
					PRODUCT CART </a></li>


			<c:if test="${ sessionScope.user.role=='ADMIN'}">

				<li><a href="/addUser" onclick="closeMenu()">
						ADD USER</a></li>
				<li><a href="/getAllUsers" 
					onclick="closeMenu()">LIST OF USERS</a></li>
				<li><a href="/listOfAllContactMessages"
					onclick="closeMenu()">LIST OF CONTACT</a></li>
				<li><a href="/listOfRequestPrice"
					onclick="closeMenu()"> LIST OF REQUEST PRICE</a></li>

			</c:if>

			<li><a href="/" onclick="closeMenu()">
					Logout</a></li>

		</ul>


	</header>


	<!-- =================================
     OVERLAY
================================= -->

	<div class="overlay" id="overlay" onclick="closeMenu()"></div>


	<!-- =================================
     JAVASCRIPT
================================= -->



</body>

</html>

