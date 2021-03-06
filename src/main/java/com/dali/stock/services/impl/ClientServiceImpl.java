package com.dali.stock.services.impl;

import com.dali.stock.dao.IClientDao;
import com.dali.stock.entites.Client;
import com.dali.stock.services.IClientService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
@Transactional
public class ClientServiceImpl implements IClientService {

    private IClientDao dao;

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    @Override
    public Client save(Client entity) {
        return dao.save(entity);
    }

    @Override
    public Client update(Client entity) {
        return dao.update(entity);
    }

    @Override
    public List<Client> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Client> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Client getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Client findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Client findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }

}
