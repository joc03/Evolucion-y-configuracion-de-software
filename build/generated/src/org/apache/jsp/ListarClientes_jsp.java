package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListarClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ilche</title>\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("       <link rel=\"shortcut icon\" href=\"img/LogoIlche.jpeg\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css\">\n");
      out.write("        <link href=\"EstilosMenú.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            function eliminar(cod,nom,apell,dni,tele,dire,email){ \n");
      out.write("                \n");
      out.write("                var r = confirm(\"Está seguro de eliminar el registro de \" + nom );\n");
      out.write("                datos={tcodigo:cod,tnombre:nom,tapellido:apell,tdni:dni,ttelefono:tele,tdireccion:dire,temail:email};\n");
      out.write("                if(r === true){\n");
      out.write("                    $.ajax({\n");
      out.write("                        data: datos,\n");
      out.write("                        type: 'POST',\n");
      out.write("                        url: \"EliminarCliente.jsp\",\n");
      out.write("                        success: function (response) {\n");
      out.write("                            listar();\n");
      out.write("                             alert(\"Cliente eliminado\");\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }                \n");
      out.write("            }   \n");
      out.write("            \n");
      out.write("            function editar(cod,nom,apell,dni,tele,dire,email){                \n");
      out.write("                document.getElementById(\"txtcodigo\").value=cod;\n");
      out.write("                document.getElementById(\"txtnombre\").value=nom;\n");
      out.write("                document.getElementById(\"txtapellido\").value=apell;\n");
      out.write("                document.getElementById(\"txtdni\").value=dni;\n");
      out.write("                document.getElementById(\"txtcelular\").value=tele;\n");
      out.write("                document.getElementById(\"txtdireccion\").value=dire;\n");
      out.write("                document.getElementById(\"txtcorreo\").value=email;\n");
      out.write("            }  \n");
      out.write("            function actualiza(){\n");
      out.write("                cod=document.getElementById(\"txtcodigo\").value;\n");
      out.write("                nom=document.getElementById(\"txtnombre\").value;\n");
      out.write("                apell=document.getElementById(\"txtapellido\").value;\n");
      out.write("                dni=document.getElementById(\"txtdni\").value;\n");
      out.write("                tele=document.getElementById(\"txtcelular\").value;\n");
      out.write("                dire=document.getElementById(\"txtdireccion\").value;\n");
      out.write("                email=document.getElementById(\"txtcorreo\").value;\n");
      out.write("                \n");
      out.write("                datos={tcodigog:cod,tnombreg:nom,tapellidog:apell,tdnig:dni,ttelefonog:tele,tdirecciong:dire,temailg:email};\n");
      out.write("                $.ajax({\n");
      out.write("                    data: datos,\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"ActualizarCliente.jsp\",\n");
      out.write("                    success: function (response) {\n");
      out.write("                        listar();\n");
      out.write("                        alert(\"Datos Actualizados\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                tipo=0;\n");
      out.write("            }\n");
      out.write("            function listar(){                \n");
      out.write("                $.ajax({\n");
      out.write("                    type : 'POST',\n");
      out.write("                    url: \"ListarClientes_1.jsp\",\n");
      out.write("                    success: function (response1) {\n");
      out.write("                        document.getElementById(\"listado1\").innerHTML=response1;\n");
      out.write("                    }\n");
      out.write("                });   \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background: url(img/Menu1.2.png) ; background-repeat: no-repeat;\n");
      out.write("          width: 100%; min-height: 100vh; background-position: center;background-size: cover;\n");
      out.write("          background-attachment: fixed\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\t\t\t<!--header menu start-->\n");
      out.write("\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t<div class=\"header-menu\">\n");
      out.write("                                    <img src=\"img/LogoIlche.jpeg\" style=\"width: 50px; height: 50px; float: left\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t<div class=\"title\">Ilche</div>\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-btn\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-bars\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                            <li><a href=\"Login.jsp\"><i class=\"fas fa-power-off\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--header menu end-->\n");
      out.write("\t\t\t<!--sidebar start-->\n");
      out.write("\t\t\t<div class=\"sidebar\">\n");
      out.write("\t\t\t\t<div class=\"sidebar-menu\">\n");
      out.write("\t\t\t\t\t<center class=\"profile\">\n");
      out.write("                                                <img src=\"img/avatar.png\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<p>Admin</p>\n");
      out.write("\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t<li class=\"item\">\n");
      out.write("                                            <a href=\"MenuPrincipal2.jsp\" class=\"menu-btn\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-desktop\"></i><span>Home</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <!--\n");
      out.write("                                        <li class=\"item\" id=\"personal\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#personal\" class=\"menu-btn\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-user-circle\"></i><span>Personal<i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fas fa-image\"></i><span>Registrar personal</span></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fas fa-address-card\"></i><span>Listar personal</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li> -->\n");
      out.write("\t\t\t\t\t<li class=\"item\" id=\"Clientes\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#Clientes\" class=\"menu-btn\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-user-circle\"></i><span>Clientes <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"RegistrarClientes.jsp\"><i class=\"fas fa-user-plus\"></i><span>Registrar cliente</span></a>\n");
      out.write("                                                    <a href=\"ListarClientes.jsp\"><i class=\"fas fa-address-card\"></i><span>Listar cliente</span></a>\n");
      out.write("                                                    <a href=\"BuscarCliente.jsp\"><i class=\"fas fa-search\"></i><span>Buscar cliente</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"item\" id=\"vehículos\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#vehículos\" class=\"menu-btn\">\n");
      out.write("                                                    <i class=\"fas fa-truck-moving\"></i><span>Vehículos <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"RegistrarVehiculo.jsp\"><i class=\"fas fa-plus-circle\"></i><span>Nuevo</span></a>\n");
      out.write("                                                    <a href=\"ListarVehiculo.jsp\"><i class=\"fas fa-list\"></i><span>Listar</span></a>\n");
      out.write("                                                    <a href=\"BuscarVehiculos.jsp\"><i class=\"fas fa-search\"></i><span>Buscar vehículos</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li class=\"item\" id=\"messages\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#messages\" class=\"menu-btn\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-tractor\"></i><span>Maquinarias <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"RegistrarMaquinaria.jsp\"><i class=\"fas fa-plus-circle\"></i><span>Nuevo</span></a>\n");
      out.write("                                                    <a href=\"ListarMaquinarias.jsp\"><i class=\"fas fa-list\"></i><span>Listar</span></a>\n");
      out.write("                                                    <a href=\"BuscarMaquinaria.jsp\"><i class=\"fas fa-search\"></i><span>Buscar maquianria</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li class=\"item\" id=\"Cotización\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#Cotización\" class=\"menu-btn\">\n");
      out.write("                                                    <i class=\"fas fa-sticky-note\"></i><span>Cotización <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"CotizaAlquilerMaquinaria.jsp\"><i class=\"fas fa-notes-medical\"></i><span>Alquiler de maquinaria</span></a>\n");
      out.write("                                                    <a href=\"CotizaTransporteMaquinaria.jsp\"><i class=\"fas fa-notes-medical\"></i><span>Transporte de maquinaria</span></a>\n");
      out.write("                                                    <a href=\"CotizaTransporteMateriales.jsp\"><i class=\"fas fa-notes-medical\"></i><span>Transporte de materiales</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--sidebar end-->\n");
      out.write("\t\t\t<!--main container start-->\n");
      out.write("\t\t\t<div class=\"main-container\">\n");
      out.write("                            \n");
      out.write("                            <div id=\"listado1\" style=\"width: 100%; float: right;padding: 0px; \">\n");
      out.write("        \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--main container end-->\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write(" <script>\n");
      out.write("   listar();\n");
      out.write("\n");
      out.write(" </script>\n");
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
