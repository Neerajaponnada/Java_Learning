<%@ page import="java.time.LocalDate"%>
 
<html>
			<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
		<title>IBS-Home</title>	
	</head>
	
	<body>	
	<h1><img src="${pageContext.request.contextPath}/resources/BankLogo.jpg" width="60" height=60 /> IBS Bank </h1>
	<h2> Welcome To IBS Banking </h2>	<h5>Safe,Secure And Convenient Banking</h5>
	<jsp:include page="homeMenu.jsp"/>

	 <div>
	 <img src="${pageContext.request.contextPath}/resources/HomeImage1.jpg" width="600" height="250"/>
	 </div>
	<div>
	<h5 style="word-wrap:break-word;">*With the rapid growth of Internet technology, online banking has played an important and central role in the e-payment area.</h5>
	<p style="">*Banking online allows a customer to make deposits, withdraws, transfer with the click of mouse.</p>
	 </div>
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
	</body>
</html>