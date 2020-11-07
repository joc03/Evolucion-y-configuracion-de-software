/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import be.Clientebe;
import be.Maquinariabe;
import be.Alquilermaquinaria;
import be.suma;
import dao.Alquilermabd;
import dao.Clientebd;
import dao.Maquinariabd;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author josed
 */
public class Alquilermabr {

    public Alquilermabr() {
    }
    public int registrarALquiler(Alquilermaquinaria e) throws SQLException{
        return new Alquilermabd().registrarCotización(e);
    }
    public List<Alquilermaquinaria> listarCliente() throws SQLException{
      
            return new Alquilermabd().ListadoCotizacionAlquiler();
    }
    public int eliminarCotizacion(Alquilermaquinaria e) throws SQLException{
        return new Alquilermabd().eliminarCotizacioAlquiler(e);
    }
    public List<suma> listasuma() throws SQLException{
      
            return new Alquilermabd().sumatotal();
    }
}
