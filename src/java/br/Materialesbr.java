/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;
import be.TransporteMateriales;
import be.suma;
import dao.TransporteMaterialesbd;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author josed
 */
public class Materialesbr {

    public Materialesbr() {
    }
    public int registrarCotizacionTransporteMateriales(TransporteMateriales e) throws SQLException{
        return new TransporteMaterialesbd().registrarCotizaciónMateriales(e);
    }
    public List<TransporteMateriales> listarCotizacionTransporteMateriales() throws SQLException{
      
            return new TransporteMaterialesbd().ListadoCotizacionTransporteMateriales();
    }
    public int eliminarCotizacionTransporteMateriales(TransporteMateriales e) throws SQLException{
        return new TransporteMaterialesbd().eliminarCotizacioTransporteMateriales(e);
    }
    public List<suma> listasumaCotizacionTransporteMateriales() throws SQLException{
      
            return new TransporteMaterialesbd().sumatotalTransporteMateriales();
    }
}
