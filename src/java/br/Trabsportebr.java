/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;


import be.TransporteMaquinaria;
import be.suma;
import dao.Transportemaquibd;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author josed
 */
public class Trabsportebr {

    public Trabsportebr() {
    }
      public int registrarCotizacionTransporte(TransporteMaquinaria e) throws SQLException{
        return new Transportemaquibd().registrarCotizaciónTransporte(e);
    }
    public List<TransporteMaquinaria> listarCotizacionTransporte() throws SQLException{
      
            return new Transportemaquibd().ListadoCotizacionTransporte();
    }
    public int eliminarCotizacionTransporte(TransporteMaquinaria e) throws SQLException{
        return new Transportemaquibd().eliminarCotizacioTransporte(e);
    }
    public List<suma> listasumaCotizacionTransporte() throws SQLException{
      
            return new Transportemaquibd().sumatotalTransporte();
    }
}
