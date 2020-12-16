<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>IBS Bank-Funds Transfer</title>
    	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
    </head>
   <body leftmargin=0 topmargin=0 marginheight="0" marginwidth="0" bgcolor="#FFFFFF" style="background-color:PaleGoldenRod;">
	<h1 style="text-align:center;background-color:DarkCyan;color:White;font-size:45">IBS Bank</h1>
        
        <form name="acctSummary" >
            <table border="0" cellspacing="0" cellpadding="0">
                <tr><td>
                	<table border="0.5" >
                            <tr bgcolor="#FFF0FF">
                                <th align="center"><a href="/acctSummary?userName=${userName}">Account Summary&nbsp;&nbsp;</a></th>
                                <th align="center"><a href="/fundsTransferHome?userName=${userName}">Funds Transfer&nbsp;&nbsp;</a></th>
                                <th align="center"><a href="fixedDeposit.jsp">Fixed Deposit&nbsp;&nbsp;</a></th>
                                <th><a href="recurringDeposit.jsp">Recurring Deposit&nbsp;&nbsp;</a></th></tr>
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
                        <a href="accountStatement.jsp">Account Statement <br></a><br><br>
                        <a href="changePassword.jsp">Change Password<br></a>
                        <a href="index.jsp">Log out</a>
                        <br>
                        <br>
                    </td>
                    <td width="1100" height="80" bgcolor="#FAF8CC">
                        <font color="brown"><h2>Funds Transfer</h2></font>
                        <h4><a href="/addBnfPage?userName=${userName}">Add Beneficiary</a>
                        <span><a href="/transferFunds?userName=${userName}">Transfer Funds</a></span></h4>
               <c:choose>
				<c:when test="${bncfryList==null || bncfryList.isEmpty()}">
					<div class="alert alert-info">
						<strong>No Beneficiaries Available</strong>
					</div>
				</c:when>
				<c:otherwise>
                        <table class="table table-bordered table-striped" border = "1" bgcolor="#98AFC7">
						<thead>
                            <tr align="center" bgcolor="#98AFC7">
                                <th >Beneficiary ID</th>
                                <th>Account Name</th>
                                <th>Account Number</th>
                                <th>IFSC </th>
                            	<th>Bank Name</th>
                            	<th>Mobile #</th>
                            	<th colspan="1">Action</th>
                            	</tr>
                            </thead>
						<tbody>
							<c:forEach var="c" items="${bncfryList}">
								<tr bgcolor="#FAF8CC">
									<td>${c.bnfcryId }</td>
									<td>${c.bnfcryAcctName }</td>
									<td>${c.bnfcryAcctNum}</td>
									<td>${c.bnfcryBankIfsc}</td>
									<td>${c.bnfcryBankName}</td>
									<td>${c.bnfcryMblNum}</td>
									<!-- <td>
										<a href="/transferFunds?bnfcryId=${c.bnfcryId }" class="btn btn-sm btn-danger">Transfer</a>
									</td> -->
									<td>
										<a href="/deleteBnfcry?bnfcryId=${c.bnfcryId }" class="btn btn-sm btn-danger">Delete</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>					
					</table>
					</c:otherwise>
			</c:choose>
            <table border="0" cellspacing="0" cellpadding="0" width="100%">
            </table>

            <table border="0" cellspacing="0" cellpadding="0" width="100%" height="63" background="HTML/images/bot.gif">
                <tr>
                    <td>
                        <table border="0" cellspacing="0" cellpadding="0" width="780" background="" height="25">
                            <tr align="center" valign="top">
                                <td width="400"><h5 style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</h5><br/></td>
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
