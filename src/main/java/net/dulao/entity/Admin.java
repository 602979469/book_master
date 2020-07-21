package net.dulao.entity;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2020-07-21 17:15:27
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -43733903467610510L;

    private Integer mId;

    private String mUsername;

    private String mPassword;


    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getMUsername() {
        return mUsername;
    }

    public void setMUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getMPassword() {
        return mPassword;
    }

    public void setMPassword(String mPassword) {
        this.mPassword = mPassword;
    }

}