/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import be.TransporteMaquinaria;
import be.suma;
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
public class Transportemaquibd extends bd{
    public int registrarCotizaciónTransporte(TransporteMaquinaria e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = "insert into cotizacionTransporte (descrip,depa,viajes,precio,subtotal) values (?,?,?,?,?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, e.getDescripcion());
           pst.setString(2, e.getDepartamento());
           pst.setInt(3, e.getViajes());
           pst.setFloat(4, e.getPrecio());
           pst.setFloat(5, e.getSubtotal());                     
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
    public List<TransporteMaquinaria> ListadoCotizacionTransporte(){
       List<TransporteMaquinaria> lista = new ArrayList();
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select descrip,depa,viajes,precio,subtotal from cotizacionTransporte"  ;
        try {
            //Statement st = c.createStatement();
            //ResultSet rs=st.executeQuery(sql);   
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                TransporteMaquinaria area = new TransporteMaquinaria();
                area.setDescripcion(rs.getString("descrip"));
                area.setDepartamento(rs.getString("depa"));
                area.setViajes(rs.getInt("viajes"));
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
    public int eliminarCotizacioTransporte(TransporteMaquinaria e) {
         
        int r=0;
        String sql="delete from cotizacionTransporte where descrip=?";
        Connection c = new bd().getMysql();
        try{
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, e.getDescripcion());
            r = pst.executeUpdate();
            c.close();
        }
        catch(Exception ex){
            Logger.getLogger(Clientebd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;         
   }
    public List<suma> sumatotalTransporte(){
       List<suma> lista = new ArrayList();
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select sum(subtotal) from cotizacionTransporte;"  ;
        try {
              
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                suma area = new suma();                
                area.setSuma(rs.getInt("sum(subtotal)"));                            
                lista.add(area);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }             
       return lista;
    }
}
