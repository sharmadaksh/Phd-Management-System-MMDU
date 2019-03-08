<%-- 
    Document   : AddLoginDetails
    Created on : Jan 25, 2019, 9:40:36 AM
    Author     : HP PAVILION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Login_v9/css/Dashboard.css" rel="stylesheet" type="text/css">
        <title>Create Login | Admin</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
                <form method="post" action="../AddCourse">
        <div>
            <div>
                <%@include file="AdminHome.jsp" %>
            </div>
            <div class="container">
  
      <h2>Login Creation Portal</h2>
    <div class="row">
      <div class="col-25">
        <label for="uname">Username</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" placeholder="Enter Username..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">Password</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" placeholder="Enter Password..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="">Rolename</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" placeholder="Rolename..">
      </div>
    </div>
          <div class="row">
      <div class="col-25">
        <label for="subject">Email Id</label>
      </div>
      <div class="col-75">
          <input type="text" id="" name="" placeholder="Enter Email.."><br>
      </div>
      </div>
      <div class="row">
      <div class="col-25">
        <label for="subject">Security Question</label>
      </div>
      <div class="col-75">
          <select class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                <option value="Select">Select</option>
                <option value="What was the registration number of your first vehicle?">What was the registration number of your first vehicle?</option>
                <option value="What is your favourite color?">What is your favourite color?</option>
                <option value="Which book do you read frequently?">Which book do you read frequently?</option>
                <option value="What was name of your first school?">What was name of your first school?</option>
                <option value="What is your mother's maiden name?">What is your mother's maiden name?</option>
          </select>
      </div>
      </div>
         
         <div class="row">
         <div class="col-25">
        <label for="fname">Security Answer</label>
      </div>
      <div class="col-75">
          <input type="text" id="" name="" placeholder="Security Answer Here.."><br>
      </div>
         </div>
       <div class="row">
        <br><input type="submit" value="Create User">
    </div>
 
</div>
            <div color="cyan">
                <%@include file="Footer.jsp" %>
            </div>
       </div>
            </form>
    </body>
</html>
