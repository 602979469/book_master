package net.dulao.entity;

import java.io.Serializable;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-07-21 17:15:29
 */
public class Book implements Serializable {
    private static final long serialVersionUID = -96139269559550741L;

    private Integer bId;

    private String bName;

    private String bType;

    private String bAuthor;

    private String bImage;

    private String bDescribe;


    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public String getBName() {
        return bName;
    }

    public void setBName(String bName) {
        this.bName = bName;
    }

    public String getBType() {
        return bType;
    }

    public void setBType(String bType) {
        this.bType = bType;
    }

    public String getBAuthor() {
        return bAuthor;
    }

    public void setBAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getBImage() {
        return bImage;
    }

    public void setBImage(String bImage) {
        this.bImage = bImage;
    }

    public String getBDescribe() {
        return bDescribe;
    }

    public void setBDescribe(String bDescribe) {
        this.bDescribe = bDescribe;
    }

}