package com.dayton.dolphin.designModel.flyWeight.demo;/**
 * Created by daimian on 17-5-22.
 */

import com.dayton.dolphin.designModel.flyWeight.IntrinsicState;

/**
 * CD唱片
 *
 * @author Damian
 * @create 2017-05-22 下午5:03
 **/
public class CD {

    private String title;
    private Integer year;
    private Artist artist;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
