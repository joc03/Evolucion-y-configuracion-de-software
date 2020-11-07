<%-- 
    Document   : EliminarCotizacionTransporteMateriales
    Created on : 13/10/2020, 06:59:21 AM
    Author     : josed
--%>

<%@page import="br.Materialesbr"%>
<%@page import="be.TransporteMateriales"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String descrip = request.getParameter("tdescripcion");
    String depa = request.getParameter("tdepartamento");    
    int via = Integer.parseInt(request.getParameter("tviajes"));  
    float precio =Float.parseFloat( request.getParameter("tprecio")); 
    float subto =Float.parseFloat( request.getParameter("tsubto"));
TransporteMateriales u = new TransporteMateriales(descrip,depa,via,precio,subto);
Materialesbr p = new Materialesbr();
int r= p.eliminarCotizacionTransporteMateriales(u);
if(r ==1 ){
    //colocamos el usuario en el ambito de la sesion
    session.setAttribute("susuario", u);  
    
    %>
    
    <%= r %>
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
