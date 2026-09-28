<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="Menu.jsp"></jsp:include>

</head>
<body style="background-color: teal; margin: 0px; padding: 10px">


	<div class=mainDiv>
		<h4>ABOUT</h4>

		<h1>About 3DWebSoft.INC</h1>
		<h5>Empowering India with education, skills and support turning
			learners into technology specialists.</h5>
	</div>


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