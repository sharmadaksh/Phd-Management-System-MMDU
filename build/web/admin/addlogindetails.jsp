<%-- 
    Document   : AddLoginDetails
    Created on : Jan 25, 2019, 9:40:36 AM
    Author     : HP PAVILION
--%>
<%@page import="utility.Validations"%>
<%@page import="utility.QuestionList"%>
<%@page import="utility.Roles"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/Dashboard.css" rel="stylesheet" type="text/css">
        <title>Create Login | Admin</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body>
        <form method="post" action="createlogin">
            <div>
                <div>
                    <%@include file="adminhome.jsp" %>
                </div>
                <div class="container">

                    <h2>Login Creation Portal</h2>
                    <div class="row">
                        <div class="col-25">
                            <label for="uname">Username</label>
                        </div>
                        <div class="col-75">
                            <input type="text" name="uname"  id="uname" name="" placeholder="Enter Username..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="pwd">Password</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="pwd" name="pwd"  id="pwd" placeholder="Enter Password..">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="">Rolename</label>
                        </div>
                        <div class="col-75">
                            <select name="rolename" id="rolename" class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                                <option value="">Choose Any Role</option>
                                <%
                                    List<String> roles = Roles.getRoles();
                                    for (String question : roles) {
                                        out.println("<option value=\"" + question + "\">");
                                        out.println(question);
                                        out.println("</option>");
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="email">Email Id</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="email" name="email"  placeholder="Enter Email.."><br>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="subject">Security Question</label>
                        </div>
                        <div class="col-75">

                            <select name="secque" id="secque" class="wrap-input100 validate-input m-b-25" style="text-decoration: none">
                                <option value="">Choose Any Question</option>
                                <%
                                    List<String> questions = QuestionList.getQuestions();
                                    for (String question : questions) {
                                        out.println("<option value=\"" + question + "\">");
                                        out.println(question);
                                        out.println("</option>");
                                    }
                                %>
                            </select>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-25">
                            <label for="secans">Security Answer</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="secans"  name="secans" placeholder="Security Answer Here.."><br>
                        </div>
                    </div>
                    <div class="row">
                        <br><input type="submit"  value="Create User">
                    </div>
                    <%
                        if(session.getAttribute("message")!=null){
                            out.println(session.getAttribute("message"));
                        }
                        %>
                </div>
                <div color="cyan">
                    <%@include file="footer.jsp" %>
                </div>
            </div>
        </form>
    </body>
</html>
