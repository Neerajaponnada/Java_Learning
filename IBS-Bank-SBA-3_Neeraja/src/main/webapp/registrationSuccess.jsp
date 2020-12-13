<%@page import="java.time.LocalDate" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
	<title>Registration - Success</title>
	</head>
<body>
	<h1>IBS Bank</h1>
	<h3>Welcome! Register below</h3>
	<jsp:include page="homeMenu.jsp"/>
	
	<h2>Registration successful !! We will notify once your account is opened. Have a good Day !! </h2>
	
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>