package com.dali.stock.services.impl;

import com.dali.stock.dao.IFlickrDao;
import com.dali.stock.services.IFlickrService;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;

/**
 * Created by mohamed ali on 4/1/2018.
 */
@Transactional
public class FlickrServiceImpl implements IFlickrService {

    private IFlickrDao dao;

    public void setDao(IFlickrDao dao) {
        this.dao = dao;
    }

    @Override
    public String savePhoto(InputStream photo, String title) throws Exception {
        return dao.savePhoto(photo, title);
    }

}
