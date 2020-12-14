<%@page import="java.time.LocalDate" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<link href ="${pageContext.request.contextPath}/resources/IBS-Styling.css" type ="text/css" rel ="stylesheet"></link>
	<title>Registration Form</title>
<script type="text/javascript">
	function typOfAcctChk() {
    if (document.getElementById('customer').checked) {
        document.getElementById('ifCustomer').style.display = 'block';
    } else {
        document.getElementById('ifCustomer').style.display = 'none';
   }
	}
</script>
	</head>
<body>
	<h1>IBS Bank</h1>
	<h3>Welcome! Register below</h3>
	<jsp:include page="homeMenu.jsp"/>

<form:form action="/register" method="POST" modelAttribute="register" class="form">
	<table>
			<tr><td><strong>User Name</strong></td> 
			<td><em><input type="text" name="userName" required /></em></td>
			</tr>
			<tr><td><strong>Password</strong></td> 
			<td><em><input type="password" name="password" required /></em></td>
			</tr>
			<tr><td><strong>Full Name</strong></td> 
			<td><em><input type="text" name="fullName" required /></em></td>
			</tr>
			<tr><td><strong>Date Of Birth</strong></td> 
			<td><em><input type="date" name="dateOfBirth" required /></em></td>
			</tr>
			<tr><td><strong>Gender</strong></td> 
				<td> <div class="Gender">
        			<input type="radio" name="gender" value="Male" CHECKED/><label for="male">Male</label>
        			<input type="radio" name="gender" value="Female" /><label for="female">Female</label>
      				</div>
      			</td>
			</tr>
			<tr><td><strong>Email Id</strong></td> 
			<td><em><input type="text" name="emailId" required /></em></td>
			</tr>
			<tr><td><strong>Mobile # </strong></td> 
			<td><em><input type="text" name="mobileNum" required /></em></td>
			</tr>
			<tr><td><strong>Address</strong></td>
			<td><em><input type="text" name="address" required /></em></td>
			</tr>
			<tr><td><strong>City</strong></td> 
			<td><em><input type="text" name="city" required /></em></td>
			</tr>
			<tr><td><strong>PinCode</strong></td> 
			<td><em><input type="number" name="pinCode" required /></em></td>
			</tr>
			<tr><td><strong>Type of Account</strong></td> 
				<td><div class="typeOfAcctHolder">
        			<input type="radio" onclick="typOfAcctChk();" value="Customer" name ="typeOfAcctHolder" id="customer"/><label for="customer">Customer</label>
        			<input type="radio" onclick="typOfAcctChk();" value="Service Provider"name ="typeOfAcctHolder" /><label for="serviceProvider">ServiceProvider</label>
      				</div>
				</td>
			</tr>
			<tr  id="ifCustomer" style="display:none"><td width =200 height=30><strong>Customer Account Type</strong></td> 
				<td>
    				<div><input type="checkbox" name="custAcctType" value="Savings Account"><label for="savingsAcct">Savings</label></div>
    				<div><input type="checkbox" name="custAcctType" value="Fixed Deposit"><label for="fdAcct">Fixed Deposit</label></div>
    				<div><input type="checkbox" name="custAcctType" value="Recurring Deposit"><label for="rdAcct">Recurring Deposit</label></div>
  				</td>
			</tr>
			<tr><td><strong>KYC Upload Type</strong></td> 
				<td> <div class="kycIdentityType">
        			<input type="radio" name="kycIdentityType" value="PAN Card" CHECKED/><label for="panCard">PAN Card</label>
        			<input type="radio" name="kycIdentityType" value="Aadhaar Card" /><label for="aadhaarCard">Aadhaar Card</label>
      				</div>
      			</td>
			</tr>
			<tr><td><strong>Upload Proof</strong></td> 
			<td><em><input type="file" name="kycUploadDoc"/></em></td>
			</tr>
			<tr><td><button>Submit</button></td> 
			<td><em></em></td>
			</tr>
</table>
</form:form>
	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>