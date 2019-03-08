package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.InstituteinfoDAO;
import model.to.InstituteinfoTO;
import java.util.List;

public final class adddepartment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                <title>Create Department</title>\n");
      out.write("                <link href=\"../css/Dashboard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"createdepartment\">\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                ");
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
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("  \n");
      out.write("      <h2>Department Creation Portal</h2>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"stepid\">Department ID</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"deptid\" name=\"deptid\" placeholder=\"Enter Department Id..\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"deptname\">Department Name</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"deptid\" name=\"deptname\" placeholder=\"Enter Department Name..\">      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"instid\">Choose Institute :</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"instid\" name=\"instid\">\n");
      out.write("            <option value=\"\">Choose Institute</option>\n");
      out.write("            ");

                List<InstituteinfoTO> all_details = new InstituteinfoDAO().getAllRecord();
                if(all_details!=null){
                    for(InstituteinfoTO it : all_details){
                        out.println("<option value=\"" + it.getInstid() + "\">" + it.getInstname() + "</option>");
                                
                    }                    
                }
                
                
              
      out.write("\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"row\">\n");
      out.write("        <br><input type=\"submit\" value=\"Create Department\">\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("            <div color=\"cyan\">\n");
      out.write("                ");
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"border-radius: 35px;\">\n");
      out.write("    <div class=\"copyright\" style=\"height:70px;background-color: teal;border-radius: 25px;\"><br>                                 \n");
      out.write("        <center><font color=\"white\">Copyright &copy; 2019 MAHARISHI MARKANDESHWAR (DEEMED TO BE UNIVERSITY). All rights reserved. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     Website Designed & Developed:Team X</font></center><br>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("            </form>\n");
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
