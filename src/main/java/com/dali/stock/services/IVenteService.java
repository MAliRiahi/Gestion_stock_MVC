package com.dali.stock.services;

import com.dali.stock.entites.Vente;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface IVenteService {
    public Vente save(Vente entity);

    public Vente update(Vente entity);

    public List<Vente> selectAll();

    public List<Vente> selectAll(String sortField, String sort);

    public Vente getById(Long id);

    public void remove(Long id);

    public Vente findOne(String paramName, Object paramValue);

    public Vente findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
