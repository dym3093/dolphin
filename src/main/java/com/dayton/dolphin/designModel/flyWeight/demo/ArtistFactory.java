package com.dayton.dolphin.designModel.flyWeight.demo;/**
 * Created by daimian on 17-5-22.
 */

import java.util.concurrent.ConcurrentHashMap;

/**
 * 制作人工厂
 *
 * @author Damian
 * @create 2017-05-22 下午5:34
 **/
public class ArtistFactory {

    private ConcurrentHashMap<String, Artist> pool = new ConcurrentHashMap<>();

    public Artist getArtist(String key){
        Artist artist = pool.get(key);
        if (artist!=null){
           artist = new Artist(key);
           pool.put(key, artist);
        }
        return artist;
    }

}
