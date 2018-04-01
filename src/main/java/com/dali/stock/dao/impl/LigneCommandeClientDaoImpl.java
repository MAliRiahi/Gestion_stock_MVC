package com.dali.stock.dao.impl;

import com.dali.stock.dao.ILigneCommandeClientDao;
import com.dali.stock.entites.LigneCommandeClient;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public class LigneCommandeClientDaoImpl  extends GenericDaoImpl<LigneCommandeClient> implements ILigneCommandeClientDao {

    @SuppressWarnings("unchecked")
    @Override
    public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient) {
        String queryString = "select lc from " + LigneCommandeClient.class.getSimpleName() + " lc where lc.commandeClient.idCommandeClient = :x";
        Query query = em.createQuery(queryString);
        query.setParameter("x", idCommandeClient);
        return query.getResultList();
    }

}
