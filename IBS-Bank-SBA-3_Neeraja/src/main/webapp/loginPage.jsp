<html>
	<head>
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
            margin: 20px;
            width: 100px;
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
	
	 	<title>User Login</title>
	</head>
	<body>
	<h1>IBS Bank - Login</h1>
<jsp:include page="homeMenu.jsp"/>


<h2>Welcome Back To IBS Bank</h2>
<table>
		<tr><td><strong>Login ID&nbsp;&nbsp;</strong></td> 
		<td><em><input type="number" name="uci" required /></em></td>
		</tr>
		<tr><td><strong>Password&nbsp;&nbsp;</strong></td> 
		<td><em><input type="password" name="password" required /></em></td>
		</tr>
		<tr><td align="center"><a href="accountSummary.jsp"><button>Submit</button></a></td> 
		<td><em></em></td>
		</tr>
</table>

	 <p>
		<footer style="text-align:center;">Copyright&copy;2020 IBS Bank.com. All rights reserved | Designed by Batch-7 Group3</footer>
	 <p>
</body>
</html>
