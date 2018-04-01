package com.dali.stock.services;

import com.dali.stock.entites.CommandeFournisseur;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface ICommandeFournisseurService {
    public CommandeFournisseur save(CommandeFournisseur entity);

    public CommandeFournisseur update(CommandeFournisseur entity);

    public List<CommandeFournisseur> selectAll();

    public List<CommandeFournisseur> selectAll(String sortField, String sort);

    public CommandeFournisseur getById(Long id);

    public void remove(Long id);

    public CommandeFournisseur findOne(String paramName, Object paramValue);

    public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
