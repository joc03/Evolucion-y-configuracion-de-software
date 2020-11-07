package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.Clientebr;
import be.Clientebe;
import java.util.List;

public final class AlquilerMaquinaria_005fCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap-4.5.0-dist/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              \n");
      out.write("                    ");
 
                        String codigo = request.getParameter("textcodigo1");
                        List<Clientebe> lista;
                        Clientebr regla = new Clientebr();
                        String dni = regla.BuscarDNI(codigo);
                        if ( dni.compareTo(codigo) ==0){
                        lista = regla.BuscarClienteDNI(codigo);
                        for (Clientebe entidad:lista){
                    // for de cliente
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-1\">\n");
      out.write("                            <b>Nombre</b>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-11\">\n");
      out.write("                            ");
      out.print( entidad.getNombre_cli()  );
      out.write("\n");
      out.write("                            ");
      out.print( entidad.getApelli_cli()  );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                       </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-1\">\n");
      out.write("                            <b>Celular</b>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-11\">\n");
      out.write("                            ");
      out.print( entidad.getTelef_cli()  );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("       \n");
      out.write("                    \n");
      out.write("                    ");

                        }
                    }else {

      out.write(" \n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\" style=\"text-align: center\">\n");
      out.write("                            <b><i>Cliente no encontrado</i></b>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

}

                    
      out.write("\n");
      out.write("          \n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/popper.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"bootstrap-4.5.0-dist/js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>                                 \n");
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
