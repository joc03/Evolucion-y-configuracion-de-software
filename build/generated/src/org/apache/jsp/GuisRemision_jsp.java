package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GuisRemision_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("    input.transparent-input{\n");
      out.write("       background-color:transparent;\n");
      out.write("       border:none;\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"table table-bordered\" >\n");
      out.write("            <tr class=\"bg-primary\" style=\"color: white\">\n");
      out.write("                <td colspan=\"2\"><b><center>INFORMACION IMPRESA</center></td>\n");
      out.write("                <td><b><center>INFORMACION NO NECESARIAMENTE IMPRESA</center></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td rowspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"table-active\">\n");
      out.write("                <td colspan=\"2\"><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("                <td><input class=\"transparent-input\" type=\"text\" name=\"\"> </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/jquery-3.5.1.min\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
