<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
    
    	<style>
        body {
            background-color: powderblue;
        }
       
        h1 {
            color: green;
            background-color: green;
            font-size: 1em;
            text-align: center;
            line-height: 30px;
        }
       
        h1 {
            color: red;
            background-color: LightSeaGreen;
            font-size: 5em;
            text-align: center;
            line-height: 60px;
        }
        
        h2,
        ul {
            text-align: center;
        }
       
        li {
            list-style: none;
            display: inline-block;
            padding: 5px;
            border: 1px solid black;
        }
       
        form {
            text-align: center;
        }
       
        label {
            margin-right: 5px;
            width: 75px;
            display: inline-block;
        }
       
        .formInput {
            margin: 10px;
            font-size: 15px;
        }
        input{
            margin: 5px;
        }
       
        button {
            margin: 5px;
            width: 82px;
        }
       
        a {
            margin-right: 5px;
        }
       
        footer {
            background-color: LightSeaGreen;
            font-size: 1em;
            text-align: center;
            line-height: 20px;
        }
        </style>-- 
        <title>IBS Bank- Funds Transfer</title>
    </head>
   <body>
	<h1>IBS Bank</h1>
        
        <form name="acctSummary" >
            <table border="0" cellspacing="0" cellpadding="0">
                <tr><td>
                	<table border="0.5" >
                            <tr bgcolor="#FFF0FF">
                                <th align="center"><a href="accountSummary.jsp">Account Summary&nbsp;&nbsp;</a></th>
                                <th align="center"><a href="fixedDeposit.jsp">Fixed Deposit&nbsp;&nbsp;</a></th>
                                <th><a href="accountSummary.jsp">Account Statement&nbsp;&nbsp;</a></th>
                                <th><a href="recurringDepost.jsp">Recurring Deposit&nbsp;&nbsp;</a></th></tr>
                            <tr>
                            <tr align="right"><p>Welcome User !! </p></tr>
                        </table>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td bgcolor="#E3E4FA" height="410" width="24%" valign="top">
                        <br><strong>Services</strong><br>
                        <a href="accountSummary.jsp">Account Summary<br></a>
                        <a href="fundsTransfer.jsp">Funds Transfer<br></a>
                        <a href="accountStatement.jsp">Account Statement <br></a><br><br>
                        <a href="changePassword.jsp">Change Password<br></a>
                        <a href="index.jsp">Log Out</a>
                        <br>
                        <br>
                    </td>
                    <td width="1100" height="100" bgcolor="#FAF8CC">
                        <font color="brown"><h2>Funds Transfer </h2></font>
                        <h3></h3>
               <form action="transferFunds" method="POST" >
				 
				 
		<table border="0" cellspacing="0" cellpadding="0" width="40%" >
			<tr><td><strong>From Account</strong></td> 
			<td><em><input type="number" name="fromAccount" required /></em></td>
			</tr>
			<tr><td><strong>To Account</strong></td> 
			<td><em><input type="number" name="toAccount" required /></em></td>
			</tr>
			<tr><td><strong>Transfer Amount</strong></td> 
			<td><em><input type="number" name="transferAmount" min="1" max="200000" step="1" required/></em></td>
			</tr>
			<tr><td><strong>Transfer Type</strong></td> 
			<td><em><input type="text" name="transferType" required /></em></td>
			</tr>
			<tr><td><strong>Comments</strong></td> 
			<td><em><input type="text" name="txnComments" required /></em></td>
			</tr>
			<tr  align="center"><td><button>Transfer Funds</button></td> 
			<td><em></em></td>
			</tr>
		</table>
			
            </table>
            <table border="0" cellspacing="0" cellpadding="0" width="100%">
            </table>

            <table border="0" cellspacing="0" cellpadding="0" width="100%" height="63" background="HTML/images/bot.gif">
                <tr>
                    <td>
                        <table border="0" cellspacing="0" cellpadding="0" width="780" background="" height="25">
                            <footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer><br/></td>
                            </tr>
                        </table>
                    </td>
                    <td>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>