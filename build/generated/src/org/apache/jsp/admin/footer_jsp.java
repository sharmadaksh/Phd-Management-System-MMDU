package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write(".container1{\n");
      out.write("    padding-right:15px;\n");
      out.write("    padding-left:15px;\n");
      out.write("    margin-right:auto;\n");
      out.write("    margin-left:auto;\n");
      out.write("    }\n");
      out.write("@media (min-width:768px){.container{width:750px}\n");
      out.write("}\n");
      out.write("@media (min-width:992px){.container{width:970px}\n");
      out.write("}\n");
      out.write("@media (min-width:1200px){.container{width:1240px}\n");
      out.write("}\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container1\" style=\"border-radius: 35px; margin-left: 5px;\">\n");
      out.write("            <div class=\"copyright\" style=\"background-color: teal;border-radius: 35px; margin-left: 5px;\">                                     \n");
      out.write("                <br><center><font color=\"white\">Copyright &copy; 2019 MAHARISHI MARKANDESHWAR (DEEMED TO BE UNIVERSITY). All rights reserved. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     Website Designed & Developed:Team X</font></center><br>\n");
      out.write("                \n");
      out.write("            </div>><br>\n");
      out.write("                </div>\n");
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
