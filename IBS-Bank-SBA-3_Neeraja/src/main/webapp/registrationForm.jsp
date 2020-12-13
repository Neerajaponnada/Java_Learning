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
			<tr><td><strong>First Name</strong></td> 
			<td><em><input type="text" name="firstName" required /></em></td>
			</tr>
			<tr><td><strong>Last Name</strong></td> 
			<td><em><input type="text" name="lastName" required /></em></td>
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
				<td><div class="typeOfAcct">
        			<input type="radio" onclick="typOfAcctChk();" value="Customer" name ="typOfAcct" id="customer"/><label for="typeOfAcct">Customer</label>
        			<input type="radio" onclick="typOfAcctChk();" value="Service Provider"name ="typOfAcct" /><label for="typeOfAcct">ServiceProvider</label>
      				</div>
				</td>
			</tr>
			<tr  id="ifCustomer" style="display:none"><td width=200 height =30><strong>Customer Account Type</strong></td> 
				<td>
    				<div><input type="checkbox" name="custAcctType" value="Savings Account"><label for="savingsAcct">Savings</label></div>
    				<div><input type="checkbox" name="custAcctType" value="Fixed Deposit"><label for="fdAcct">Fixed Deposit</label></div>
    				<div><input type="checkbox" name="custAcctType" value="Recurring Deposit"><label for="rdAcct">Recurring Deposit</label></div>
  				</td>
			</tr>
			<tr><td><strong>KYC Upload Type</strong></td> 
			<td><select name="kycUploadType">
					<option></option>
					<option>PAN Card</option>
					<option>Aadhaar Card</option>
					</select></td>
			</tr>
			<!--  <tr><td><strong>Upload Proof</strong></td> 
			<td><em><input type="file" name="KYCIdentityProof"  /></em></td>  
			</tr>-->
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