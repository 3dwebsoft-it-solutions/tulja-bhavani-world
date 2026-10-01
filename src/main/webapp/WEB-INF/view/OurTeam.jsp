<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Tulja Bhavani World</title>
<link rel="stylesheet" href="/CSS/ourTeam.css">
<jsp:include page="Menu.jsp"></jsp:include>
</head>

<body>


	<div class=mainDiv>
		<h4>OUR TEAM</h4>

		<h3>Connect with Our Team Regarding Your Projects</h3>
		<br>

		<h5>Electrical Power & Lighting, HVAC Installation, Plumbing
			Systems, Fire Fighting Systems,Ventilation Systems Building
			Management Systems (BMS)</h5>

	</div>


	<section class="ourteam-section" id="ourteam">

		<div class="section-title">
			<h3>Board of Directors</h3>
			<p>The leadership guiding 3DWebSoft.INC IT Solutions' vision and
				growth</p>
		</div>

		<div class="ourteam-container">

			<!-- Project 1 -->
			<div class="ourteam-card">
				<div class="ourteam-image">
					<img src="Gallery/ourTeam/founder.jpg"
						alt="Commercial Building MEP">
				</div>

				<div class="ourteam-content">
					<span class="ourteam-category">Santosh H Rathod</span>
					<h3>Founder & CEO</h3>
					<p>Leads the vision and strategy for 3DWebSoft.INC across
						training, staffing and software delivery.</p>

				</div>
			</div>

			


			
			<!-- Project 4 -->
			<div class="ourteam-card">
				<div class="ourteam-image">
					<img src="Gallery/ourTeam/ramesh.png" alt="Hospital MEP Project">
				</div>

				<div class="ourteam-content">
					<span class="ourteam-category">Ramesh Jadhav</span>
					<h3>Director</h3>
					<p>Oversees operations and ensures effective execution of
						organizational goals.</p>

				</div>
			</div>

		</div>

	</section>


</body>

<footer>
	<jsp:include page="Footer.jsp"></jsp:include>
</footer>
</html>

<style>
.mainDiv {
	background-color: teal;
	color: white;
	margine: 0px;
	padding: 80px;
	text-align: center;
}

h5 {
	color: white;
}

h4 {
	color: yellow;
}
</style>