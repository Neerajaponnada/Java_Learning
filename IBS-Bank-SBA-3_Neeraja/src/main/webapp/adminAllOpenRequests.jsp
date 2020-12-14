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
	<h5 align="right"> Welcome ${loginUser.getUserName}</h5>
	<div><a href="/openRequests">Get Open Requests</a></div>
	<div><a href="/getCustomerStatement">Get Customer Statement</a></div>
	<div><a href="/checkTransactions">Check Transactions</a></div>
	<div><a href="index.jsp">Log Out</a></div>
	
	<hr/>
	<h6>${approvalStatus}</h6>
	<c:choose>
				<c:when test="${allOpenRequests==null || allOpenRequests.isEmpty() }">
					<div class="alert alert-info">
						<strong>No Open Account Requests Available</strong>
					</div>
				</c:when>
				<c:otherwise>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Reg Id</th>
							<th>User Name</th>
							<th>Mobile Num</th>
							<th>Type Of Account</th>
							<th>Customer Accounts</th>
							<th colspan="2"></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${allOpenRequests }">
								<tr>
									<td>${c.regId }</td>
									<td>${c.userName }</td>
									<td>${c.mobileNum}</td>
									<td>${c.typeOfAcctHolder}</td>
									<td>${c.custAcctType }</td>
									</td>
									<td>
										<a href="/approve?regId=${c.regId }" class="btn btn-sm btn-danger">
											Approve
										</a>
									</td>
									<td>
										<a href="/reject?regId=${c.regId }" class="btn btn-sm btn-info">
											Reject
										</a>
									</td>
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