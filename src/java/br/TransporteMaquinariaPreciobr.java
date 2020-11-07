/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import be.ContenidoTransportebe;
import be.TransporteMaquinariaPreciobe;
import dao.TransporteMaquinariaPreciobd;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author josed
 */
public class TransporteMaquinariaPreciobr {

    public TransporteMaquinariaPreciobr() {
    }
    public int registrarTransporteMaquinaria(TransporteMaquinariaPreciobe e) throws SQLException{
     return new TransporteMaquinariaPreciobd().registrarTransporteMaquinariaPrecio(e);
    }
    //contenido
    public int registrarContenidoTransporte(ContenidoTransportebe e) throws SQLException{
     return new TransporteMaquinariaPreciobd().RegistrarContenidoTransporte(e);
    }
     public List<TransporteMaquinariaPreciobe> listarTransporteMaquinaria() throws SQLException{
      
            return new TransporteMaquinariaPreciobd().ListadoTransporteMaquinaria();
    }
     public int eliminarTransporteMaquinaria(String e) throws SQLException{
        return new TransporteMaquinariaPreciobd().eliminarTransporteMaquinaria(e);
    }
     public int eliminarContenidoTransporte(String e) throws SQLException{
        return new TransporteMaquinariaPreciobd().eliminarContenidoTransporte(e);
    }
     public float listasumaTransporteMaquinaria() throws SQLException{
      
            return new TransporteMaquinariaPreciobd().sumatotalTransporteMaquinaria();
    }
      public int ContarFilas() throws SQLException{
        return new TransporteMaquinariaPreciobd().ContarFilas();
    }
      public int ContarFilasContenidoTransporte() throws SQLException{
        return new TransporteMaquinariaPreciobd().ContarFilasContenidoTransporte();
    }
      public int ContarFilasContadorSoli() throws SQLException{
        return new TransporteMaquinariaPreciobd().ContarFilasContenido();
    }
}
