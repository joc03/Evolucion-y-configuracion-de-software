<%-- 
    Document   : EliminarCotizacionAlquiler
    Created on : 09/10/2020, 09:26:53 PM
    Author     : josed
--%>

<%@page import="br.Alquilermabr"%>
<%@page import="be.Alquilermaquinaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    String maqui = request.getParameter("tmaquinaria");
    int dias =Integer.parseInt( request.getParameter("tdias"));    
    int cant = Integer.parseInt(request.getParameter("tcantidad"));  
    float precio =Float.parseFloat( request.getParameter("tprecio")); 
    float subto =Float.parseFloat( request.getParameter("tsubto"));
int sc = 0;
Alquilermaquinaria u = new Alquilermaquinaria(maqui,dias,cant,precio,subto);
Alquilermabr p = new Alquilermabr();
int resultado= p.eliminarCotizacion(u);
if(resultado ==1 ){
    //colocamos el usuario en el ambito de la sesion
    session.setAttribute("susuario", u);  
    
    %>
    
    <%= resultado %>
    registros creados
    
    
    <jsp:include page="CotizaAlquilerMaquinaria.jsp"/>
    
 <%
} 
else{

  %>
0 Registros creados
<jsp:include page="CotizaAlquilerMaquinaria.jsp"/>
<%

}
%>
