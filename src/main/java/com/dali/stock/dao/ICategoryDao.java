package com.dali.stock.dao;

import com.dali.stock.entites.Article;
import com.dali.stock.entites.Category;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface ICategoryDao extends IGenericDao<Category> {

    public List<Article> selectAllArticlesByCategory(Long idCategory);

}