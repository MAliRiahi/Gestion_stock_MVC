package com.dali.stock.services;

import com.dali.stock.entites.CommandeClient;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface ICommandeClientService {
    public CommandeClient save(CommandeClient entity);

    public CommandeClient update(CommandeClient entity);

    public List<CommandeClient> selectAll();

    public List<CommandeClient> selectAll(String sortField, String sort);

    public CommandeClient getById(Long id);

    public void remove(Long id);

    public CommandeClient findOne(String paramName, Object paramValue);

    public CommandeClient findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
