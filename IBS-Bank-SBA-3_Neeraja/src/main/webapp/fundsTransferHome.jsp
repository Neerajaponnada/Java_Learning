<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>IBS Bank-Funds Transfer</title>
    	 		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
    </head>
   <body leftmargin=0 topmargin=0 marginheight="0" marginwidth="0"  >
	<h1 style="text-align:center;background-color:DarkCyan;color:White;font-size:45">IBS Bank</h1>
        <table>
                <tr><td>
                		<table >
                            <tr bgcolor="#FFF0FF"><jsp:include page="customerMenu.jsp"/></tr>
                            <tr></tr>
                            <tr></tr>
                            <tr align="right"><p align="right">Welcome ${userName} !! </p></tr>
                        </table>
                   </td></tr>
            </table>
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
            <p>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</o>
    </body>
</html>
