package com.dali.stock.services;

import com.dali.stock.entites.Fournisseur;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface IFournisseurService {
    public Fournisseur save(Fournisseur entity);

    public Fournisseur update(Fournisseur entity);

    public List<Fournisseur> selectAll();

    public List<Fournisseur> selectAll(String sortField, String sort);

    public Fournisseur getById(Long id);

    public void remove(Long id);

    public Fournisseur findOne(String paramName, Object paramValue);

    public Fournisseur findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

}
