/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Said
 */
@Entity
@Table(name = "detallefactura")
public class Detallefactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetalleFactura")
    private Integer idDetalleFactura;
    @Size(max = 45)
    @Column(name = "precio")
    private String precio;
    @Size(max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @JoinColumn(name = "idFactura", referencedColumnName = "idFactura")
    @ManyToOne(optional = false)
    private Factura idFactura;
    @JoinColumn(name = "idPlatillo", referencedColumnName = "idPlatillo")
    @ManyToOne(optional = false)
    private Platillo idPlatillo;


    public Detallefactura(Integer idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public Integer getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(Integer idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Factura idFactura) {
        this.idFactura = idFactura;
    }

    public Platillo getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Platillo idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleFactura != null ? idDetalleFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.idDetalleFactura == null && other.idDetalleFactura != null) || (this.idDetalleFactura != null && !this.idDetalleFactura.equals(other.idDetalleFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restaurante.model.Detallefactura[ idDetalleFactura=" + idDetalleFactura + " ]";
    }
    
}
