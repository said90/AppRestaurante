/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.ejb;

import com.restaurante.model.Platillo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Said
 */
@Local
public interface PlatilloFacadeLocal {

    void create(Platillo platillo);

    void edit(Platillo platillo);

    void remove(Platillo platillo);

    Platillo find(Object id);

    List<Platillo> findAll();

    List<Platillo> findRange(int[] range);

    int count();
    
}
