<%-- 
    Document   : EliminarCotizacionTransporteMaqui
    Created on : 13/10/2020, 05:44:53 AM
    Author     : josed
--%>

<%@page import="br.Trabsportebr"%>
<%@page import="be.TransporteMaquinaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String descrip = request.getParameter("tdescripcion");
    String depa = request.getParameter("tdepartamento");    
    int via = Integer.parseInt(request.getParameter("tviajes"));  
    float precio =Float.parseFloat( request.getParameter("tprecio")); 
    float subto =Float.parseFloat( request.getParameter("tsubto"));
TransporteMaquinaria u = new TransporteMaquinaria(descrip,depa,via,precio,subto);
Trabsportebr p = new Trabsportebr();
int r= p.eliminarCotizacionTransporte(u);
if(r ==1 ){
    //colocamos el usuario en el ambito de la sesion
    session.setAttribute("susuario", u);  
    
    %>
    
 
   
    
    
    <jsp:include page="CotizaAlquilerMaquinaria.jsp"/>
    
 <%
} 
else{

  %>

<jsp:include page="CotizaAlquilerMaquinaria.jsp"/>
<%

}
%>
