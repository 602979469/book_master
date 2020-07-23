package net.dulao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 书
 * (Book)实体类
 *
 * @author makejava
 * @date 2020/07/23
 * @since 2020-07-21 18:18:50
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
    /**
     * 串行版本uid
     */
    private static final long serialVersionUID = -10247387134098543L;

    /**
     * b id
     */
    private Integer bId;

    /**
     * b的名字
     */
    private String bName;

    /**
     * b图像
     */
    private String bImage;

    /**
     * b描述
     */
    private String bDescribe;


}