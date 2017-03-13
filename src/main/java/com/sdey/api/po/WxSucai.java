package com.sdey.api.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "wx_sucai")
public class WxSucai {
    @Id
    private Integer id;

    /**
     * 图片地址
     */
    private String imgpath;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String jianjie;

    private String linkurl;

    private Date createdata;

    /**
     * 关联的按钮id
     */
    private String menukey;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取图片地址
     *
     * @return imgpath - 图片地址
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * 设置图片地址
     *
     * @param imgpath 图片地址
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取简介
     *
     * @return jianjie - 简介
     */
    public String getJianjie() {
        return jianjie;
    }

    /**
     * 设置简介
     *
     * @param jianjie 简介
     */
    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    /**
     * @return linkurl
     */
    public String getLinkurl() {
        return linkurl;
    }

    /**
     * @param linkurl
     */
    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    /**
     * @return createdata
     */
    public Date getCreatedata() {
        return createdata;
    }

    /**
     * @param createdata
     */
    public void setCreatedata(Date createdata) {
        this.createdata = createdata;
    }

    /**
     * 获取关联的按钮id
     *
     * @return menukey - 关联的按钮id
     */
    public String getMenukey() {
        return menukey;
    }

    /**
     * 设置关联的按钮id
     *
     * @param menukey 关联的按钮id
     */
    public void setMenukey(String menukey) {
        this.menukey = menukey;
    }
}