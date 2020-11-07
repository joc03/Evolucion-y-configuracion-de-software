/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import be.ContenidoTransportebe;
import be.TransporteMaquinariaPreciobe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josed
 */
public class TransporteMaquinariaPreciobd extends bd{

    public TransporteMaquinariaPreciobd() {
    }
    public int registrarTransporteMaquinariaPrecio(TransporteMaquinariaPreciobe e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = "insert into TransporteMaquinaria (codigo,codCont,placaVehiculo,maquina,departamento,cantidad,precio,subtotal) values (?,?,?,?,?,?,?,?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, e.getCodigo());
           pst.setString(2, e.getCodCont());
           pst.setString(3, e.getPlacaVehiculo());
           pst.setString(4, e.getMaquina());
           pst.setString(5, e.getDepartamento());
           pst.setInt(6,e.getCantidad());
           pst.setFloat(7, e.getPrecio());  
           pst.setFloat(8, e.getSubtotal());
           if(pst.executeUpdate() == 1){
               return resultado=1;
           }                          
       } catch (Exception ex) {
       }finally{
           
           try {
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
               
           } catch (Exception ex) {
               System.err.println("Error"+ ex);
           }
       }       
       return resultado;
   }
  
    
    public float sumatotalTransporteMaquinaria(){
      float precio=0;
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select sum(subtotal) from TransporteMaquinaria;"  ;
        try {
              
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                                
                precio=rs.getInt("sum(subtotal)");                            
                
               
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }             
       return precio;
    }
    public List<TransporteMaquinariaPreciobe> ListadoTransporteMaquinaria(){
       List<TransporteMaquinariaPreciobe> lista = new ArrayList();
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select codigo,codCont,placaVehiculo,maquina,departamento,cantidad,precio,subtotal from TransporteMaquinaria"  ;
        try {
            //Statement st = c.createStatement();
            //ResultSet rs=st.executeQuery(sql);   
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){ 
                TransporteMaquinariaPreciobe area = new TransporteMaquinariaPreciobe();
                area.setCodigo(rs.getString("codigo"));
                area.setCodCont(rs.getString("codCont"));
                 area.setPlacaVehiculo(rs.getString("placaVehiculo"));
                area.setMaquina(rs.getString("maquina"));
                area.setDepartamento(rs.getString("departamento"));
                area.setCantidad(rs.getInt("cantidad"));
                area.setPrecio(rs.getFloat("precio"));
                area.setSubtotal(rs.getFloat("subtotal"));
                lista.add(area);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Clientebd.class.getName()).log(Level.SEVERE, null, ex);
        }
             
       return lista;
    }
    
    public int eliminarTransporteMaquinaria(String e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = " DELETE FROM TransporteMaquinaria    WHERE codigo='"+e+ "'";
           pst = getConexion().prepareStatement(consulta);
           
           if(pst.executeUpdate() == 1){
               return resultado=1;
           }                          
       } catch (Exception ex) {
       }finally{
           try {
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
               
           } catch (Exception ex) {
               System.err.println("Error"+ ex);
           }
       }
       return resultado;
   }
     public  int  ContarFilas(){
       int filas=0;
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="SELECT count(*) FROM TransporteMaquinaria"  ;
        try {
              
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                             
                filas = rs.getInt("count(*)");                            
               
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }             
       return filas;
    }
     
     
       //contenido
   public int RegistrarContenidoTransporte(ContenidoTransportebe e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = "insert into ContenidoTransporte (cod,codCont,vehiculo,maquina,depa,cant,precio,subtotal) values (?,?,?,?,?,?,?,?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, e.getCodigo());
           pst.setString(2, e.getCodCont());
           pst.setString(3, e.getVehiculo());
           pst.setString(4, e.getMaquina());
           pst.setString(5, e.getDepa());
           pst.setInt(6, e.getCantidad());  
           pst.setFloat(7, e.getPrecio());
           pst.setFloat(8, e.getSubtotal());
           if(pst.executeUpdate() == 1){
               return resultado=1;
           }                          
       } catch (Exception ex) {
       }finally{
           
           try {
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
               
           } catch (Exception ex) {
               System.err.println("Error"+ ex);
           }
       }       
       return resultado;
   }
   public int eliminarContenidoTransporte(String e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = " DELETE FROM ContenidoTransporte    WHERE cod='"+e+ "'";
           pst = getConexion().prepareStatement(consulta);
           
           if(pst.executeUpdate() == 1){
               return resultado=1;
           }                          
       } catch (Exception ex) {
       }finally{
           try {
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
               
           } catch (Exception ex) {
               System.err.println("Error"+ ex);
           }
       }
       return resultado;
   }
   
   ///////
   public int EliminarTabla(){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = "truncate table AlquileMaquinaria;";
           pst = getConexion().prepareStatement(consulta);
           
           if(pst.executeUpdate() == 1){
               return resultado=1;
           }                          
       } catch (Exception ex) {
       }finally{
           try {
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
           } catch (Exception ex) {
               System.err.println("Error"+ ex);
           }
       }       
       return resultado;
   }
   
   //contador
   public int registrarContador(String cod, int e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = "insert into contadorTransporte (cod,cont) values (?,?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, cod);
           pst.setInt(2, e);
           if(pst.executeUpdate() == 1){
               return resultado=1;
           }                          
       } catch (Exception ex) {
       }finally{
           try {
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
           } catch (Exception ex) {
               System.err.println("Error"+ ex);
           }
       }       
       return resultado;
   }
   
   public  int  ContarFilasContenidoTransporte(){
       int filas=0;
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="SELECT count(*) FROM ContenidoTransporte"  ;
        try {
              
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                             
                filas = rs.getInt("count(*)");                            
               
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }             
       return filas+1;
    }
   
    public  int  ContarFilasContenido(){
       int filas=0;
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="SELECT count(*) FROM contadorTransporte"  ;
        try {
              
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                             
                filas = rs.getInt("count(*)");                            
               
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }             
       return filas+1;
    }
   
     
     
}
