package com.dali.stock.services;

import java.io.InputStream;

/**
 * Created by mohamed ali on 4/1/2018.
 */
public interface IFlickrService {

    public String savePhoto(InputStream photo, String title) throws Exception;
}
