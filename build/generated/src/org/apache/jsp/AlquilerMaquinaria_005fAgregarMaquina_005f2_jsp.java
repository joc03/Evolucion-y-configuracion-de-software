package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.Clientebr;
import be.Clientebe;
import be.suma;
import be.AlquilerMaquinariaPreciosbe;
import br.AlquilerMaquinariaPreciobr;
import br.Maquinariabr;
import java.util.List;
import be.Maquinariabe;

public final class AlquilerMaquinaria_005fAgregarMaquina_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ilche</title>\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/LogoIlche.jpeg\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-4.5.0-dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"js/SolicitudAlquilerMaquinaria.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"card-header\" style=\"text-align: left\">\n");
      out.write("                <h1><i>Alquiler de Maquinaria</i></h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                \n");
      out.write("                <div style=\"border-style: solid; padding: 20px; border-color: #cccccc\"> \n");
      out.write("                    \n");
      out.write("                        <div class=\"row\" style=\"text-align: right\">\n");
      out.write("                              <div class=\"col-2\" style=\"text-align: left\"><i><b><h3>Cliente</h3></b></i> </div>\n");
      out.write("                              <div class=\"col-4\"></div>\n");
      out.write("                              <div class=\"col-2\">\n");
      out.write("                                  <b>DNI</b>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"col-2\">\n");
      out.write("                                  <input type=\"text\" style=\"\" id=\"txtcodigo\" \n");
      out.write("                                         name=\"textcodigo1\" class=\"form-control\"\n");
      out.write("                                         maxlength=\"8\"\n");
      out.write("                                         required pattern=\"[0-9]{8}\"\n");
      out.write("                                         > \n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"col-2\" style=\"text-align: left\" >\n");
      out.write("                                  <button class=\"btn btn-outline-primary\" type=\"submit\" onclick=\"listarCliente()\"  >\n");
      out.write("                                      <i class=\"fas fa-search\"></i></button>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"\" id=\"ListaCliente\">\n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("                    </div> </div>\n");
      out.write("                <br>\n");
      out.write("        <div style=\"border-style: solid;  border-color: #cccccc;padding: 15px\">   \n");
      out.write("            <div class=\"col-12\" style=\"text-align: left\"><i><b><h3>Agregar Maquinaria</h3></b></i> </div>\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <div class=\"row\" >\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <b>Maquinarias</b>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <select name=\"textMaquinaria\" id=\"texMaquinaria\" class=\"form-control\" style=\"width: 100%\">\n");
      out.write("                                            ");
 

                                            List<Maquinariabe> lista;
                                            Maquinariabr regla = new Maquinariabr();
                                            lista = regla.listarCliente();
                                             for (Maquinariabe entidad:lista){
                                            
      out.write("\n");
      out.write("                                            <option value='");
      out.print( entidad.getCodigo_Maqui());
      out.write("'> ");
      out.print( entidad.getNombre_Maqui());
      out.write(" </option>\n");
      out.write("\n");
      out.write("                                            ");
 
                                            }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                            <b>Días</b>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-1\">\n");
      out.write("                                        <input type=\"text\" name=\"\" id=\"texDias\" class=\"form-control\"\n");
      out.write("                                               maxlength=\"2\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                            <b>Cantidad</b>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-1\">\n");
      out.write("                                        <input type=\"text\" name=\"\" id=\"texCant\" class=\"form-control\"\n");
      out.write("                                               maxlength=\"2\" >\n");
      out.write("                                    </div>   \n");
      out.write("                                        <div class=\"col-1\">\n");
      out.write("\n");
      out.write("                                            <button class=\"btn btn-outline-primary\" onclick='agregarAlquiler()' >\n");
      out.write("                                                <i class=\"fas fa-plus\"></i>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                 <div id=\"ListadoMaquina\"> \n");
      out.write("\n");
      out.write("                 </div>\n");
      out.write("                    \n");
      out.write("                                \n");
      out.write("            </div>\n");
      out.write("                                        <br>\n");
      out.write("            <div style=\"border-style: solid; padding: 20px; border-color: #cccccc\"> \n");
      out.write("                <div class=\"col-12\" style=\"text-align: left\"><i><b><h3>Fecha</h3></b></i> </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <b>Fecha de Inicio</b>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"FechaInicio\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <b>Fecha de fin de servicios</b>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"FechaFin\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                                        \n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer\">\n");
      out.write("                <div>\n");
      out.write("                    <button class=\"btn btn-primary\" onclick=\"AgregarAlqui()\" >Generar Solicitud</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/popper.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>     \n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        listarCliente();\n");
      out.write("        listarMaquina();\n");
      out.write("    </script>\n");
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
