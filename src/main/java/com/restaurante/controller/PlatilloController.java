/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.controller;

import com.restaurante.ejb.PlatilloFacadeLocal;
import com.restaurante.model.Platillo;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Said
 */
@Named
@ViewScoped
public class PlatilloController implements Serializable {

    private Platillo platillo;

    @EJB
    PlatilloFacadeLocal platilloEJB;

    List<Platillo> lstPlatillo;

    @PostConstruct
    public void init() {
        platillo = new Platillo();
        lstPlatillo = platilloEJB.findAll();
    }

    public void insertarRegistro() {

        platilloEJB.create(platillo);

    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    public List<Platillo> getLstPlatillo() {
        return lstPlatillo;
    }

    public void setLstPlatillo(List<Platillo> lstPlatillo) {
        this.lstPlatillo = lstPlatillo;
    }

}
