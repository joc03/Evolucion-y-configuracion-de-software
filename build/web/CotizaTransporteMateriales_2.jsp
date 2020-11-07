<%-- 
    Document   : CotizaTransporteMateriales_2
    Created on : 13/10/2020, 05:55:50 AM
    Author     : josed
--%>

<%@page import="be.suma"%>
<%@page import="br.Materialesbr"%>
<%@page import="be.TransporteMateriales"%>
<%@page import="java.util.List"%>
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
                <div style="float: right"><h2>TRANSPORTE DE MATERIALES </h2> </div>
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
                                                <tr ><td class="" ><b style="font-size: 20px; font-style: inherit; color: white"> SERVICIOS</b></td> <td></td><td></td><td></td><td></td><td></td><td></td></tr>                                            
                                            <tr class="">
                                                <td class="" ><b>DESCRIPCIÓN</b></td> 
                                                <td> <input class="form-control" name="textmaquina" id="txtdescripcion" style="" required="">
                                                        
                                                </td>
                                                <td class=""><b>DEPARTAMENTO</b></td> 
                                               <td> <select class="form-control" name="textcantidad" id="txtdepartamento" style="">
                                                        <option value="AMAZONAS">AMAZONAS</option>
                                                        <option value="ANCASH">ANCASH</option>
                                                        <option value="APURIMAC">APURIMAC</option>
                                                        <option value="AREQUIPA">AREQUIPA</option>
                                                        <option value="AYACUCHO">AYACUCHO</option>
                                                        <option value="CAJAMARCA">CAJAMARCA</option>
                                                        <option value="CUSCO">CUSCO</option>
                                                        <option value="HUANCAVELICA">HUANCAVELICA</option>
                                                        <option value="HUANUCO">HUÁNUCO</option>
                                                        <option value="ICA">ICA</option>
                                                        <option value="JUNIN">JUNIN</option>
                                                        <option value="LA LIBERTAD">LA LIBERTAD</option>
                                                        <option value="LAMBAYEQUE">LAMBAYEQUE</option>
                                                        <option value="LIMA">LIMA</option>
                                                        <option value="LORETO">LORETO</option>
                                                        <option value="MADRE DE DIOS">MADRE DE DIOS</option>
                                                        <option value="MOQUEGUA">MOQUEGUA</option>
                                                        <option value="PASCO">PASCO</option>
                                                        <option value="PIURA">PIURA</option>
                                                        <option value="PUNO">PUNO</option>
                                                        <option value="SAN MARTIN">SAN MARTIN</option>
                                                        <option value="TACNA">TACNA</option>
                                                        <option value="TUMBES">TUMBES</option>
                                                        <option value="UCAYALI">UCAYALI</option>
                                                        
                                                       
                                                    </select> 
                                                </td>
                                                <td class=""><b>N. VIAJES</b></td> 
                                                <td> <select class="form-control" name="textdias" id="txtviajes" style="">
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
                                                 List<TransporteMateriales> lista;
                                                 Materialesbr regla = new Materialesbr();
                                                 lista = regla.listarCotizacionTransporteMateriales();
                                                 
                                                List<suma> lista1;
                                                Materialesbr regla1 = new Materialesbr();
                                                lista1 = regla1.listasumaCotizacionTransporteMateriales();

                                             %>
                                                   <% 

                                                   for (TransporteMateriales entidad:lista){

                                                       %> 
                                                       <tr>
                                                          <td > 
                                                               <input class="form-control bg-light" style="height: 47px" disabled="" name="txtcodigoex" type="text" value='<%= entidad.getDescripcion()%>' >                            
                                                           </td>
                                                           <td > 
                                                               <input class="form-control bg-light" style="height: 47px; text-align: center" disabled="" name="txtnombreex" type="text" value='<%= entidad.getDepartamento()%> ' > 
                                                           </td>
                                                           <td > 
                                                               <input class="form-control bg-light" style="height: 47px; text-align: center" disabled="" name="txtnombreex" type="text" value='<%= entidad.getViajes()%> ' > 
                                                           </td>
                                                           <td >
                                                               <input class="form-control bg-light" style="height: 47px; text-align: right" disabled="" name="txtapellidoex" type="text" value='S/.<%= entidad.getPrecio()%>' > 
                                                           </td>
                                                           <td > 
                                                               <input class="form-control bg-light" style="height: 47px; text-align: right" disabled="" name="txtdniex" type="text" value='S/.<%= entidad.getSubtotal()%>'> 
                                                           </td>
                                                           <td id=""> <input type="submit"  value="ELIMINAR" class="btn-lg   btn-outline-danger" src="img/Eliminar.png"
                                                                             onclick='eliminar( "<%= entidad.getDescripcion()%>","<%= entidad.getDepartamento()%>","<%= entidad.getViajes()%>",
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
