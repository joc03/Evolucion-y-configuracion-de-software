<%-- 
    Document   : RegistrarSolicitudTransporte
    Created on : 24/10/2020, 06:26:03 PM
    Author     : josed
--%>

<%@page import="be.SolicitudTransportebe"%>
<%@page import="br.SolicitudTransportebr"%>
<%@page import="be.TransporteMaquinariaPreciobe"%>
<%@page import="br.TransporteMaquinariaPreciobr"%>
<%@page import="br.Departamentobr"%>
<%@page import="br.Maquinariabr"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
      
String dni = "684654";
float precio =Float.parseFloat( request.getParameter("Tprecio"));
String chofer = "HOLA";
String fecha = "1999-12-12";

float precio1 = 150;
br.SolicitudTransportebr lo4 = new SolicitudTransportebr();

// codigo automatico
int Fila = lo4.ContarFilas() + 1;
String myFila = Integer.toString(Fila);
String codigo = "SOLTRA00" + myFila ;

SolicitudTransportebe u = new SolicitudTransportebe(codigo,dni,precio1,chofer,fecha);
br.SolicitudTransportebr lo = new SolicitudTransportebr();
int r = lo.registrarSolicitudTransporte(u);

if(r ==1 ){
    //colocamos el usuario en el ambito de la sesion
    session.setAttribute("susuario", u);  
    
    %>
    <jsp:forward page="TransporteMaquinaria.jsp"/> 
    
 <%
} 
else{

  %>
  <jsp:forward page="TransporteMaquinaria.jsp"/> 

<%
} 

%>
