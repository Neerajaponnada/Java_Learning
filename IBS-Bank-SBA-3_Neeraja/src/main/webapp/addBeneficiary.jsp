<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
                                <th align="center"><a href="/acctSummary?userName=${userName}">Account Summary</a></th>
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
                        <a href="accountStatement">Account Statement <br></a><br><br>
                        <a href="changePassword.jsp">Change Password<br></a>
                        <a href="index.jsp">Log out</a>
                        <br>
                        <br>
                    </td>
                    <td  width="1100" height="80" bgcolor="#FAF8CC">
                    <font color="brown"><h2>Funds Transfer</h2></font>
                        <h4><a href="/fundsTransferHome?userName=${userName}">View List Of Beneficiaries</a> <span> | </span>
                        <span><a href="/transferFunds?userName=${userName}">Transfer Funds</a></span></h4>
      <form:form action="/addBnfcry?userName=${userName}" method="POST" modelAttribute="addBnf" class="form">
			<table>
			<tr><td><strong>Beneficiary Acct # </strong></td> 
			<td><em><input type="number" name="bnfcryAcctNum" required /></em></td>
			</tr>
			<tr><td><strong>Beneficiary Acct Name </strong></td> 
			<td><em><input type="text" name="bnfcryAcctName" required /></em></td>
			</tr>
			<tr><td><strong>Beneficiary Bank</strong></td> 
			<td><em><input type="text" name="bnfcryBankName" required /></em></td>
			</tr>
			<tr><td><strong>Beneficiary IFSC</strong></td> 
			<td><em><input type="text" name="bnfcryBankIfsc" required /></em></td>
			</tr>
			<tr><td><strong>Beneficiary Mobile #</strong></td> 
			<td><em><input type="text" name="bnfcryMblNum" required /></em></td>
			</tr>
			<tr><td align="center"><button>Add</button></td> 
			<td><em></em></td>
			</tr>
</table>
</form:form>
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