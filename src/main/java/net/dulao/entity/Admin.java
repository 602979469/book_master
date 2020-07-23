package net.dulao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 管理
 * (Admin)实体类
 *
 * @author makejava
 * @date 2020/07/23
 * @since 2020-07-21 18:18:50
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
    private static final long serialVersionUID = -59112042835828358L;

    private Integer mId;

    private String mUsername;

    private String mPassword;


}