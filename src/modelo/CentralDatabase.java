/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Juan Nebel
 */
public class CentralDatabase {
    private List<Usuario> usuarios;
    private List<Sucursal> sucursales;
    private List<Producto> productos;
    private List<Oferta> servicios;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Oferta> getServicios() {
        return servicios;
    }

    public void setServicios(List<Oferta> servicios) {
        this.servicios = servicios;
    }
    
    
}
