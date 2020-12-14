<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	 	<title>Employee Login</title>
	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
	</head>
	<body>
	<h1>IBS Bank - Admin Home</h1>
<hr/>
	<h5 align="right"> Welcome ${loginUser.getUserName}</h5>
	<div><a href="/openRequests">Get Open Requests</a></div>
	<div><a href="/getCustomerStatement">Get Customer Statement</a></div>
	<div><a href="/checkTransactions">Check Transactions</a></div>
	<div><a href="index.jsp">Log Out</a></div>
	<hr/>
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>