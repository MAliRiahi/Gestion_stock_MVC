package com.dali.stock;

import com.dali.stock.dao.impl.FlickrDaoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by mohamed ali on 4/2/2018.
 */
public class test {
/**    public static  void  main(String[] args){
        FlickrDaoImpl flick =new FlickrDaoImpl();
       // flick.auth();
        try {
            InputStream stream = new FileInputStream(new File("D:\\photo.png"));
            String url = flick.savePhoto(stream,"myphoto");
            System.out.println(url);
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
