package com.dali.stock.services;

import com.dali.stock.entites.Utilisateur;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface IUtilisateurService {
    public Utilisateur save(Utilisateur entity);

    public Utilisateur update(Utilisateur entity);

    public List<Utilisateur> selectAll();

    public List<Utilisateur> selectAll(String sortField, String sort);

    public Utilisateur getById(Long id);

    public void remove(Long id);

    public Utilisateur findOne(String paramName, Object paramValue);

    public Utilisateur findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
