package com.dali.stock.dao.impl;

import com.dali.stock.dao.ICategoryDao;
import com.dali.stock.entites.Article;
import com.dali.stock.entites.Category;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
@SuppressWarnings("unchecked")
public class CategoryDaoImpl extends GenericDaoImpl<Category> implements ICategoryDao {

    @Override
    public List<Article> selectAllArticlesByCategory(Long idCategory) {
        Query query = em.createQuery("select a from " + Article.class.getSimpleName() + " a where a.category.idCategory = :x");
        query.setParameter("x", idCategory);
        return query.getResultList();
    }

}