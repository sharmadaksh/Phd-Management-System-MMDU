s<%-- 
    Document   : addphdstep
    Created on : Mar 6, 2019, 11:08:09 AM
    Author     : Daksh
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Phd Step</title>
                <link href="../css/Dashboard.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form method="post" action="createphdstep">
        <div>
            <div>
                <%@include file="adminhome.jsp" %>
            </div>
            <div class="container">
  
      <h2>Step Creation Portal</h2>
    <div class="row">
      <div class="col-25">
        <label for="stepid">Step ID</label>
      </div>
      <div class="col-75">
        <input type="text" id="stepid" name="stepid" placeholder="Enter Step Id..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="stepname">Step Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="stepid" name="stepname" placeholder="Enter Step Name..">
      </div>
    </div>
       <div class="row">
        <br><input type="submit" value="Create Step">
    </div>
 
</div>
            <div color="cyan">
                <%@include file="footer.jsp" %>
            </div>
       </div>
            </form>
    </body>
</html>
