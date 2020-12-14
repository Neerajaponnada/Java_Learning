<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
	 	<title>IBS Bank - Login</title>
	</head>
	<body>
	<h1>IBS Bank - Login</h1>
<jsp:include page="homeMenu.jsp"/>
<h2>Welcome Back To IBS Bank</h2>

<form:form action="/login" method="POST" modelAttribute="login" class="form">
<table>
		<tr><td><strong>Login ID&nbsp;</strong></td> 
		<td><em><input type="text" name="userName" required /></em></td>
		</tr>
		<tr><td><strong>Password&nbsp;</strong></td> 
		<td><em><input type="password" name="password" required /></em></td>
		</tr>
		<tr><td><strong>Role&nbsp;</strong></td> 
		<td><div class="role">
        			<input type="radio" name="role" value="Customer" CHECKED/><label for="customer">Customer</label>
        			<input type="radio" name="role" value="Admin" /><label for="Admin">Admin</label>
      				</div></td>
		</tr>
		<tr>		<td></td>
		<td align="center"><button>Submit</button></td> 
		</tr>
</table>
</form:form>
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>
