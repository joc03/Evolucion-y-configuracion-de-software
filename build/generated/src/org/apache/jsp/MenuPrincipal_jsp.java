package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"shortcut icon\" href=\"img/LogoIlche.jpeg\"> \n");
      out.write("        <link href=\"EstilosMenú.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css\">\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("   <!-- codigo para deslizar la barra-->\n");
      out.write("        \n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\".sidebar-btn\").click(function(){\n");
      out.write("\t\t\t\t$(\".wrapper\").toggleClass(\"collapse\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("                \n");
      out.write("\t\t</script>\n");
      out.write("        \n");
      out.write("        <body style=\" background: url(img/Menu1.2.png) ; background-repeat: no-repeat;\n");
      out.write("          width: 100%; min-height: 100vh; background-position: center;background-size: cover;\n");
      out.write("          background-attachment: fixed; \n");
      out.write("          \">\n");
      out.write("\n");
      out.write("\t\t<!--wrapper start-->\n");
      out.write("\t\t<div class=\"wrapper\">\n");
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
      out.write("                        <div class=\"sidebar\" style=\" \">\n");
      out.write("                            <div class=\"sidebar-menu\" style=\" \">\n");
      out.write("\t\t\t\t\t<center class=\"profile\">\n");
      out.write("                                                <img src=\"img/avatar.png\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<p>Admin</p>\n");
      out.write("\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t<li class=\"item\">\n");
      out.write("                                            <a href=\"home.jsp\" target=\"myframe\" class=\"menu-btn\">\n");
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
      out.write("                                                    <a href=\"RegistrarClientes.jsp\" target=\"myframe\" ><i class=\"fas fa-user-plus\" ></i><span>Registrar cliente</span></a>\n");
      out.write("                                                    <a href=\"ListarClientes.jsp\" target=\"myframe\"><i class=\"fas fa-address-card\"></i><span>Listar cliente</span></a>\n");
      out.write("                                                    <a href=\"BuscarCliente.jsp\" target=\"myframe\"><i class=\"fas fa-search\"></i><span>Buscar cliente</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"item\" id=\"vehículos\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#vehículos\" class=\"menu-btn\">\n");
      out.write("                                                    <i class=\"fas fa-truck-moving\"></i><span>Vehículos <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"RegistrarVehiculo.jsp\" target=\"myframe\"><i class=\"fas fa-plus-circle\"></i><span>Nuevo</span></a>\n");
      out.write("                                                    <a href=\"ListarVehiculo.jsp\" target=\"myframe\"><i class=\"fas fa-list\"></i><span>Listar</span></a>\n");
      out.write("                                                    <a href=\"BuscarVehiculos.jsp\" target=\"myframe\"><i class=\"fas fa-search\"></i><span>Buscar vehículos</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li class=\"item\" id=\"messages\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#messages\" class=\"menu-btn\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-tractor\"></i><span>Maquinarias <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"RegistrarMaquinaria.jsp\" target=\"myframe\"><i class=\"fas fa-plus-circle\"></i><span>Nuevo</span></a>\n");
      out.write("                                                    <a href=\"ListarMaquinarias.jsp\" target=\"myframe\"><i class=\"fas fa-list\"></i><span>Listar</span></a>\n");
      out.write("                                                    <a href=\"BuscarMaquinaria.jsp\" target=\"myframe\"><i class=\"fas fa-search\"></i><span>Buscar maquianria</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li class=\"item\" id=\"Cotización\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#Cotización\" class=\"menu-btn\">\n");
      out.write("                                                    <i class=\"fas fa-sticky-note\"></i><span>Cotización <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"CotizaAlquilerMaquinaria.jsp\" target=\"myframe\"><i class=\"fas fa-notes-medical\"></i><span>Alquiler de maquinaria</span></a>\n");
      out.write("                                                    <a href=\"CotizaTransporteMaquinaria.jsp\" target=\"myframe\"><i class=\"fas fa-notes-medical\"></i><span>Transporte de maquinaria</span></a>\n");
      out.write("                                                    <a href=\"CotizaTransporteMateriales.jsp\" target=\"myframe\"><i class=\"fas fa-notes-medical\"></i><span>Transporte de materiales</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li class=\"item\" id=\"Servicios\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#Servicios\" class=\"menu-btn\">\n");
      out.write("                                                    <i class=\"fas fa-sticky-note\"></i><span>Servicios <i class=\"fas fa-chevron-down drop-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("                                                    <a href=\"AlquilerMaquinaria.jsp\" target=\"myframe\"><i class=\"fas fa-notes-medical\"></i><span>Alquiler de maquinaria</span></a>\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--sidebar end-->\n");
      out.write("\t\t\t<!--main container start-->\n");
      out.write("                        <div class=\"main-container\" style=\" \">\n");
      out.write("                        <iframe name=\"myframe\" style=\"height: 100%; width: 100%; border: 0\"></iframe>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("\t\t\t<!--main container end-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--wrapper end-->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </body>\n");
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
