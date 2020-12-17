<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>IBS Bank-Account Summary</title>
   	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
    </head>
   <body>
	<h1>IBS Bank</h1>
           <table>
                <tr><td>
                	<table >
                            <tr>
                               <jsp:include page="customerMenu.jsp"/>   
                            <tr>
                            <tr align="right"><p align="right">Welcome ${userName} !! </p></tr>
                        </table>
                    </td>
                </tr>
            </table>
                    <td  width="1100" height="80">
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
         <footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
    </body>
</html>