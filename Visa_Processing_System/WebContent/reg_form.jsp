<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

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

                        <div class="row  p-5 bg-dark" style="height:100vh;border-style: outset;">
                        <div class="col-12">	
	
	<spr:form action="reg.htm" method="post" commandName="user" >
	
	<table align="center"  >
		
	
		
		
		<tr style="margin-top: 10px">
			<td style="color: white">
				First Name:
			</td>
			<td>
				<spr:input path="firstName"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Last Name:
			</td>
			<td>
				<spr:input path="lastName"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Gender :
			</td>
			<td style="color: white">
				<spr:radiobutton path="gender" value="Male"/>Male
			    <spr:radiobutton path="gender" value="Female"/>Female<br>
			    <spr:radiobutton path="gender" value="Other"/>Other<br>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Country :
			</td>
			<td>
			 <spr:select path="country">
			    <spr:option value="India">India</spr:option>
			    <spr:option value="Canada">Canada</spr:option>
			    <spr:option value="USA">USA</spr:option> 
			    <spr:option value="Sri Lanka">SriLanka</spr:option>
			    <spr:option value="Switzerland">Switzerland</spr:option>
			    <spr:option value="Finland">Finland</spr:option>
			     <spr:option value="Iran">Iran</spr:option>
			    <spr:option value="Qatar">Qatar</spr:option>
			    <spr:option value="lasVegas">Las Vegas</spr:option>
			     <spr:option value="Macau">Macau</spr:option>
			    <spr:option value="Indonesia">Indonesia</spr:option>
			    <spr:option value="Bhutan">Bhutan</spr:option>
			  </spr:select>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Address:
			</td>
			<td>
				<spr:textarea path="addr"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Email Id:
			</td>
			<td>
				<spr:input path="emailId"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Contact No:
			</td>
			<td>
				<spr:input path="contactNo"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Date Of Birth :
			</td>
			<td>
				<spr:input path="dateOfBirth"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Passport No :
			</td>
			<td>
				<spr:input path="passportNo"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Date Of Issue :
			</td>
			<td>
				<spr:input path="dateOfIssue"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Valid Upto:
			</td>
			<td>
				<spr:input path="validUpto"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white">
				Password:
			</td>
			<td>
				<spr:password path="password"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
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
	</spr:form>
	
</body>
</html>