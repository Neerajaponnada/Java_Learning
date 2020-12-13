<%@ page import="java.time.LocalDate"%>
 
<html>
	<head>
	<style>
        body {
            background-color: powderblue;
        }
       
        h1 {
            color: red;
            background-color: LightSeaGreen;
            font-size: 5em;
            text-align: center;
            line-height: 40px;
        }
        
        h2,
        ul {
            text-align: center;
        }
        
        h4 {
            text-align: center;
        }
       
        li {
            list-style: none;
            display: inline-block;
            padding: 5px;
            border: 1px solid black;
        }
       
        form {
            text-align: center;
        }
       
        label {
            margin-right: 5px;
            width: 75px;
            display: inline-block;
        }
       
        .formInput {
            margin: 10px;
            font-size: 15px;
        }
        input{
            margin: 5px;
        }
       
        button {
            margin: 5px;
            width: 82px;
        }
       
        a {
            margin-right: 5px;
        }
       
        footer {
            background-color: LightSeaGreen;
            font-size: 1em;
            text-align: center;
            line-height: 20px;
        }
        
        div {
            style="display:inline-block;
            vertical-align:top
        }
        </style>-- 
		<title>IBS-Home</title>	
	</head>
	
	<body>	
	<h1><img src="${pageContext.request.contextPath}/resources/BankLogo.jpg" width="60" height=60 /> IBS Bank </h1>
	<h2> Welcome To IBS Banking </h2>
	<h4>Safe,Secure And Convenient Banking</h4>
	<jsp:include page="homeMenu.jsp"/>

	 <div>
	 <img src="${pageContext.request.contextPath}/resources/HomeImage1.jpg" width="600" height="250"/>
	 </div>
	<div>
	<h5 style="word-wrap:break-word;">*With the rapid growth of Internet technology, online banking has played an important and central role in the e-payment area.</h2>
	<h5 style="">*Banking online allows a customer to make deposits, withdraws, transfer with the click of mouse.</h2>
	 </div>
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
	</body>
</html>