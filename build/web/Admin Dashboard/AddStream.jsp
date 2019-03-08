<%-- 
    Document   : AddStream
    Created on : Jan 25, 2019, 10:50:33 AM
    Author     : HP PAVILION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Login_v9/css/Dashboard.css" rel="stylesheet" type="text/css">
        <title>Stream Addition | Admin</title>
    </head>
    <body>
        <form method="post" action="../AddCourse">
        <div>
            <div>
                <%@include file="AdminHome.jsp" %>
            </div>
            <div class="container">
  
      <h2>Stream Creation Portal</h2>
    <div class="row">
      <div class="col-25">
        <label for="uname">Stream ID</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" placeholder="Enter Stream Id..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">Stream Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="" name="" placeholder="Enter Stream Name..">
      </div>
    </div>
       <div class="row">
        <br><input type="submit" value="Create Stream">
    </div>
 
</div>
            <div color="cyan">
                <%@include file="Footer.jsp" %>
            </div>
       </div>
            </form>
    </body>
</html>
