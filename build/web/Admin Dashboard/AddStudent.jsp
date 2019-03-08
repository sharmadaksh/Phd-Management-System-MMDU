<%-- 
    Document   : AddStudent
    Created on : Jan 25, 2019, 10:59:12 AM
    Author     : HP PAVILION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Login_v9/css/Dashboard.css" rel="stylesheet" type="text/css">
        <title>Student Addition | Admin</title>
    </head>
    <body>
        <form method="post" action="../AddCourse">
        <div>
            <div>
                <%@include file="AdminHome.jsp" %>
            </div>
            <div class="container" align="center" style="border-radius: 20px;">
  
                <h2 style="color:#990000">Student Creation Portal</h2>
      <hr style="color:#17a2b8;">
    <div class="row">
      <div class="col-25">
        <label for="uname">Student Id</label>
      </div>
      <div class="col-75">
        <input type="text" style="border-radius: 20px;" id="" name="" placeholder="Enter Student Id..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">Student Username</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Student Userame..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Student Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Student Name..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Father Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Father Name..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Session Begin Month</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Session Begin Month..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Session End Month</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Session End Month..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Session Begin Year</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Session Begin Year..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Session End Year</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Session End Year..">
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="lname">Stream Id</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" style="border-radius: 20px;" placeholder="Enter Stream Id..">
      </div>
    </div>
      <br>
      <hr>
       <div class="row">
        <br><input type="submit" value="Create Student">
    </div>
 
</div>
            <div color="cyan">
                <%@include file="Footer.jsp" %>
            </div>
       </div>
            </form>
    </body>
</html>
