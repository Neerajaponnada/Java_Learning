<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
	<title>IBS Bank - Error Page</title>
	</head>
</head>
<body>
	<h1>IBS Bank</h1>
	<jsp:include page="homeMenu.jsp"/>
		<p>Error Message : <%=exception.getMessage()%> </p>
	<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
</body>
</html>


</body>