package com.dali.stock.dao.impl;


import com.dali.stock.dao.IGenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public class GenericDaoImpl<E> implements IGenericDao<E>{

/*Les interactions entre la base de données et les beans entités sont assurées par un objet de type javax.persistence.EntityManager : il permet de lire et rechercher des données mais aussi de les mettre à jour (ajout, modification, suppression). L'EntityManager est donc au coeur de toutes les actions de persistance
L'EntityManager assure aussi les interactions avec un éventuel gestionnaire de transactions.
Un EntityManager gère un ensemble défini de beans entités nommé persistence unit. La définition d'un persistence unit est assurée dans un fichier de description nommé persistence.xml.

nous pouvons injecter  une instance d'un EntityManager dépendant d'une unité de persistance, via l'annotation @PersistenceContext*/
@PersistenceContext
EntityManager em;

    private Class<E> type;

    public GenericDaoImpl() {
        Type t =getClass().getGenericSuperclass(); /*++ getClass() ++ : obtient l'instance de classe actuelle de la classe concrète. Ceci identifie le type concret de notre descendant immédiat*/ /* ++ getGenericSuperclass ++ : obtient le supertype de cette classe*/
        ParameterizedType pt = (ParameterizedType) t; /*Puisque nous sommes un type paramétrique, nous pouvons nous propulser en toute sécurité vers ParameterizedType*/
        type  =  (Class<E>) pt.getActualTypeArguments()[0]; /* ++ getActualTypeArguments ++ : obtient le tableau des types mappés dans nos génériques, dans l'ordre tel que déclaré dans le code de la classe. Pour cet exemple, nous retirons le premier paramètre */

    }

    public Class<E> getType() {
        return type;
    }

    @Override
    public Object save(Object entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public Object update(Object entity) {
        return em.merge(entity);
    }
/*Hibernate utilise plusieurs moyens pour obtenir des données de la base de données :

- Hibernate Query Language (HQL)
- API Criteria : Query By Criteria (QBC) et Query BY Example (QBE)
- Requêtes SQL natives

Le plus courant est d'obtenir une instance de la classe Query en invoquant la méthode createQuery() de la session Hibernate courante : elle attend en paramètre la requête HQL qui devra être exécutée.
JPQL (Java Persistence Query Language) qui est un sous-ensemble de HQL. Toute requête JPQL est une requête HQL, l’inverse n’est pas vrai.

*/
@Override
public List<E> selectAll() {
    Query query = em.createQuery("select t from " + type.getSimpleName() + " t");
    return query.getResultList();
}

    @Override
    public List<E> selectAll(String sortField, String sort) {
        Query query = em.createQuery("select t from " + type.getSimpleName() + " t order by " + sortField + " " + sort);
        return query.getResultList();
    }

    @Override
    public E getById(Long id) {
        return em.find(type, id);
    }

    @Override
    public void remove(Long id) {
        E tab = em.getReference(type, id);
        em.remove(tab);
    }

    @Override
    public E findOne(String paramName, Object paramValue) {
        Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
        query.setParameter("x", paramValue);
        return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
    }

    @Override
    public E findOne(String[] paramNames, Object[] paramValues) {
        if (paramNames.length != paramValues.length) {
            return null;
        }
        String queryString = "select e from " + type.getSimpleName() + " e where ";
        int len = paramNames.length;
        for (int i = 0; i < len; i++) {
            queryString += " e." + paramNames[i] + "= :x" + i;
            if ((i + 1) < len) {
                queryString += " and ";
            }
        }
        Query query = em.createQuery(queryString);
        for (int i = 0; i < paramValues.length; i++) {
            query.setParameter("x" + i, paramValues[i]);
        }
        return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
        query.setParameter(paramName, paramValue);
        return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
    }

}
