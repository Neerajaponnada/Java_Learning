<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
   	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
        <title>IBS Bank- Funds Transfer</title>
    </head>
   <body>
	<h1>IBS Bank</h1>
           <table border="0" cellspacing="0" cellpadding="0" >
                <tr><td>
                	<table border="0.5" >
                            <tr bgcolor="#FFF0FF">
                               <jsp:include page="customerMenu.jsp"/>   
                            <tr>
                            <tr align="right"><p align="right">Welcome ${userName} !! </p></tr>
                        </table>
                    </td>
                </tr>
            </table>
                    <td width="1100" height="100" bgcolor="#FAF8CC">
                        <font color="brown"><h2>Funds Transfer </h2></font>
						<h4><a href="/addBnfPage?userName=${userName}">Add Beneficiary</a>
                        <span><a href="/fundsTransferHome?userName=${userName}">View List Of Beneficiaries</a></span></h4>
<form:form action="/transfer?userName=${userName}" method="POST" modelAttribute="transfer" class="form">

		<table border="0" cellspacing="0" cellpadding="0" width="40%" >
			<tr><td><strong>From Account</strong></td> 
			<td><input type="text" name="fromAcctNum"  value=${fromCustAcctNum} readonly /></td>
			</tr>
			<tr><td><strong>To Account&nbsp;</strong></td> 
			<td><select name="toAcctNum">
   				 <c:forEach items="${bncfryList}" var="c">
        			<option value="${c.bnfcryId}">${c.bnfcryAcctNum}  ${c.bnfcryAcctName} </option>
    			</c:forEach>
			</select></td>
			</tr>
			<tr><td><strong>Transfer Amount</strong></td> 
			<td><em><input type="number" name="txnAmt" min="1" max="500000" step="1" required/></em></td>
			</tr>
			<tr><td><strong>Comments</strong></td> 
			<td><em><input type="text" name="txnCmnts" required /></em></td>
			</tr>
			<tr align="right"><td><button>Transfer</button></td> 
			<td><em></em></td>
			</tr>
		</table>
	</form:form>	
          <footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
    </body>
</html>