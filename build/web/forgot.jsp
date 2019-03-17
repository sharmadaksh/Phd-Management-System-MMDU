<%-- 
    Document   : forgot
    Created on : Mar 17, 2019, 11:53:49 AM
    Author     : Daksh
--%>

<%@page import="utility.Operations"%>
<%@page import="utility.Validations"%>
<%@page import="java.util.List"%>
<%@page import="utility.QuestionList"%>
<%@page import="model.to.LogininfoTO"%>
<%@page import="model.dao.LogininfoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>MMDU | Ph.D Reset Password</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>


        <div class="container-login100" style="background-image: url('Images/background-13.jpg');">
            <div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
                <form class="login100-form validate-form" method="post">
                    <center> <img src="Images/mmu_logo.png" height="100px" width="250px"></center>
                    <span class="login100-form-title p-b-37">
                        Reset Password
                    </span>

                    <div class="wrap-input100 validate-input m-b-20" data-validate="Enter username or email">
                        <input class="input100" type="text" name="username" placeholder="username or email">
                        <span class="focus-input100"></span>
                    </div>
                    <div class="wrap-input100 validate-input m-b-25" data-validate = "">
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
                                
                        <span class="focus-input100"></span>
                    </div>
                    <div class="wrap-input100 validate-input m-b-25" data-validate = "Enter password">
                        <input class="input100" type="text" name="secans" placeholder="Security Answer">
                        <span class="focus-input100"></span>
                    </div>

                    <div class="container-login100-form-btn">
                        <button class="login100-form-btn" name="action"  type="submit">
                            Reset Password
                        </button>
                    </div>


                </form>


            </div>
        </div>



        <div id="dropDownSelect1"></div>

        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/daterangepicker/moment.min.js"></script>
        <script src="vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>
        <%
            if (request.getParameter("action") != null) {
                String username = request.getParameter("username");
                String secque = request.getParameter("secque");
                String secans = request.getParameter("secans");
                String message = "";
                System.out.println("username "+username);
                System.out.println("secque "+secque);
                System.out.println("secans "+secans);
                if (Validations.isEmpty(username) || Validations.isEmpty(secque) || Validations.isEmpty(secans)) {
                    message = "Please Provide All Values";
                } else {
                    System.out.println("+++++++++111111111");
                    
                    LogininfoTO lit=new LogininfoTO();
                    LogininfoTO record = new LogininfoDAO().getRecord(username);
                    if (record != null) {
                        System.out.println("222222222222222222");
                        if (record.getSecque().equals(secque) && record.getSecans().equals(secans)) {
                            System.out.println("3333333333333333333");
                            String newpassword = new String(Operations.randomPassword(14));
                            record.setPassword(newpassword);
                            LogininfoDAO lid=new LogininfoDAO();
                            if (lid.updateRecord(lit)) {
                                System.out.println("44444444444444444444");
                                String subject = "Your Password has been reset";
                                String messageText = "<p>Your Password has been reset by system</p>";
                                messageText += "<h1>Your New Password is : " + newpassword;
                                if (Operations.SendEmail(record.getEmailid(), subject, messageText)) {
                                    message = "Your Password has been reset and send to your registered Email";
                                } else {
                                    message = "Your New Password : " + newpassword;
                                }
                            } else {
                                message = "There is some problem " + lid.getError_message();
                            }
                        } else {
                            message = "Details are not match with database";
                        }
                    } else {
                        message = "Details are not match with database";
                    }
                }
                out.println("<h1>" + message + "</h1>");
            }
        %>
    </body>
</html>