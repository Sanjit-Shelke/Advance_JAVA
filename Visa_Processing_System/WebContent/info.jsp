<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body style="background-image: url(visa_login.jpg); background-size: cover">
	<div class="container-fluid">
        <!--navbar-->
        <div class="row  align-items-center" style="height: 10vh;">
            <div class="col-12 " 
                style="font-size: 30px;font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;font-weight:normal; text-align: center; 
                background-color: teal; color: white;">
                Online Visa Processing Portal 
            </div>        
    	</div>
    	
    	 <div class="row justify-content-center" style="height: 90vh;">
            <div class="col-6 d-flex justify-content-center align-items-center">
                <div class="row justify-content-center" style="height:50vh;">
                    <div class="col-12 ">

                        <div class="row bg-success" style="height:10vh;border-style: outset;">
                            <div class="col-12 " style="color:white;font-size: 35px; font-family: inherit; padding-left: 10vh">Password Sent</div>
                        </div>

                        <div class="row  p-5 bg-dark" style="height:100vh;border-style: outset;">
                        <div class="col-12">	

	<table align="center" >
		<tr>
			<td style="color: red"> <%=request.getAttribute("msg")%></td>
		</tr>
		<tr>
			<td> <a href="index.jsp" >Sign In</a> </td>
		</tr>
	</table>
	
	 </div>
                        </div>


                    </div>
                </div>
            </div>
        </div>             
  </div>	
</body>
</html>