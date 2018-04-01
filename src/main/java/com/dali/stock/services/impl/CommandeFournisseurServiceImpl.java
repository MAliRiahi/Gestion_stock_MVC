package com.dali.stock.services.impl;

import com.dali.stock.dao.ICommandeFournisseurDao;
import com.dali.stock.entites.CommandeFournisseur;
import com.dali.stock.services.ICommandeFournisseurService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {

    private ICommandeFournisseurDao dao;

    public void setDao(ICommandeFournisseurDao dao) {
        this.dao = dao;
    }

    @Override
    public CommandeFournisseur save(CommandeFournisseur entity) {
        return dao.save(entity);
    }

    @Override
    public CommandeFournisseur update(CommandeFournisseur entity) {
        return dao.update(entity);
    }

    @Override
    public List<CommandeFournisseur> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<CommandeFournisseur> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public CommandeFournisseur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public CommandeFournisseur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }

}
