package com.dali.stock.dao;

import java.io.InputStream;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface IFlickrDao {

    public String savePhoto(InputStream photo, String title) throws Exception;
}
