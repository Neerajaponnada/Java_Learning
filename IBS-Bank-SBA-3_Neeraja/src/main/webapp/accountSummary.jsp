<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

	<style>
        body {
            background-color: powderblue;
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
    <head>
        <title>IBS Bank-Account Summary</title>
    </head>
   <body>
	<h1>IBS Bank</h1>
        
        <form name="acctSummary" >
            <table border="0" cellspacing="0" cellpadding="0" >
                <tr><td>
                	<table border="0.5" >
                            <tr bgcolor="#FFF0FF">
                                <th align="center"><a href="accountSummary.jsp">Account Summary&nbsp;&nbsp;</a></th>
                                <th align="center"><a href="fundsTransfer.jsp">Funds Transfer&nbsp;&nbsp;</a></th>
                                <th align="center"><a href="fixedDeposit.jsp">Fixed Deposit&nbsp;&nbsp;</a></th>
                                <th><a href="recurringDeposit.jsp">Recurring Deposit&nbsp;&nbsp;</a></th></tr>
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
                        <a href="accountStatement">Account Statement <br></a><br><br>
                        <a href="changePassword.jsp">Change Password<br></a>
                        <a href="index.jsp">Log out</a>
                        <br>
                        <br>
                    </td>
                    <td width="8000" height="100" bgcolor="#FAF8CC">
                        <font color="brown"><h2>Account Summary</h2></font>
                        <h3>Savings Account</h3>
                        <table border="1" >
                            <tr bgcolor="#98AFC7">
                                <th align="center">Account no</th>
                                <th align="center">Branch</th>
                                <th>Name</th>
                                <th>Currency</th>
                            	<th>Available Balance</th></tr>
                            <tr><td>9999999999</td>
                            	<td>Hyderabad</td>
                            	<td>Tom Cruise</td>
                                <td>INR</td>
                                <td>2,10,678</td></tr>
                        </table>
                    </td>
                </tr>
            </table>
            <table border="0" cellspacing="0" cellpadding="0" width="100%">
            </table>

            <table border="0" cellspacing="0" cellpadding="0" width="100%" height="63">
                <tr>
                    <td>
                        <table border="0" cellspacing="0" cellpadding="0" width="780" background="" height="25">
                            <footer>Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer></td>
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
