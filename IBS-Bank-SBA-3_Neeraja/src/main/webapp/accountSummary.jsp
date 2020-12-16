<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>IBS Bank-Account Summary</title>
   	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
    </head>
   <body>
	<h1>IBS Bank</h1>
            <table border="0" cellspacing="0" cellpadding="0" >
                <tr><td>
                	<table border="0.5" >
                            <tr bgcolor="#FFF0FF">
                               <jsp:include page="customerMenu.jsp"/>    
                            <tr>
                            <tr align="right"><p>Welcome ${userName} !! </p></tr>
                        </table>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td bgcolor="#E3E4FA" height="410" width="24%" valign="top">
                        <br><strong>Services</strong><br>
                        <a href="/acctSummary?userName=${userName}">Account Summary<br></a>
                        <a href="/fundsTransferHome?userName=${userName}">Funds Transfer<br></a>
                        <a href="accountStatement">Account Statement <br></a><br><br>
                        <a href="changePassword.jsp">Change Password<br></a>
                        <a href="index.jsp">Log out</a>
                        <br>
                        <br>
                    </td>
                    <td  width="1100" height="80" bgcolor="#FAF8CC">
                        <font color="brown"><h2>Account Summary</h2></font>
                        <h3>Savings Account</h3>
                       <c:choose>
				<c:when test="${savingsData==null || savingsData.isEmpty()}">
					<div class="alert alert-info">
						<strong>Account is not approved yet by the Admin</strong>
					</div>
				</c:when>
				<c:otherwise>
				<table class="table table-bordered table-striped" border = "1">
						<thead>
							<tr align="center" bgcolor="#E3E4FA" valign="top">
							<th>Account Number</th>
							<th>Customer Name</th>
							<th>Branch Name</th>
							<th>Account Balance</th>
							<th>Account Type</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${savingsData }">
								<tr bgcolor="#FAF8CC">
									<td>${c.custAcctNum }</td>
									<td>${c.custName }</td>
									<td>${c.branchName}</td>
									<td>${c.availableBalance}</td>
									<td>${c.custAcctType}</td>
								</tr>
							</c:forEach>
						</tbody>					
					</table>
					</c:otherwise>
			</c:choose>
                    </td>
                </tr>
            </table>
            <table border="0" cellspacing="0" cellpadding="0" width="100%">
            </table>

            <table border="0" cellspacing="0" cellpadding="0" width="100%" height="63">
                <tr>
                    <td>
                        <table border="0" cellspacing="0" cellpadding="0" width="780" background="" height="25">
                            <footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer></td>
                            </tr>
                        </table>
                    </td>
                    <td>
                    </td>
                </tr>
            </table>
    </body>
</html>
