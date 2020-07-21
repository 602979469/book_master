package net.dulao.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2020-07-21 18:18:50
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 474452574985578100L;

    private Integer sId;

    private String sUsername;

    private String sPassword;


    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getSUsername() {
        return sUsername;
    }

    public void setSUsername(String sUsername) {
        this.sUsername = sUsername;
    }

    public String getSPassword() {
        return sPassword;
    }

    public void setSPassword(String sPassword) {
        this.sPassword = sPassword;
    }

}