<%-- <%@include file= "scholarhome.jsp"%> --%>

<!DOCTYPE html>
<%@page import="model.to.StudentInfoTO"%>
<%@page import="model.to.StudentPhotoTO"%>
<%@page import="java.util.UUID"%>
<%@page import="model.dao.StudentinfoDAO"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@include file="scholarhome.jsp"%>
<link href="../css/Dashboard.css" rel="stylesheet" type="text/css">
<div>
    <%
        String uname=(String)session.getAttribute("uname");
        StudentInfoTO stud = new StudentinfoDAO().getRecord(uname);
         
        %>
</div>
<div class="container" align="center" style="border-radius: 20px;">

                    <h2 style="color:#000">Student's Profile</h2>
                    <hr style="color:#17a2b8;">

                    <div class="row">
                        <div class="col-25">
                            <label for="studentid">Student Reg No</label>
                        </div>
                        <div class="col-75">
                            <input type="text" style="border-radius: 20px;" id="studentid" name="studentid" placeholder="Enter Student Id.." readonly="readonly" value="<%=stud.getStudentid()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="uname">Student Username</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getUsername()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="name">Student Name</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="name" name="name" style="border-radius: 20px;" placeholder="Enter Student Name.." readonly="readonly" value="<%=stud.getName()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="fname">Father Name</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="fname" name="fname" style="border-radius: 20px;" placeholder="Enter Father Name.." readonly="readonly" value="<%=stud.getFname()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessbegmnth">Session Begin Month</label>
                        </div>
                        <div class="col-75">
                           <input type="text" id="" name="" style="border-radius: 20px;" placeholder="  " readonly="readonly" value="<%=stud.getSessionbeginmonth()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessendmnth">Session End Month</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getSessionendmonth()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessbegyr">Session Begin Year</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getSessionbeginyear()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="sessendyr">Session End Year</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getSessionendyear()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="contact">Contact Number</label>
                        </div>
                        <div class="col-75">
<input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getContact()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="aadhar">Aadhar Number</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getAadhar()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="pan">Pan Number</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getPan()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="category">Category</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getCategory()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="institute">Institute</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getInstname()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="deptname">Department</label>
                        </div>
                        <div class="col-75"><input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getDeptname()%>">
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="dob">Date of Birth</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getDob()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="email">Email ID</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getEmail()%>">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="rarea">Research Area</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="uname" name="uname" style="border-radius: 20px;" placeholder="Enter Student Userame.." readonly="readonly" value="<%=stud.getRarea()%>">
                        </div>
                    </div>
                    </div>
<%@ include file="../admin/footer.jsp"%> --%>