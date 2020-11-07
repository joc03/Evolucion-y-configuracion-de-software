/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import be.Clientebe;
import be.Maquinariabe;
import be.Alquilermaquinaria;
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
public class Alquilermabd extends bd{

    public Alquilermabd() {
    }
    public int registrarCotización(Alquilermaquinaria e){
       PreparedStatement pst= null;
       int resultado =0;
       try {
           String consulta = "insert into cotizacionMaqui (maquina,dias,cantidad,precio,subtotal) values (?,?,?,?,?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, e.getMaquina());
           pst.setInt(2, e.getDias());
           pst.setInt(3, e.getCantidad());
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
    public List<suma> sumatotal(){
       List<suma> lista = new ArrayList();
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select sum(subtotal) from cotizacionMaqui;"  ;
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
    public List<Alquilermaquinaria> ListadoCotizacionAlquiler(){
       List<Alquilermaquinaria> lista = new ArrayList();
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select maquina,dias,cantidad,precio,subtotal from cotizacionMaqui"  ;
        try {
            //Statement st = c.createStatement();
            //ResultSet rs=st.executeQuery(sql);   
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Alquilermaquinaria area = new Alquilermaquinaria();
                area.setMaquina(rs.getString("maquina"));
                area.setDias(rs.getInt("dias"));
                area.setCantidad(rs.getInt("cantidad"));
                area.setPrecio(rs.getFloat("precio"));
                area.setSubtotal(rs.getFloat("subtotal"));
                lista.add(area);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }
             
       return lista;
    }
    public float buscarPrecioMaquinaria(String nombre){
       float precio=0;
        Connection c = new bd().getConexion();
        // 3. Enviar sentecia sql a ejecutar
        String sql="select precio_Maqui from Maquinaria where nombre_Maqui='"+nombre+"'"  ;
        try {
            //Statement st = c.createStatement();
            //ResultSet rs=st.executeQuery(sql);
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                precio = rs.getFloat("precio_Maqui");
            } else {
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }
             
       return precio;
    }
    public int eliminarCotizacioAlquiler(Alquilermaquinaria e) {
         
        int r=0;
        String sql="delete from cotizacionMaqui where maquina=?";
        Connection c = new bd().getMysql();
        try{
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, e.getMaquina());
            r = pst.executeUpdate();
            c.close();
        }
        catch(Exception ex){
            Logger.getLogger(Alquilermabd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;         
   }
}
