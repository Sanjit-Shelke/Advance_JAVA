<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body style="background-image: url(visa_login.jpg); background-size: cover">

	
	
	<spr:form action="update_detail.htm" method="post" commandName="user" >
	
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
	<table align="center" style="border:solid black 2px; margin-top: 10px; padding: 20px;" >
		
	
		<tr align="center">
		<td style="font-size: 20px; font-family: sans-serif; background-color: silver; margin-left: 30px">Update Details</td>
		</tr>
		
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="userId"/>
			</td>
		</tr>
		
		<tr style="margin-top: 10px">
			<td>
				First Name:
			</td>
			<td>
				<spr:input path="firstName"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Last Name:
			</td>
			<td>
				<spr:input path="lastName"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Gender :
			</td>
			<td>
				<spr:radiobutton path="gender" value="Male"/>Male
			    <spr:radiobutton path="gender" value="Female"/>Female<br>
			    <spr:radiobutton path="gender" value="Other"/>Other<br>
			</td>
		</tr>
		
		<tr>
			<td>
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
			<td>
				Address:
			</td>
			<td>
				<spr:textarea path="addr"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Email Id:
			</td>
			<td>
				<spr:input path="emailId"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Contact No:
			</td>
			<td>
				<spr:input path="contactNo"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Date Of Birth :
			</td>
			<td>
				<spr:input path="dateOfBirth"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Passport No :
			</td>
			<td>
				<spr:input path="passportNo"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Date Of Issue :
			</td>
			<td>
				<spr:input path="dateOfIssue"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Valid Upto:
			</td>
			<td>
				<spr:input path="validUpto"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Password:
			</td>
			<td>
				<spr:input path="password"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="update_details_form.htm" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Update" >
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