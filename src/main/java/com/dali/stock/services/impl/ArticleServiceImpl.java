package com.dali.stock.services.impl;

import com.dali.stock.dao.IArticleDao;
import com.dali.stock.entites.Article;
import com.dali.stock.services.IArticleService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
/*L'annotation @Transactional peut être utilisée pour indiquer au conteneur les méthodes qui doivent s'exécuter dans un contexte transactionnel.

Si la déclaration des transactions se fait avec des annotations, il est tout de même nécessaire de déclarer le gestionnaire de transactions dans la configuration du contexte de Spring.

Pour permettre une utilisation de l'annotation @Transactional, il faut utiliser le tag <annotation-driven> de l'espace de nommage tx pour préciser à Spring que les annotations sont utilisées pour la définition des transactions. */

@Transactional
public class ArticleServiceImpl implements IArticleService {

    private IArticleDao dao;

    public void setDao(IArticleDao dao) {
        this.dao = dao;
    }

    @Override
    public Article save(Article entity) {
        return dao.save(entity);
    }

    @Override
    public Article update(Article entity) {
        return dao.update(entity);
    }

    @Override
    public List<Article> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Article> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField,sort);
    }

    @Override
    public Article getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Article findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public Article findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames,paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
