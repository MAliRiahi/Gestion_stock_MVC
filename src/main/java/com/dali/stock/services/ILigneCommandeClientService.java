package com.dali.stock.services;

import com.dali.stock.entites.LigneCommandeClient;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface ILigneCommandeClientService {
    public LigneCommandeClient save(LigneCommandeClient entity);

    public LigneCommandeClient update(LigneCommandeClient entity);

    public List<LigneCommandeClient> selectAll();

    public List<LigneCommandeClient> selectAll(String sortField, String sort);

    public LigneCommandeClient getById(Long id);

    public void remove(Long id);

    public LigneCommandeClient findOne(String paramName, Object paramValue);

    public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

    public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient);

}
