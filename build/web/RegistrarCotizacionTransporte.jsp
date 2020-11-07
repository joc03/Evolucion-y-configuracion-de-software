<%-- 
    Document   : RegistrarCotizacionTransporte
    Created on : 13/10/2020, 05:03:58 AM
    Author     : josed
--%>

<%@page import="br.Trabsportebr"%>
<%@page import="dao.Transportemaquibd"%>
<%@page import="be.TransporteMaquinaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

String descri = request.getParameter("tdescripcion");
String depa = request.getParameter("tdepartamento");
int viajes =Integer.parseInt( request.getParameter("tviajes"));

float pre ;
if(depa.equals("AMAZONAS")){
    pre= 800;
}else if(depa.equals("ANCASH")){
    pre= 600;
}else if(depa.equals("APURIMAC")){
    pre= 300;
}
else if(depa.equals("AREQUIPA")){
    pre= 300 ;
}
else if(depa.equals("AYACUCHO")){
    pre= 250;
}
else if(depa.equals("CAJAMARCA")){
    pre= 750;
}else if(depa.equals("HUANCAVELICA")){
    pre= 200;
}else if(depa.equals("HUANUCO")){
    pre= 600;
}else if(depa.equals("ICA")){
    pre= 150;
}else if(depa.equals("JUNIN")){
    pre= 250;
}else if(depa.equals("LA LIBERTAD")){
    pre= 650;
}else if(depa.equals("LAMBAYEQUE")){
    pre= 700;
}else if(depa.equals("LIMA")){
    pre= 250;
}else if(depa.equals("LORETO")){
    pre= 850;
}else if(depa.equals("MADRE DE DIOS")){
    pre= 550;
}else if(depa.equals("MOQUEGUA")){
    pre= 350;
}else if(depa.equals("PASCO")){
    pre= 550;
}else if(depa.equals("PIURA")){
    pre= 800;
}else if(depa.equals("PUNO")){
    pre= 450;
}else if(depa.equals("SAN MARTIN")){
    pre= 700;
}else if(depa.equals("TACNA")){
    pre= 400;
}else if(depa.equals("TUMBES")){
    pre= 850;
}else if(depa.equals("UCAYALI")){
    pre= 550;
} else {
    pre=0;
}


float subto= pre*viajes;

TransporteMaquinaria u = new TransporteMaquinaria(descri,depa,viajes,pre,subto);
br.Trabsportebr lo = new Trabsportebr();
int r = lo.registrarCotizacionTransporte(u);

  
if(r ==1 ){
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

