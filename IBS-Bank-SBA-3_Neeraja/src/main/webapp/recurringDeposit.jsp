<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
    
        <title>IBS Bank- Recurring Deposit</title>
    </head>
   <body leftmargin=0 topmargin=0 marginheight="0" marginwidth="0" >
	<h1>IBS Bank</h1>
        
             <table>
                <tr><td>
                	<table >
                            <tr>
                               <jsp:include page="customerMenu.jsp"/>   
                            <tr>
                            <tr align="right"><p>Welcome ${userName} !! </p></tr>
                        </table>
                    </td>
                </tr>
            </table>
                        <font color="brown"><h2>Account Summary - Recurring Deposit</h2></font>
             <c:choose>
				<c:when test="${rdData==null || rdData.isEmpty()}">
					<div class="alert alert-info">
						<strong>No Recurring Deposit Account Available</strong>
					</div>
				</c:when>
				<c:otherwise>
				 <table border="1" ><thead>
                             <tr bgcolor="#E3E4FA" >
                               <th>Account Number</th>
								<th>Customer Name</th>
								<th>Branch Name</th>
                                <th>Tenure</th>
                                <th>Maturity Date</th>
                            	<th>Maturity Amount</th></tr></thead>
                            <tbody>
							<c:forEach var="c" items="${rdData }">
								 <tr bgcolor="#FFF0FF">
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
               <footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
    </body>
</html>
