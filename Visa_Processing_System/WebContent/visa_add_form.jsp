<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visa Add Form</title>
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
                            <div class="col-12 " style="color:black;font-size: 35px; font-family: inherit; padding-left: 20vh">Apply Visa</div>
                        </div>

                        <div class="row  p-5 bg-dark" style="height:50vh;border-style: outset;">
                        <div class="col-12">	
	
	<spr:form action="visa_add.htm" method="post" commandName="visa" >
	
	<table align="center"  >
		
	
		
		
		
		<tr>
			<td style="color: white;">
				To Country :
			</td>
			<td>
			 <spr:select path="toCountry">
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
			<td style="color: white;">
				Start Date :
			</td>
			<td>
				<spr:input path="startDate"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">
				End Date :
			</td>
			<td>
				<spr:input path="endDate"/>
			</td>
		</tr>
		
		<tr>
			<td style="color: white;">
				Visa Type :
			</td>
			
			<td>
			 <spr:select path="visaType">
			    <spr:option value="Business/Tourist visa">Business/Tourist visa</spr:option>
			    <spr:option value="Work visa">Work visa</spr:option>
			    <spr:option value="Student visa">Student visa</spr:option> 
			    <spr:option value="Exchange visitor visa">Exchange visitor visa</spr:option>
			    <spr:option value="Transit/ship crew visas">Transit/ship crew visas</spr:option>
			    <spr:option value="Religious worker visa">Religious worker visa</spr:option>
			    
			  </spr:select>
			
			</td>
			
		</tr>
		
		
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Apply" >
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