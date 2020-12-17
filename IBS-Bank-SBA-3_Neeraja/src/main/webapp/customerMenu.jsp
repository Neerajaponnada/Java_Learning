<html>
<head>
	<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
</head>       


<nav>
		<a href="/acctSummary?userName=${userName}">Account Summary</a>
		<span> | </span>
        <a href="/fundsTransferHome?userName=${userName}">Funds Transfer</a>
        <span> | </span>
        <a href="/fixedDeposit?userName=${userName}">Fixed Deposit</a>
        <span> | </span>
        <a href="/recurringDeposit?userName=${userName}">Recurring Deposit</a>
        <span> | </span>
        <a href="/acctStmt?userName=${userName}">Account Statement</a> 
        <a href="/logout.jsp">Log Out</a> 
       &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
       &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
       <em></em>
	 <img src="${pageContext.request.contextPath}/resources/BankLogo.jpg" width="60" height="60"/>
	<hr/>
</nav>
</html>