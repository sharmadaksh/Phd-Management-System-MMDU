package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>MMDU | Ph.D Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-login100\" style=\"background-image: url('Images/background-13.jpg');\">\n");
      out.write("            <div class=\"wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30\">\n");
      out.write("                <form class=\"login100-form validate-form\" action=\"checklogin.do\" method=\"post\">\n");
      out.write("                    <center> <img src=\"Images/mmu_logo.png\" height=\"100px\" width=\"250px\"></center>\n");
      out.write("                    <span class=\"login100-form-title p-b-37\">\n");
      out.write("                        Sign In\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                    <div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter username or email\">\n");
      out.write("                        <input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"username or email\">\n");
      out.write("                        <span class=\"focus-input100\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"wrap-input100 validate-input m-b-25\" data-validate = \"Enter password\">\n");
      out.write("                        <input class=\"input100\" type=\"password\" name=\"password\" placeholder=\"password\">\n");
      out.write("                        <span class=\"focus-input100\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"wrap-input100 validate-input m-b-25\" data-validate = \"Role\">\n");
      out.write("                        <select class=\"wrap-input100 validate-input m-b-25\" style=\"text-decoration: none\">\n");
      out.write("                            <option value=\"Select\">Select</option>\n");
      out.write("                            <option value=\"Admin\">Admin</option>\n");
      out.write("                            <option value=\"Supervisor\">Supervisor</option>\n");
      out.write("                            <option value=\"Scholar\">Scholar</option>\n");
      out.write("                            <option value=\"Scholar\">Principal</option>\n");
      out.write("                            <option value=\"Scholar\">Dean</option>\n");
      out.write("                            <option value=\"Scholar\">Head Of Department</option>\n");
      out.write("                            <option value=\"Scholar\">Registrar</option>\n");
      out.write("                            <option value=\"Scholar\">Phd Co-Ordinator</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <span class=\"focus-input100\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <center><a href=\"#\"> Forgot Password?</a></center><br>\n");
      out.write("                    <div class=\"container-login100-form-btn\">\n");
      out.write("                        <button class=\"login100-form-btn\">\n");
      out.write("                            Sign In\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"dropDownSelect1\"></div>\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("        <script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
