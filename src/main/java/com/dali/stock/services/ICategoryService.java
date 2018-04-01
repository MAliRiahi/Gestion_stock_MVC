package com.dali.stock.services;



import com.dali.stock.entites.Article;
import com.dali.stock.entites.Category;

import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface ICategoryService {
    public Category save(Category entity);

    public Category update(Category entity);

    public List<Category> selectAll();

    public List<Category> selectAll(String sortField, String sort);

    public Category getById(Long id);

    public void remove(Long id);

    public Category findOne(String paramName, Object paramValue);

    public Category findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

    public List<Article> selectAllArticlesByCategory(Long idCategory);
}
