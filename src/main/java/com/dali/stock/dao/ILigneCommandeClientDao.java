package com.dali.stock.dao;

import com.dali.stock.entites.LigneCommandeClient;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface ILigneCommandeClientDao extends IGenericDao<LigneCommandeClient> {

    public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient);

}
