package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.Clientebr;
import java.util.List;
import be.Clientebe;

public final class TransporteMaquinaria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ilche</title>\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/LogoIlche.jpeg\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("         function GenerarSolicitud(){\n");
      out.write("                dni=document.getElementById(\"SoliDNI\").value;\n");
      out.write("                Precio=document.getElementById(\"SoliPrecio\").value;\n");
      out.write("                Chofer=document.getElementById(\"SoliChofer\").value;\n");
      out.write("                Fecha=document.getElementById(\"SoliFecha\").value;\n");
      out.write("                datos={Tdni:dni,Tprecio:Precio,TChofer:Chofer,TFecha:Fecha};  \n");
      out.write("                $.ajax({\n");
      out.write("                    data: datos,\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"RegistrarSolicitudTransporte.jsp\",\n");
      out.write("                    success: function (response) {\n");
      out.write("                        listar();\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function eliminar(cod){\n");
      out.write("                datos={tcodigo:cod};                \n");
      out.write("                $.ajax({\n");
      out.write("                    data: datos,\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"TransporteMaquinaria_Eliminar.jsp\",\n");
      out.write("                    success: function (response) {\n");
      out.write("                        listar();\n");
      out.write("                      \n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function agregarTransporte(){\n");
      out.write("                 vehi=document.getElementById(\"texVehiculo\").value;\n");
      out.write("                 cod=document.getElementById(\"texMaquinaria\").value;\n");
      out.write("                 depa=document.getElementById(\"txtDeparCod\").value;\n");
      out.write("                 cant=document.getElementById(\"texCant\").value;\n");
      out.write("                 datos={tVehiculo:vehi,tcodigoMaquina:cod,tDepacod:depa,tcantidad:cant};  \n");
      out.write("                $.ajax({\n");
      out.write("                    data: datos,\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"TransporteMaquinaria_Agregar_Registrar.jsp\",\n");
      out.write("                    success: function (response) {\n");
      out.write("                        listarDatos();\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function listar(){\n");
      out.write("                                $.ajax({\n");
      out.write("                                    type : 'POST',\n");
      out.write("                                    url: \"TransporteMaquinaria_Principal.jsp\",\n");
      out.write("                                    success: function (response12) {\n");
      out.write("                                        document.getElementById(\"listado1\").innerHTML=response12;\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function listarDatos(){\n");
      out.write("                                $.ajax({\n");
      out.write("                                    type : 'POST',\n");
      out.write("                                    url: \"TransporteMaquinaria_Agregar.jsp\",\n");
      out.write("                                    success: function (response12) {\n");
      out.write("                                        document.getElementById(\"listado2\").innerHTML=response12;\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("            }    \n");
      out.write("    function listarCliente(){\n");
      out.write("                    cod=document.getElementById(\"txtcodigo\").value;\n");
      out.write("                    datos={Tcodigo:cod};\n");
      out.write("                                $.ajax({\n");
      out.write("                                     data: datos,\n");
      out.write("                                    type : 'POST',\n");
      out.write("                                    url: \"TransporteMaquinariaCliente.jsp\",\n");
      out.write("                                    success: function (response123) {\n");
      out.write("                                        document.getElementById(\"ListaCliente\").innerHTML=response123;\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                } \n");
      out.write("                    \n");
      out.write("    </script>\n");
      out.write("    <body style=\" background: none;\">\n");
      out.write("        \n");
      out.write("        <div id=\"listado1\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                           \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        listar();\n");
      out.write("        listarDatos();\n");
      out.write("    </script>\n");
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
