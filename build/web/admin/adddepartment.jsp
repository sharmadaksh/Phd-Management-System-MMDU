<%-- 
    Document   : adddepartment
    Created on : Mar 6, 2019, 11:35:51 AM
    Author     : Daksh
--%>
<%@page import="model.dao.InstituteinfoDAO"%>
<%@page import="model.to.InstituteinfoTO"%>
<%@page import="java.util.List"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Create Department</title>
                <link href="../css/Dashboard.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form method="post" action="createdepartment">
        <div>
            <div>
                <%@include file="adminhome.jsp" %>
            </div>
            <div class="container">
  
      <h2>Department Creation Portal</h2>
    <div class="row">
      <div class="col-25">
        <label for="stepid">Department ID</label>
      </div>
      <div class="col-75">
        <input type="text" id="deptid" name="deptid" placeholder="Enter Department Id..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="deptname">Department Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="deptid" name="deptname" placeholder="Enter Department Name..">      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="instid">Choose Institute :</label>
      </div>
      <div class="col-75">
        <select id="instid" name="instid">
            <option value="">Choose Institute</option>
            <%
                List<InstituteinfoTO> all_details = new InstituteinfoDAO().getAllRecord();
                if(all_details!=null){
                    for(InstituteinfoTO it : all_details){
                        out.println("<option value=\"" + it.getInstid() + "\">" + it.getInstname() + "</option>");
                                
                    }                    
                }
                
                
              %>
        </select>
      </div>
    </div>
       <div class="row">
        <br><input type="submit" value="Create Department">
    </div>
 
</div>
            <div color="cyan">
                <%@include file="footer.jsp" %>
            </div>
       </div>
            </form>
    </body>
</html>
