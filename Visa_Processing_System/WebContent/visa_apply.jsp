<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
      crossorigin="anonymous"
    />

    <title>Apply Visa!</title>
  </head>

  <body>
    <spr:form action="product_add.htm" method="get" commandName="">
    
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

                        <div class="row  p-5 bg-dark" style="height:40vh;border-style: outset;">
                        <div class="col-12">	
    <table class="table table-bordered">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">To Country</th>
          <th scope="col">Start Date</th>
          <th scope="col">End Date</th>
          <th scope="col">Visa Type</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th scope="row">1</th>
          <td><spr:input path="productName" /></td>
          <td><spr:input path="productName" /></td>
          <td><spr:input path="productName" /></td>
        </tr>
      </tbody>
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