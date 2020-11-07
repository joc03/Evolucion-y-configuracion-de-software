<%-- 
    Document   : RegistrarCotizacionAlquiles
    Created on : 09/10/2020, 08:11:39 PM
    Author     : josed
--%>

<%@page import="dao.Alquilermabd"%>
<%@page import="br.Maquinariabr"%>
<%@page import="be.Maquinariabe"%>
<%@page import="java.util.List"%>
<%@page import="br.Alquilermabr"%>
<%@page import="be.Alquilermaquinaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

String maq = request.getParameter("tmaquina");
int canti =Integer.parseInt( request.getParameter("tcantidad"));
int dias =Integer.parseInt( request.getParameter("tdias"));

float pre ;
if(maq.equals("CARGADOR FRONTAL")){
    pre= 1200;
}else if(maq.equals("EXCAVADORA ")){
    pre= 1300;
}else if(maq.equals("MEZCLADORA ")){
    pre= 800;
}
else if(maq.equals("MINI CARGADORA")){
    pre= 200 ;
}
else if(maq.equals("MINI EXCAVADORA ")){
    pre= 750;
}
else if(maq.equals("RETROEXCAVADORA ")){
    pre= 1500;
}else if(maq.equals("TRACTOR ")){
    pre= 950;
} else {
    pre=0;
}


float subto= pre*dias;

Alquilermaquinaria u = new Alquilermaquinaria(maq, dias,canti,pre,subto);
br.Alquilermabr lo = new Alquilermabr();
int resultado= lo.registrarALquiler(u);
  
if(resultado ==1 ){
    //colocamos el usuario en el ambito de la sesion
    session.setAttribute("susuario", u);  
    
    %>
    <jsp:forward page="CotizaAlquilerMaquinaria.jsp"/> 
    
 <%
} 
else{

  %>
  <jsp:forward page="CotizaAlquilerMaquinaria.jsp"/> 

<%
}

%>


