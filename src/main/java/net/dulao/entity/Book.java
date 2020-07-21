package net.dulao.entity;

import java.io.Serializable;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-07-21 18:18:50
 */
public class Book implements Serializable {
    private static final long serialVersionUID = -10247387134098543L;

    private Integer bId;

    private String bName;

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