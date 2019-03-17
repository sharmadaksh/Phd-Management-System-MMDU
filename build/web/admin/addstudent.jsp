<%-- 
    Document   : AddStudent
    Created on : Jan 25, 2019, 10:59:12 AM
    Author     : HP PAVILION
--%>

<%@page import="model.dao.DepartmentinfoDAO"%>
<%@page import="model.to.DepartmentinfoTO"%>
<%@page import="utility.YearList"%>
<%@page import="utility.MonthList"%>
<%@page import="java.util.List"%>
<%@page import="model.dao.InstituteinfoDAO"%>
<%@page import="model.to.InstituteinfoTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/Dashboard.css" rel="stylesheet" type="text/css">
        <title>Student Addition | Admin</title>
    </head>
    <body>
        <form method="post" enctype="multipart/form-data" action="createstudent">
            <div>
                <div>
                    <%@include file="adminhome.jsp" %>
                </div>
                <div class="container" align="center" style="border-radius: 20px;">

                    <h2 style="color:#000">Student Creation Portal</h2>
                    <hr style="color:#17a2b8;">

                    <div class="row">
                        <div class="col-25">
                            <label for="studentid">Student Reg No</label>
                        </div>
                        <div class="col-75">
                            <input type="text" style="border-radius: 20px;" id="studentid" name="studentid" placeholder="Enter Student Id..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="uname">Student Username</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="name">Student Name</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="name" name="name" style="border-radius: 20px;" placeholder="Enter Student Name..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="fname">Father Name</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="fname" name="fname" style="border-radius: 20px;" placeholder="Enter Father Name..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessbegmnth">Session Begin Month</label>
                        </div>
                        <div class="col-75">
                            <select name="sessbegmnth" id="sessbegmnth" class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                                <option value="">Choose Any Month</option>
                                <%
                                    List<String> sessbegmnth = MonthList.getMonths();
                                    int count = 1;
                                    for (String month : sessbegmnth) {
                                        out.println("<option value=\"" + count + "\">");
                                        out.println(month);
                                        out.println("</option>");
                                        count++;
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessendmnth">Session End Month</label>
                        </div>
                        <div class="col-75">
                            <select name="sessendmnth" id="sessbegmnth" class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                                <option value="">Choose Any Month</option>
                                <%
                                    List<String> sessendmnth = MonthList.getMonths();
                                    count = 1;
                                    for (String month : sessendmnth) {
                                        out.println("<option value=\"" + count + "\">");
                                        out.println(month);
                                        out.println("</option>");
                                        count++;
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessbegyr">Session Begin Year</label>
                        </div>
                        <div class="col-75">
                            <select name="sessbegyr" id="sessbegyr" class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                                <option value="">Choose Any Year</option>
                                <%
                                    List<String> sessbegyr = YearList.getYear();
                                    for (String yr : sessbegyr) {
                                        out.println("<option value=\"" + yr + "\">");
                                        out.println(yr);
                                        out.println("</option>");
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessendyr">Session End Year</label>
                        </div>
                        <div class="col-75">
                            <select name="sessendyr" id="sessendyr" class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                                <option value="">Choose Any Year</option>
                                <%
                                    List<String> sessendyr = YearList.getYear();
                                    for (String yr : sessendyr) {
                                        out.println("<option value=\"" + yr + "\">");
                                        out.println(yr);
                                        out.println("</option>");
                                    }
                                %>
                            </select>

                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="contact">Contact Number</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="contact" name="contact" style="border-radius: 20px;" placeholder="Enter Contact Number..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="aadhar">Aadhar Number</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="aadhar" name="aadhar" style="border-radius: 20px;" placeholder="Enter Aadhar Number..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="pan">Pan Number</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="pan" name="pan" style="border-radius: 20px;" placeholder="Enter Pan Number..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="category">Category</label>
                        </div>
                        <div class="col-75">
                            <select name="category" id="category">
                                <option value="">Select Any Category</option>
                                <option value="General">General</option>
                                <option value="Sc">SC</option>
                                <option value="St">ST</option>
                                <option value="Obc">OBC</option>
                            </select>    
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="institute">Institute</label>
                        </div>
                        <div class="col-75">
                            <select id="instname" name="instname">
                                <option value="">Choose Institute</option>
                                <%
                                    List<InstituteinfoTO> all_details = new InstituteinfoDAO().getAllRecord();
                                    if (all_details != null) {
                                        for (InstituteinfoTO it : all_details) {
                                            out.println("<option value=\"" + it.getInstid() + "\">" + it.getInstname() + "</option>");

                                        }
                                    }


                                %>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="deptname">Department</label>
                        </div>
                        <div class="col-75">
                            <select id="deptname" name="deptname">
                                <option value="">Choose Department</option>
                                <%
                                    List<DepartmentinfoTO> all_details1 = new DepartmentinfoDAO().getAllRecord();
                                    if (all_details1 != null) {
                                        for (DepartmentinfoTO it : all_details1) {
                                            out.println("<option value=\"" + it.getDeptid()+ "\">" + it.getDeptname()+ "</option>");

                                        }
                                    }


                                %>
                            </select>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="dob">Date of Birth</label>
                        </div>
                        <div class="col-75">
                            <input type="date" name="dob" id="dob"  placeholder='Enter DOB..'  />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="email">Email ID</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="email" name="email" style="border-radius: 20px;" placeholder="Enter Email ID..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="rarea">Research Area</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="rarea" name="rarea" style="border-radius: 20px;" placeholder="Enter Research Area..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sphoto">Student Photo</label>
                        </div>
                        <div class="col-75">
                            <input type="file" id="sphoto" name="sphoto" style="border-radius: 20px;" placeholder="Enter Student Photo..">
                        </div>
                    </div>
                    <br>
                    <hr>
                    <div class="row">
                        <br><input type="submit" value="Create Student">
                    </div>

                </div>
                <div color="cyan">
                    <%@include file="footer.jsp" %>
                </div>
            </div>
        </form>
    </body>
</html>
