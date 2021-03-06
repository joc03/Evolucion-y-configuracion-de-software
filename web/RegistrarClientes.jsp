<%-- 
    Document   : RegistrarClientes
    Created on : 24/09/2020, 09:17:46 PM
    Author     : josed
--%>

<%@page import="be.Clientebe"%>
<%@page import="br.Clientebr"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ilche</title>
        <link rel="shortcut icon" href="img/LogoIlche.jpeg">
         <script src="jquery.js" type="text/javascript"></script>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
        <link rel="stylesheet" href="bootstrap-4.5.0-dist/css/bootstrap.min.css">
        <link href="EstilosMenú.css" rel="stylesheet" type="text/css"/>
        
        
    </head>
    
    <body style="background: none">
        
        <form action="RegistrarClientes.jsp" method="post"> 
             
                <div class="card mb-3" style=" margin: 0px; padding: 0px">
                    <div class="card-header " style="color: black; background-color: #ffcc20">
                        <i class="fas fa-table"></i>
                       REGISTRO DE CLIENTE</div>
                    <div class="card-body" style="background: black; margin: 0; border: 0">
                        <div class="table-responsive" >                           
                            <table 
                                class="table table-borderless " style="background: black; margin: 0; color: white; border: 0" id="dataTableDatosBasicos" width="100%" cellspacing="0">
                                <thead></thead>
                                <tbody>
                                    <tr>
                                        <th scope="row" style="">CODIGO</th>
                                        <%
                                        br.Clientebr lo = new Clientebr();
                                        int resultado= lo.Filas();
                                        String codigo = "CL00" + resultado;
                                        %>
                                        <td><input class="form-control bg-light"  name="txtcodigocli" value="<%=codigo%>" readonly="" type="text" ></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">NOMBRES</th>
                                        <td><input class="form-control bg-light"  name="txtnombrecli"  type="text"
                                                   style="text-transform: uppercase"
                                                   required=""/></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">APELLIDOS</th>
                                        <td><input class="form-control bg-light"  name="txtapellidcli" type="text" style="text-transform: uppercase"
                                                   required=""></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">DNI</th>
                                        <td><input class="form-control"  name="txtdnicli" type="text"
                                                   maxlength="8"
                                                   required pattern="[0-9]{8}" 
                                                   ></td>
                                    </tr>                                    
                                    <tr>

                                        <th scope="row">CELULAR</th>
                                        <td><input class="form-control" name="txttelecli"  type="text" 
                                                   maxlength="9"
                                                   required pattern="[0-9]{9}" 
                                                   ></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">DIRECCION</th>
                                        <td><input class="form-control" name="txtDirCli"  type="text" required=""></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">E-mail</th>
                                        <td><input class="form-control" name="txtEmailCli"  type="text" required=""></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
        </form>
         
        <% 

        String cod = request.getParameter("txtcodigocli");
        String nom = request.getParameter("txtnombrecli");
        String ape = request.getParameter("txtapellidcli");
        String dni_ru = request.getParameter("txtdnicli");
        String tele = request.getParameter("txttelecli");
        String dir = request.getParameter("txtDirCli");
        String email = request.getParameter("txtEmailCli");
        Clientebe u = new Clientebe(cod, nom,ape,dni_ru,tele,dir,email);
        int resultado1= lo.registrarCliente(u);
        if (resultado1==1){

            %>

            <script>
                alert("Registro creado");
                location.reload();
            </script>

            <%
             resultado=0;
        }
        else { %>

             <%
        }
        %>
                        <div align="center">
                            <button type="submit" class="btn btn-outline-primary btn-primary btn-lg btn-block"
                                    onclick="location.reload()" style="color: white">GUARDAR</button>
                        </div>
     <script src="bootstrap-4.5.0-dist/js/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
    <script src="bootstrap-4.5.0-dist/js/popper.min.js" crossorigin="anonymous"></script>
    <script src="bootstrap-4.5.0-dist/js/bootstrap.min.js" crossorigin="anonymous"></script>             
    </body>
   
</html>
