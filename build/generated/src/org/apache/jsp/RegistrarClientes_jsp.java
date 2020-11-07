package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import be.Clientebe;
import br.Clientebr;

public final class RegistrarClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-4.5.0-dist/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"EstilosMenú.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\".sidebar-btn\").click(function(){\n");
      out.write("\t\t\t\t$(\".wrapper\").toggleClass(\"collapse\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background: none\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("   <div  >\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\" style=\"float: left ;width: 100%\">\n");
      out.write("            <form action=\"RegistrarClientes.jsp\" method=\"post\">\n");
      out.write("                <div class=\"card mb-3\" style=\" margin: 0px; padding: 0px\">\n");
      out.write("            <div class=\"card-header \" style=\"color: black; background-color: #ffcc20\">\n");
      out.write("                        <i class=\"fas fa-table\"></i>\n");
      out.write("                       REGISTRO DE CLIENTE</div>\n");
      out.write("            <div class=\"card-body\" style=\"background: black; margin: 0; border: 0\">\n");
      out.write("                        <div class=\"table-responsive\" >                           \n");
      out.write("                            <table \n");
      out.write("                                class=\"table table-borderless \" style=\"background: black; margin: 0; color: white; border: 0\" id=\"dataTableDatosBasicos\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                                <thead></thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\" style=\"\">CODIGO</th>\n");
      out.write("                                        ");

                                        br.Clientebr lo = new Clientebr();
                                        int resultado= lo.Filas();
                                        String codigo = "CL00" + resultado;
                                        
      out.write("\n");
      out.write("                                        <td><input class=\"form-control bg-light\"  name=\"txtcodigocli\" value=\"");
      out.print(codigo);
      out.write("\" readonly=\"\" type=\"text\" ></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">NOMBRES</th>\n");
      out.write("                                        <td><input class=\"form-control bg-light\"  name=\"txtnombrecli\"  type=\"text\"\n");
      out.write("                                                   style=\"text-transform: uppercase\"\n");
      out.write("                                                   required=\"\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">APELLIDOS</th>\n");
      out.write("                                        <td><input class=\"form-control bg-light\"  name=\"txtapellidcli\" type=\"text\" style=\"text-transform: uppercase\"\n");
      out.write("                                                   required=\"\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">DNI</th>\n");
      out.write("                                        <td><input class=\"form-control\"  name=\"txtdnicli\" type=\"text\"\n");
      out.write("                                                   maxlength=\"8\"\n");
      out.write("                                                   required pattern=\"[0-9]{8}\" \n");
      out.write("                                                   ></td>\n");
      out.write("                                    </tr>                                    \n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <th scope=\"row\">CELULAR</th>\n");
      out.write("                                        <td><input class=\"form-control\" name=\"txttelecli\"  type=\"text\" \n");
      out.write("                                                   maxlength=\"9\"\n");
      out.write("                                                   required pattern=\"[0-9]{9}\" \n");
      out.write("                                                   ></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">DIRECCION</th>\n");
      out.write("                                        <td><input class=\"form-control\" name=\"txtDirCli\"  type=\"text\" required=\"\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">E-mail</th>\n");
      out.write("                                        <td><input class=\"form-control\" name=\"txtEmailCli\"  type=\"text\" required=\"\"></td>\n");
      out.write("                                    </tr>                                 \n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        ");
 

                        String cod = request.getParameter("txtcodigocli");
                        String nom = request.getParameter("txtnombrecli");
                        String ape = request.getParameter("txtapellidcli");
                        String dni_ru = request.getParameter("txtdnicli");
                        String tele = request.getParameter("txttelecli");
                        String dir = request.getParameter("txtDirCli");
                        String email = request.getParameter("txtEmailCli");
                        Clientebe u = new Clientebe(cod, nom,ape,dni_ru,tele,dir,email);
                        int resultado1= lo.registrarCliente(u);
                        if (resultado1 == 1){
                            
                            
      out.write("\n");
      out.write("                            <div>Registro creado</div>\n");
      out.write("                            \n");
      out.write("                            ");

                            
                        }
                        else {
                            
                        }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div align=\"center\"><button type=\"submit\" class=\"btn btn-outline-primary btn-primary btn-lg btn-block\"\n");
      out.write("                                                    onclick=\"location.reload()\"\n");
      out.write("                                            style=\"color: white\">GUARDAR</button>\n");
      out.write("                </div>\n");
      out.write("          </form>\n");
      out.write("         </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--main container end-->\n");
      out.write("\n");
      out.write("<!--wrapper end-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/popper.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>\n");
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
