<%-- 
    Document   : Login
    Created on : 24/09/2020, 01:56:34 AM
    Author     : josed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Ilche</title>
        <meta charset="UTF-8">
        <link rel="shortcut icon" href="img/LogoIlche.jpeg">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
       
    </head>
    
    <script>
        
    </script>
    
    <body >  
        
        <nav class="navbar" style="width: 77%; float: left; margin: 0; padding: 0;" >
            <div class="container-fluid border-0" style="margin: 0; padding: 0;">
                <img src="img/Login1Izquierda.jpg" alt="" style="height: 100%; width: 100%">
            </div>
        </nav>
        <nav class="navbar" style="width: 23%; height:90% ;height: 400px; float: right;  margin: 0; padding: 0; position: relative">
            <div class=" " style="margin: 0; padding: 0; ">
                <img src="img/LoginFor.PNG" alt="" class="" style="height: 100%; width: 100%; float: inside">
            </div>
            
            <div class="" style="float: top; position: absolute; left: 10%; top: 30%; padding: 10%  ">
            <form action="Login_V.jsp" method="post" >
            <table id="tabla">              
                <tr><td>Usuario :  <br> <input class="form-control" type="text" name="textusuario" placeholder="Ingresar usuario" required="" ></td></tr>
                <tr><td>Contraseña :<br> 
                        <input class="form-control" type="password" name="texpassword" 
                               placeholder="Ingresar contraseña"
                               required ="" >
                        
                    </td></tr>
               <tr><td><a href="#" style="font-size: 13px ">olvidé mi contraseña</a></td></tr>
              
               <tr> <td><input class="btn btn-outline-primary btn btn-block" type="submit" value="Log in" id="new">  </td></tr>
             
            </table> 
                
                
            </form>
            </div>
            
            
        </nav>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>

