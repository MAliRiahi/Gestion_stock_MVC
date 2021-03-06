package com.dali.stock.services.impl;

import com.dali.stock.dao.IVenteDao;
import com.dali.stock.entites.Vente;
import com.dali.stock.services.IVenteService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
@Transactional
public class VenteServiceImpl implements IVenteService {

    private IVenteDao dao;

    public void setDao(IVenteDao dao) {
        this.dao = dao;
    }

    @Override
    public Vente save(Vente entity) {
        return dao.save(entity);
    }

    @Override
    public Vente update(Vente entity) {
        return dao.update(entity);
    }

    @Override
    public List<Vente> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Vente> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Vente getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Vente findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Vente findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }

}
