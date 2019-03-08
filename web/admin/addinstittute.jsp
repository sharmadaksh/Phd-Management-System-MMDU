<%-- 
    Document   : addinstittute
    Created on : Mar 6, 2019, 11:04:06 AM
    Author     : Daksh
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Add Instittute</title>
                <link href="../css/Dashboard.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form method="post" action="createinstitute">
        <div>
            <div>
                <%@include file="adminhome.jsp" %>
            </div>
            <div class="container">
  
      <h2>Institute Creation Portal</h2>
    <div class="row">
      <div class="col-25">
        <label for="instid">Institute ID</label>
      </div>
      <div class="col-75">
        <input type="text" id="instid" name="instid" placeholder="Enter Institute Id..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="instname">Institute Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="instname" name="instname" placeholder="Enter Institute Name..">
      </div>
    </div>
       <div class="row">
        <br><input type="submit" value="Create Institute">
    </div>
 
</div>
            <div color="cyan">
                <%@include file="footer.jsp" %>
            </div>
       </div>
            </form>
    </body>
</html>
