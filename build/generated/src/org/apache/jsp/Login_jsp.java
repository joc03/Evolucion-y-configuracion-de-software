package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Ilche</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/LogoIlche.jpeg\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <body >  \n");
      out.write("        \n");
      out.write("        <nav class=\"navbar\" style=\"width: 77%; float: left; margin: 0; padding: 0;\" >\n");
      out.write("            <div class=\"container-fluid border-0\" style=\"margin: 0; padding: 0;\">\n");
      out.write("                <img src=\"img/Login1Izquierda.jpg\" alt=\"\" style=\"height: 100%; width: 100%\">\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <nav class=\"navbar\" style=\"width: 23%; height:90% ;height: 400px; float: right;  margin: 0; padding: 0; position: relative\">\n");
      out.write("            <div class=\" \" style=\"margin: 0; padding: 0; \">\n");
      out.write("                <img src=\"img/LoginFor.PNG\" alt=\"\" class=\"\" style=\"height: 100%; width: 100%; float: inside\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"\" style=\"float: top; position: absolute; left: 10%; top: 30%; padding: 10%  \">\n");
      out.write("            <form action=\"Login_V.jsp\" method=\"post\" >\n");
      out.write("            <table id=\"tabla\">              \n");
      out.write("                <tr><td>Usuario :  <br> <input class=\"form-control\" type=\"text\" name=\"textusuario\" placeholder=\"Ingresar usuario\" required=\"\" ></td></tr>\n");
      out.write("                <tr><td>Contraseña :<br> \n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"texpassword\" \n");
      out.write("                               placeholder=\"Ingresar contraseña\"\n");
      out.write("                               required =\"\" >\n");
      out.write("                        \n");
      out.write("                    </td></tr>\n");
      out.write("               <tr><td><a href=\"#\" style=\"font-size: 13px \">olvidé mi contraseña</a></td></tr>\n");
      out.write("              \n");
      out.write("               <tr> <td><input class=\"btn btn-outline-primary btn btn-block\" type=\"submit\" value=\"Log in\" id=\"new\">  </td></tr>\n");
      out.write("             \n");
      out.write("            </table> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
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
