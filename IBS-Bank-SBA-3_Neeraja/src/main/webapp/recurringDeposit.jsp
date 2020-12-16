<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
    
        <title>IBS Bank- Recurring Deposit</title>
    </head>
   <body>
	<h1>IBS Bank</h1>
        
        <form name="acctSummary" >
            <table border="0" cellspacing="0" cellpadding="0">
                <tr><td>
                	<table border="0.5" >
                            <tr bgcolor="#FFF0FF">
                                <th align="center"><a href="/acctSummary?userName=${userName}">Account Summary</a></th>
                                <th align="center"><a href="/fundsTransferHome?userName=${userName}">Funds Transfer&nbsp;&nbsp;</a></th>
                                <th align="center"><a href="/fixedDeposit?userName=${userName}">Fixed Deposit&nbsp;&nbsp;</a></th>
                                <th><a href="/recurringDeposit?userName=${userName}">Recurring Deposit&nbsp;&nbsp;</a></th></tr>
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
                        <a href="accountSummary.jsp">Account Summary<br></a>
                        <a href="fundsTransfer.jsp">Funds Transfer<br></a>
                        <a href="accountStatement.jsp">Account Statement <br></a><br><br>
                        <a href="changePassword.jsp">Change Password<br></a>
                        <a href="index.jsp">Log out</a>
                        <br>
                        <br>
                    </td>
                    <td width="1100" height="410" bgcolor="#FAF8CC">
                        <font color="brown"><h2>Account Summary</h2></font>
                        <h3>Recurring Deposit</h3>
             <c:choose>
				<c:when test="${rdData==null || rdData.isEmpty()}">
					<div class="alert alert-info">
						<strong>No Recurring Deposit Account Available</strong>
					</div>
				</c:when>
				<c:otherwise>
				 <table border="1" ><thead>
                            <tr bgcolor="#98AFC7">
                               <th>Account Number</th>
								<th>Customer Name</th>
								<th>Branch Name</th>
                                <th>Tenure</th>
                                <th>Maturity Date</th>
                            	<th>Maturity Amount</th></tr></thead>
                            <tbody>
							<c:forEach var="c" items="${rdData }">
								<tr bgcolor="#FAF8CC">
									<td>${c.custAcctNum }</td>
									<td>${c.custName }</td>
									<td>${c.branchName}</td>
									<td>${c.tenure}</td>
									<td>${c.acctCloseDate}</td>
									<td>${c.availableBalance}</td>
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

            <table border="0" cellspacing="0" cellpadding="0" width="100%" height="63" background="HTML/images/bot.gif">
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
        </form>
    </body>
</html>
