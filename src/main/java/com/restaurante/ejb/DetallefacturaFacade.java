/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.ejb;

import com.restaurante.model.Detallefactura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Said
 */
@Stateless
public class DetallefacturaFacade extends AbstractFacade<Detallefactura> implements DetallefacturaFacadeLocal {

    @PersistenceContext(unitName = "com.restaurante_AppRestaurante_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallefacturaFacade() {
        super(Detallefactura.class);
    }
    
}
