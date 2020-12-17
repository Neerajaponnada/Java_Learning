<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page isELIgnored="false" %>
<html>
	<head>
	 	<title>Employee Login</title>
	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	</head>
	<body>
	<h1>IBS Bank - Admin Home</h1>
<hr/>
	<h5 align="right"> Welcome Admin</h5>
	<div><a href="/openRequests">Get Open Requests</a></div>
	<div><a href="/adminGetCustTransactions.jsp">Get Customer Statement</a></div>
	<div><a href="/adminGetCustTransactions.jsp">Check Transactions</a></div>
	<div><a href="index.jsp">Log Out</a></div>
	
	<hr/>
	<h6>${approvalStatus}</h6>
	<form:form action="/adminStmt?userName=${userName}" method="GET" modelAttribute="adminStmt" class="form">
                        <font color="brown" align = "left"><h2>Customer Account Statement</h2></font>
                        <strong>Customer</strong><input type="text" name="custAcctNum"   />
                        <strong>UserName</strong><input type="text" name="userName" />
                       <!--  <strong>From </strong> 
							<em><input type="date" name="startDate" required /></em>
						<strong>To </strong>
						<em><input type="date" name="endDate" required /> -->
						<button>Filter</button>
				</form:form>
               <c:choose>
				<c:when test="${acctStmt==null || acctStmt.isEmpty()}">
					<div class="alert alert-info">
						<strong></strong>
					</div>
				</c:when>
				<c:otherwise>
                        <table class="table table-bordered table-striped" border = "1" bgcolor="#98AFC7">
						<thead>
                            <tr align="center" bgcolor="#98AFC7">
                                <th >Transaction ID</th>
                                <th>From Account</th>
                                <th>To Account</th>
                                <th>Transaction Amount</th>
                                <th>Transaction Date</th>
                                <th>Comments </th>
                            	</tr>
                            </thead>
						<tbody>
							<c:forEach var="c" items="${acctStmt}">
								<tr bgcolor="#FAF8CC">
									<td>${c.txnId }</td>
									<td>${c.fromAcctNum}</td>
									<td>${c.toAcctNum}</td>
									<td>${c.txnAmt}</td>
									<td>${c.txnDate}</td>
									<td>${c.txnCmnts}</td>
								</tr>
							</c:forEach>
						</tbody>					
					</table>
					</c:otherwise>
			</c:choose>
		
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>