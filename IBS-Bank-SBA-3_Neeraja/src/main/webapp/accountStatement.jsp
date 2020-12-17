<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>IBS Bank-Account Statement</title>
    	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
    </head>
   <body leftmargin=0 topmargin=0 marginheight="0" marginwidth="0"  style="background-color:PaleGoldenRod;">
	<h1 style="text-align:center;color:White;font-size:45">IBS Bank</h1>
            <table border="0" cellspacing="0" cellpadding="0"  bgcolor="#FFF0FF">
                <tr><td>
                            <jsp:include page="customerMenu.jsp"/>
                            <tr align="right"><p>Welcome ${userName} !! </p></tr>
                        </table>
                    <td width="1100" height="80" bgcolor="#FAF8CC">>
              <form:form action="/filterStmt?userName=${userName}" method="GET" modelAttribute="filterStmt" class="form">
                        <font color="brown"><h2>Account Statement</h2></font>
                        <strong>Customer</strong><input type="text" name="custAcctNum"  value=${custAcctNum} readonly />
                        <strong>UserName</strong><input type="text" name="userName"  value=${userName} readonly />
                        <strong>From </strong> 
							<em><input type="date" name="startDate" required /></em>
						<strong>To </strong>
						<em><input type="date" name="endDate" required />
						<button>Filter</button>
				</form:form>
               <c:choose>
				<c:when test="${acctStmt==null || acctStmt.isEmpty()}">
					<div class="alert alert-info">
						<strong>No transaction available for the selected user</strong>
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
 <br><footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
    </body>
</html>
