package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.DepartmentinfoDAO;
import model.to.DepartmentinfoTO;
import utility.YearList;
import utility.MonthList;
import java.util.List;
import model.dao.InstituteinfoDAO;
import model.to.InstituteinfoTO;

public final class addstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/adminhome.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../css/Dashboard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Student Addition | Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" enctype=\"multipart/form-data\" action=\"createstudent\">\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  \n");
      out.write("    font-family: \"Lato\", sans-serif;\n");
      out.write("    transition: background-color .5s;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("    background-color: cadetblue;\n");
      out.write("    width: 1400px;\n");
      out.write("    border: 2px none;\n");
      out.write("    padding: 5px;\n");
      out.write("    margin: 5px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("    height: 100%;\n");
      out.write("    width: 0;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    background-color: #111;\n");
      out.write("    overflow-x: hidden;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a {\n");
      out.write("    padding: 8px 8px 8px 32px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 14px;\n");
      out.write("    color: #818181;\n");
      out.write("    display: block;\n");
      out.write("    transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a:hover {\n");
      out.write("    color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav .closebtn {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    right: 25px;\n");
      out.write("    font-size: 36px;\n");
      out.write("    margin-left: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#main {\n");
      out.write("    transition: margin-left .5s;\n");
      out.write("    padding: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .sidenav {padding-top: 12px;}\n");
      out.write("  .sidenav a {font-size: 12px;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropbtn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropbtn:hover, .dropbtn:focus {\n");
      out.write("    background-color: #3e8e41;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput {\n");
      out.write("    border-box: box-sizing;\n");
      out.write("    background-image: url('searchicon.png');\n");
      out.write("    background-position: 14px 12px;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    font-size: 16px;\n");
      out.write("    padding: 14px 20px 12px 45px;\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput:focus {outline: 3px solid #ddd;}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f6f6f6;\n");
      out.write("    min-width: 230px;\n");
      out.write("    overflow: auto;\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown a:hover {background-color: #ddd}\n");
      out.write("\n");
      out.write(".show {display:block;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a><br><br>\n");
      out.write("    <a href=\"WelcomeAdmin.jsp\">Home</a><br>\n");
      out.write("    <a href=\"addlogindetails.jsp\">Login Creation</a><br>\n");
      out.write("    <a href=\"addphdstep.jsp\">Phd Step Addition</a><br>\n");
      out.write("  <a href=\"addstream.jsp\">Stream Creation</a><br>\n");
      out.write("  <a href=\"addstudent.jsp\">Student Creation</a><br>\n");
      out.write("  <a href=\"addinstittute.jsp\">Institute Creation</a><br>\n");
      out.write("  <a href=\"adddepartment.jsp\">Department Creation</a><br>\n");
      out.write("  <a href=\"viewlogindetails.do\">View Login Details</a><br>\n");
      out.write("  <a href=\"viewstreamdetails.do\">View Stream Details</a><br>\n");
      out.write("  <a href=\"viewphdsteps.do\">View Ph.D Steps</a><br>\n");
      out.write("  <a href=\"http://localhost:8888/Final Phd Management System/\">Logout</a><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("    <img src=\"../Images/logo.png\" style=\"width: 300px; height:100px; margin-left: 2px\"><br>\n");
      out.write("    <hr width=\"100%\" color=\"grey\" size=\"2\">\n");
      out.write("    <center><img src=\"../Images/logo-big.png\" width=\"150\" height=\"50\"></center>\n");
      out.write("    \n");
      out.write("  <span style=\"font-size:22px;cursor:pointer;color: black\" onclick=\"openNav()\">&#9776; Administrator Dashboard</span>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("<script>\n");
      out.write("function openNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("    document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("    document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("    document.getElementById(\"main\").style.marginLeft= \"0\";\n");
      out.write("    document.body.style.backgroundColor = \"white\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("     \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\" align=\"center\" style=\"border-radius: 20px;\">\n");
      out.write("\n");
      out.write("                    <h2 style=\"color:#000\">Student Creation Portal</h2>\n");
      out.write("                    <hr style=\"color:#17a2b8;\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"studentid\">Student Reg No</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" style=\"border-radius: 20px;\" id=\"studentid\" name=\"studentid\" placeholder=\"Enter Student Id..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"uname\">Student Username</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"uname\" name=\"uname\" style=\"border-radius: 20px;\" placeholder=\"Enter Student Userame..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"name\">Student Name</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"name\" style=\"border-radius: 20px;\" placeholder=\"Enter Student Name..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"fname\">Father Name</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"fname\" name=\"fname\" style=\"border-radius: 20px;\" placeholder=\"Enter Father Name..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"sessbegmnth\">Session Begin Month</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select name=\"sessbegmnth\" id=\"sessbegmnth\" class=\"wrap-input100 validate-input m-b-25\" style=\"text-decoration: none\">\n");
      out.write("                                <option value=\"\">Choose Any Month</option>\n");
      out.write("                                ");

                                    List<String> sessbegmnth = MonthList.getMonths();
                                    int count = 1;
                                    for (String month : sessbegmnth) {
                                        out.println("<option value=\"" + count + "\">");
                                        out.println(month);
                                        out.println("</option>");
                                        count++;
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"sessendmnth\">Session End Month</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select name=\"sessendmnth\" id=\"sessbegmnth\" class=\"wrap-input100 validate-input m-b-25\" style=\"text-decoration: none\">\n");
      out.write("                                <option value=\"\">Choose Any Month</option>\n");
      out.write("                                ");

                                    List<String> sessendmnth = MonthList.getMonths();
                                    count = 1;
                                    for (String month : sessendmnth) {
                                        out.println("<option value=\"" + count + "\">");
                                        out.println(month);
                                        out.println("</option>");
                                        count++;
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"sessbegyr\">Session Begin Year</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select name=\"sessbegyr\" id=\"sessbegyr\" class=\"wrap-input100 validate-input m-b-25\" style=\"text-decoration: none\">\n");
      out.write("                                <option value=\"\">Choose Any Year</option>\n");
      out.write("                                ");

                                    List<String> sessbegyr = YearList.getYear();
                                    for (String yr : sessbegyr) {
                                        out.println("<option value=\"" + yr + "\">");
                                        out.println(yr);
                                        out.println("</option>");
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"sessendyr\">Session End Year</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select name=\"sessendyr\" id=\"sessendyr\" class=\"wrap-input100 validate-input m-b-25\" style=\"text-decoration: none\">\n");
      out.write("                                <option value=\"\">Choose Any Year</option>\n");
      out.write("                                ");

                                    List<String> sessendyr = YearList.getYear();
                                    for (String yr : sessendyr) {
                                        out.println("<option value=\"" + yr + "\">");
                                        out.println(yr);
                                        out.println("</option>");
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"contact\">Contact Number</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"contact\" name=\"contact\" style=\"border-radius: 20px;\" placeholder=\"Enter Contact Number..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"aadhar\">Aadhar Number</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"aadhar\" name=\"aadhar\" style=\"border-radius: 20px;\" placeholder=\"Enter Aadhar Number..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"pan\">Pan Number</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"pan\" name=\"pan\" style=\"border-radius: 20px;\" placeholder=\"Enter Pan Number..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"category\">Category</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select name=\"category\" id=\"category\">\n");
      out.write("                                <option value=\"\">Select Any Category</option>\n");
      out.write("                                <option value=\"General\">General</option>\n");
      out.write("                                <option value=\"Sc\">SC</option>\n");
      out.write("                                <option value=\"St\">ST</option>\n");
      out.write("                                <option value=\"Obc\">OBC</option>\n");
      out.write("                            </select>    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"institute\">Institute</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select id=\"instname\" name=\"instname\">\n");
      out.write("                                <option value=\"\">Choose Institute</option>\n");
      out.write("                                ");

                                    List<InstituteinfoTO> all_details = new InstituteinfoDAO().getAllRecord();
                                    if (all_details != null) {
                                        for (InstituteinfoTO it : all_details) {
                                            out.println("<option value=\"" + it.getInstid() + "\">" + it.getInstname() + "</option>");

                                        }
                                    }


                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"deptname\">Department</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <select id=\"deptname\" name=\"deptname\">\n");
      out.write("                                <option value=\"\">Choose Department</option>\n");
      out.write("                                ");

                                    List<DepartmentinfoTO> all_details1 = new DepartmentinfoDAO().getAllRecord();
                                    if (all_details1 != null) {
                                        for (DepartmentinfoTO it : all_details1) {
                                            out.println("<option value=\"" + it.getDeptid()+ "\">" + it.getDeptname()+ "</option>");

                                        }
                                    }


                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"dob\">Date of Birth</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"date\" name=\"dob\" id=\"dob\"  placeholder='Enter DOB..'  />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"email\">Email ID</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"email\" name=\"email\" style=\"border-radius: 20px;\" placeholder=\"Enter Email ID..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"rarea\">Research Area</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"rarea\" name=\"rarea\" style=\"border-radius: 20px;\" placeholder=\"Enter Research Area..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"sphoto\">Student Photo</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"file\" id=\"sphoto\" name=\"sphoto\" style=\"border-radius: 20px;\" placeholder=\"Enter Student Photo..\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <br><input type=\"submit\" value=\"Create Student\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div color=\"cyan\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"border-radius: 35px;\">\n");
      out.write("    <div class=\"copyright\" style=\"height:70px;background-color: teal;border-radius: 25px;\"><br>                                 \n");
      out.write("        <center><font color=\"white\">Copyright &copy; 2019 MAHARISHI MARKANDESHWAR (DEEMED TO BE UNIVERSITY). All rights reserved. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     Website Designed & Developed:Team X</font></center><br>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
