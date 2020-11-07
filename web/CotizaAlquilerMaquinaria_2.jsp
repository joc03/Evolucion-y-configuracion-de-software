<%-- 
    Document   : CotizaAlquilerMaquinaria_2
    Created on : 09/10/2020, 05:41:26 PM
    Author     : josed
--%>

<%@page import="be.suma"%>
<%@page import="br.Alquilermabr"%>
<%@page import="java.util.List"%>
<%@page import="be.Alquilermaquinaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap-4.5.0-dist/css/bootstrap.min.css">
    </head>
    <body>
        
        <div class="card" style="background: black; color:white ">
            <div class="card-header " style="background:#ffcc20; color: white"> 
                <div style="float: left"> <h2><i class="fas fa-edit">Nueva Cotización</i> </h2> </div> 
                <div style="float: right"><h2>ALQUILER DE MAQUINARIAS </h2> </div>
            </div>
            <div class="card-body" style="color: white">
                                        <div class="table-responsive">
                                            <table class="table" style="color: white; background: black">
                                            <tr class="">
                                                <td class=""><b>Atención</b></td> 
                                                <td> <input class="form-control" type="text" name="" id=""> </td>
                                                <td class=""><b>Telefono</b></td> 
                                                <td> <input class="form-control" type="text" name="" id=""> </td>
                                                <td></td> <td></td>
                                            </tr>
                                            <tr>
                                               <td class=""><b>Cliente</b></td> 
                                                <td> <input class="form-control" type="text" name="" id=""> </td>
                                                <td class=""><b>Telefono</b></td> 
                                                <td> <input class="form-control" type="text" name="" id=""> </td>
                                                <td class=""><b>Email</b></td> 
                                                <td> <input class="form-control" type="text" name="" id=""> </td>
                                            </tr>
                                            </table>
                                        </div>
                                        
                                        <div >
                                            <table class="table" style="color: white">
                                                <tr ><td class="" ><b style="font-size: 20px; font-style: inherit; color: white">MAQUINARIAS</b></td> <td></td><td></td><td></td><td></td><td></td><td></td></tr>                                            
                                            <tr class="">
                                                <td class="" ><b>Maquina</b></td> 
                                                <td> <select class="form-control" name="textmaquina" id="txtmaquina" style="">
                                                        <option value="CARGADOR FRONTAL">CARGADOR FRONTAL</option>
                                                        <option value="RETROEXCAVADORA ">RETRO EXCAVADORA </option>
                                                        <option value="MEZCLADORA ">MEZCLADORA </option>
                                                        <option value="EXCAVADORA ">EXCAVADORA </option>
                                                        <option value="MINI EXCAVADORA ">MINI EXCAVADORA </option>
                                                        <option value="MINI CARGADORA">MINI CARGADORA</option>
                                                        <option value="TRACTOR ">TRACTOR </option>
                                                    </select> 
                                                </td>
                                                <td class=""><b>Cantidad</b></td> 
                                               <td> <select class="form-control" name="textcantidad" id="txtcantidad" style="">
                                                        <option value="1">1</option>
                                                        <option value="2">2</option>
                                                        <option value="3">3</option>
                                                        <option value="4">4</option>
                                                        <option value="5">5</option>
                                                    </select> 
                                                </td>
                                                <td class=""><b>Días</b></td> 
                                                <td> <select class="form-control" name="textdias" id="txtdias" style="">
                                                        <option value="1">1</option>
                                                        <option value="2">2</option>
                                                        <option value="3">3</option>
                                                        <option value="4">4</option>
                                                        <option value="5">5</option>
                                                        <option value="6">6</option>
                                                        <option value="7">7</option>
                                                        <option value="8">8</option>
                                                        <option value="9">9</option>
                                                        <option value="10">10</option>
                                                        <option value="11">11</option>
                                                        <option value="12">12</option>
                                                    </select> 
                                                </td>
                                                <td class=" "> <button onclick='agregar()' class="btn btn-outline-info"><i class="fas fa-plus"></i>Agregar</button> </td> 
                                            </tr>
                                           
                                            </table>
                                        </div>
                                        <div class="table-responsive">
                                                    <table class="table" style="background: black">
                                                    <thead style="">
                                                   <tr style="padding: 200px ;background: black; color: white">
                                                       <th> MAQUINA </th><th style="width: 150px"> DIAS </th><th style="width: 170px"> CANTIDAD  </th><th> PRECIO </th><th> SUBTOTAL </th><th></th>
                                                   </tr>
                                               </thead>
                                               <tbody>
                                                   <%
                                                 List<Alquilermaquinaria> lista;
                                                 Alquilermabr regla = new Alquilermabr();
                                                 lista = regla.listarCliente();
                                                 
                                                List<suma> lista1;
                                                Alquilermabr regla1 = new Alquilermabr();
                                                lista1 = regla1.listasuma();

                                             %>
                                                   <% 

                                                   for (Alquilermaquinaria entidad:lista){

                                                       %> 
                                                       <tr>
                                                          <td > 
                                                               <input class="form-control bg-light" style="height: 47px" disabled="" name="txtcodigoex" type="text" value='<%= entidad.getMaquina()%>' >                            
                                                           </td>
                                                           <td > 
                                                               <input class="form-control bg-light" style="height: 47px; text-align: center" disabled="" name="txtnombreex" type="text" value='<%= entidad.getDias()%> ' > 
                                                           </td>
                                                           <td > 
                                                               <input class="form-control bg-light" style="height: 47px; text-align: center" disabled="" name="txtnombreex" type="text" value='<%= entidad.getCantidad()%> ' > 
                                                           </td>
                                                           <td >
                                                               <input class="form-control bg-light" style="height: 47px; text-align: right" disabled="" name="txtapellidoex" type="text" value='S/.<%= entidad.getPrecio()%>' > 
                                                           </td>
                                                           <td > 
                                                               <input class="form-control bg-light" style="height: 47px; text-align: right" disabled="" name="txtdniex" type="text" value='S/.<%= entidad.getSubtotal()%>'> 
                                                           </td>
                                                           <td id=""> <input type="submit"  value="ELIMINAR" class="btn-lg   btn-outline-danger" src="img/Eliminar.png"
                                                                             onclick='eliminar( "<%= entidad.getMaquina()%>","<%= entidad.getDias()%>","<%= entidad.getCantidad()%>",
                                                                      "<%= entidad.getPrecio()%>","<%= entidad.getSubtotal()%>")'> </td> 

                                                       </tr>
                                                      

                                                   <%
                                                   }
                                                   %>
                                                     
                                                        <% 

                                                       for (suma entidad:lista1){
                                                           %> 

                                                           <tr style="color: white; border-color: #ffcc20; border: 5px">
                                                               <td >  </td >
                                                               <td >  </td > <td >  </td ><td style="text-align: right">TOTAL S/.</td>
                                                               <td style="text-align: right; height: 47px"> 
                                                                   <input  class="form-control bg-light" disabled="" name="txtdniex" type="text" value=' S/.<%= entidad.getSuma()%>' style="text-align:  right ; height: 47px"> 
                                                           </td>
                                                           <td class=" "> <button onclick="window.print()" class="btn btn-primary"><i class="fas fa-print"></i>Imprimir</button> </td> 


                                                           </tr>
                                                       <%
                                                       }
                                                       %>
                                               </tbody>
                                           </table>
                                               </div>
                                      

                                    </div>
                                </div>
        
        
       
            <script src="bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
    <script src="bootstrap-4.5.0-dist/js/popper.min.js" crossorigin="anonymous"></script>
    <script src="bootstrap-4.5.0-dist/js/bootstrap.min.js" crossorigin="anonymous"></script>
    </body>
</html>
