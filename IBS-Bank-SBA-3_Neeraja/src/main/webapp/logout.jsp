<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
			<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
<title>IBS Bank - Logout</title>
</head>
	<body>	
	<h1><img src="${pageContext.request.contextPath}/resources/BankLogo.jpg" width="60" height=60 /> IBS Bank </h1>
	<h4>Safe,Secure And Convenient Banking</h4>
	<jsp:include page="homeMenu.jsp"/>

	 <div>
	 </div>
You are successfully logged out. <a href="loginPage.jsp">Click here</a> to login again !! 

<p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>