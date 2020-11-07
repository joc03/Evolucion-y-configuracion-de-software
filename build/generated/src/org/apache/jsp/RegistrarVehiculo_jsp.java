package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import be.Vehiculobe;
import br.Vehiculobr;

public final class RegistrarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ilche</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/LogoIlche.jpeg\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-4.5.0-dist/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"EstilosMenú.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: none\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"RegistrarVehiculo_V.jsp\" method=\"post\">\n");
      out.write("    <div class=\"card mb-3\" style=\"padding: 0px\">\n");
      out.write("<div class=\"card-header\" style=\"background: #ffcc20;\">\n");
      out.write("            <i class=\"fas fa-table\"></i>\n");
      out.write("           REGISTRO DE VEHÍVULO</div>\n");
      out.write("        <div class=\"card-body\" style=\"background: black; margin: 0; border: 0\">\n");
      out.write("            <div class=\"table-responsive\" >                           \n");
      out.write("                <table class=\"table table-borderless \" style=\"background: black; margin: 0; border: 0\" id=\"dataTableDatosBasicos\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                    <thead></thead>\n");
      out.write("                    <tbody style=\"color: white\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\" style=\"\">CODIGO</th>\n");
      out.write("                            ");

                            br.Vehiculobr lo = new Vehiculobr();
                            int resultado= lo.Filas();
                            String codigo = "VH00" + resultado;
                            
      out.write("\n");
      out.write("                            <td><input class=\"form-control bg-light\"  name=\"txtcodigoMaqui\" type=\"text\"\n");
      out.write("                                       readonly=\"\"\n");
      out.write("                                       value=\"");
      out.print(codigo);
      out.write("\"\n");
      out.write("                                       ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">PLACA</th>\n");
      out.write("                            <td><input class=\"form-control bg-light\"  name=\"txtplacaVe\" \n");
      out.write("                                       style=\"text-transform: uppercase\"\n");
      out.write("                                       type=\"text\" \n");
      out.write("                                       ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">POLIZA</th>\n");
      out.write("                            <td><input class=\"form-control\"  name=\"txtPoliVe\" \n");
      out.write("                                       style=\"text-transform: uppercase\"\n");
      out.write("                                       type=\"text\" ></td>\n");
      out.write("                        </tr>                                    \n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <th scope=\"row\">PESO TARA</th>\n");
      out.write("                            <td><input class=\"form-control\" name=\"txtpesTaraVe\"  type=\"text\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">PESO BRUTO (T)</th>\n");
      out.write("                            <td><input class=\"form-control\" name=\"txtPesoBruVe\"  type=\"text\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">CARGO UNITARIO</th>\n");
      out.write("                            <td><input class=\"form-control\" name=\"txtcargoUniVe\"  type=\"text\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("    <div align=\"center\"><button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" >GUARDAR</button></div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/popper.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
