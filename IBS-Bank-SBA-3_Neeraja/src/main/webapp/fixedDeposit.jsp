<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>IBS Bank-Fixed Deposit</title>
    </head>
   <body>
	<h1 >IBS Bank</h1>
        
            <table>
                <tr><td>
                	<table>
                            <tr>
                               <jsp:include page="customerMenu.jsp"/>   
                            <tr>
                            <tr align="right"><p align="right">Welcome ${userName} !! </p></tr>
                        </table>
                    </td>
                </tr>
            </table>
                    <td width="1100" height="80" border = "1" bgcolor="#98AFC7">
                        <font color="brown"><h2>Account Summary - Fixed Deposit</h2></font>
                        <c:choose>
				<c:when test="${fdData==null || fdData.isEmpty()}">
					<div class="alert alert-info">
						<strong>No Fixed Deposit Account Available</strong>
					</div>
				</c:when>
				<c:otherwise>
				 <table >
                           <thead> <tr align="center" bgcolor="#98AFC7">
                               <th>Account Number</th>
								<th>Customer Name</th>
								<th>Branch Name</th>
                                <th>Tenure</th>
                                <th>Maturity Date</th>
                            	<th>Maturity Amount</th></tr></thead>
                            <tbody>
							<c:forEach var="c" items="${fdData }">
								<tr  bgcolor="#FAF8CC">
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
            <p style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</p>
    </body>
</html>
