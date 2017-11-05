/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.ejb;

import com.restaurante.model.Platillo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Said
 */
@Stateless
public class PlatilloFacade extends AbstractFacade<Platillo> implements PlatilloFacadeLocal {

    @PersistenceContext(unitName = "com.restaurante_AppRestaurante_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlatilloFacade() {
        super(Platillo.class);
    }
    
}
