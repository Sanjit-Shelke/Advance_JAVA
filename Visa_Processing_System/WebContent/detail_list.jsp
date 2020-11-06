<%@page import="com.cdac.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
                            <div class="col-12 " style="color:black;font-size: 35px; font-family: inherit;">Registration Form</div>
                        </div>

                        <div class="row  p-5 bg-dark" style="height:70vh;border-style: outset;">
                        <div class="col-12">	
	
	<table align="center">
		
		<%
		List<User> ulist = (List<User>)request.getAttribute("detailList");
		for(User u : ulist)
		{
		%>
		<tr>
		
			
			<td style="color: white;">First Name :</td>
			<td style="color: silver;">
				 
				  <%=u.getFirstName() %>
			</td>
			
			
		</tr>
		<tr>
			<td style="color: white;">Last Name :</td>
			<td style="color: silver;">
				 <%=u.getLastName() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Gender :</td>
			<td style="color: silver;">
				 <%=u.getGender() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Country :</td>
			<td style="color: silver;">
				 <%=u.getCountry() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Address :</td>
			<td style="color: silver;">
				 <%=u.getAddr() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Email Id :</td>
			<td style="color: silver;">
				 <%=u.getEmailId() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Contact No :</td>
			<td style="color: silver;">
				 <%=u.getContactNo() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Date Of Birth :</td>
			<td style="color: silver;">
				 <%=u.getDateOfBirth() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Passport No :</td>
			<td style="color: silver;">
				 <%=u.getPassportNo() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Date Of Issue :</td>
			<td style="color: silver;">
				 <%=u.getDateOfIssue() %>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">Valid Upto :</td>
			<td style="color: silver;">
				 <%=u.getValidUpto() %>
			</td>
			
		</tr>
		
		<%} %>
					
			
		<tr>
			<td style="padding-left: 30vh">
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
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