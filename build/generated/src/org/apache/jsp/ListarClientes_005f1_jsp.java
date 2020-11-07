package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.Clientebr;
import java.util.List;
import be.Clientebe;

public final class ListarClientes_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Clientes</title>\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-4.5.0-dist/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <script>              \n");
      out.write("            \n");
      out.write("        </script> \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          ");

              List<Clientebe> lista;
              Clientebr regla = new Clientebr();
              lista = regla.listarCliente();
          
      out.write("\n");
      out.write("     \n");
      out.write("          <div class=\"\" style=\" \" > \n");
      out.write("             \n");
      out.write("              <div class=\"card mb-5\" style=\" width: 100%;padding: 0px  \">\n");
      out.write("         <div class=\"card-header\" style=\"background:  #ffcc20\">\n");
      out.write("                        <i class=\"fas fa-table\"></i>\n");
      out.write("                       CLIENTES</div>\n");
      out.write("            \n");
      out.write("                 <table class=\"border-warning \" style=\"background: black;\">\n");
      out.write("                 <thead style=\"\">\n");
      out.write("                <tr style=\"padding: 200px;background: black; color: white\">\n");
      out.write("                    <th> CODIGO </th><th style=\"width: 150px\"> NOMBRE </th><th style=\"width: 170px\"> APELLIDO  </th><th> DNI </th><th> CELULAR </th><th style=\"width: 150px\">DIRECCION</th><th style=\"width: 200px\">CORREO</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("              \n");
      out.write("                ");
 
                
                for (Clientebe entidad:lista){
                    
                    
      out.write(" \n");
      out.write("                    <tr >\n");
      out.write("                       <td > \n");
      out.write("                            <input class=\"form-control bg-light\"style=\"height: 47px\" disabled=\"\" name=\"txtcodigoex\" type=\"text\" value='");
      out.print( entidad.getCodigo_cli());
      out.write("' >                            \n");
      out.write("                        </td>\n");
      out.write("                        <td> \n");
      out.write("                            <input class=\"form-control bg-light\"style=\"height: 47px\" disabled=\"\" name=\"txtnombreex\" type=\"text\" value='");
      out.print( entidad.getNombre_cli());
      out.write(" ' > \n");
      out.write("                        </td>\n");
      out.write("                        <td> \n");
      out.write("                            <input class=\"form-control bg-light\"style=\"height: 47px\" disabled=\"\" name=\"txtnombreex\" type=\"text\" value='");
      out.print( entidad.getApelli_cli());
      out.write(" ' > \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input class=\"form-control bg-light\" style=\"height: 47px\" disabled=\"\" name=\"txtapellidoex\" type=\"text\" value='");
      out.print( entidad.getDniruc_cli());
      out.write("' > \n");
      out.write("                        </td>\n");
      out.write("                        <td> \n");
      out.write("                            <input class=\"form-control bg-light\"style=\"height: 47px\" disabled=\"\" name=\"txtdniex\" type=\"text\" value='");
      out.print( entidad.getTelef_cli());
      out.write("'> \n");
      out.write("                        </td>\n");
      out.write("                        <td > \n");
      out.write("                            <input class=\"form-control bg-light\"style=\"height: 47px\" disabled=\"\" name=\"txtdniex\" type=\"text\" value='");
      out.print( entidad.getDirrec_cli());
      out.write("'> \n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"\"> \n");
      out.write("                            <input class=\"form-control bg-light\" style=\"height: 47px\" disabled=\"\" name=\"txtdniex\" type=\"text\" value='");
      out.print( entidad.getEmail_cli());
      out.write("' > \n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <td id=\"\"> <input type=\"submit\"  value=\"ELIMINAR\" class=\"btn-lg   btn-outline-danger\" src=\"img/Eliminar.png\"\n");
      out.write("                                          onclick='eliminar( \"");
      out.print( entidad.getCodigo_cli());
      out.write("\",\"");
      out.print( entidad.getNombre_cli());
      out.write("\",\"");
      out.print( entidad.getApelli_cli());
      out.write("\",\n");
      out.write("                                   \"");
      out.print( entidad.getDniruc_cli());
      out.write("\",\"");
      out.print( entidad.getTelef_cli());
      out.write("\",\"");
      out.print( entidad.getDirrec_cli());
      out.write("\",\n");
      out.write("                                   \"");
      out.print( entidad.getEmail_cli());
      out.write("\")'> </td> \n");
      out.write("                        <td id=\"\"><input type=\"submit\"  value=\"EDITAR\" class=\"btn-lg   btn-outline-success\" \n");
      out.write("                                          onclick='editar(\"");
      out.print( entidad.getCodigo_cli());
      out.write("\",\"");
      out.print( entidad.getNombre_cli());
      out.write("\",\"");
      out.print( entidad.getApelli_cli());
      out.write("\",\n");
      out.write("                                   \"");
      out.print( entidad.getDniruc_cli());
      out.write("\",\"");
      out.print( entidad.getTelef_cli());
      out.write("\",\"");
      out.print( entidad.getDirrec_cli());
      out.write("\",\n");
      out.write("                                   \"");
      out.print( entidad.getEmail_cli());
      out.write("\")'></td>                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div style=\"\"  class=\"\">\n");
      out.write("            <div class=\" card mb-5\" style=\"width:100%; padding: 0px \">\n");
      out.write("                <div class=\"card-header\" style=\"background:  #ffcc20\">\n");
      out.write("                        <i class=\"fas fa-table\"></i>\n");
      out.write("                       EDITAR CLIENTES\n");
      out.write("                </div>\n");
      out.write("                <table class=\"border-warning\" style=\"background: black;color: white\">\n");
      out.write("                    <thead>\n");
      out.write("                        \n");
      out.write("                    </thead>\n");
      out.write("                    <tbody style=\"padding: 10px;margin: 10px \">\n");
      out.write("                        <tr style=\"padding: 5px\">\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">CODIGO</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\" disabled=\"\"  name=\"txtcodigocli\" type=\"text\" id=\"txtcodigo\" ></td >\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">NOMBRE</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\"  name=\"txtcodigocli\" type=\"text\" id=\"txtnombre\"></td >\n");
      out.write("                        </tr>\n");
      out.write("                        <tr style=\"padding: 5px\">\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">APELLIDO</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\"   name=\"txtcodigocli\" type=\"text\" id=\"txtapellido\" ></td >\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">DNI</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\"   name=\"txtcodigocli\" type=\"text\" id=\"txtdni\" ></td >\n");
      out.write("                        </tr>\n");
      out.write("                        <tr style=\"padding: 5px\">\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">CELULAR</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\"   name=\"txtcodigocli\" type=\"text\" id=\"txtcelular\"></td >\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">DIRECCIÓN</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\"   name=\"txtcodigocli\" type=\"text\" id=\"txtdireccion\"></td >\n");
      out.write("                        </tr>\n");
      out.write("                        <tr style=\"padding: 5px\">\n");
      out.write("                            <td scope=\" \" style=\"align-items: center; text-align: center\">CORREO</td>\n");
      out.write("                            <td><input class=\"form-control bg-light\"   name=\"txtcodigocli\" type=\"text\" id=\"txtcorreo\"></td >\n");
      out.write("                            <td></td>\n");
      out.write("                            <td id=\"\"> <input type=\"submit\"  value=\"GUARDAR\" class=\"btn-lg   btn-outline-primary btn-block\" \n");
      out.write("                                              onclick=\"actualiza()\"> </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div >\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/popper.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>    \n");
      out.write("    </body>   \n");
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
