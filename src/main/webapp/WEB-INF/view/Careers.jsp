<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/CSS/career.css">
<jsp:include page="Menu.jsp"></jsp:include>
</head>
<body style="background-color: teal; margin: 0px; padding: 10px">

	<div class=mainDiv>
		<h4>CAREER</h4>

		<h1>World Building Material Supplier and Build Your Career With
			Us</h1>

		<h5>Complete Website Product & Brand Catalogue</h5>

	</div>


</body>


<section class="projects-section" id="projects">


	<div class="section-heading">

		<div class="section-label">
			<span></span> Join Our Team

		</div>

		<h2>Current Openings</h2>

		<div class="heading-line"></div>

		<p>If you can bring ideas to life, we'd love for you to join our
			team and make a real impact.</p>

	</div>
	<!-- Creating Table -->

	<section class="job-section">

		<div class="job-table-container">

			<table class="job-table">

				<thead>
					<tr>
						<th>S.NO</th>
						<th>TITLE</th>
						<th>LOCATION</th>
						<th>EXPERIENCE</th>
						<th>POSITIONS</th>
						<th>TYPE</th>
						<th>APPLY</th>
					</tr>
				</thead>

				<tbody>

					<tr>
						<td>1</td>
						<td class="job-title">Full Stack Developer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>2</td>
						<td class="job-title">Frontend Developer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>3</td>
						<td class="job-title">Backend Developer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>4</td>
						<td class="job-title">Mobile App Developer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>5</td>
						<td class="job-title">AI & Machine Learning Trainer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>6</td>
						<td class="job-title">IT Trainer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>7</td>
						<td class="job-title">Digital Marketing Executive</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

					<tr>
						<td>8</td>
						<td class="job-title">Digital Marketing Trainer</td>
						<td>Hyderabad</td>
						<td>0-5 years</td>
						<td>5</td>
						<td>Full-time</td>
						<td><a href="contactMessage">Apply here</a></td>
					</tr>

				</tbody>

			</table>

		</div>

	</section>

	<!-- Table End -->

	<div class="section-title">
		<h2>Construction & MEP Projects</h2>
		<p>Our successfully completed construction and MEP engineering
			projects</p>
	</div>

	<div class="projects-container">

		<!-- Project 1 -->
		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Flexible Working Hours</span>
				<p>Benefit from flexible working hours that allow you to balance
					work with personal and family responsibilities.</p>

			</div>
		</div>

		<!-- Project 2 -->
		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Talented Team</span>

				<p>A cohesive group of dedicated engineers who bring passion to
					every aspect of their work.</p>

			</div>
		</div>

		<!-- Project 3 -->
		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Ongoing Growth</span>
				<p>Continuous development of professional skills and meaningful
					career advancement in your chosen field</p>

			</div>
		</div>

		<!-- Project 4 -->
		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Best Brands</span>
				<p>HVAC and electrical installation for a large-scale shopping
					and entertainment complex.</p>

			</div>
		</div>

		<!-- Project 5 -->
		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Infrastructure</span>
				<p>Experience a modern, comfortable office environment optimized
					for productivity and convenience.</p>

			</div>
		</div>

		<!-- Project 6 -->
		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Training</span>
				<p>Receive professional certifications and training to support
					your career development and skill enhancement.</p>

			</div>
		</div>

		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Opportunity</span>
				<p>Seize the chance to advance your career and take on new
					challenges in a dynamic environment.</p>

			</div>
		</div>

		<div class="project-card">

			<div class="project-content">
				<span class="project-category">Creative Projects</span>
				<p>Tackle challenging and innovative projects that allow you to
					gain valuable expertise and grow your skills.</p>

			</div>
		</div>

		<!-- Cart end -->

	</div>

</section>



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