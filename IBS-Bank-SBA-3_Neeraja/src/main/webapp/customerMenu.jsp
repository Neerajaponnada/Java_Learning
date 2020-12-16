<html>
<head>
	<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
</head>       


<nav>
	<hr />
		<a href="/acctSummary?userName=${userName}">Account Summary</a>
		<span> | </span>
        <a href="/fundsTransferHome?userName=${userName}">Funds Transfer&nbsp;&nbsp;</a>
        <span> | </span>
        <a href="/fixedDeposit?userName=${userName}">Fixed Deposit&nbsp;&nbsp;</a>
        <span> | </span>
        <a href="/recurringDeposit?userName=${userName}">Recurring Deposit&nbsp;&nbsp;</a>
        <span> | </span>
        <a href="/acctStmt?userName=${userName}">Statement&nbsp;&nbsp;</a>
	<hr/>
</nav>
</html>